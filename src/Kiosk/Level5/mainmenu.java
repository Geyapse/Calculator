package Kiosk.Level5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class mainmenu {
    public static List<menuitem> Burgers = new ArrayList<>();
    public static List<menuitem> Drinks = new ArrayList<>();
    public static List<menuitem> Desserts = new ArrayList<>();

    static {
        Burgers.add(new menuitem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        Burgers.add(new menuitem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        Burgers.add(new menuitem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        Burgers.add(new menuitem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Drinks.add(new menuitem("Cola", 2.5, "시원한 콜라 "));
        Drinks.add(new menuitem("ZeroCola", 2.5, "시원한 제로콜라 "));
        Drinks.add(new menuitem("Cider", 2.5, "시원한 사이다 "));
        Drinks.add(new menuitem("ZeroCider", 2.5, "시원한 제로사이다 "));

        Desserts.add(new menuitem("IceCream", 2.0, "달콤하고 부드러운 아이스크림"));
        Desserts.add(new menuitem("FrenchFries", 2.0, "바삭하고 짭잘한 감자튀김"));
        Desserts.add(new menuitem("CheeseStick", 2.0, "바삭하고 고소한 치즈스틱"));
        Desserts.add(new menuitem("ColeSlaw", 2.0, "아삭하고 상큼한 샐러드"));
    }

    public static String MainMenuPrint() {
        Scanner sc = new Scanner(System.in);

        System.out.println("[ MAIN MENU ]");
        System.out.println("1. Burgers ");
        System.out.println("2. Drinks ");
        System.out.println("3. Desserts ");
        System.out.println("4. Orders       | 장바구니를 확인 후 주문합니다.");
        System.out.println("5. Cancel       | 진행중인 주문을 취소합니다.");
        System.out.println("0. 종료       | 종료");

        return sc.next();


    }
}


