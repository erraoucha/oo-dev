package com.hle.clashofanimals.api.types;

import com.hle.clashofanimals.api.behaviors.Aggressive;

public interface Carnivore extends Aggressive {

    String tryToDevour( Herbivore herbivore);
    int getNumberOfCanines ();
    
}
