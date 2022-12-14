package com.example.protobufdemo.protoBuilder;

import com.example.protobufdemo.proto.CourseOrBuilder;
import com.example.protobufdemo.proto.Student;
import com.example.protobufdemo.proto.StudentOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.UnknownFieldSet;

import java.util.List;
import java.util.Map;

public class CourseBuilder implements CourseOrBuilder {
    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public ByteString getCourseNameBytes() {
        return null;
    }

    @Override
    public List<Student> getStudentList() {
        return null;
    }

    @Override
    public Student getStudent(int index) {
        return null;
    }

    @Override
    public int getStudentCount() {
        return 0;
    }

    @Override
    public List<? extends StudentOrBuilder> getStudentOrBuilderList() {
        return null;
    }

    @Override
    public StudentOrBuilder getStudentOrBuilder(int index) {
        return null;
    }

    @Override
    public Message getDefaultInstanceForType() {
        return null;
    }

    @Override
    public boolean isInitialized() {
        return false;
    }

    @Override
    public List<String> findInitializationErrors() {
        return null;
    }

    @Override
    public String getInitializationErrorString() {
        return null;
    }

    @Override
    public Descriptors.Descriptor getDescriptorForType() {
        return null;
    }

    @Override
    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        return null;
    }

    @Override
    public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return false;
    }

    @Override
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
        return null;
    }

    @Override
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        return false;
    }

    @Override
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        return null;
    }

    @Override
    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        return 0;
    }

    @Override
    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
        return null;
    }

    @Override
    public UnknownFieldSet getUnknownFields() {
        return null;
    }
}
