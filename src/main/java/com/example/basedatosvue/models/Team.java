package com.example.basedatosvue.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;

@Entity @Getter @Setter
public class Team {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String country;

    private String motor;

    @JsonBackReference
    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private Set<Pilot> pilots = new HashSet<>();
}
