package com.bbb.wrapper;

import org.springframework.web.bind.annotation.RestController;

import com.bbb.wrapper.requestDTO.CreateMeetingRequest;
import com.bbb.wrapper.requestDTO.JoinAllMeetingRequest;
import com.bbb.wrapper.requestDTO.JoinMeetingRequest;
import com.bbb.wrapper.requestDTO.RecordingsRequestDTO;
import com.bbb.wrapper.responseDTO.CreateMeetingResponseDTO;
import com.bbb.wrapper.responseDTO.JoinMeetingResponseDTO;
import com.bbb.wrapper.responseDTO.MeetingInfoDTO;
import com.bbb.wrapper.responseDTO.MeetingInfoListDTO;
import com.bbb.wrapper.responseDTO.MeetingStatusDTO;
import com.bbb.wrapper.responseDTO.RecordingListDTO;
import com.bbb.wrapper.services.BBBService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class WrapperController {
	@Autowired
	private BBBService bbbService;
	
	@RequestMapping("/")
	public String index() {
		return "Wrapper Running";
	}
	
	@RequestMapping("/bbb")
	public String checkApi() throws JsonMappingException, JsonProcessingException {
		String response = bbbService.checkAPI();
		return response;
	}
	
	@RequestMapping(value="/createMeeting",method=RequestMethod.POST)
	public CreateMeetingResponseDTO createMeeting(@RequestBody CreateMeetingRequest createMeetingRequest ) throws UnsupportedEncodingException, JsonMappingException, JsonProcessingException {
		CreateMeetingResponseDTO response = bbbService.createMeeting(createMeetingRequest);
		return response;
	}
	
	@RequestMapping(value="/getSessionURL",method=RequestMethod.POST)
	public String getSessionURL() {
		return "null";
	};
	
	@RequestMapping(value="/joinMeeting",method=RequestMethod.POST)
	public String joinMeeting(@RequestBody JoinMeetingRequest joinMeetingRequest ) throws UnsupportedEncodingException{
		String response = bbbService.joinMeeting(joinMeetingRequest);
		return response;
	}
	
	@RequestMapping(value="/joinAll",method=RequestMethod.POST)
	public JoinMeetingResponseDTO JoinAllURLs(@RequestBody JoinAllMeetingRequest joinAllMeetingRequest ) throws UnsupportedEncodingException {
		JoinMeetingResponseDTO response = bbbService.joinAll(joinAllMeetingRequest);
		return response;
	}
	
	@RequestMapping(value="/isMeetingRunning",method=RequestMethod.GET)
	public MeetingStatusDTO isMeetingRunning(@RequestParam String meetingID) throws JsonMappingException, JsonProcessingException, UnsupportedEncodingException {
		MeetingStatusDTO response = bbbService.isMeetingRunning(meetingID);
		return response;
	}
	
	@RequestMapping(value="/endMeeting",method=RequestMethod.GET)
	public MeetingStatusDTO endRunning(@RequestParam String meetingID, @RequestParam String password) throws JsonMappingException, JsonProcessingException, UnsupportedEncodingException {
		MeetingStatusDTO response = bbbService.endMeeting(meetingID,password);
		return response;
	}
	
	@RequestMapping(value="/getMeetingInfo",method=RequestMethod.GET)
	public MeetingInfoDTO getMeetingInfo(@RequestParam String meetingID) throws JsonMappingException, JsonProcessingException, UnsupportedEncodingException {
		MeetingInfoDTO response = bbbService.getMeetingInfo(meetingID);
		return response;
	}
	
	@RequestMapping(value="/getMeetings",method=RequestMethod.GET)
	public MeetingInfoListDTO getMeetings() throws JsonMappingException, JsonProcessingException, UnsupportedEncodingException {
		MeetingInfoListDTO response = bbbService.getMeetings();
		return response;
	}
	
	@RequestMapping(value="/getRecordings",method=RequestMethod.POST)
	public RecordingListDTO getRecordings(@RequestBody RecordingsRequestDTO recordingsRequestDTO) throws JsonMappingException, JsonProcessingException, UnsupportedEncodingException {
		RecordingListDTO response = bbbService.getRecordings(recordingsRequestDTO);
		return response;
	}
}
