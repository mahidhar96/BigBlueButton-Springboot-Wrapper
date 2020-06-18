package com.bbb.wrapper.responseDTO;

public class AttendeeInfoDTO {
	private String userID;
	private String fullName;
	private String role;
	private Boolean isPresenter;
	private Boolean isListeningOnly;
	private Boolean hasJoinedVoice;
	private Boolean hasVideo;
	private String clientType;//>FLASH</clientType>
	
	@Override
	public String toString() {
		return "AttendeeInfoDTO [userID=" + userID + ", fullName=" + fullName + ", role=" + role + ", isPresenter="
				+ isPresenter + ", isListeningOnly=" + isListeningOnly + ", hasJoinedVoice=" + hasJoinedVoice
				+ ", hasVideo=" + hasVideo + ", clientType=" + clientType + "]";
	}

	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Boolean getIsPresenter() {
		return isPresenter;
	}
	public void setIsPresenter(Boolean isPresenter) {
		this.isPresenter = isPresenter;
	}
	public Boolean getIsListeningOnly() {
		return isListeningOnly;
	}
	public void setIsListeningOnly(Boolean isListeningOnly) {
		this.isListeningOnly = isListeningOnly;
	}
	public Boolean getHasJoinedVoice() {
		return hasJoinedVoice;
	}
	public void setHasJoinedVoice(Boolean hasJoinedVoice) {
		this.hasJoinedVoice = hasJoinedVoice;
	}
	public Boolean getHasVideo() {
		return hasVideo;
	}
	public void setHasVideo(Boolean hasVideo) {
		this.hasVideo = hasVideo;
	}
	public String getClientType() {
		return clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
}
