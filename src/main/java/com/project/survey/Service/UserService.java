package com.project.survey.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.survey.Model.User;
import com.project.survey.Repository.UserRepo;


@Service
public class UserService {

	@Autowired
    private UserRepo repo;
	
public User saveUser(User user) {
    return repo.save(user);
}

public List<User> saveUsers(List<User> users) {
    return repo.saveAll(users);
}

public List<User> getProducts() {
    return repo.findAll();
}



public User getUserById(int id) {
    return repo.findById(id).orElse(null);
}
//public User getUserByName(String name) {
//    return repository.findByName(name);
//}

}
