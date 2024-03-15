import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Duck> kaczki = new ArrayList<>();
        kaczki.add(new MallarDuck(new FlyingWithWings(), new Quack()));
        kaczki.add(new RubberDuck(new FlyingnoWay(), new Squeak()));
        kaczki.add(new ModelDuck(new FlyingnoWay(), new MuteQuack()));


        for(Duck duck:kaczki)
        {
            duck.performQuack();
            duck.performFly();
        }

        kaczki.get(1).setFlyinhBehavior(new FlyinhBehavior() {
            @Override
            public void fly() {
                System.out.println("Duck is flying with a jetpack");
            }
        });
        kaczki.get(1).performFly();

    }
}