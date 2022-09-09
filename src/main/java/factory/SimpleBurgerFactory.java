package factory;

public class SimpleBurgerFactory {
    public Burger createBurger (String kind) {
        Burger burger = null;
        if (kind.equals("beef")) {
            burger = new BeefBurger();
        }
        return burger;
    }
}
