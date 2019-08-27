package com.example.final_project.repository;

import com.example.final_project.modal.lessonbean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface lessonrepository extends JpaRepository<lessonbean, String> {

}