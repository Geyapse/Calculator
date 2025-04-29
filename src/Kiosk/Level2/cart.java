package Kiosk.Level2;

import java.util.*;


public class cart {
    private static cart instance = new cart();

    private List<menuitem> items = new ArrayList<>();

    private cart() {
    }

    public static cart getInstance() {
        return instance;
    }

    public void addItem(menuitem item) {
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

        for (menuitem item : items) {
            System.out.printf("%-15s | W %.1f | %s \n", item.getName(), item.getPrice(), item.getDescription());
            total += item.getPrice();
        }
        System.out.println("\n");
        System.out.println("[ Total ]");
        System.out.printf("W %.1f\n", total);
        System.out.println("1. 주문       2. 메뉴판");
        Scanner sc = new Scanner(System.in);

        int order = input(sc);

        if (order == 1) {
            System.out.println("할인 정보를 입력해주세요.");
            System.out.println("1. 국가유공자 : 10%");
            System.out.println("2. 군인      : 5%");
            System.out.println("3. 학생      : 3%");
            System.out.println("4. 일반      : 0%");

            int discount = input(sc);

            if (discount == 1) {
                total = total * 0.9;
            } else if (discount == 2) {
                total = total * 0.95;
            } else if (discount == 3) {
                total = total * 0.97;
            } else if (discount == 4) {
                total = total * 1;
            } else {
                System.out.println("잘못된 입력입니다. 다시선택하세요");
                return;
            }
            System.out.printf("주문이 완료되었습니다. 금액은 W %.1f 입니다\n\n", total);
            items.clear();
        }


    }

    public void clearCart() {
        items.clear();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    private static int input(Scanner sc) {
        while (true) {
            String input = sc.nextLine();
            try{
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }
    }

}
