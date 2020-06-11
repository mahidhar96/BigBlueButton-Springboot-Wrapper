package com.bbb.wrapper.requestDTO;

import org.springframework.web.bind.annotation.RequestMapping;

import com.bbb.wrapper.utils.WrapperUtils;

import java.io.UnsupportedEncodingException;

@RequestMapping//35
public class CreateMeetingRequest {
	private String name;
	//required
	private String meetingID;
	private String attendeePW;
	private String moderatorPW;
	private String welcome;
	private String dialNumber;
	private String voiceBridge;
	private Integer maxParticipants;
	private String logoutURL;
	private Boolean record;
	
	//mins
	private Integer duration;
	//breakoutroom required
	private Boolean isBreakout;
	private String parentMeetingID;
	private Number sequence;
	private Boolean freeJoin;
	private String meta;
	private String moderatorOnlyMessage;
	private Boolean autoStartRecording;
	private Boolean allowStartStopRecording;
	private Boolean webcamsOnlyForModerator;
	private String logo;
	private String bannerText;
	private String bannerColor;
	private String copyright;
	private Boolean muteOnStart;
	private Boolean allowModsToUnmuteUsers;
	private Boolean lockSettingsDisableCam;
	private Boolean lockSettingsDisableMic;
	private Boolean lockSettingsDisablePrivateChat;
	private Boolean lockSettingsDisablePublicChat;
	private Boolean lockSettingsDisableNote;
	private Boolean lockSettingsLockedLayout;
	private Boolean lockSettingsLockOnJoinConfigurable;
	private Boolean lockSettingsLockOnJoin;
	private String guestPolicy;
	
	
	@Override
	public String toString() {
		return "CreateMeetingRequest [name=" + name + ", meetingID=" + meetingID + ", attendeePW=" + attendeePW
				+ ", moderatorPW=" + moderatorPW + ", welcome=" + welcome + ", dialNumber=" + dialNumber
				+ ", voiceBridge=" + voiceBridge + ", maxParticipants=" + maxParticipants + ", logoutURL=" + logoutURL
				+ ", record=" + record + ", duration=" + duration + ", isBreakout=" + isBreakout + ", parentMeetingID="
				+ parentMeetingID + ", sequence=" + sequence + ", freeJoin=" + freeJoin + ", meta=" + meta
				+ ", moderatorOnlyMessage=" + moderatorOnlyMessage + ", autoStartRecording=" + autoStartRecording
				+ ", allowStartStopRecording=" + allowStartStopRecording + ", webcamsOnlyForModerator="
				+ webcamsOnlyForModerator + ", logo=" + logo + ", bannerText=" + bannerText + ", bannerColor="
				+ bannerColor + ", copyright=" + copyright + ", muteOnStart=" + muteOnStart
				+ ", allowModsToUnmuteUsers=" + allowModsToUnmuteUsers + ", lockSettingsDisableCam="
				+ lockSettingsDisableCam + ", lockSettingsDisableMic=" + lockSettingsDisableMic
				+ ", lockSettingsDisablePrivateChat=" + lockSettingsDisablePrivateChat
				+ ", lockSettingsDisablePublicChat=" + lockSettingsDisablePublicChat + ", lockSettingsDisableNote="
				+ lockSettingsDisableNote + ", lockSettingsLockedLayout=" + lockSettingsLockedLayout
				+ ", lockSettingsLockOnJoinConfigurable=" + lockSettingsLockOnJoinConfigurable
				+ ", lockSettingsLockOnJoin=" + lockSettingsLockOnJoin + ", guestPolicy=" + guestPolicy + "]";
	}
	
	public String toQuery() throws UnsupportedEncodingException {
		String query = "";
		if(name!=null){query = WrapperUtils.joinQuery(query,"name",name.toString());}
		if(meetingID!=null){query = WrapperUtils.joinQuery(query,"meetingID",meetingID.toString());}
		if(attendeePW!=null){query = WrapperUtils.joinQuery(query,"attendeePW",attendeePW.toString());}
		if(moderatorPW!=null){query = WrapperUtils.joinQuery(query,"moderatorPW",moderatorPW.toString());}
		if(welcome!=null){query = WrapperUtils.joinQuery(query,"welcome",welcome.toString());}
		if(dialNumber!=null){query = WrapperUtils.joinQuery(query,"dialNumber",dialNumber.toString());}
		if(voiceBridge!=null){query = WrapperUtils.joinQuery(query,"voiceBridge",voiceBridge.toString());}
		if(maxParticipants!=null){query = WrapperUtils.joinQuery(query,"maxParticipants",maxParticipants.toString());}
		if(logoutURL!=null){query = WrapperUtils.joinQuery(query,"logoutURL",logoutURL.toString());}
		if(record!=null){query = WrapperUtils.joinQuery(query,"record",record.toString());}
		if(duration!=null){query = WrapperUtils.joinQuery(query,"duration",duration.toString());}
		if(isBreakout!=null){query = WrapperUtils.joinQuery(query,"isBreakout",isBreakout.toString());}
		if(parentMeetingID!=null){query = WrapperUtils.joinQuery(query,"parentMeetingID",parentMeetingID.toString());}
		if(sequence!=null){query = WrapperUtils.joinQuery(query,"sequence",sequence.toString());}
		if(freeJoin!=null){query = WrapperUtils.joinQuery(query,"freeJoin",freeJoin.toString());}
		if(meta!=null){query = WrapperUtils.joinQuery(query,"meta",meta.toString());}
		if(moderatorOnlyMessage!=null){query = WrapperUtils.joinQuery(query,"moderatorOnlyMessage",moderatorOnlyMessage.toString());}
		if(autoStartRecording!=null){query = WrapperUtils.joinQuery(query,"autoStartRecording",autoStartRecording.toString());}
		if(allowStartStopRecording!=null){query = WrapperUtils.joinQuery(query,"allowStartStopRecording",allowStartStopRecording.toString());}
		if(webcamsOnlyForModerator!=null){query = WrapperUtils.joinQuery(query,"webcamsOnlyForModerator",webcamsOnlyForModerator.toString());}
		if(logo!=null){query = WrapperUtils.joinQuery(query,"logo",logo.toString());}
		if(bannerText!=null){query = WrapperUtils.joinQuery(query,"bannerText",bannerText.toString());}
		if(bannerColor!=null){query = WrapperUtils.joinQuery(query,"bannerColor",bannerColor.toString());}
		if(copyright!=null){query = WrapperUtils.joinQuery(query,"copyright",copyright.toString());}
		if(muteOnStart!=null){query = WrapperUtils.joinQuery(query,"muteOnStart",muteOnStart.toString());}
		if(allowModsToUnmuteUsers!=null){query = WrapperUtils.joinQuery(query,"allowModsToUnmuteUsers",allowModsToUnmuteUsers.toString());}
		if(lockSettingsDisableCam!=null){query = WrapperUtils.joinQuery(query,"lockSettingsDisableCam",lockSettingsDisableCam.toString());}
		if(lockSettingsDisableMic!=null){query = WrapperUtils.joinQuery(query,"lockSettingsDisableMic",lockSettingsDisableMic.toString());}
		if(lockSettingsDisablePrivateChat!=null){query = WrapperUtils.joinQuery(query,"lockSettingsDisablePrivateChat",lockSettingsDisablePrivateChat.toString());}
		if(lockSettingsDisablePublicChat!=null){query = WrapperUtils.joinQuery(query,"lockSettingsDisablePublicChat",lockSettingsDisablePublicChat.toString());}
		if(lockSettingsDisableNote!=null){query = WrapperUtils.joinQuery(query,"lockSettingsDisableNote",lockSettingsDisableNote.toString());}
		if(lockSettingsLockedLayout!=null){query = WrapperUtils.joinQuery(query,"lockSettingsLockedLayout",lockSettingsLockedLayout.toString());}
		if(lockSettingsLockOnJoinConfigurable!=null){query = WrapperUtils.joinQuery(query,"lockSettingsLockOnJoinConfigurable",lockSettingsLockOnJoinConfigurable.toString());}
		if(lockSettingsLockOnJoin!=null){query = WrapperUtils.joinQuery(query,"lockSettingsLockOnJoin",lockSettingsLockOnJoin.toString());}
		if(guestPolicy!=null){query = WrapperUtils.joinQuery(query,"guestPolicy",guestPolicy.toString());}
		return query;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMeetingID() {
		return meetingID;
	}
	public void setMeetingID(String meetingID) {
		this.meetingID = meetingID;
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
	public String getWelcome() {
		return welcome;
	}
	public void setWelcome(String welcome) {
		this.welcome = welcome;
	}
	public String getDialNumber() {
		return dialNumber;
	}
	public void setDialNumber(String dialNumber) {
		this.dialNumber = dialNumber;
	}
	public String getVoiceBridge() {
		return voiceBridge;
	}
	public void setVoiceBridge(String voiceBridge) {
		this.voiceBridge = voiceBridge;
	}
	public Integer getMaxParticipants() {
		return maxParticipants;
	}
	public void setMaxParticipants(Integer maxParticipants) {
		this.maxParticipants = maxParticipants;
	}
	public String getLogoutURL() {
		return logoutURL;
	}
	public void setLogoutURL(String logoutURL) {
		this.logoutURL = logoutURL;
	}
	public Boolean getRecord() {
		return record;
	}
	public void setRecord(Boolean record) {
		this.record = record;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Boolean getIsBreakout() {
		return isBreakout;
	}
	public void setIsBreakout(Boolean isBreakout) {
		this.isBreakout = isBreakout;
	}
	public String getParentMeetingID() {
		return parentMeetingID;
	}
	public void setParentMeetingID(String parentMeetingID) {
		this.parentMeetingID = parentMeetingID;
	}
	public Number getSequence() {
		return sequence;
	}
	public void setSequence(Number sequence) {
		this.sequence = sequence;
	}
	public Boolean getFreeJoin() {
		return freeJoin;
	}
	public void setFreeJoin(Boolean freeJoin) {
		this.freeJoin = freeJoin;
	}
	public String getMeta() {
		return meta;
	}
	public void setMeta(String meta) {
		this.meta = meta;
	}
	public String getModeratorOnlyMessage() {
		return moderatorOnlyMessage;
	}
	public void setModeratorOnlyMessage(String moderatorOnlyMessage) {
		this.moderatorOnlyMessage = moderatorOnlyMessage;
	}
	public Boolean getAutoStartRecording() {
		return autoStartRecording;
	}
	public void setAutoStartRecording(Boolean autoStartRecording) {
		this.autoStartRecording = autoStartRecording;
	}
	public Boolean getAllowStartStopRecording() {
		return allowStartStopRecording;
	}
	public void setAllowStartStopRecording(Boolean allowStartStopRecording) {
		this.allowStartStopRecording = allowStartStopRecording;
	}
	public Boolean getWebcamsOnlyForModerator() {
		return webcamsOnlyForModerator;
	}
	public void setWebcamsOnlyForModerator(Boolean webcamsOnlyForModerator) {
		this.webcamsOnlyForModerator = webcamsOnlyForModerator;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getBannerText() {
		return bannerText;
	}
	public void setBannerText(String bannerText) {
		this.bannerText = bannerText;
	}
	public String getBannerColor() {
		return bannerColor;
	}
	public void setBannerColor(String bannerColor) {
		this.bannerColor = bannerColor;
	}
	public String getCopyright() {
		return copyright;
	}
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	public Boolean getMuteOnStart() {
		return muteOnStart;
	}
	public void setMuteOnStart(Boolean muteOnStart) {
		this.muteOnStart = muteOnStart;
	}
	public Boolean getAllowModsToUnmuteUsers() {
		return allowModsToUnmuteUsers;
	}
	public void setAllowModsToUnmuteUsers(Boolean allowModsToUnmuteUsers) {
		this.allowModsToUnmuteUsers = allowModsToUnmuteUsers;
	}
	public Boolean getLockSettingsDisableCam() {
		return lockSettingsDisableCam;
	}
	public void setLockSettingsDisableCam(Boolean lockSettingsDisableCam) {
		this.lockSettingsDisableCam = lockSettingsDisableCam;
	}
	public Boolean getLockSettingsDisableMic() {
		return lockSettingsDisableMic;
	}
	public void setLockSettingsDisableMic(Boolean lockSettingsDisableMic) {
		this.lockSettingsDisableMic = lockSettingsDisableMic;
	}
	public Boolean getLockSettingsDisablePrivateChat() {
		return lockSettingsDisablePrivateChat;
	}
	public void setLockSettingsDisablePrivateChat(Boolean lockSettingsDisablePrivateChat) {
		this.lockSettingsDisablePrivateChat = lockSettingsDisablePrivateChat;
	}
	public Boolean getLockSettingsDisablePublicChat() {
		return lockSettingsDisablePublicChat;
	}
	public void setLockSettingsDisablePublicChat(Boolean lockSettingsDisablePublicChat) {
		this.lockSettingsDisablePublicChat = lockSettingsDisablePublicChat;
	}
	public Boolean getLockSettingsDisableNote() {
		return lockSettingsDisableNote;
	}
	public void setLockSettingsDisableNote(Boolean lockSettingsDisableNote) {
		this.lockSettingsDisableNote = lockSettingsDisableNote;
	}
	public Boolean getLockSettingsLockedLayout() {
		return lockSettingsLockedLayout;
	}
	public void setLockSettingsLockedLayout(Boolean lockSettingsLockedLayout) {
		this.lockSettingsLockedLayout = lockSettingsLockedLayout;
	}
	public Boolean getLockSettingsLockOnJoinConfigurable() {
		return lockSettingsLockOnJoinConfigurable;
	}
	public void setLockSettingsLockOnJoinConfigurable(Boolean lockSettingsLockOnJoinConfigurable) {
		this.lockSettingsLockOnJoinConfigurable = lockSettingsLockOnJoinConfigurable;
	}
	public Boolean getLockSettingsLockOnJoin() {
		return lockSettingsLockOnJoin;
	}
	public void setLockSettingsLockOnJoin(Boolean lockSettingsLockOnJoin) {
		this.lockSettingsLockOnJoin = lockSettingsLockOnJoin;
	}
	public String getGuestPolicy() {
		return guestPolicy;
	}
	public void setGuestPolicy(String guestPolicy) {
		this.guestPolicy = guestPolicy;
	}
	
	
}
