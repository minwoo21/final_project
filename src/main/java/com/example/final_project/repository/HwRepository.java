package com.example.final_project.repository;

import com.example.final_project.modal.hwLBean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HwRepository extends JpaRepository<hwLBean, String> {

}