package ru.ravel.rtelebots.model.request;

import ru.ravel.rtelebots.AttachName;

import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

abstract public class InputPaidMedia implements Serializable {
	private final static long serialVersionUID = 0L;

	private final String type;
	private final String media;
	transient protected Map<String, Object> attachments = new HashMap<>();
	transient private InputFile inputFile;
	transient private String inputFileAttachId;
	transient private String fileName;
	transient private String contentType;

	InputPaidMedia(String type, Object media) {
		this.type = type;
		if (media instanceof String) {
			this.media = (String) media;
		} else {
			String attachName = AttachName.next();
			this.media = "attach://" + attachName;
			inputFileAttachId = attachName;
			if (media instanceof File) {
				fileName = ((File) media).getName();
				inputFile = new InputFile((File) media, getFileName(), getContentType());
			} else if (media instanceof byte[]) {
				inputFile = new InputFile((byte[]) media, getFileName(), getContentType());
			}
		}
	}

	public Map<String, Object> getAttachments() {
		return attachments;
	}

	protected String addAttachment(Object attachment) {
		String attachName = AttachName.next();
		attachments.put(attachName, attachment);
		return "attach://" + attachName;
	}

	public InputFile inputFile() {
		return inputFile;
	}

	public String getInputFileId() {
		return inputFileAttachId;
	}

	public String getFileName() {
		return (fileName != null && !fileName.isEmpty()) ? fileName : getDefaultFileName();
	}

	public String getContentType() {
		return (contentType != null && !contentType.isEmpty()) ? contentType : getDefaultContentType();
	}

	abstract protected String getDefaultFileName();

	abstract protected String getDefaultContentType();
}
