package com.bbb.wrapper.responseDTO;

public class CreateMeetingResponseDTO {
	private String returncode;//SUCCESS
	private String meetingID;
	private String internalMeetingID;
	private String parentMeetingID;
	private String attendeePW;
	private String moderatorPW;
	private String createTime;
	private String voiceBridge;
	private String dialNumber;
	private String createDate;//>Thu Jun 11 03:41:14 PDT 2020</createDate>
	private Boolean hasUserJoined;
	private Integer duration;
	private Boolean hasBeenForciblyEnded;
	private String messageKey;
	private String message;
	
	@Override
	public String toString() {
		return "CreateMeetingResponseDTO [returncode=" + returncode + ", meetingID=" + meetingID
				+ ", internalMeetingID=" + internalMeetingID + ", parentMeetingID=" + parentMeetingID + ", attendeePW="
				+ attendeePW + ", moderatorPW=" + moderatorPW + ", createTime=" + createTime + ", voiceBridge="
				+ voiceBridge + ", dialNumber=" + dialNumber + ", createDate=" + createDate + ", hasUserJoined="
				+ hasUserJoined + ", duration=" + duration + ", hasBeenForciblyEnded=" + hasBeenForciblyEnded
				+ ", messageKey=" + messageKey + ", message=" + message + "]";
	}

	public String getReturncode() {
		return returncode;
	}

	public void setReturncode(String returncode) {
		this.returncode = returncode;
	}

	public String getMeetingID() {
		return meetingID;
	}

	public void setMeetingID(String meetingID) {
		this.meetingID = meetingID;
	}

	public String getInternalMeetingID() {
		return internalMeetingID;
	}

	public void setInternalMeetingID(String internalMeetingID) {
		this.internalMeetingID = internalMeetingID;
	}

	public String getParentMeetingID() {
		return parentMeetingID;
	}

	public void setParentMeetingID(String parentMeetingID) {
		this.parentMeetingID = parentMeetingID;
	}

	public String getAttendeePW() {
		return attendeePW;
	}

	public void setAttendeePW(String attendeePW) {
		this.attendeePW = attendeePW;
	}

	public String getModeratorPW() {
		return moderatorPW;
	}

	public void setModeratorPW(String moderatorPW) {
		this.moderatorPW = moderatorPW;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getVoiceBridge() {
		return voiceBridge;
	}

	public void setVoiceBridge(String voiceBridge) {
		this.voiceBridge = voiceBridge;
	}

	public String getDialNumber() {
		return dialNumber;
	}

	public void setDialNumber(String dialNumber) {
		this.dialNumber = dialNumber;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public Boolean getHasUserJoined() {
		return hasUserJoined;
	}

	public void setHasUserJoined(Boolean hasUserJoined) {
		this.hasUserJoined = hasUserJoined;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Boolean getHasBeenForciblyEnded() {
		return hasBeenForciblyEnded;
	}

	public void setHasBeenForciblyEnded(Boolean hasBeenForciblyEnded) {
		this.hasBeenForciblyEnded = hasBeenForciblyEnded;
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
