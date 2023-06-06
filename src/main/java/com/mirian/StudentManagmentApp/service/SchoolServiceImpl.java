package com.mirian.StudentManagmentApp.service;

import com.mirian.StudentManagmentApp.exceptions.PrincipalIdNotFoundException;
import com.mirian.StudentManagmentApp.model.Principal;
import com.mirian.StudentManagmentApp.model.School;
import com.mirian.StudentManagmentApp.repository.SchoolRepository;
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
    public School saveSchool(School school) {
        return schoolRepository.save(school);
    }

    @Override
    public School updateSchoolById(int schoolId, School schoolForUpdate) {
        Optional<Principal> optionalPrincipal = schoolRepository.findById(principalId);
        if (optionalPrincipal.isPresent()) {
            Principal updatedPrincipal = optionalPrincipal.get();
            updatedPrincipal.setFirstName(principalForUpdate.getFirstName());
            updatedPrincipal.setLastName(principalForUpdate.getLastName());
            updatedPrincipal.setEmail(principalForUpdate.getEmail());
            updatedPrincipal.setIdSchool(principalForUpdate.getIdSchool());

            return schoolRepository.save(updatedPrincipal);
        } else {
            throw new PrincipalIdNotFoundException("Principal not Found with Id: " + principalId);
        }





        return null;
    }

    @Override
    public void deleteSchoolById(int schoolId) {

    }
}
