/*package com.restexample.couserservie;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.test.web.servlet.ResultHandler;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.restexample.couserservie.dto.Course;
import com.restexample.couserservie.service.CourseService;

@SpringBootTest
class CouserServieApplicationTests {
	
	private MockMvc mockMvc;
	@Autowired
	private CourseService courseService;
	@Autowired
	private WebApplicationContext context;
	ObjectMapper om=new ObjectMapper();
	Course course=null;
	@BeforeEach
	public void setup() throws Exception {
		this.mockMvc = MockMvcBuilders.standaloneSetup(context).build();
		 course=new Course();
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		String toParse = "12-07-2022";
		Date date = df.parse(toParse);
		course.setCourseId(100);
		course.setCourseName("java");
		course.setTrainerName("HariKrishna");
		course.setDuration("90");
		om.setDateFormat(df);
		course.setFees(4000.0);
		course.setCourseType("Live");
		course.setCertificateAvailble(false);
		course.setDescription("Core java");
		
	}
	@Test
	public void TestAddCourse() throws Exception {
		
		String jsonRequest=om.writeValueAsString(course);
		
		MvcResult result = mockMvc.perform(post("/course/add").content(jsonRequest)
				.contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isCreated())
				.andReturn();
		String content=result.getResponse().getContentAsString();
		Course value=om.readValue(content, Course.class);
		 System.out.println(value);
		
	}
	
	@Test
	public void TestGetCourse() throws Exception {
		
		mockMvc.perform(get("/course/get"))
		
		.andExpect(status().isOk());
		}
	@Test
	public void TestGetCourseById() throws Exception {
		
		/*
		 * 
		 * 
		 * mockMvc.perform(get("/course/get/100"))
   .andExpect(status().isOk())
   .andExpect(content().contentType(MediaType.APPLICATION_JSON))
   .andExpect(jsonPath("$.person.name").value("Jason"));
   mockMvc.perform(get("/course/get/100").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andExpect(content().contentTypeCompatibleWith("application/json"))
        .andExpect(jsonPath("$.greeting").value("Hello World"));
		 */
		
		/*
		MvcResult result=this.mockMvc.perform(get("/course/get/100").contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andReturn();
		//Mockito.when(courseService.findById(100)).thenReturn(course);
		String content=result.getResponse().getContentAsString();
		Course value=om.readValue(content, Course.class);
		 assertEquals(courseService.findById(100),value);*/
		
		
		
		
	
	

