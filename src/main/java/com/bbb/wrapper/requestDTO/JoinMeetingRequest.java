package com.bbb.wrapper.requestDTO;

import java.io.UnsupportedEncodingException;

import org.springframework.web.bind.annotation.RequestMapping;

import com.bbb.wrapper.utils.WrapperUtils;

@RequestMapping
public class JoinMeetingRequest {
	private String fullName;
	private String meetingID;
	private String password;
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
	
	public JoinMeetingRequest(JoinAllMeetingRequest joinAllMeetingRequest) {
		setMeetingID(joinAllMeetingRequest.getMeetingID());
		setCreateTime(joinAllMeetingRequest.getCreateTime());
		setUserID(joinAllMeetingRequest.getUserID());
		setWebVoiceConf(joinAllMeetingRequest.getWebVoiceConf());
		setConfigToken(joinAllMeetingRequest.getConfigToken());
		setDefaultLayout(joinAllMeetingRequest.getDefaultLayout());
		setAvatarURL(joinAllMeetingRequest.getAvatarURL());
		setRedirect(joinAllMeetingRequest.getRedirect());
		setClientURL(joinAllMeetingRequest.getClientURL());
		setJoinViaHtml5(joinAllMeetingRequest.getJoinViaHtml5());
		setGuest(joinAllMeetingRequest.getGuest());
	}
	
	public String toQuery() throws UnsupportedEncodingException {
		String query="";
		if(fullName!=null){query = WrapperUtils.joinQuery(query,"fullName",fullName.toString());}
		if(meetingID!=null){query = WrapperUtils.joinQuery(query,"meetingID",meetingID.toString());}
		if(password!=null){query = WrapperUtils.joinQuery(query,"password",password.toString());}
		if(createTime!=null){query = WrapperUtils.joinQuery(query,"createTime",createTime.toString());}
		if(userID!=null){query = WrapperUtils.joinQuery(query,"userID",userID.toString());}
		if(webVoiceConf!=null){query = WrapperUtils.joinQuery(query,"webVoiceConf",webVoiceConf.toString());}
		if(configToken!=null){query = WrapperUtils.joinQuery(query,"configToken",configToken.toString());}
		if(defaultLayout!=null){query = WrapperUtils.joinQuery(query,"defaultLayout",defaultLayout.toString());}
		if(avatarURL!=null){query = WrapperUtils.joinQuery(query,"avatarURL",avatarURL.toString());}
		if(redirect!=null){query = WrapperUtils.joinQuery(query,"redirect",redirect.toString());}
		if(clientURL!=null){query = WrapperUtils.joinQuery(query,"clientURL",clientURL.toString());}
		if(joinViaHtml5!=null){query = WrapperUtils.joinQuery(query,"joinViaHtml5",joinViaHtml5.toString());}
		if(guest!=null){query = WrapperUtils.joinQuery(query,"guest",guest.toString());}
		return query;
	}
	
	public JoinMeetingRequest() {}
	
	@Override
	public String toString() {
		return "JoinMeetingRequest [fullName=" + fullName + ", meetingID=" + meetingID + ", password=" + password
				+ ", createTime=" + createTime + ", userID=" + userID + ", webVoiceConf=" + webVoiceConf
				+ ", configToken=" + configToken + ", defaultLayout=" + defaultLayout + ", avatarURL=" + avatarURL
				+ ", redirect=" + redirect + ", clientURL=" + clientURL + ", joinViaHtml5=" + joinViaHtml5 + ", guest="
				+ guest + "]";
	}
	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getMeetingID() {
		return meetingID;
	}
	public void setMeetingID(String meetingID) {
		this.meetingID = meetingID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
