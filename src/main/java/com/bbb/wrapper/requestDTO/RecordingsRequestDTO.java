package com.bbb.wrapper.requestDTO;

import java.io.UnsupportedEncodingException;

import com.bbb.wrapper.utils.WrapperUtils;

public class RecordingsRequestDTO {
	public String meetingID;
	public String recordID;
	public String state;
	public String meta;
	
	public String toQuery() throws UnsupportedEncodingException {
		String query="";
		if(meetingID!=null){query = WrapperUtils.joinQuery(query,"meetingID",meetingID.toString());}
		if(recordID!=null){query = WrapperUtils.joinQuery(query,"recordID",recordID.toString());}
		if(state!=null){query = WrapperUtils.joinQuery(query,"state",state.toString());}
		if(meta!=null){query = WrapperUtils.joinQuery(query,"meta",meta.toString());}
		return query;
	}
	
	@Override
	public String toString() {
		return "RecordingsDTO [meetingID=" + meetingID + ", recordID=" + recordID + ", state=" + state + ", meta="
				+ meta + "]";
	}

	public String getMeetingID() {
		return meetingID;
	}
	public void setMeetingID(String meetingID) {
		this.meetingID = meetingID;
	}
	public String getRecordID() {
		return recordID;
	}
	public void setRecordID(String recordID) {
		this.recordID = recordID;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMeta() {
		return meta;
	}
	public void setMeta(String meta) {
		this.meta = meta;
	}
	
}
