package com.mirian.StudentManagmentApp.service;

import com.mirian.StudentManagmentApp.model.Principal;

import java.util.List;

public interface PrincipalService {
    List<Principal> findAllPrincipals();

    Principal findPrincipalById();

    Principal savePrincipal();

    Principal updatePrincipal();

    void deletePrincipal();


}
