package com.bbb.wrapper.responseDTO;

import java.util.Arrays;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class RecordingListDTO {
	private String returncode;
	private String messageKey;
	private String message;
	@JacksonXmlElementWrapper(useWrapping = true)
	public RecordingDTO[] recordings;
	
	@Override
	public String toString() {
		return "RecordingListDTO [returncode=" + returncode + ", messageKey=" + messageKey + ", message=" + message
				+ ", recordings=" + Arrays.toString(recordings) + "]";
	}

	public String getReturncode() {
		return returncode;
	}
	public void setReturncode(String returncode) {
		this.returncode = returncode;
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
	public RecordingDTO[] getRecordings() {
		return recordings;
	}
	public void setRecordings(RecordingDTO[] recordings) {
		this.recordings = recordings;
	}
}
