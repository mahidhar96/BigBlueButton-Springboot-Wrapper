package com.bbb.wrapper.responseDTO;

import java.util.Arrays;

public class RecordingTextTracksDTO {
	private String returncode;
	private TextTrackDTO[] tracks;
	private String messageKey;
	private String message;
	
	@Override
	public String toString() {
		return "RecordingTextTracksDTO [returncode=" + returncode + ", tracks=" + Arrays.toString(tracks)
				+ ", messageKey=" + messageKey + ", message=" + message + "]";
	}
	
	public String getReturncode() {
		return returncode;
	}
	public void setReturncode(String returncode) {
		this.returncode = returncode;
	}
	public TextTrackDTO[] getTracks() {
		return tracks;
	}
	public void setTracks(TextTrackDTO[] tracks) {
		this.tracks = tracks;
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
