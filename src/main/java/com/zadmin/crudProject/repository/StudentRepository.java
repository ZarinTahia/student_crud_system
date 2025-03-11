package com.zadmin.crudProject.repository;

import com.zadmin.crudProject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zarin
 * @since 12/21/2021
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}