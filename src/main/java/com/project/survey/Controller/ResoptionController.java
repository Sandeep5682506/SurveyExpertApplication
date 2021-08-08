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

import com.project.survey.Model.Resoption;
import com.project.survey.Model.Response;
import com.project.survey.Repository.ResoptionRepo;
import com.project.survey.Repository.ResponseRepo;
import com.project.survey.Service.ResoptionService;
import com.project.survey.Service.ResponseService;


@RestController
public class ResoptionController {
	
	
	
	
	private final ResoptionRepo repoResoption;
	private final ResoptionService serviceResoption;
	
	@Autowired
	public ResoptionController(ResoptionRepo repoResoption,ResoptionService serviceResoption) {
		this.repoResoption = repoResoption;
		this.serviceResoption =serviceResoption;
		
	}
	@PostMapping("/needResoption")
	public ResponseEntity<Resoption> needResoption(@RequestBody Resoption resoption){
		Resoption newResoption=serviceResoption.needResoption(resoption);
		return new ResponseEntity<>(newResoption,HttpStatus.CREATED);
		
	}
	@GetMapping("/needResoption")
	public ResponseEntity<List<Resoption>> getAllResoption(){
		List<Resoption> resoption=serviceResoption.getAllResoptions();
		return new ResponseEntity<>(resoption,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/needResoption/{option_id}")
	public ResponseEntity<Resoption> getResoptionById(@PathVariable("option_id") int option_id){
		Resoption resoption1=serviceResoption.findResoptionById(option_id);
		return new ResponseEntity<>(resoption1,HttpStatus.CREATED);
		
	}

}
