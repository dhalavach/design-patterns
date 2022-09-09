package factory;

public class BeefBurgerRestaurant extends Restaurant {
    public Burger createBurger() {
        System.out.println("returning new beef burger");
        return new BeefBurger();

    }
}
