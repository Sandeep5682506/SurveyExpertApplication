package com.project.survey.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.survey.Model.User;
import com.project.survey.Service.UserService;



@RestController
public class UserController {


	public static final Logger logger = LoggerFactory.getLogger(UserController.class);
	 @Autowired
	  private UserService service; 
	    @PostMapping("/addUser")
	    public User addUser(@RequestBody User user) {
	        return service.saveUser(user);
	    }
	    
//	    @PostMapping("/addUsers")
//	    public List<User> addUsers(@RequestBody List<User> Users) {
//	        return service.saveUsers(Users);	
//	    }
	    @GetMapping("/userById/{id}")
	    public User findUserById(@PathVariable int id) {
	        return service.getUserById(id);
	    }
	    

}
