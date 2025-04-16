package chapter1.io;

import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = sc.next();
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        System.out.println("출력 결과: ");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }
}
