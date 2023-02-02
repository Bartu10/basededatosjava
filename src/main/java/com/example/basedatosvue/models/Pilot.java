package com.example.basedatosvue.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity @Getter @Setter
public class Pilot {

    @Id
    @GeneratedValue
    private Long id;

    private Integer number;

    private String name;

    private String surname;

    private String nacionality;

    private Long titles;

    @ManyToOne
    @JoinColumn()
    private Team team;

    public Pilot(){
    }

    public Pilot(Integer number, String name, String surname, String nacionality, Long titles){
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.nacionality = nacionality;
        this.titles = titles;
    }



}
