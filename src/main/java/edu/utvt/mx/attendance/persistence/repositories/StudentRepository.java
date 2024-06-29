package edu.utvt.mx.attendance.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.utvt.mx.attendance.persistence.entities.Student;

public interface StudentRepository extends JpaRepository<Student, String> {

}
