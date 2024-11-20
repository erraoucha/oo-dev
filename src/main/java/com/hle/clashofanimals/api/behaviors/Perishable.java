package com.hle.clashofanimals.api.behaviors;

import java.time.LocalDate;

public interface Perishable {

    LocalDate getDeathDate();

    void dies();

}
