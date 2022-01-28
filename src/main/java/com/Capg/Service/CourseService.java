package com.Capg.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Capg.Model.Course;
import com.Capg.Repositary.CourseRepositary;

@Service
@Transactional
public class CourseService
{
	@Autowired
	private CourseRepositary courseRepositary;
	public List<Course> listAllCourse()
	{
		return courseRepositary.findAll();
	}
	public Course getCourse(int course_id)
	{
		return courseRepositary.findById(course_id).get();
	}
	public void updateCourse(int course_id,Course course)
	{
		courseRepositary.save(course);
	}
	public void deleteCourse(int course_id)
	{
		courseRepositary.deleteById(course_id);
	}
	
		
	}



