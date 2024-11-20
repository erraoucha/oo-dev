package com.hle.clashofanimals.impl.effect;

import com.hle.clashofanimals.api.effects.attack.AttackEffect;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AttackEffect2D implements AttackEffect {

    private String weapon;

    @Override
    public String showEffect() {
        return String.format("2D Viz Effect of <%s>", weapon);
    }
}
