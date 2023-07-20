package com.restexample.couserservie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restexample.couserservie.entity.CourseEntity;

public interface CourseDao extends JpaRepository<CourseEntity, Integer> {

}
