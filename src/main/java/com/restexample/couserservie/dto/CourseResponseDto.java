package com.restexample.couserservie.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;


public class CourseResponseDto {
	private int courseId;
	private String courseName;
	private String trainerName;
	private String duration;
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd-MM-yyyy")
	private Date startDate;
	private Double fees;
	private String courseType;
	private boolean isCertificateAvailble;
	private String description;
	private String courseUniqueId;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Double getFees() {
		return fees;
	}
	public void setFees(Double fees) {
		this.fees = fees;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public boolean isCertificateAvailble() {
		return isCertificateAvailble;
	}
	public void setCertificateAvailble(boolean isCertificateAvailble) {
		this.isCertificateAvailble = isCertificateAvailble;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCourseUniqueId() {
		return courseUniqueId;
	}
	public void setCourseUniqueId(String courseUniqueId) {
		this.courseUniqueId = courseUniqueId;
	}
	public CourseResponseDto(int courseId, String courseName, String trainerName, String duration, Date startDate,
			Double fees, String courseType, boolean isCertificateAvailble, String description, String courseUniqueId) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.trainerName = trainerName;
		this.duration = duration;
		this.startDate = startDate;
		this.fees = fees;
		this.courseType = courseType;
		this.isCertificateAvailble = isCertificateAvailble;
		this.description = description;
		this.courseUniqueId = courseUniqueId;
	}
	public CourseResponseDto() {
		super();
	}
	@Override
	public String toString() {
		return "CourseResponseDto [courseId=" + courseId + ", courseName=" + courseName + ", trainerName=" + trainerName
				+ ", duration=" + duration + ", startDate=" + startDate + ", fees=" + fees + ", courseType="
				+ courseType + ", isCertificateAvailble=" + isCertificateAvailble + ", description=" + description
				+ ", courseUniqueId=" + courseUniqueId + "]";
	}
	
	
}
