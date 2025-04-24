package Kiosk.Level2;

import java.util.*;


public class Cart {
    private List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
        System.out.println(item.getName() + "이 장바구니에 추가되었습니다.\n");
    }

    public void printCart() {
        if (items.isEmpty()) {
            System.out.println("장바구니가 비어있습니다");
            return;

        }

        double total = 0;
        System.out.println("[ Orders ] ");
        for (int i = 0; i < items.size(); i++) {
            MenuItem item = items.get(i);
            System.out.printf("%-15s | W %.1f | %s \n", item.getName(), item.getPrice(), item.getDescription());
            total += item.getPrice();
        }
        System.out.println("[ Total ]");
        System.out.printf("W %.1f\n", total);
        System.out.println("1. 주문       2. 메뉴판");
        Scanner sc = new Scanner(System.in);
        int order = sc.nextInt();
        if (order == 1) {
            System.out.printf("주문이 완료되었습니다. 금액은 W %.1f 입니다", total);
        }
        if (order == 2) {
            Main.main(new String[0]);
        }


    }
}
