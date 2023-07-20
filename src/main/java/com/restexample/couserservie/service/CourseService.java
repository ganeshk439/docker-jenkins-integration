package com.restexample.couserservie.service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restexample.couserservie.dto.CourseRequestDto;
import com.restexample.couserservie.dto.CourseResponseDto;
import com.restexample.couserservie.entity.CourseEntity;
import com.restexample.couserservie.repository.CourseDao;
import com.restexample.couserservie.util.AppUtils;

@Service
public class CourseService {
	@Autowired
	private CourseDao courseDao;
	
	
	//Add Course
	public CourseResponseDto addCourse(CourseRequestDto course) {
		//course.setCourseId(new Random().nextInt(5000));
		CourseEntity courseEntity=AppUtils.mapDtotoEntity(course);
		CourseEntity entity=courseDao.save(courseEntity);
		CourseResponseDto courseResponseDto=AppUtils.mapEntitytoDto(entity);
		courseResponseDto.setCourseUniqueId(UUID.randomUUID().toString().split("-")[0]);
		return courseResponseDto;
		} 
	//view All Courses
	public List<CourseResponseDto> viewAllCourses(){
		List<CourseEntity> entites=courseDao.findAll();
		
		return StreamSupport.stream(entites.spliterator(), false)	
				.map(AppUtils::mapEntitytoDto)
				.collect(Collectors.toList());
	}
	//filter by courseid
	public CourseResponseDto findById(int courseId) {
		CourseEntity entity=courseDao.findById(courseId).orElseThrow(()->new RuntimeException(courseId+"not valid"));
		return AppUtils.mapEntitytoDto(entity);
		}
	//delete the Course
	public void deleteById(Integer courseId) {
		courseDao.deleteById(courseId);
		
	}
	//Update the Course
	public CourseResponseDto updateCourse(int courseId,CourseRequestDto courseRequestDto) {
		//get the object
		CourseEntity existingCourseEntity=courseDao.findById(courseId).orElse(null);
		//modify the object
		existingCourseEntity.setCourseName(courseRequestDto.getCourseName());
		existingCourseEntity.setTrainerName(courseRequestDto.getTrainerName());
		existingCourseEntity.setDuration(courseRequestDto.getDuration());
		existingCourseEntity.setStartDate(courseRequestDto.getStartDate());
		existingCourseEntity.setFees(courseRequestDto.getFees());
		existingCourseEntity.setCourseType(courseRequestDto.getCourseType());
		existingCourseEntity.setDescription(courseRequestDto.getDescription());
		existingCourseEntity.setCertificateAvailble(courseRequestDto.isCertificateAvailble());
		//save the object
		CourseEntity updateCourseEntity=courseDao.save(existingCourseEntity);
		return AppUtils.mapEntitytoDto(updateCourseEntity);
	}
	 
}
