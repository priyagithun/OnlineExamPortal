package com.Capg.RestController;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Capg.Model.Course;
import com.Capg.Service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseRestController 
{
	@Autowired
	CourseService courseService;
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Course course, @PathVariable Integer Course_id) 
	{
		 try 
		   {
	           courseService.getCourse(Course_id);
	           return new ResponseEntity<>(HttpStatus.OK);
	       } 
		   catch (NoSuchElementException e)
		   {
	           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	       }
    
	}
	  
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer Course_id)
      {
	   courseService.deleteCourse(Course_id);
      }

}
