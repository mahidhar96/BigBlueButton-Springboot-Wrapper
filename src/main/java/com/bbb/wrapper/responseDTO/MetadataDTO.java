package com.bbb.wrapper.responseDTO;

public class MetadataDTO {
	public Boolean isBreakout;
    public String meetingId;
    public String meetingName;
    
	@Override
	public String toString() {
		return "MetadataDTO [isBreakout=" + isBreakout + ", meetingId=" + meetingId + ", meetingName=" + meetingName
				+ "]";
	}
	
	public Boolean getIsBreakout() {
		return isBreakout;
	}
	public void setIsBreakout(Boolean isBreakout) {
		this.isBreakout = isBreakout;
	}
	public String getMeetingId() {
		return meetingId;
	}
	public void setMeetingId(String meetingId) {
		this.meetingId = meetingId;
	}
	public String getMeetingName() {
		return meetingName;
	}
	public void setMeetingName(String meetingName) {
		this.meetingName = meetingName;
	}

}
