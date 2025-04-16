package Calculator.Level1;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value;
        char operator;

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int number1 = in.nextInt();
        boolean running = true;

        while (running) {

            System.out.print("연산자를 입력하세요:");
            operator = in.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            int number2 = in.nextInt();

            switch (operator) {
                case '+':
                    value = number1 + number2;
                    break;
                case '-':
                    value = number1 - number2;
                    break;
                case '*':
                    value = number1 * number2;
                    break;
                case '/':
                    if (number2 != 0) {
                        value = number1 / number2;
                    }
                    else{
                        System.out.println("0으로 나눌수 없습니다");
                        continue;
                    }
                    break;
                case '%':
                    value = number1 % number2;
                    break;
                default:
                    System.out.println("잘못된 입력입니다");
                    continue;
            }

            System.out.println("계산결과 : " + value);
            System.out.println("더 계산 하시겠습니까? 계산하시려면 아무거나입력 (exit 입력 시 종료)");
            String cal = in.next();

            if (cal.equals("exit")) {
                System.out.println("계산 종료");
                running = false;
            } else {
                number1 = value;
            }

        }
        in.close();
    }
}
