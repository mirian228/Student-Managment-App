package com.mirian.StudentManagmentApp.service;

import com.mirian.StudentManagmentApp.model.Principal;
import com.mirian.StudentManagmentApp.repository.PrincipalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PrincipalServiceImpl implements PrincipalService {
    private final PrincipalRepository principalRepository;

    @Autowired
    PrincipalServiceImpl(PrincipalRepository principalRepository) {
        this.principalRepository = principalRepository;
    }


    @Override
    public List<Principal> findAllPrincipals() {
        return principalRepository.findAll();
    }

    @Override
    public Principal findPrincipalById(int principalId) {
        return principalRepository.findById(principalId).get();
    }

    @Override
    public Principal savePrincipal(Principal principal) {
        return principalRepository.save(principal);
    }

    @Override
    public Principal updatePrincipal(int principalId) {
        return null;
    }

    @Override
    public void deletePrincipal(int principalId) {

    }
}
