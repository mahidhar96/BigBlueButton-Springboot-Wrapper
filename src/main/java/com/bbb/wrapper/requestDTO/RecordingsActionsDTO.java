package com.bbb.wrapper.requestDTO;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import com.bbb.wrapper.utils.WrapperUtils;

public class RecordingsActionsDTO {
	private String[] recordIDs;
	private Boolean publish;
	private Boolean delete;
	private Boolean update;
	private String meta;
	
	public String toQuery() throws UnsupportedEncodingException{
		String query = "";
		String records = "";
		if(recordIDs!=null){
			for (String recordID : recordIDs) {
				records = records.concat(recordID).concat(",");
			}
			records = records.substring(0, records.length()-1);
			query = WrapperUtils.joinQuery(query,"recordID",records.toString());
		}
		if(publish!=null){query = WrapperUtils.joinQuery(query,"publish",publish.toString());}
		if(update!=null){query = WrapperUtils.joinQuery(query,"meta",meta.toString());}
		return query;
	}
	
	@Override
	public String toString() {
		return "RecordingsActionsDTO [recordIDs=" + Arrays.toString(recordIDs) + ", publish=" + publish + ", delete="
				+ delete + ", update=" + update + ", meta=" + meta + "]";
	}

	public String[] getRecordIDs() {
		return recordIDs;
	}
	public void setRecordIDs(String[] recordIDs) {
		this.recordIDs = recordIDs;
	}
	public Boolean getPublish() {
		return publish;
	}
	public void setPublish(Boolean publish) {
		this.publish = publish;
	}
	public Boolean getDelete() {
		return delete;
	}
	public void setDelete(Boolean delete) {
		this.delete = delete;
	}
	public Boolean getUpdate() {
		return update;
	}
	public void setUpdate(Boolean update) {
		this.update = update;
	}
	public String getMeta() {
		return meta;
	}
	public void setMeta(String meta) {
		this.meta = meta;
	}
}
