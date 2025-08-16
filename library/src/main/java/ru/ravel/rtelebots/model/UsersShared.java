package ru.ravel.rtelebots.model;

import ru.ravel.rtelebots.model.shared.SharedUser;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class UsersShared implements Serializable {
	private final static long serialVersionUID = 0L;

	private Integer request_id;
	private SharedUser[] users;

	public Integer requestId() {
		return request_id;
	}

	public SharedUser[] users() {
		return users;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		UsersShared that = (UsersShared) o;
		return Objects.equals(request_id, that.request_id) && Arrays.equals(users, that.users);
	}

	@Override
	public int hashCode() {
		int result = Objects.hash(request_id);
		result = 31 * result + Arrays.hashCode(users);
		return result;
	}

	@Override
	public String toString() {
		return "UsersShared{" +
				"request_id=" + request_id +
				", users=" + Arrays.toString(users) +
				'}';
	}
}
