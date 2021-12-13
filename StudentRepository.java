package com.example.webApp4.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.webApp4.entity.Student;
@Repository("stuRepo")
public interface StudentRepository extends CrudRepository<Student, Integer>
{

}
