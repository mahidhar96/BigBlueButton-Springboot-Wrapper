package com.bbb.wrapper.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.bbb.wrapper.requestDTO.CreateMeetingRequest;
import com.bbb.wrapper.requestDTO.JoinAllMeetingRequest;
import com.bbb.wrapper.requestDTO.JoinMeetingRequest;
import com.bbb.wrapper.requestDTO.RecordingsRequestDTO;
import com.bbb.wrapper.responseDTO.CheckAPIResponse;
import com.bbb.wrapper.responseDTO.CreateMeetingResponseDTO;
import com.bbb.wrapper.responseDTO.JoinMeetingResponseDTO;
import com.bbb.wrapper.responseDTO.MeetingInfoDTO;
import com.bbb.wrapper.responseDTO.MeetingInfoListDTO;
import com.bbb.wrapper.responseDTO.MeetingStatusDTO;
import com.bbb.wrapper.responseDTO.RecordingListDTO;
import com.bbb.wrapper.utils.WrapperUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@Component
public class BBBService {

	public String bbb_server = "";
	public String bbb_secret = "";
	
//	public void analyze(Object obj){
//	    ReflectionUtils.doWithFields(obj.getClass(), field -> {
//
//	        System.out.println("Field name: " + field.getName());
//	        field.setAccessible(true);
//	        System.out.println("Field value: "+ field.get(obj));
//
//	    });
//	}
	
	public String checkAPI() throws JsonMappingException, JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response
		  = restTemplate.getForEntity(bbb_server, String.class);
		XmlMapper xmlMapper = new XmlMapper();
		if (response.getStatusCode() == HttpStatus.OK) {
			CheckAPIResponse checkAPIResponse
				= xmlMapper.readValue(response.getBody(), CheckAPIResponse.class);
			xmlMapper.readValue(response.getBody(), CheckAPIResponse.class);
			return checkAPIResponse.toString();
		}else {
			return response.toString();
		}	
	}
	
	public CreateMeetingResponseDTO createMeeting(CreateMeetingRequest createMeetingRequest) throws UnsupportedEncodingException, JsonMappingException, JsonProcessingException {
		String callName = "create";
		String queryString = createMeetingRequest.toQuery();
		String checksum = WrapperUtils.generateSHA1(callName, queryString, bbb_secret);
		String finalquery = WrapperUtils.finalQuery(callName, queryString, checksum);
		CreateMeetingResponseDTO createMeetingResponseDTO = new CreateMeetingResponseDTO();
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response
		  = restTemplate.getForEntity(bbb_server.concat(finalquery), String.class);
		XmlMapper xmlMapper = new XmlMapper();
		if (response.getStatusCode() == HttpStatus.OK) {
			createMeetingResponseDTO
				= xmlMapper.readValue(response.getBody(), CreateMeetingResponseDTO.class);
			xmlMapper.readValue(response.getBody(), CreateMeetingResponseDTO.class);
		}
		
		return createMeetingResponseDTO;
	}
	
	public String joinMeeting(JoinMeetingRequest joinMeetingRequest) throws UnsupportedEncodingException{
		String callName = "join";
		String queryString = joinMeetingRequest.toQuery();
		String checksum = WrapperUtils.generateSHA1(callName, queryString, bbb_secret);
		String finalQuery = WrapperUtils.finalQuery(callName, queryString, checksum);
		return bbb_server.concat(finalQuery);
	}
	
	public JoinMeetingResponseDTO joinAll(JoinAllMeetingRequest joinAllMeetingRequest) throws UnsupportedEncodingException{
		String callName = "join";
		JoinMeetingResponseDTO joinMeetingResponseDTO = new JoinMeetingResponseDTO();
		JoinMeetingRequest joinMeetingRequest = new JoinMeetingRequest(joinAllMeetingRequest);
		String queryString = joinMeetingRequest.toQuery();
		String checksum = WrapperUtils.generateSHA1(callName, queryString, bbb_secret);
		String finalQuery = WrapperUtils.finalQuery(callName, queryString, checksum);
		joinMeetingResponseDTO.setUnsafeURL(bbb_server.concat(finalQuery));
		
		joinMeetingRequest.setFullName(null);
		queryString = joinMeetingRequest.toQuery();
		checksum = WrapperUtils.generateSHA1(callName, queryString, bbb_secret);
		finalQuery = WrapperUtils.finalQuery(callName, queryString, checksum);
		joinMeetingResponseDTO.setGenericAttendeeURL(bbb_server.concat(finalQuery));
		
		List<String> attendeeNames = joinAllMeetingRequest.getAttendeeFullNames();
		List<String> attendeeURLs = new ArrayList<String>();
		joinMeetingRequest.setPassword(joinAllMeetingRequest.getAttendeePassword());
		for (String attendeeName : attendeeNames) {
			joinMeetingRequest.setFullName(attendeeName);
			queryString = joinMeetingRequest.toQuery();
			checksum = WrapperUtils.generateSHA1(callName, queryString, bbb_secret);
			finalQuery = WrapperUtils.finalQuery(callName, queryString, checksum);
			attendeeURLs.add(bbb_server.concat(finalQuery));
			joinMeetingResponseDTO.setAttendeeURLs(attendeeURLs);
		}
		
		joinMeetingRequest.setFullName(null);
		queryString = joinMeetingRequest.toQuery();
		checksum = WrapperUtils.generateSHA1(callName, queryString, bbb_secret);
		finalQuery = WrapperUtils.finalQuery(callName, queryString, checksum);
		joinMeetingResponseDTO.setGenericModeratorURL(bbb_server.concat(finalQuery));
		
		List<String> moderatorNames = joinAllMeetingRequest.getModeratorFullNames();
		List<String> moderatorURLs = new ArrayList<String>();
		joinMeetingRequest.setPassword(joinAllMeetingRequest.getAttendeePassword());
		for (String moderatorName : moderatorNames) {
			joinMeetingRequest.setFullName(moderatorName);
			queryString = joinMeetingRequest.toQuery();
			checksum = WrapperUtils.generateSHA1(callName, queryString, bbb_secret);
			finalQuery = WrapperUtils.finalQuery(callName, queryString, checksum);
			moderatorURLs.add(bbb_server.concat(finalQuery));
			joinMeetingResponseDTO.setModeratorURLs(moderatorURLs);
		}

		return joinMeetingResponseDTO;
	}
	
	public MeetingStatusDTO isMeetingRunning(String meetingID) throws JsonMappingException, JsonProcessingException, UnsupportedEncodingException{
		String callName = "isMeetingRunning";
		String queryString = WrapperUtils.joinQuery("", "meetingID", meetingID);
		String checksum = WrapperUtils.generateSHA1(callName, queryString, bbb_secret);
		String finalquery = WrapperUtils.finalQuery(callName, queryString, checksum);
		MeetingStatusDTO meetingStatusDTO = new MeetingStatusDTO();
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response
		  = restTemplate.getForEntity(bbb_server.concat(finalquery), String.class);
		XmlMapper xmlMapper = new XmlMapper();
		if (response.getStatusCode() == HttpStatus.OK) {
			meetingStatusDTO
				= xmlMapper.readValue(response.getBody(), MeetingStatusDTO.class);
			return meetingStatusDTO;
		}else {
			System.out.println(response.getStatusCode());
			return meetingStatusDTO;
		}
	}
	
	public MeetingStatusDTO endMeeting(String meetingID, String moderatorPassword) throws JsonMappingException, JsonProcessingException, UnsupportedEncodingException{
		String callName = "end";
		String queryString = WrapperUtils.joinQuery("", "meetingID", meetingID);
		queryString = WrapperUtils.joinQuery(queryString, "password", moderatorPassword);
		String checksum = WrapperUtils.generateSHA1(callName, queryString, bbb_secret);
		String finalquery = WrapperUtils.finalQuery(callName, queryString, checksum);
		MeetingStatusDTO meetingStatusDTO = new MeetingStatusDTO();
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response
		  = restTemplate.getForEntity(bbb_server.concat(finalquery), String.class);
		XmlMapper xmlMapper = new XmlMapper();
		if (response.getStatusCode() == HttpStatus.OK) {
			meetingStatusDTO
				= xmlMapper.readValue(response.getBody(), MeetingStatusDTO.class);
			return meetingStatusDTO;
		}else {
			System.out.println(response.getStatusCode());
			return meetingStatusDTO;
		}
	}
	
	public MeetingInfoDTO getMeetingInfo(String meetingID) throws JsonMappingException, JsonProcessingException, UnsupportedEncodingException{
		//ToDo: Manage Breakouts
		
		String callName = "getMeetingInfo";
		String queryString = WrapperUtils.joinQuery("", "meetingID", meetingID);
		String checksum = WrapperUtils.generateSHA1(callName, queryString, bbb_secret);
		String finalquery = WrapperUtils.finalQuery(callName, queryString, checksum);
		MeetingInfoDTO meetingInfoDTO = new MeetingInfoDTO();
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response
		  = restTemplate.getForEntity(bbb_server.concat(finalquery), String.class);
		XmlMapper xmlMapper = new XmlMapper();
		if (response.getStatusCode() == HttpStatus.OK) {
			meetingInfoDTO
				= xmlMapper.readValue(response.getBody(), MeetingInfoDTO.class);
			return meetingInfoDTO;
		}else {
			System.out.println(response.getStatusCode());
			return meetingInfoDTO;
		}
	}
	
	public MeetingInfoListDTO getMeetings() throws JsonMappingException, JsonProcessingException, UnsupportedEncodingException{
		String callName = "getMeetings";
		String queryString = "";
		String checksum = WrapperUtils.generateSHA1(callName, queryString, bbb_secret);
		String finalquery = WrapperUtils.finalQuery(callName, queryString, checksum);
		MeetingInfoListDTO meetingInfoListDTO = new MeetingInfoListDTO();
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response
		  = restTemplate.getForEntity(bbb_server.concat(finalquery), String.class);
		XmlMapper xmlMapper = new XmlMapper();
		if (response.getStatusCode() == HttpStatus.OK) {
			meetingInfoListDTO
				= xmlMapper.readValue(response.getBody(), MeetingInfoListDTO.class);
			return meetingInfoListDTO;
		}else {
			System.out.println(response.toString());
			return meetingInfoListDTO;
		}
	}
	
	public RecordingListDTO getRecordings(RecordingsRequestDTO recordingsRequestDTO) throws JsonMappingException, JsonProcessingException, UnsupportedEncodingException{
		String callName = "getRecordings";
		String queryString = recordingsRequestDTO.toQuery();
		String checksum = WrapperUtils.generateSHA1(callName, queryString, bbb_secret);
		String finalquery = WrapperUtils.finalQuery(callName, queryString, checksum);
		RecordingListDTO recordingListDTO = new RecordingListDTO();
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response
		  = restTemplate.getForEntity(bbb_server.concat(finalquery), String.class);
		System.out.println(response.toString());
		XmlMapper xmlMapper = new XmlMapper();
		if (response.getStatusCode() == HttpStatus.OK) {
			recordingListDTO
				= xmlMapper.readValue(response.getBody(), RecordingListDTO.class);
			return recordingListDTO;
		}else {
			System.out.println(response.toString());
			return recordingListDTO;
		}
	}
}
