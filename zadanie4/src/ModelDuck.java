public class ModelDuck extends Duck{
    public ModelDuck() {
        super(new FlyingnoWay(), new MuteQuack());
    }

    public ModelDuck(FlyinhBehavior flyinhBehavior, QuackBehavior quackBehavior) {
        super(flyinhBehavior, quackBehavior);
    }
}
