package factory;

public class BeefBurger extends Burger implements BurgerInterface {
    public Burger createBurger() {
        Burger bb = new BeefBurger();
        return bb;

    }
}
