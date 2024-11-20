package com.hle.clashofanimals.impl;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString
public abstract class Animal {

    protected String name;
    protected int bodyTemperature;
    protected String species;

    public abstract String makeNoise();

}