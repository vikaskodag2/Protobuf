package com.example.protobufdemo.service;

import com.example.protobufdemo.proto.Course;
import com.example.protobufdemo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;

    public Course getCourses(int id) {
        return this.demoRepository.getCourseById(id);
    }

    public Course addCourse(Course course) {
        if (this.demoRepository.getAllCourses().containsKey(course.getId())) {
            System.out.println("Course with id: " + course.getId() + " already exists!");
            return this.demoRepository.getCourseById(course.getId());
        }
        return this.demoRepository.addCourse(course);
    }
}
