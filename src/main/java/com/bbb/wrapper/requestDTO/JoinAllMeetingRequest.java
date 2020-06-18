package com.bbb.wrapper.requestDTO;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class JoinAllMeetingRequest {
	private List<String> moderatorFullNames;
	private List<String> attendeeFullNames;
	private String meetingID;
	private String moderatorPassword;
	private String attendeePassword;
	private String createTime;
	private String userID;
	private String webVoiceConf;
	private String configToken;
	private String defaultLayout;
	private String avatarURL;
	private String redirect;
	private String clientURL;
	private String joinViaHtml5;
	private String guest;

	@Override
	public String toString() {
		return "JoinAllMeetingRequest [moderatorFullNames=" + moderatorFullNames + ", attendeeFullNames="
				+ attendeeFullNames + ", meetingID=" + meetingID + ", moderatorPassword=" + moderatorPassword
				+ ", attendeePassword=" + attendeePassword + ", createTime=" + createTime + ", userID=" + userID
				+ ", webVoiceConf=" + webVoiceConf + ", configToken=" + configToken + ", defaultLayout=" + defaultLayout
				+ ", avatarURL=" + avatarURL + ", redirect=" + redirect + ", clientURL=" + clientURL + ", joinViaHtml5="
				+ joinViaHtml5 + ", guest=" + guest + "]";
	}

	public List<String> getModeratorFullNames() {
		return moderatorFullNames;
	}

	public void setModeratorFullNames(List<String> moderatorFullNames) {
		this.moderatorFullNames = moderatorFullNames;
	}

	public List<String> getAttendeeFullNames() {
		return attendeeFullNames;
	}

	public void setAttendeeFullNames(List<String> attendeeFullNames) {
		this.attendeeFullNames = attendeeFullNames;
	}

	public String getMeetingID() {
		return meetingID;
	}

	public void setMeetingID(String meetingID) {
		this.meetingID = meetingID;
	}

	public String getModeratorPassword() {
		return moderatorPassword;
	}

	public void setModeratorPassword(String moderatorPassword) {
		this.moderatorPassword = moderatorPassword;
	}

	public String getAttendeePassword() {
		return attendeePassword;
	}

	public void setAttendeePassword(String attendeePassword) {
		this.attendeePassword = attendeePassword;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getWebVoiceConf() {
		return webVoiceConf;
	}

	public void setWebVoiceConf(String webVoiceConf) {
		this.webVoiceConf = webVoiceConf;
	}

	public String getConfigToken() {
		return configToken;
	}

	public void setConfigToken(String configToken) {
		this.configToken = configToken;
	}

	public String getDefaultLayout() {
		return defaultLayout;
	}

	public void setDefaultLayout(String defaultLayout) {
		this.defaultLayout = defaultLayout;
	}

	public String getAvatarURL() {
		return avatarURL;
	}

	public void setAvatarURL(String avatarURL) {
		this.avatarURL = avatarURL;
	}

	public String getRedirect() {
		return redirect;
	}

	public void setRedirect(String redirect) {
		this.redirect = redirect;
	}

	public String getClientURL() {
		return clientURL;
	}

	public void setClientURL(String clientURL) {
		this.clientURL = clientURL;
	}

	public String getJoinViaHtml5() {
		return joinViaHtml5;
	}

	public void setJoinViaHtml5(String joinViaHtml5) {
		this.joinViaHtml5 = joinViaHtml5;
	}

	public String getGuest() {
		return guest;
	}

	public void setGuest(String guest) {
		this.guest = guest;
	}
}
