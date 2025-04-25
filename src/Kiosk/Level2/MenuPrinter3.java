package Kiosk.Level2;

import java.util.List;

public class MenuPrinter3 {
    public static void print(List<MenuItem> Desserts) {
        System.out.println("[ DESSERT MENU ]");
        for (int i = 0; i < Desserts.size(); i++) {
            MenuItem item = Desserts.get(i);
            System.out.printf("%d. %-13s | W %.1f | %s\n", i + 1, item.getName(), item.getPrice(), item.getDescription());
        }
        System.out.println("0. 종료           | 종료");
    }
}
