package Kiosk.Level2;

import java.util.List;

public class MenuPrinter {
    public static void print(List<MenuItem> menuItems) {
        System.out.println("[ SHAKESHACK MENU ]");
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.printf("%d. %-13s | W %.1f | %s\n", i + 1, item.getName(), item.getPrice(), item.getDescription());
        }
        System.out.println("0. 종료           | 종료");
    }
}
