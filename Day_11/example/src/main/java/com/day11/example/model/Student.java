package com.day11.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    // @OneToOne(cascade = CascadeType.ALL) // Cascade all operations to associated StudentInfo
    // @JsonManagedReference
    // private StudentInfo studentInfo;

    @ManyToOne
    // @JsonBackReference
    private School school;
}
