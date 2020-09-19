package com.example.mindtree.feedbackservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.mindtree.feedbackservice.FeedBackFormModel;
import com.example.mindtree.feedbackservice.FeedBackService;
import com.fasterxml.jackson.core.JsonProcessingException;

@Controller
@RequestMapping(value = "/api")
public class FeedBackFormController {
	
	@Autowired
	private FeedBackService service;
	
	@PostMapping(value = "/savefeedback", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<FeedBackFormModel> saveFeedback(
			@RequestBody FeedBackFormModel model) throws JsonProcessingException {
		return new ResponseEntity<>(service.saveFeedBackForm(model), HttpStatus.OK);
	}
	
	@GetMapping(value = "/getFeedBackInfo")
	public @ResponseBody ResponseEntity<FeedBackFormModel> getFeedBackInfo(@RequestParam Long customerId) {
		return new ResponseEntity<>(service.getFeedBackInfo(customerId), HttpStatus.OK);
	}

}
