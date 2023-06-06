package com.mirian.StudentManagmentApp.service;

import com.mirian.StudentManagmentApp.model.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> findAllTeachers();

    Teacher findTeacherById(int teacherId);

    Teacher saveTeacher(Teacher teacher);

    Teacher updateTeacherById(int teacherId, Teacher teacher);

    void deleteTeacherById(int teacherId);
}
