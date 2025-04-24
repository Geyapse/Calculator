package Kiosk.Level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 장바구니 기능
// 주문 기능
// 할인 기능
public class Main{


    public static void main(String[] args) {

        List<MenuItem> menuItems = new ArrayList<>();
        List<MenuItem> Drink = new ArrayList<>();
        List<MenuItem> Dessert = new ArrayList<>();

        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Drink.add(new MenuItem("Cola", 2.5, "시원한 콜라 "));
        Drink.add(new MenuItem("ZeroCola", 2.5, "시원한 제로콜라 "));
        Drink.add(new MenuItem("Cider", 2.5, "시원한 사이다 "));
        Drink.add(new MenuItem("ZeroCider", 2.5, "시원한 제로사이다 "));

        Dessert.add(new MenuItem("IceCream", 2.0, "달콤하고 부드러운 아이스크림"));
        Dessert.add(new MenuItem("FrenchFries", 2.0, "바삭하고 짭잘한 감자튀김"));
        Dessert.add(new MenuItem("CheeseStick", 2.0, "바삭하고 고소한 치즈스틱"));
        Dessert.add(new MenuItem("ColeSlaw", 2.0, "아삭하고 상큼한 샐러드"));



        Scanner sc = new Scanner(System.in);

        boolean running = true;
        Cart cart = new Cart();
        System.out.println("[ MAIN MENU ]");
        System.out.println("1. Burgers ");
        System.out.println("2. Drinks ");
        System.out.println("3. Desserts ");
        System.out.println("0. 종료       | 종료");

        int menuChoice = sc.nextInt();

        if(menuChoice == 1) {
            MenuPrinter.print(menuItems);
        }
        else if(menuChoice == 2) {
            MenuPrinter2.print(menuItems);
        }
        else if(menuChoice == 3) {
            MenuPrinter3.print(menuItems);
        }


        while (running) {
            MenuPrinter.print(menuItems);
            MenuPrinter2.print(Drink);
            MenuPrinter3.print(Dessert);

            int input = sc.nextInt();



            switch (input) {

                case 1:
//                    String temp = """
//                            """;
                    System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인    2. 취소");
                    int answer1 = sc.nextInt();
                    if (answer1 == 1) {
                        cart.addItem(menuItems.get(0));
                    } else {
                        System.out.println("취소되었습니다");
                    }
                    break;

                case 2:
                    System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인    2. 취소");
                    int answer2 = sc.nextInt();
                    if (answer2 == 1) {
                        cart.addItem(menuItems.get(1));
                    } else {
                        System.out.println("취소되었습니다");
                    }
                    break;


                case 3:
                    System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인    2. 취소");
                    int answer3 = sc.nextInt();
                    if (answer3 == 1) {
                        cart.addItem(menuItems.get(2));
                    } else {
                        System.out.println("취소되었습니다");
                    }
                    break;

                case 4:
                    System.out.println("2. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인    2. 취소");
                    int answer4 = sc.nextInt();
                    if (answer4 == 1) {
                        cart.addItem(menuItems.get(3));
                    } else {
                        System.out.println("취소되었습니다");
                    }
                    break;

                case 0:
                    System.out.println("주문을 종료합니다");
                    cart.printCart();
                    running = false;

                default:
                    break;
            }
        }


    }
}
