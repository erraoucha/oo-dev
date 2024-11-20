package com.hle.clashofanimals.api.behaviors;

import com.hle.clashofanimals.api.effects.attack.AttackEffect;
import com.hle.clashofanimals.impl.Animal;

public interface Aggressive {

    String attack(Animal animal);
    void attachAttackStrategy(AttackEffect attackEffect);

}
