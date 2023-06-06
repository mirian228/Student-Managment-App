package com.mirian.StudentManagmentApp.repository;

import com.mirian.StudentManagmentApp.model.Principal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrincipalRepository extends JpaRepository<Principal, Integer> {
}