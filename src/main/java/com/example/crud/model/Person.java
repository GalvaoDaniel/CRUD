package com.example.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(generator = "sequence_generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sequence_generator", sequenceName = "sequence_id_person", allocationSize = 1)
    @Column(name = "id_person")
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
