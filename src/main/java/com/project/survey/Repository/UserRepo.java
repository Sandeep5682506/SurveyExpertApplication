package com.project.survey.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.survey.Model.User;


public interface UserRepo extends JpaRepository<User,Integer> {

}
