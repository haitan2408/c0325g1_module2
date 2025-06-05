package ss21_structural_DP.facade;

public class HotelKeeper {

    public NonVegMenu getNonVegMenu() {
        NonVegRestaurant v = new NonVegRestaurant();
        NonVegMenu nonVegMenu = (NonVegMenu) v.getMenus();

        return nonVegMenu;
    }

    public VegMenu getVegMenu() {
        VegRestaurant v = new VegRestaurant();
        VegMenu vegMenu = (VegMenu) v.getMenus();

        return vegMenu;
    }
}
