package com.hle.clashofanimals.impl.animals;

import com.hle.clashofanimals.api.behaviors.Perishable;
import com.hle.clashofanimals.api.effects.attack.AttackEffect;
import com.hle.clashofanimals.api.types.Carnivore;
import com.hle.clashofanimals.api.types.Herbivore;
import com.hle.clashofanimals.impl.Animal;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString
public class Cat extends Animal implements Carnivore {

    private int numberOfCanines;
    private AttackEffect attackEffect;

    @Override
    public String makeNoise() {
        return String.format("the cat <%s> is meowing : MEEYAW...", this.getName());
    }

    @Override
    public String attack(Animal animal) {
        return String.format("The cat  <%s> is attacking  with its claws <%s> : <%s> ....",
                this.getName(),
                animal.getName(),
                this.makeNoise());
    }

    @Override
    public void attachAttackStrategy(AttackEffect attackEffect) {
        this.attackEffect = attackEffect;

    }

    @Override
    public String tryToDevour(Herbivore herbivore) {

        this.makeNoise();

        attackEffect.showEffect();

        ((Animal) herbivore).makeNoise();
        String herbivoreName = ((Animal) herbivore).getName();

        if (herbivore instanceof Perishable poorAnimal) {
            poorAnimal.dies();
            return String.format("poor <%s> was devoured by cat <%s>..", herbivoreName, this.getName(), this.getName());
        } else {
            return (String.format(" lucky <%s> could escape the cat <%s>: <%s> ....",
                    herbivoreName, this.getName(),
                    ((Animal) herbivore).getName()));
        }
    }

}
