package com.mirian.StudentManagmentApp.service;

import com.mirian.StudentManagmentApp.model.School;

import java.util.List;

public interface SchoolService {
    List<School> findAllSchools();

    School findSchoolById(int schoolId);

    School saveSchool(School school);

    School updateSchoolById(int schoolId, School school);

    void deleteSchoolById(int schoolId);
}
