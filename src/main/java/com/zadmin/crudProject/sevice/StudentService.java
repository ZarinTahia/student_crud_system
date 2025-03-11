package com.zadmin.crudProject.sevice;

import com.zadmin.crudProject.model.Student;

import java.util.List;

/**
 * @author zarin
 * @since 12/21/2021
 */
public interface StudentService {
    List<Student> getAllStudents();

    void saveStudent(Student student);

    Student getStudentByID(long id);

    void deleteStudentByID(long id);
}