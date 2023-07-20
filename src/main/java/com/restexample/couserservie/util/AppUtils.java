package com.restexample.couserservie.util;

import com.restexample.couserservie.dto.CourseRequestDto;
import com.restexample.couserservie.dto.CourseResponseDto;
import com.restexample.couserservie.entity.CourseEntity;

public class AppUtils {

	public static CourseEntity mapDtotoEntity(CourseRequestDto courseRequestDto) {
		
		CourseEntity courseEntity=new CourseEntity();
		courseEntity.setCourseId(courseRequestDto.getCourseId());
		courseEntity.setCourseName(courseRequestDto.getCourseName());
		courseEntity.setTrainerName(courseRequestDto.getTrainerName());
		courseEntity.setDuration(courseRequestDto.getDuration());
		courseEntity.setStartDate(courseRequestDto.getStartDate());
		courseEntity.setFees(courseRequestDto.getFees());
		courseEntity.setCourseType(courseRequestDto.getCourseType());
		courseEntity.setDescription(courseRequestDto.getDescription());
		courseEntity.setCertificateAvailble(courseRequestDto.isCertificateAvailble());
		
		
		return courseEntity;
		
	}
	
public static CourseResponseDto mapEntitytoDto(CourseEntity courseEnity) {
		
		CourseResponseDto courseResponseDto=new CourseResponseDto();
		
		courseResponseDto.setCourseId(courseEnity.getCourseId());
		courseResponseDto.setCourseName(courseEnity.getCourseName());
		courseResponseDto.setTrainerName(courseEnity.getTrainerName());
		courseResponseDto.setDuration(courseEnity.getDuration());
		courseResponseDto.setStartDate(courseEnity.getStartDate());
		courseResponseDto.setFees(courseEnity.getFees());
		courseResponseDto.setCourseType(courseEnity.getCourseType());
		courseResponseDto.setDescription(courseEnity.getDescription());
		courseResponseDto.setCertificateAvailble(courseEnity.isCertificateAvailble());
		
		
		return courseResponseDto;
		
	}
	
}
