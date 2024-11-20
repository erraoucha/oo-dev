import com.hle.clashofanimals.api.behaviors.Perishable;
import com.hle.clashofanimals.api.effects.attack.AttackEffect;
import com.hle.clashofanimals.api.types.Carnivore;
import com.hle.clashofanimals.api.types.Herbivore;
import com.hle.clashofanimals.impl.Animal;

public class Tiger extends Animal implements Carnivore {

    private int numberOfCanines;
    private String typeRayure;
    private AttackEffect attackEffect;

    @Override
    public String makeNoise() {
        return String.format("Tiger  <%s> is growling : GRRRR ...", this.getName());
    }

    @Override
      public String  attack(Animal animal) {
          return  String.format("Tiger <%s> is mauling with its claws and fangs <%s>  : <%s> ....",
                  this.getName(),
                  animal.getName(),
                  this.makeNoise()));
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
            return String.format("poor <%s> was devoured by Tiger <%s>..", herbivoreName, this.getName(), this.getName());
        } else {
            return (String.format(" lucky <%s> could escape the tiger <%s>: <%s> ....",
                    herbivoreName, this.getName(),
                    ((Animal) herbivore).getName()));
        }
    }

    @Override
    public int getNumberOfCanines() {

        return numberOfCanines;

    }

}