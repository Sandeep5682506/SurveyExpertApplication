package com.project.survey.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.survey.Model.Response;
import com.project.survey.Repository.ResponseRepo;
import com.project.survey.Service.ResponseService;

@RestController
public class ResponseController {
	
	private final ResponseRepo repoResponse;
	private final ResponseService serviceResponse;
	
	@Autowired
	
	public ResponseController(ResponseRepo repoResponse,ResponseService serviceResponse) {
		this.repoResponse = repoResponse;
		this.serviceResponse =serviceResponse;
		
	}
	@PostMapping("/needResponse")
	public ResponseEntity<Response> needResponse(@RequestBody Response response){
		Response newResponse=serviceResponse.needResponse(response);
		return new ResponseEntity<>(newResponse,HttpStatus.CREATED);
		
	}
	@GetMapping("/needResponse")
	public ResponseEntity<List<Response>> getAllResponses(){
		List<Response> response=serviceResponse.getAllResponses();
		return new ResponseEntity<>(response,HttpStatus.CREATED);
		
	}
	@GetMapping("/needResponse/{response_id}")
	public ResponseEntity<Response> getResponseById(@PathVariable("reponse_id") int response_id){
		Response response1=serviceResponse.findResponseById(response_id);
		return new ResponseEntity<>(response1,HttpStatus.CREATED);
		
	}



}
