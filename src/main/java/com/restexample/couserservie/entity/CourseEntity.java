package com.restexample.couserservie.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
@Table(name="Course_Table")
public class CourseEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	public CourseEntity(int courseId, String courseName, String trainerName, String duration, Date startDate,
			Double fees, String courseType, boolean isCertificateAvailble, String description) {
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
	}
	public CourseEntity() {
		super();
	}
	@Override
	public String toString() {
		return "CourseEntity [courseId=" + courseId + ", courseName=" + courseName + ", trainerName=" + trainerName
				+ ", duration=" + duration + ", startDate=" + startDate + ", fees=" + fees + ", courseType="
				+ courseType + ", isCertificateAvailble=" + isCertificateAvailble + ", description=" + description
				+ "]";
	}

	
	
}
