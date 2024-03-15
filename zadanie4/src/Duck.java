public abstract class Duck {
    FlyinhBehavior flyinhBehavior;
    QuackBehavior quackBehavior;

    public Duck()
    {

    }

    public Duck(FlyinhBehavior flyinhBehavior, QuackBehavior quackBehavior) {
        this.flyinhBehavior = flyinhBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void swim(){
        System.out.println("duck is swimming");
    }

    public void setFlyinhBehavior(FlyinhBehavior flyinhBehavior) {
        this.flyinhBehavior = flyinhBehavior;
    }

    public void performFly()
    {
        flyinhBehavior.fly();
    }

    public  void performQuack(){
        quackBehavior.quack();
    }


}
