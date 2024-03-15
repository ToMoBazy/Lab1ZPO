package pracowac;

public class Leczenie implements Pracowac{
    @Override
    public void pracuj() {
        System.out.println("leczy ludzi...");
    }
}
