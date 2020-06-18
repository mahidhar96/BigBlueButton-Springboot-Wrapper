package com.bbb.wrapper.responseDTO;

public class MeetingStatusDTO {
	private String returncode;
	private Boolean running;
	private String messageKey;
	private String message;
	
	@Override
	public String toString() {
		return "MeetingStatusDTO [returncode=" + returncode + ", running=" + running + ", messageKey=" + messageKey
				+ ", message=" + message + "]";
	}

	public String getReturncode() {
		return returncode;
	}
	public void setReturncode(String returncode) {
		this.returncode = returncode;
	}
	public Boolean getRunning() {
		return running;
	}
	public void setRunning(Boolean running) {
		this.running = running;
	}
	public String getMessageKey() {
		return messageKey;
	}
	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
