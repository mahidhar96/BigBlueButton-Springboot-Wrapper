package com.bbb.wrapper.responseDTO;

public class RecordingsActionsResponseDTO {
	private String returncode;
	private String published;
	private String deleted;
	private String updated;
	
	@Override
	public String toString() {
		return "RecordingsActionsResponseDTO [returncode=" + returncode + ", published=" + published + ", deleted="
				+ deleted + ", updated=" + updated + "]";
	}

	public String getReturncode() {
		return returncode;
	}
	public void setReturncode(String returncode) {
		this.returncode = returncode;
	}
	public String getPublished() {
		return published;
	}
	public void setPublished(String published) {
		this.published = published;
	}
	public String getDeleted() {
		return deleted;
	}
	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
}
