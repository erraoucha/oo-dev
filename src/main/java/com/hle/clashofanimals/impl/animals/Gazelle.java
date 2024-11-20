package com.hle.clashofanimals.impl.animals;

import java.time.LocalDate;

import com.hle.clashofanimals.api.behaviors.Perishable;
import com.hle.clashofanimals.api.types.Herbivore;
import com.hle.clashofanimals.impl.Animal;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;



@SuperBuilder@Getter
@Setter
public class Gazelle extends Animal implements Herbivore, Perishable {

    private int dureeRuminantia;
    private String dateDeMort;
    private int ruminatingDuration;
    private LocalDate deathDate;

    @Override
    public String makeNoise() {
        return String.format("Gazelle <%s> is snorting : PFFFT ...", this.getName());
    }

    @Override
    public int getRuminatingDuration() {
        return ruminatingDuration;
    }

    @Override
    public void dies() {
        System.out.println(String.format("Poor gazelle <%s> is dying : %s ...", this.getName(), this.makeNoise()));
        this.deathDate =LocalDate.now();
    }

    @Override
    public LocalDate getDeathDate() {
        return this.deathDate;

    }

}
