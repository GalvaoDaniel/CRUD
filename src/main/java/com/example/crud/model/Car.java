package com.example.crud.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(generator = "car_sequence_generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "car_sequence_generator", sequenceName = "sequence_id_car", allocationSize = 1)
    @Column(name = "id_car")
    private Long id;

    private String plate;

    private String model;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "owner")
    private Person owner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return plate.equals(car.plate) && model.equals(car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plate, model);
    }
}
