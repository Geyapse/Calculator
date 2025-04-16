package chapter1.io;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Java");

        System.out.print("안녕");
        System.out.print("자바");

        System.out.println("Hello\nWorld!");

        Scanner sc = new Scanner(System.in);
        System.out.println("좋아하는 문장을 입력하세요: ");
        String s = sc.nextLine();
        System.out.println("sentence: " + s);

        Integer num = 100;
        String numStr = num.toString();
        System.out.println("numStr = " + numStr);
    }
}
