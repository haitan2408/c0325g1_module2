package ss21_structural_DP.facade;

public class VegRestaurant implements Hotel {
    @Override
    public Menu getMenus() {
        VegMenu vegMenu = new VegMenu();
        return vegMenu;
    }
}
