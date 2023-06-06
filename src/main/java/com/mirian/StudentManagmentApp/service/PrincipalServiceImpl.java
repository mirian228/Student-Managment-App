package com.mirian.StudentManagmentApp.service;

import com.mirian.StudentManagmentApp.exceptions.PrincipalIdNotFoundException;
import com.mirian.StudentManagmentApp.model.Principal;
import com.mirian.StudentManagmentApp.repository.PrincipalRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    @Transactional
    public Principal savePrincipal(Principal principal) {
        return principalRepository.save(principal);
    }

    @Override
    @Transactional
    public Principal updatePrincipalById(int principalId, Principal principalForUpdate) {
        Optional<Principal> optionalPrincipal = principalRepository.findById(principalId);
        if (optionalPrincipal.isPresent()) {
            Principal updatedPrincipal = optionalPrincipal.get();
            updatedPrincipal.setFirstName(principalForUpdate.getFirstName());
            updatedPrincipal.setLastName(principalForUpdate.getLastName());
            updatedPrincipal.setEmail(principalForUpdate.getEmail());
            updatedPrincipal.setIdSchool(principalForUpdate.getIdSchool());

            return principalRepository.save(updatedPrincipal);
        } else {
            throw new PrincipalIdNotFoundException("Principal not Found with Id: " + principalId);
        }

    }

    @Override
    @Transactional
    public void deletePrincipalById(int principalId) {
        principalRepository.deleteById(principalId);
    }
}
