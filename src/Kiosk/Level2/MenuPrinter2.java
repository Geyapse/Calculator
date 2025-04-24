package Kiosk.Level2;

import java.util.List;

public class MenuPrinter2 {
    public static void print(List<MenuItem> Drink) {
        System.out.println("[ DRINK MENU ]");
        for (int i = 0; i < Drink.size(); i++) {
            MenuItem item = Drink.get(i);
            System.out.printf("%d. %-13s | W %.1f | %s\n", i + 1, item.getName(), item.getPrice(), item.getDescription());
        }
        System.out.println("0. 종료           | 종료");

    }
}
