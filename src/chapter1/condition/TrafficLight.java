package chapter1.condition;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        System.out.println("신호등 불빛을 입력하세요 ");
        Scanner in = new Scanner(System.in);
        String light = in.nextLine();

        switch (light) {
            case "초록불":
                System.out.println("건너세요!");
                break;
            case "노란불":
                System.out.println("주의하세요!");
                break;
            case "빨간불":
                System.out.println("멈추세요!");
                break;
            default:
                System.out.println("잘못된 입력입니다");
                break;


        }
    }
}
