package com.bbb.wrapper.responseDTO;

public class TextTrackDTO {
	private String href;
    private String kind;
    private String label;
    private String lang;
    private String source;
    
	@Override
	public String toString() {
		return "TextTrackDTO [href=" + href + ", kind=" + kind + ", label=" + label + ", lang=" + lang + ", source="
				+ source + "]";
	}
	
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
