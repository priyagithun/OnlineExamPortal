package com.Capg.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Capg.Model.Course;

public interface CourseRepositary extends JpaRepository<Course,Integer>
{
   
}
