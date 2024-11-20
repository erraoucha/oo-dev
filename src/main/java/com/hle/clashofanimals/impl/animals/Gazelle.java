import java.time.LocalDate;

import com.hle.clashofanimals.api.behaviors.Perishable;
import com.hle.clashofanimals.api.effects.attack.AttackEffect;
import com.hle.clashofanimals.api.types.Herbivore;
import com.hle.clashofanimals.impl.Animal;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;



@Builder
@Getter
@Setter
public class Gazelle extends Animal implements Herbivore, Perishable {

    private int dureeRuminantia;
    private String dateDeMort;
    private int ruminatingDuration;
    private LocalDate deathDate;

    @Override
    public String makeNoise() {
        System.out.println(String.format("Gazelle <%s> is snorting with its trumpet : PFFFT ...", this.getName()));
    }

    @Override
    public int getRuminatingDuration() {
        return ruminatingDuration;
    }

    @Override
    public void dies() {
        System.out.println(String.format("Poor gazelle <%> is dying : <%s> ...", this.getName(), this.makeNoise()));
        this.deathDate =LocalDate.now();
    }

    @Override
    public LocalDate getDeathDate() {
        return this.deathDate;

    }

}
