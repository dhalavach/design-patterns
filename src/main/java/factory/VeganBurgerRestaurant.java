package factory;

public class VeganBurgerRestaurant extends Restaurant {

    public Burger createBurger() {
        Burger burger = new VeganBurger();
        return burger;
    }
}
