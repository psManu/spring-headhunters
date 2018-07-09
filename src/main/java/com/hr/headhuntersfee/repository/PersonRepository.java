package com.hr.headhuntersfee.repository;

import com.hr.headhuntersfee.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}