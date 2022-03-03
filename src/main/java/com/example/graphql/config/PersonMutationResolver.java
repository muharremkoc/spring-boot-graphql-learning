package com.example.graphql.config;


import com.example.graphql.dto.PersonDto;
import com.example.graphql.model.Person;
import com.example.graphql.repository.PersonRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
@RequiredArgsConstructor
public class PersonMutationResolver  implements GraphQLMutationResolver {


   final PersonRepository personRepository;

    public Person newPerson(String firstName,String lastName,int age){
        Person person=new Person();

        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);

        return personRepository.save(person);
    }

    public Person updatePerson(int id,String firstName,String lastName,int age){
        Person person=personRepository.findById(id).orElseThrow();

        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);

        return personRepository.save(person);
    }

    public Person deletePerson(int id){
        Person deletePerson = new Person();
        Optional<Person> findPerson =  personRepository.findById(id);
        if(findPerson.isPresent()){
            personRepository.delete(findPerson.get());
            deletePerson = findPerson.get();
        }
        return deletePerson;

    }

    public Person newPersonWithPersonDto(PersonDto personDto){
        Person person=new Person();

        person.setFirstName(personDto.getFirstName());
        person.setLastName(personDto.getLastName());
        person.setAge(personDto.getAge());

        return personRepository.save(person);
    }

    public Person updatePersonWithPersonDto(int id,PersonDto personDto){
        Person person=personRepository.findById(id).orElseThrow();

        person.setFirstName(personDto.getFirstName());
        person.setLastName(personDto.getLastName());
        person.setAge(personDto.getAge());

        return personRepository.save(person);
    }
}
