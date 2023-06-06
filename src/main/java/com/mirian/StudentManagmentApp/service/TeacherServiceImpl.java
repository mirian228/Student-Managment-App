package com.mirian.StudentManagmentApp.service;

import com.mirian.StudentManagmentApp.exceptions.TeacherIdNotFoundException;
import com.mirian.StudentManagmentApp.model.Teacher;
import com.mirian.StudentManagmentApp.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    @Autowired
    TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }


    @Override
    public List<Teacher> findAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher findTeacherById(int teacherId) {
        return teacherRepository.findById(teacherId).get();
    }

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher updateTeacherById(int teacherId, Teacher teacherForUpdate) {
        Optional<Teacher> optionalTeacher = teacherRepository.findById(teacherId);
        if (optionalTeacher.isPresent()) {
            Teacher updatedTeacher = optionalTeacher.get();
            updatedTeacher.setFirstName(teacherForUpdate.getFirstName());
            updatedTeacher.setLastName(teacherForUpdate.getLastName());
            updatedTeacher.setEmail(teacherForUpdate.getEmail());
            updatedTeacher.setSchools(teacherForUpdate.getSchools());
            updatedTeacher.setStudents(teacherForUpdate.getStudents());

            return teacherRepository.save(updatedTeacher);
        } else {
            throw new TeacherIdNotFoundException("Teacher not found with Id: " + teacherId);
        }


    }

    @Override
    public void deleteTeacherById(int teacherId) {
        teacherRepository.deleteById(teacherId);
    }
}
