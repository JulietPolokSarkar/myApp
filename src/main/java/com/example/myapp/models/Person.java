package com.example.myapp.models;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String placeOfBirth;
    private String nationality;
    private String gender;
    private String address;
    private String email;
    private String phoneNumber;

    // Constructors, getters, setters
}

