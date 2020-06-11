package com.bbb.wrapper.responseDTO;

public class CheckAPIResponse {
	String returncode;
	String version;
	
	@Override
	public String toString() {
		return "CheckAPIResponse [returncode=" + returncode + ", version=" + version + "]";
	}
	public String getReturncode() {
		return returncode;
	}
	public void setReturncode(String returncode) {
		this.returncode = returncode;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	
}
