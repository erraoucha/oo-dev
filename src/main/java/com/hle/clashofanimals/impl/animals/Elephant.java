package com.hle.clashofanimals.impl.animals;

import com.hle.clashofanimals.api.behaviors.Aggressive;
import com.hle.clashofanimals.api.effects.attack.AttackEffect;
import com.hle.clashofanimals.api.types.Herbivore;
import com.hle.clashofanimals.impl.Animal;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@ToString
public class Elephant extends Animal implements Herbivore, Aggressive {

    private int ruminatingDuration;
    private String dateDeMort;
    private float longueurDeTrompe;
    private AttackEffect attackEffect;

    @Override
    public String makeNoise() {
        return String.format("Elephant <%s> is rumbling with its trumpet : TROUMP ...", this.getName());
    }

    @Override
    public String attack(Animal animal) {
        return String.format("Elephant <%s> is chaging  with its tusks against <%s>  : <%s> ....",
                this.getName(),
                animal.getName(),
                this.makeNoise());
    }

    @Override
    public void attachAttackStrategy(AttackEffect attackEffect) {
        this.attackEffect = attackEffect;
    }

    @Override
    public int getRuminatingDuration() {
        return ruminatingDuration;
    }

}
