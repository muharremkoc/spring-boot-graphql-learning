package com.example.graphql.config;

import com.example.graphql.model.Person;
import com.example.graphql.repository.PersonRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonQueryResolver implements GraphQLQueryResolver {


   final PersonRepository personRepository;

    public Iterable<Person> allPerson(){
        return personRepository.findAll();
    }

    public Person getPersonById(int id){
        return personRepository.findById(id).get();
    }

}
