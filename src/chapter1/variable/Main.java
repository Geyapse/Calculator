package chapter1.variable;

public class Main {
    public static void main(String[] args) {

        // 자료형 변수이름;
        int a;
        a = 1;
        a = 2;
        System.out.println("a = " + a);
        
        // 논리형
        boolean booleanBox = true;
        booleanBox = false;
        System.out.println("booleanBox = " + booleanBox);

        // 문자형
        char charBox = 'a';
        charBox = 'b';
        System.out.println("charBox = " + charBox);

        // 큰 정수형
        long longBox = 1;
        longBox = 2;
        System.out.println("longBox = " + longBox);

        // 소수점
        float floatBox = 0.12345678f;
        floatBox = 0.1234567890f;
        System.out.println("floatBox = " + floatBox);
        
        double doubleBox = 0.1234567890;
        System.out.println("doubleBox = " + doubleBox);


        // 다운캐스팅: 큰 데이터를 ㅡ> 큰 상자
        double bigBox = 10.123;
        int smallBox = (int) bigBox;
        System.out.println("smallBox = " + smallBox);

        
        // 업캐스팅: 작은 데이터 ㅡ> 큰 상자
        int smallBox2 = 10;
        double bigBox2 = smallBox2;
        System.out.println("bigBox2 = " + bigBox2);

        // 문자열 데이터
        char a1 ='a';
        String a2 ="안녕하세요!";
        int a3 = 1;
        long l3 = 1;

        boolean b = true;
    }
}
