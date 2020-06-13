package com.bbb.wrapper.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.bbb.wrapper.requestDTO.CreateMeetingRequest;
import com.bbb.wrapper.requestDTO.JoinAllMeetingRequest;
import com.bbb.wrapper.requestDTO.JoinMeetingRequest;
import com.bbb.wrapper.responseDTO.CheckAPIResponse;
import com.bbb.wrapper.responseDTO.CreateMeetingResponseDTO;
import com.bbb.wrapper.responseDTO.JoinMeetingResponseDTO;
import com.bbb.wrapper.utils.WrapperUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.UnsupportedEncodingException;

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
		System.out.println(bbb_server.concat(finalquery));
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
		
		joinMeetingRequest.setPassword(joinAllMeetingRequest.getAttendeePassword());
		queryString = joinMeetingRequest.toQuery();
		checksum = WrapperUtils.generateSHA1(callName, queryString, bbb_secret);
		finalQuery = WrapperUtils.finalQuery(callName, queryString, checksum);
		joinMeetingResponseDTO.setAttendeeURL(bbb_server.concat(finalQuery));
		
		joinMeetingRequest.setPassword(joinAllMeetingRequest.getModeratorPassword());
		queryString = joinMeetingRequest.toQuery();
		checksum = WrapperUtils.generateSHA1(callName, queryString, bbb_secret);
		finalQuery = WrapperUtils.finalQuery(callName, queryString, checksum);
		joinMeetingResponseDTO.setModeratorURL(bbb_server.concat(finalQuery));
		
		return joinMeetingResponseDTO;
	}
}
