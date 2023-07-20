package com.restexample.couserservie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restexample.couserservie.dto.CourseRequestDto;
import com.restexample.couserservie.dto.CourseResponseDto;
import com.restexample.couserservie.dto.ServiceResponse;
import com.restexample.couserservie.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private CourseService service;

	@PostMapping("/add")
	public ServiceResponse<CourseResponseDto> onBoardCourse(@RequestBody CourseRequestDto courseRequestDto) {
		CourseResponseDto newCourse=service.addCourse(courseRequestDto);
		return new ServiceResponse<>(HttpStatus.CREATED,newCourse);

	}
	@GetMapping("/get")
	public ServiceResponse<List<CourseResponseDto>> getAllCourses(){
		List<CourseResponseDto> responseDto=service.viewAllCourses();
		return new ServiceResponse<>(HttpStatus.OK,responseDto);
	}
	@GetMapping("/get/{courseId}")
	public ServiceResponse<CourseResponseDto> findCourse(@PathVariable int courseId){
		CourseResponseDto responseDto=service.findById(courseId);
		return new ServiceResponse<CourseResponseDto>(HttpStatus.OK,responseDto);
	}
	@GetMapping("/get/paran")
	public ServiceResponse<CourseResponseDto> findCourseUsingParam(@RequestParam(required=false) int courseId){
		CourseResponseDto responseDto=service.findById(courseId);
		return new ServiceResponse<CourseResponseDto> (HttpStatus.OK,responseDto);
	}

	@DeleteMapping("/delete/{courseId}")
	public ResponseEntity<?> deleteCourse(@PathVariable int courseId){
		service.deleteById(courseId);
		return ResponseEntity.ok(HttpStatus.NO_CONTENT);
	}
	@PutMapping("/update/{courseId}")
	public ServiceResponse<CourseResponseDto> updateTheCourse(@PathVariable int courseId,@RequestBody CourseRequestDto courseRequestDto ){
		CourseResponseDto responseDto=service.updateCourse(courseId,courseRequestDto);
		return new ServiceResponse<CourseResponseDto>(HttpStatus.OK,responseDto);
	}





}
