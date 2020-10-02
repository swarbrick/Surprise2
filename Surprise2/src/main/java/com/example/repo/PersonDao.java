package com.example.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Person;

public interface PersonDao extends CrudRepository<Person, Integer> {

	public Person findByPersonName(String personName);

	
}
