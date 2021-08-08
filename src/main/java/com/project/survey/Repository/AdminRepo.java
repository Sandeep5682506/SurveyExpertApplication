package com.project.survey.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.survey.Model.Admin;



public interface AdminRepo extends JpaRepository<Admin,Integer> {

}
