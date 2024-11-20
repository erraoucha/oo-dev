package com.hle;

import com.hle.clashofanimals.api.types.Herbivore;
import com.hle.clashofanimals.impl.animals.Elephant;
import com.hle.clashofanimals.impl.animals.Gazelle;
import com.hle.clashofanimals.impl.animals.Tiger;
import com.hle.clashofanimals.impl.effect.AttackEffect2D;
import com.hle.clashofanimals.impl.effect.AttackEffect3D;

public class ApplicationEntry {
    public static void main(String[] args) {

        Herbivore elo = Elephant.builder()
                .name("ELO")
                .ruminatingDuration(5)
                .species("Loxodonta africana")
                .attackEffect(AttackEffect2D.builder().weapon("Golden Tusks").build())
                .build();

        Herbivore gazelli = Gazelle.builder()
                .species("Gazella dorcas")
                .name("gazelli")
                .build();

        Tiger baguerra = Tiger.builder()
                .name("baguerra")
                .species("Tigros")
                .numberOfCanines(4)
                .attackEffect(AttackEffect3D.builder().weapon("Golden Claws").build())
                .build();

        System.out.println(baguerra.tryToDevour(elo));
        System.out.println(baguerra.tryToDevour(gazelli));


    }
}
