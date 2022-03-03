package com.example.graphql.repository;

import com.example.graphql.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PersonRepository extends JpaRepository<Person,Integer> {
}
