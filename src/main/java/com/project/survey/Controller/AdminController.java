package com.project.survey.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.survey.Model.Admin;
import com.project.survey.Service.AdminService;

public class AdminController {

	 @Autowired
	  private AdminService serviceA;

	    @PostMapping("/addAdmin")
	    public Admin addAdmin(@RequestBody Admin admin) {
	        return serviceA.saveAdmin(admin);
	    }
	    
	    @PostMapping("/addAdmins")
	    public List<Admin> addAdmins(@RequestBody List<Admin> Admins) {
	        return serviceA.saveAdmins(Admins);
	    }
	    @GetMapping("/adminById/{id}")
	    public Admin findAdminById(@PathVariable int id) {
	        return serviceA.getAdminById(id);
	    }
	    
}

