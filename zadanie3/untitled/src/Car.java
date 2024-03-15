

public class Car {

    private String brand;

    private String model;

    SpeedStrategy speedStrategy;

    public Car() {
        this.brand = "opel";
        this.model = "astra";
        this.speedStrategy = new CarSpeed();
    }

    public Car(String aBrand, String aModel, SpeedStrategy aSpeedStrategy) {
        brand = aBrand;
        model = aModel;
        speedStrategy = aSpeedStrategy;
    }

    public Car(SpeedStrategy aSpeedStrategy) {
        speedStrategy = aSpeedStrategy;
    }

    public void setBrand(String aBrand) {
        brand = aBrand;
    }

    public void setModel(String aModel) {
        model = aModel;
    }

    public void setSpeedStrategy(SpeedStrategy aSpeedStrategy) {
        speedStrategy = aSpeedStrategy;
    }

    public int getMaxSpeed() {
        return speedStrategy.maxSpeed();
    }

    public String getCarName(){
        return this.brand + " " + this.model;
    }

}
