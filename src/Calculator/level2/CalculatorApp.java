package Calculator.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculatorApp {

    private List<Integer> results = new ArrayList<>();

    public int sum(int a, int b) {
        int result = a + b;
        addResult(result);
        return result;
    }

    public int sub(int a, int b) {
        int result = a - b;
        addResult(result);
        return result;
    }

    public int mul(int a, int b) {
        int result = a * b;
        addResult(result);
        return result;
    }

    public int div(int a, int b) {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        int result = a / b;
        addResult(result);
        return result;
    }

    public int mod(int a, int b) {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        int result = a % b;
        addResult(result);
        return result;
    }

    public void addResult(int result) {
        results.add(result);
        if (results.size() > 10) {
            results.remove(0);
        }
    }

    public void printResults() {
        System.out.println("=== 지금까지의 계산 결과 ===");
        for (int i = 0; i < results.size(); i++) {
            System.out.println((i + 1) + ": " + results.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CalculatorApp calc = new CalculatorApp();

        int number1, number2, value;
        char operator;


        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            number1 = in.nextInt();
            if (number1 < 0) {
                System.out.println("양의 정수(0포함)를 입력 해주세요");
            } else {
                break;
            }
        }

        boolean running = true;
        while (running) {
            System.out.print("연산자를 입력하세요: ");
            operator = in.next().charAt(0);

            while (true) {
                System.out.print("두 번째 숫자를 입력하세요: ");
                number2 = in.nextInt();
                if (number2 < 0) {
                    System.out.println("양의 정수(0포함)를 입력 해주세요");
                } else {
                    break;
                }
            }

            switch (operator) {
                case '+':
                    value = calc.sum(number1, number2);
                    break;
                case '-':
                    value = calc.sub(number1, number2);
                    break;
                case '*':
                    value = calc.mul(number1, number2);
                    break;
                case '/':
                    value = calc.div(number1, number2);
                    break;
                case '%':
                    value = calc.mod(number1, number2);
                    break;
                default:
                    System.out.println("잘못된 입력입니다");
                    continue;
            }

            System.out.println("계산 결과: " + value);
            System.out.println("계속 계산하시겠습니까? (exit 입력 시 종료)");
            String cal = in.next();

            if (cal.equals("exit")) {
                System.out.println("계산 종료");
                calc.printResults();
                running = false;
            } else {
                number1 = value;
            }
        }
        in.close();
    }
}
