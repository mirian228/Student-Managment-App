package com.mirian.StudentManagmentApp.service;

import com.mirian.StudentManagmentApp.exceptions.StudentIdNotFoundException;
import com.mirian.StudentManagmentApp.model.Student;
import com.mirian.StudentManagmentApp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student findStudentById(int studentId) {
        return studentRepository.findById(studentId).get();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudentById(int studentId, Student studentForUpdate) {
        Optional<Student> optionalStudent = studentRepository.findById(studentId);
        if (optionalStudent.isPresent()) {
            Student updatedStudent = optionalStudent.get();
            updatedStudent.setFirstName(studentForUpdate.getFirstName());
            updatedStudent.setLastName(studentForUpdate.getLastName());
            updatedStudent.setEmail(studentForUpdate.getEmail());
            updatedStudent.setIdSchool(studentForUpdate.getIdSchool());

            return studentRepository.save(updatedStudent);
        } else {
            throw new StudentIdNotFoundException("Student not Found with Id: " + studentId);
        }


    }

    @Override
    public void deleteStudentById(int studentId) {
      studentRepository.deleteById(studentId);
    }
}
