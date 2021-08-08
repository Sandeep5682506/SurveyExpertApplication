package com.project.survey.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.survey.Model.Response;
import com.project.survey.Repository.ResponseRepo;

@Service
public class ResponseService {
	
	
	private final ResponseRepo repoResponse;
	@Autowired
	public ResponseService(ResponseRepo repoResponse) {
		this.repoResponse = repoResponse;
	}
	
	public  Response needResponse(Response response) {
		return repoResponse.save(response);
		
	}
	public List<Response> needResponses(List<Response> responses) {
		return repoResponse.saveAll(responses);
		
	}
	public  List<Response> getAllResponses(){
		return repoResponse.findAll();
	}

	public  Response findResponseById(int response_id) {
		return repoResponse.findById(response_id).orElse(null);
	}
	
	
	
	
}
