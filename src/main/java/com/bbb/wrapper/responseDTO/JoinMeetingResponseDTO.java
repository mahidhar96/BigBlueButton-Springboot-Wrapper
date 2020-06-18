package com.bbb.wrapper.responseDTO;

import java.util.List;

import org.springframework.web.bind.annotation.ResponseBody;



@ResponseBody
public class JoinMeetingResponseDTO {
	private List<String> moderatorURLs;
	private List<String> attendeeURLs;
	private String genericModeratorURL;
	private String genericAttendeeURL;
	private String unsafeURL;
	
	@Override
	public String toString() {
		return "JoinMeetingResponseDTO [moderatorURLs=" + moderatorURLs + ", attendeeURLs=" + attendeeURLs
				+ ", genericModeratorURL=" + genericModeratorURL + ", genericAttendeeURL=" + genericAttendeeURL
				+ ", unsafeURL=" + unsafeURL + "]";
	}

	public List<String> getModeratorURLs() {
		return moderatorURLs;
	}

	public void setModeratorURLs(List<String> moderatorURLs) {
		this.moderatorURLs = moderatorURLs;
	}

	public List<String> getAttendeeURLs() {
		return attendeeURLs;
	}

	public void setAttendeeURLs(List<String> attendeeURLs) {
		this.attendeeURLs = attendeeURLs;
	}

	public String getGenericModeratorURL() {
		return genericModeratorURL;
	}

	public void setGenericModeratorURL(String genericModeratorURL) {
		this.genericModeratorURL = genericModeratorURL;
	}

	public String getGenericAttendeeURL() {
		return genericAttendeeURL;
	}

	public void setGenericAttendeeURL(String genericAttendeeURL) {
		this.genericAttendeeURL = genericAttendeeURL;
	}

	public String getUnsafeURL() {
		return unsafeURL;
	}

	public void setUnsafeURL(String unsafeURL) {
		this.unsafeURL = unsafeURL;
	}
	
	

}
