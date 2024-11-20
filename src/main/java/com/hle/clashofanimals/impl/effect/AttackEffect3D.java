package com.hle.clashofanimals.impl.effect;

import com.hle.clashofanimals.api.effects.attack.AttackEffect;

public class AttackEffect3D implements AttackEffect {

    private String weapon;

    public AttackEffect3D(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String showEffect() {
        return String.format("3D Viz Effect of <%s>", weapon);
    }
}
