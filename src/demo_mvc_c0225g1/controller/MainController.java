package demo_mvc_c0225g1.controller;

import demo_mvc_c0225g1.view.MainView;
import demo_mvc_c0225g1.view.StudentView;

public class MainController {

    public static void main(String[] args) {
        int choice = MainView.displayMainView();
        switch (choice) {
            case 1:
                StudentView.displayMenuStudent();
                break;
        }
    }
}
