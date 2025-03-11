package com.zadmin.crudProject.sevice;

import com.zadmin.crudProject.model.Student;
import com.zadmin.crudProject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author zarin
 * @since 12/21/2021
 */
@Service
public class StudentServiceImplements implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void saveStudent(Student student) {
        this.studentRepository.save(student);
    }

    @Override
    public Student getStudentByID(long id) {
        Optional<Student> optional = studentRepository.findById(id);
        Student student = null;
        if (optional.isPresent()) {
            student = optional.get();
        } else {
            throw new RuntimeException("Student Not Found for id: " + id);
        }
        return student;
    }

    @Override
    public void deleteStudentByID(long id) {
        this.studentRepository.deleteById(id);
    }
}