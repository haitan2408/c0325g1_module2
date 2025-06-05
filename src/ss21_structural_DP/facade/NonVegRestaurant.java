package ss21_structural_DP.facade;

public class NonVegRestaurant implements Hotel {
    @Override
    public Menu getMenus() {
        NonVegMenu nonVegMenu = new NonVegMenu();
        return nonVegMenu;
    }
}
