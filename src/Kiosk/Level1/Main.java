package Kiosk.Level1;

import java.util.Scanner;

// 장바구니 기능
// 주문 기능
// 할인 기능
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        boolean running = true;

        while (running) {
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료      | 종료");

            int input = sc.nextInt();

            switch (input) {
                case 1:
                    running = false;
                    break;

                case 2:
                    running = false;
                    break;

                case 3:
                    running = false;
                    break;

                case 4:
                    running = false;
                    break;

                case 0:
                    System.out.println("주문을 종료합니다");
                    running = false;

                default:
                    running = false;
                    break;
            }



        }


    }
}
