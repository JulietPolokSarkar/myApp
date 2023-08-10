package com.example.myapp.repositories;
import com.example.myapp.models.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}

