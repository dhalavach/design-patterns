package factory;

public class VeganBurger extends Burger implements BurgerInterface {
    public Burger createBurger() {
        Burger vb = new VeganBurger();
        return vb;

    }
}
