package arquiteturadesw.designpatternsgof.adapter;

/**
 * Retirado de: https://www.baeldung.com/java-adapter-pattern
 * */
public class MovableAdapterImpl implements MovableAdapter {
    private Movable luxuryCars;

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
