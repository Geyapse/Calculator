package Kiosk.Level2;

import java.util.Scanner;

// 장바구니 기능
// 주문 기능
// 할인 기능
public class Main {


    public static void main(String[] args) {

        boolean running = true;
        Cart cart = new Cart();
        MainMenu.MainMenuPrint();


        Scanner sc = new Scanner(System.in);

        while (running) {

            int input = sc.nextInt();

            switch (input) {

                case 1:
                    System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인    2. 취소");

                    int answer1 = sc.nextInt();

                    if (answer1 == 1) {
                        cart.addItem(Burgers.get(0));
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

