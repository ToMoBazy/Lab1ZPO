public class MallarDuck extends Duck{

    public MallarDuck() {
        super(new FlyingWithWings(), new Quack());
    }

    public MallarDuck(FlyinhBehavior flyinhBehavior, QuackBehavior quackBehavior) {
        super(flyinhBehavior, quackBehavior);

    }
}
