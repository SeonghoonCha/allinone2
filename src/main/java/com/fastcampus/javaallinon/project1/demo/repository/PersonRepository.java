package com.fastcampus.javaallinon.project1.demo.repository;

import com.fastcampus.javaallinon.project1.demo.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
