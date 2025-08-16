package ru.ravel.rtelebots;

import com.google.gson.*;
import ru.ravel.rtelebots.model.*;
import ru.ravel.rtelebots.response.*;

import java.io.*;

import okhttp3.*;
import ru.ravel.rtelebots.model.ResponseParameters;
import ru.ravel.rtelebots.response.BaseResponse;

/**
 * Stas Parshin
 * 26 January 2020
 */
public class RetryInterceptor implements Interceptor {

    private final int defaultSleepMillis;
    private final Gson gson = new Gson();
    private boolean enabled = true;

    public RetryInterceptor() {
        this(1000);
    }

    public RetryInterceptor(int defaultSleepMillis) {
        this.defaultSleepMillis = defaultSleepMillis;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        if (!enabled) return chain.proceed(chain.request());
        Request request = chain.request();
        Exception exception = null;
        int retries = 3;
        while (retries-- > 0) {
            try {
                Response response = chain.proceed(request);
                if (response.isSuccessful()) {
                    return response;
                } else if (response.code() != 429) {
                    return response;
                } else {
                    BaseResponse baseResponse = gson.fromJson(response.body().string(), BaseResponse.class);
                    ResponseParameters params = baseResponse.parameters();
                    int sleepTimeMillis;
                    if (params != null && params.retryAfter() != null) {
                        sleepTimeMillis = params.retryAfter() * 1000;
                    } else {
                        sleepTimeMillis = defaultSleepMillis;
                    }
                    System.err.println("++++ response " + response.code() + " sleep for " + sleepTimeMillis + " ms");
                    Thread.sleep(sleepTimeMillis);
                }
            } catch (Exception e) {
                exception = e;
                System.err.println("++++ exception " + e.getMessage());
                e.printStackTrace(System.err);
                try {
                    Thread.sleep(defaultSleepMillis);
                } catch (InterruptedException ignored) {}
            }
        }
        if (exception instanceof IOException) throw (IOException) exception;
        else if (exception != null) throw new RuntimeException(exception);
        else throw new RuntimeException("empty exception");
    }
}
