package com.bbb.wrapper.responseDTO;

import java.util.Arrays;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;


public class MeetingInfoListDTO {
	private String returncode;
	private String messageKey;
	private String message;
	@JacksonXmlElementWrapper(useWrapping = true)
	private MeetingInfoDTO[] meetings;
	
	@Override
	public String toString() {
		return "MeetingInfoListDTO [returncode=" + returncode + ", messageKey=" + messageKey + ", message=" + message
				+ ", meetings=" + Arrays.toString(meetings) + "]";
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
	public MeetingInfoDTO[] getMeetings() {
		return meetings;
	}
	public void setMeetings(MeetingInfoDTO[] meetings) {
		this.meetings = meetings;
	}

}
