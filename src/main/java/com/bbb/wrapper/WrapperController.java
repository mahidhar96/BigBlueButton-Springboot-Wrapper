package com.bbb.wrapper;

import org.springframework.web.bind.annotation.RestController;

import com.bbb.wrapper.requestDTO.CreateMeetingRequest;
import com.bbb.wrapper.requestDTO.JoinAllMeetingRequest;
import com.bbb.wrapper.requestDTO.JoinMeetingRequest;
import com.bbb.wrapper.responseDTO.CreateMeetingResponseDTO;
import com.bbb.wrapper.responseDTO.JoinMeetingResponseDTO;
import com.bbb.wrapper.services.BBBService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


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
	
	@RequestMapping(value="/joinMeeting",method=RequestMethod.POST)
	public String joinMeeting(@RequestBody JoinMeetingRequest joinMeetingRequest ) throws UnsupportedEncodingException{
		String response = bbbService.joinMeeting(joinMeetingRequest);
		return response;
	}
	
	@RequestMapping(value="/joinAll",method=RequestMethod.POST)
	public JoinMeetingResponseDTO JoinAllURLs(@RequestBody JoinAllMeetingRequest joinAllMeetingRequest ) throws UnsupportedEncodingException, JsonMappingException, JsonProcessingException {
		JoinMeetingResponseDTO response = bbbService.joinAll(joinAllMeetingRequest);
		return response;
	}
}
