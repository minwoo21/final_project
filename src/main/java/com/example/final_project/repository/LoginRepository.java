package com.example.final_project.repository;

import com.example.final_project.modal.ClassBean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<ClassBean, String> {

}