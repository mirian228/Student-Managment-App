package com.mirian.StudentManagmentApp.service;

import com.mirian.StudentManagmentApp.model.School;

import java.util.List;

public interface SchoolService {
    List<School> findAllSchools();

    School findSchoolById();

    School saveSchool();

    School updateSchool();

    void deleteSchool();
}
