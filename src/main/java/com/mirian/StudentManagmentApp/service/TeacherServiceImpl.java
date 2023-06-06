package com.mirian.StudentManagmentApp.service;

import com.mirian.StudentManagmentApp.model.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {
    @Override
    public List<Teacher> findAllTeachers() {
        return null;
    }

    @Override
    public Teacher findTeacherById(int teacherId) {
        return null;
    }

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return null;
    }

    @Override
    public Teacher updateTeacherById(int teacherId, Teacher teacherForUpdate) {
        return null;
    }

    @Override
    public void deleteTeacherById(int teacherId) {

    }
}
