package com.bbb.wrapper.responseDTO;

import java.util.Arrays;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

class ImageDTO{
	@JacksonXmlProperty(isAttribute = true)
	private String alt;//="Welcome To BigBlueButton" 
	@JacksonXmlProperty(isAttribute = true)
	private Integer height;//="136" 
	@JacksonXmlProperty(isAttribute = true)
	private Integer width;//="176"
	@JacksonXmlText
    private String link;
	
	@Override
	public String toString() {
		return "ImageDTO [alt=" + alt + ", height=" + height + ", width=" + width + ", link=" + link + "]";
	}
	
	public String getAlt() {
		return alt;
	}
	public void setAlt(String alt) {
		this.alt = alt;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
}

class PreviewDTO{
	private ImageDTO[] images;

	@Override
	public String toString() {
		return "PreviewDTO [images=" + Arrays.toString(images) + "]";
	}

	public ImageDTO[] getImages() {
		return images;
	}
	public void setImages(ImageDTO[] images) {
		this.images = images;
	}
}

class FormatDTO{
	private String type;//>presentation</type>
	private String url;
	private Integer processingTime;//>7177</processingTime>
	private Integer length;//>0</length>
	private String size;//9220921
    @JacksonXmlElementWrapper(useWrapping = true)
    private PreviewDTO preview;/*<preview>
       <images>
          <image alt="Welcome to" height="136" width="176">https://demo.bigbluebutton.org/presentation/ffbfc4cc24428694e8b53a4e144f414052431693-1530718721124/presentation/d2d9a672040fbde2a47a10bf6c37b6a4b5ae187f-1530718721134/thumbnails/thumb-1.png</image>
          <image alt="(this slide left blank for use as a whiteboard)" height="136" width="176">https://demo.bigbluebutton.org/presentation/ffbfc4cc24428694e8b53a4e144f414052431693-1530718721124/presentation/d2d9a672040fbde2a47a10bf6c37b6a4b5ae187f-1530718721134/thumbnails/thumb-2.png</image>
          <image alt="(this slide left blank for use as a whiteboard)" height="136" width="176">https://demo.bigbluebutton.org/presentation/ffbfc4cc24428694e8b53a4e144f414052431693-1530718721124/presentation/d2d9a672040fbde2a47a10bf6c37b6a4b5ae187f-1530718721134/thumbnails/thumb-3.png</image>
       </images>
    </preview>*/
    
    @Override
	public String toString() {
		return "FormatDTO [type=" + type + ", url=" + url + ", processingTime=" + processingTime + ", length=" + length
				+ ", size=" + size + ", preview=" + preview + "]";
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getProcessingTime() {
		return processingTime;
	}
	public void setProcessingTime(Integer processingTime) {
		this.processingTime = processingTime;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public PreviewDTO getPreview() {
		return preview;
	}
	public void setPreview(PreviewDTO preview) {
		this.preview = preview;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
}

class PlaybackDTO{
	@JacksonXmlElementWrapper(useWrapping = true)
	private FormatDTO format;

	@Override
	public String toString() {
		return "PlaybackDTO [format=" + format + "]";
	}
	public FormatDTO getFormat() {
		return format;
	}
	public void setFormat(FormatDTO format) {
		this.format = format;
	}
}

public class RecordingDTO {
	private String recordID;
	private String meetingID;
	private String internalMeetingID;
	private String name;
	private Boolean isBreakout;
	private Boolean published;
	private String state;//published
	private String startTime;//1530718721124
	private String endTime;//1530718810456
	private Integer participants;
	private String rawSize;//452274062
	private MetadataDTO metadata;/*<metadata>
          <isBreakout>false</isBreakout>
          <meetingName>Fred's Room</meetingName>
          <gl-listed>false</gl-listed>
          <meetingId>c637ba21adcd0191f48f5c4bf23fab0f96ed5c18</meetingId>
       </metadata>*/
	private String size;//9220921
	@JacksonXmlElementWrapper(useWrapping = true)
	private PlaybackDTO playback;/*<playback>
          <format>
             <type>podcast</type>
             <url>https://demo.bigbluebutton.org/podcast/ffbfc4cc24428694e8b53a4e144f414052431693-1530718721124/audio.ogg</url>
             <processingTime>0</processingTime>
             <length>0</length>
          </format>
          <format>
             <type>presentation</type>
             <url>https://demo.bigbluebutton.org/playback/presentation/2.0/playback.html?meetingId=ffbfc4cc24428694e8b53a4e144f414052431693-1530718721124</url>
             <processingTime>7177</processingTime>
             <length>0</length>
             <preview>
                <images>
                   <image alt="Welcome to" height="136" width="176">https://demo.bigbluebutton.org/presentation/ffbfc4cc24428694e8b53a4e144f414052431693-1530718721124/presentation/d2d9a672040fbde2a47a10bf6c37b6a4b5ae187f-1530718721134/thumbnails/thumb-1.png</image>
                   <image alt="(this slide left blank for use as a whiteboard)" height="136" width="176">https://demo.bigbluebutton.org/presentation/ffbfc4cc24428694e8b53a4e144f414052431693-1530718721124/presentation/d2d9a672040fbde2a47a10bf6c37b6a4b5ae187f-1530718721134/thumbnails/thumb-2.png</image>
                   <image alt="(this slide left blank for use as a whiteboard)" height="136" width="176">https://demo.bigbluebutton.org/presentation/ffbfc4cc24428694e8b53a4e144f414052431693-1530718721124/presentation/d2d9a672040fbde2a47a10bf6c37b6a4b5ae187f-1530718721134/thumbnails/thumb-3.png</image>
                </images>
             </preview>
          </format>
       </playback>*/
	private String data;
	
	
	
	@Override
	public String toString() {
		return "RecordingDTO [recordID=" + recordID + ", meetingID=" + meetingID + ", internalMeetingID="
				+ internalMeetingID + ", name=" + name + ", isBreakout=" + isBreakout + ", published=" + published
				+ ", state=" + state + ", startTime=" + startTime + ", endTime=" + endTime + ", participants="
				+ participants + ", rawSize=" + rawSize + ", metadata=" + metadata + ", size=" + size + ", playback="
				+ playback + ", data=" + data + "]";
	}
	
	public String getRecordID() {
		return recordID;
	}
	public void setRecordID(String recordID) {
		this.recordID = recordID;
	}
	public String getMeetingID() {
		return meetingID;
	}
	public void setMeetingID(String meetingID) {
		this.meetingID = meetingID;
	}
	public String getInternalMeetingID() {
		return internalMeetingID;
	}
	public void setInternalMeetingID(String internalMeetingID) {
		this.internalMeetingID = internalMeetingID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIsBreakout() {
		return isBreakout;
	}
	public void setIsBreakout(Boolean isBreakout) {
		this.isBreakout = isBreakout;
	}
	public Boolean getPublished() {
		return published;
	}
	public void setPublished(Boolean published) {
		this.published = published;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public Integer getParticipants() {
		return participants;
	}
	public void setParticipants(Integer participants) {
		this.participants = participants;
	}
	public MetadataDTO getMetadata() {
		return metadata;
	}
	public void setMetadata(MetadataDTO metadata) {
		this.metadata = metadata;
	}
	public PlaybackDTO getPlayback() {
		return playback;
	}
	public void setPlayback(PlaybackDTO playback) {
		this.playback = playback;
	}
	public String getRawSize() {
		return rawSize;
	}
	public void setRawSize(String rawSize) {
		this.rawSize = rawSize;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
}
