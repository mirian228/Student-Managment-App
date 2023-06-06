package com.mirian.StudentManagmentApp.service;

import com.mirian.StudentManagmentApp.exceptions.SchoolIdNotFoundException;
import com.mirian.StudentManagmentApp.model.School;
import com.mirian.StudentManagmentApp.repository.SchoolRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;

    @Autowired
    SchoolServiceImpl(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }


    @Override
    public List<School> findAllSchools() {
        return schoolRepository.findAll();
    }

    @Override
    public School findSchoolById(int schoolId) {
        return schoolRepository.findById(schoolId).get();
    }

    @Override
    @Transactional
    public School saveSchool(School school) {
        return schoolRepository.save(school);
    }

    @Override
    @Transactional
    public School updateSchoolById(int schoolId, School schoolForUpdate) {
        Optional<School> optionalSchool = schoolRepository.findById(schoolId);
        if (optionalSchool.isPresent()) {
            School updatedSchool = optionalSchool.get();
            updatedSchool.setId(schoolForUpdate.getId());
            updatedSchool.setSchoolAddress(schoolForUpdate.getSchoolAddress());
            updatedSchool.setSchoolName(schoolForUpdate.getSchoolName());


            return schoolRepository.save(updatedSchool);
        } else {
            throw new SchoolIdNotFoundException("School not Found with Id: " + schoolId);
        }
    }

    @Override
    @Transactional
    public void deleteSchoolById(int schoolId) {
      schoolRepository.deleteById(schoolId);
    }
}
