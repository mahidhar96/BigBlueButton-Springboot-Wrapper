package com.bbb.wrapper.responseDTO;

public class JoinMeetingResponseDTO {
	String moderatorURL;
	String attendeeURL;
	String unsafeURL;
	
	@Override
	public String toString() {
		return "JoinMeetingResponseDTO [moderatorURL=" + moderatorURL + ", attendeeURL=" + attendeeURL + ", unsafeURL="
				+ unsafeURL + "]";
	}
	
	public String getModeratorURL() {
		return moderatorURL;
	}
	public void setModeratorURL(String moderatorURL) {
		this.moderatorURL = moderatorURL;
	}
	public String getAttendeeURL() {
		return attendeeURL;
	}
	public void setAttendeeURL(String attendeeURL) {
		this.attendeeURL = attendeeURL;
	}
	public String getUnsafeURL() {
		return unsafeURL;
	}
	public void setUnsafeURL(String unsafeURL) {
		this.unsafeURL = unsafeURL;
	}
}
