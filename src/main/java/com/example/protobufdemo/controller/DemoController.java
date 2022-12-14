package com.example.protobufdemo.controller;

import com.example.protobufdemo.proto.Course;
import com.example.protobufdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/courses/proto/id/{id}")
    Course getCoursesProto(@PathVariable int id) {
        return demoService.getCourses(id);
    }


//    @GetMapping("/courses//id/{id}")
//    String getCoursesProto() {
//
//    }
}
