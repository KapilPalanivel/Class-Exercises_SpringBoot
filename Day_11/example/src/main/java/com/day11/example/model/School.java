package com.day11.example.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class School {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int school_id;
  private String School_Name;  
    
  @OneToMany(mappedBy = "school",cascade = CascadeType.ALL)
//   @JsonManagedReference
  private List<Student> studentSc;
}
