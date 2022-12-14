package com.example.protobufdemo.repository;

import com.example.protobufdemo.proto.Course;
import com.example.protobufdemo.proto.Student;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DemoRepository {
    private Map<Integer, Course> courses = new HashMap<>();

    public DemoRepository() {
        Student.PhoneNumber phone1 = createPhone("1234567890", Student.PhoneType.MOBILE);
        Student.PhoneNumber phone2 = createPhone("6487395210", Student.PhoneType.MOBILE);
        Student.PhoneNumber landline1 = createPhone("48937549", Student.PhoneType.LANDLINE);

        Student student1 = createStudent(1, "Paresh", "Joshi", "paresh.joshi@gmail.com", Collections.singletonList(phone1));
        Student student2 = createStudent(2, "Rahul", "Gautam", "rahulk.gautam.007@gmail.com", Collections.singletonList(phone2));
        Student student3 = createStudent(3, "Harish", "Sethi", "harish.sethi@gmail.com", Collections.singletonList(landline1));
        Student student4 = createStudent(4, "Kajol", "Sharma", "Kajol.sharma@gmail.com", Collections.singletonList(phone2));

        Course course1 = Course.newBuilder()
                .setId(1)
                .setCourseName("Introduction to Java")
                .setStudent(0, student1)
                .setStudent(1, student2)
                .setStudent(2, student4)
                .build();

        Course course2 = Course.newBuilder()
                .setId(2)
                .setCourseName("Advance Java")
                .setStudent(0, student1)
                .setStudent(1, student3)
                .build();

        this.courses.put(course1.getId(), course1);
        this.courses.put(course2.getId(), course2);
    }

    private Student createStudent(int id, String firstName, String lastName, String email, List<Student.PhoneNumber> phones) {
        return Student.newBuilder()
                .setId(id)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .addAllPhone(phones)
                .build();
    }

    private Student.PhoneNumber createPhone(String number, Student.PhoneType type) {
        return Student.PhoneNumber.newBuilder()
                .setNumber(number)
                .setType(type).build();
    }

}
