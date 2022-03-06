package arquiteturadesw.designpatternsgof.adapter;

/**
 * Retirado de: https://www.baeldung.com/java-adapter-pattern
 * */
public class BugattiVeyron implements Movable {

    @Override
    public double getSpeed() {
        return 268;
    }
}
