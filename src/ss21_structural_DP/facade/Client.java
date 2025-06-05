package ss21_structural_DP.facade;

public class Client {

    public static void main(String[] args) {
        HotelKeeper hotelKeeper = new HotelKeeper();
        VegMenu vegMenu = hotelKeeper.getVegMenu();
        System.out.println(vegMenu);
        NonVegMenu nonVegMenu = hotelKeeper.getNonVegMenu();
        System.out.println(nonVegMenu);
    }
}
