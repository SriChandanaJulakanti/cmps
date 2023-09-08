package com.southern.cmps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.southern.cmps.response.CmpsResponse;
import com.southern.cmps.response.CmpsResponse.Status;
import com.southern.cmps.service.CmpsService;
import com.southern.cmps.service.exception.CmpsException;

@RestController
@RequestMapping("student")
public class StudentController {

	@Autowired
	private CmpsService cmpsServiceImpl;
	
	@GetMapping("/getStudentDetail")
	public ResponseEntity<CmpsResponse> getStudentDetail(@RequestParam String uNumber) throws CmpsException {
		return new ResponseEntity<CmpsResponse>(new CmpsResponse(Status.SUCCESS, null, cmpsServiceImpl.getStudentDetail(uNumber)),HttpStatus.OK);
	}

	@GetMapping("/concentrations")
	public ResponseEntity<CmpsResponse> getConcentrations() throws CmpsException {
		return new ResponseEntity<CmpsResponse>(new CmpsResponse(Status.SUCCESS, null, cmpsServiceImpl.getConcentrations()),HttpStatus.OK);
	}
	
 }
