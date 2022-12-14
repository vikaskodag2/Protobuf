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
    }
}
