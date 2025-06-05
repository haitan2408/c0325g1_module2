package ss21_structural_DP.facade;

import java.util.List;

public class NonVegMenu implements Menu {
    String menu = "meat,fish,age";

    @Override
    public String toString() {
        return "NonVegMenu{" +
                "menu='" + menu + '\'' +
                '}';
    }
}
