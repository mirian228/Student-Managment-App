package com.mirian.StudentManagmentApp.service;

import com.mirian.StudentManagmentApp.model.Principal;

import java.util.List;

public interface PrincipalService {
    List<Principal> findAllPrincipals();

    Principal findPrincipalById(int principalId);

    Principal savePrincipal(Principal principal);

    Principal updatePrincipalById(int principalId, Principal principal);

    void deletePrincipalById(int principalId);


}
