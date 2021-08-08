package com.project.survey.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.survey.Model.Resoption;
import com.project.survey.Repository.ResoptionRepo;

public class ResoptionService {
	

	private final ResoptionRepo repoResoption;
	@Autowired
	public ResoptionService(ResoptionRepo repoResoption) {
		this.repoResoption = repoResoption;
	}
	
	public  Resoption needResoption(Resoption resoption) {
		return repoResoption.save(resoption);
		
	}
	public List<Resoption> needResoptions(List<Resoption> resoptions) {
		return repoResoption.saveAll(resoptions);
		
	}
	public  List<Resoption> getAllResoptions(){
		return repoResoption.findAll();
	}

	public  Resoption findResoptionById(int option_id) {
		return repoResoption.findById(option_id).orElse(null);
	}
	
	
	
	
	

}
