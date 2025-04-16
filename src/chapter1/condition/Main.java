package chapter1.condition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        switch (number) {

            case 1:
                System.out.println("1입니다.");
                break;
            case 2:
                System.out.println("2입니다,");
                break;
            default:
                System.out.println("1도아니고 2도아닙니다");

        }
    }
}
