package com.mirian.StudentManagmentApp.repository;

import com.mirian.StudentManagmentApp.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School, Integer> {
}
