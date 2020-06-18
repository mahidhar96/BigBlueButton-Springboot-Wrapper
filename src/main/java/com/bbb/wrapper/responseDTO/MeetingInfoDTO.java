package com.bbb.wrapper.responseDTO;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class MeetingInfoDTO {
	private String returncode;
	private String meetingName;
	private String meetingID;
	private String internalMeetingID;
	private String createTime;
	private String createDate;//Tue Jul 10 16:36:25 UTC 2018
	private String voiceBridge;
	private String dialNumber;
	private String attendeePW;
	private String moderatorPW;
	private Boolean running;
	private Integer duration;
	private Boolean hasUserJoined;
	private Boolean recording;
	private Boolean hasBeenForciblyEnded;
	private String startTime;//>1531240585239</startTime>
	private String endTime;//>0</endTime>
	private Integer participantCount;
	private Integer listenerCount;
	private Integer voiceParticipantCount;
	private Integer videoCount;
	private Integer maxUsers;
	private Integer moderatorCount;
	@JacksonXmlElementWrapper(useWrapping = true)
	private AttendeeInfoDTO[] attendees;
	private String metadata;
	private Boolean isBreakout;
	private String messageKey;
	private String message;

	@Override
	public String toString() {
		return "MeetingInfoDTO [returncode=" + returncode + ", meetingName=" + meetingName + ", meetingID=" + meetingID
				+ ", internalMeetingID=" + internalMeetingID + ", createTime=" + createTime + ", createDate="
				+ createDate + ", voiceBridge=" + voiceBridge + ", dialNumber=" + dialNumber + ", attendeePW="
				+ attendeePW + ", moderatorPW=" + moderatorPW + ", running=" + running + ", duration=" + duration
				+ ", hasUserJoined=" + hasUserJoined + ", recording=" + recording + ", hasBeenForciblyEnded="
				+ hasBeenForciblyEnded + ", startTime=" + startTime + ", endTime=" + endTime + ", participantCount="
				+ participantCount + ", listenerCount=" + listenerCount + ", voiceParticipantCount="
				+ voiceParticipantCount + ", videoCount=" + videoCount + ", maxUsers=" + maxUsers + ", moderatorCount="
				+ moderatorCount + ", attendees=" + attendees + ", metadata=" + metadata + ", isBreakout=" + isBreakout
				+ ", messageKey=" + messageKey + ", message=" + message + "]";
	}
	
	public String getReturncode() {
		return returncode;
	}
	public void setReturncode(String returncode) {
		this.returncode = returncode;
	}
	public String getMeetingName() {
		return meetingName;
	}
	public void setMeetingName(String meetingName) {
		this.meetingName = meetingName;
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
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
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
	public Boolean getRunning() {
		return running;
	}
	public void setRunning(Boolean running) {
		this.running = running;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Boolean getHasUserJoined() {
		return hasUserJoined;
	}
	public void setHasUserJoined(Boolean hasUserJoined) {
		this.hasUserJoined = hasUserJoined;
	}
	public Boolean getRecording() {
		return recording;
	}
	public void setRecording(Boolean recording) {
		this.recording = recording;
	}
	public Boolean getHasBeenForciblyEnded() {
		return hasBeenForciblyEnded;
	}
	public void setHasBeenForciblyEnded(Boolean hasBeenForciblyEnded) {
		this.hasBeenForciblyEnded = hasBeenForciblyEnded;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public Integer getParticipantCount() {
		return participantCount;
	}
	public void setParticipantCount(Integer participantCount) {
		this.participantCount = participantCount;
	}
	public Integer getListenerCount() {
		return listenerCount;
	}
	public void setListenerCount(Integer listenerCount) {
		this.listenerCount = listenerCount;
	}
	public Integer getVoiceParticipantCount() {
		return voiceParticipantCount;
	}
	public void setVoiceParticipantCount(Integer voiceParticipantCount) {
		this.voiceParticipantCount = voiceParticipantCount;
	}
	public Integer getVideoCount() {
		return videoCount;
	}
	public void setVideoCount(Integer videoCount) {
		this.videoCount = videoCount;
	}
	public Integer getMaxUsers() {
		return maxUsers;
	}
	public void setMaxUsers(Integer maxUsers) {
		this.maxUsers = maxUsers;
	}
	public Integer getModeratorCount() {
		return moderatorCount;
	}
	public void setModeratorCount(Integer moderatorCount) {
		this.moderatorCount = moderatorCount;
	}
	public AttendeeInfoDTO[] getAttendees() {
		return attendees;
	}
	public void setAttendees(AttendeeInfoDTO[] attendees) {
		this.attendees = attendees;
	}
	public String getMetadata() {
		return metadata;
	}
	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}
	public Boolean getIsBreakout() {
		return isBreakout;
	}
	public void setIsBreakout(Boolean isBreakout) {
		this.isBreakout = isBreakout;
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
