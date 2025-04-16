package chapter1.loop;

import java.util.Scanner;

public class gugu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 단수를 입력하세요 :");
        int dan = sc.nextInt();
        for(int i = 1; i < 10; i++) {
            //System.out.printf("%d X %d = %d\n",dan,i,dan*i);
            System.out.println(dan + " X " + i + " = " + (dan * i));
        }
    }
}
