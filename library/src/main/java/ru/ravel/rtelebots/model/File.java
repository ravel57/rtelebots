package ru.ravel.rtelebots.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Stas Parshin
 * 16 October 2015
 */
public class File implements Serializable {
	private final static long serialVersionUID = 0L;

	private String file_id;
	private String file_unique_id;
	private Long file_size;
	private String file_path;

	public String fileId() {
		return file_id;
	}

	public String fileUniqueId() {
		return file_unique_id;
	}

	public Long fileSize() {
		return file_size;
	}

	public String filePath() {
		return file_path;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		File file = (File) o;

		if (!Objects.equals(file_id, file.file_id)) return false;
		if (!Objects.equals(file_unique_id, file.file_unique_id))
			return false;
		if (!Objects.equals(file_size, file.file_size)) return false;
		return Objects.equals(file_path, file.file_path);
	}

	@Override
	public int hashCode() {
		return file_id != null ? file_id.hashCode() : 0;
	}

	@Override
	public String toString() {
		return "File{" +
				"file_id='" + file_id + '\'' +
				", file_unique_id='" + file_unique_id + '\'' +
				", file_size=" + file_size +
				", file_path='" + file_path + '\'' +
				'}';
	}
}
