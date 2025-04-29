package Kiosk.Level2;

import java.util.Scanner;

// 장바구니 기능
// 주문 기능
// 할인 기능
public class main {


    public static void main(String[] args) {

        boolean running = true;
        cart cart = Kiosk.Level2.cart.getInstance();

        Scanner sc = new Scanner(System.in);

        while (running) {
            String menuChoice = mainmenu.MainMenuPrint(); // 메뉴 선택
            switch (menuChoice) {
                case "1": // 버거 메뉴
                    menuprinter.print("Burgers", mainmenu.Burgers);
                    handleMenuSelection(mainmenu.Burgers, cart);
                    break;
                case "2": // 음료 메뉴
                    menuprinter.print("Drinks", mainmenu.Drinks);
                    handleMenuSelection(mainmenu.Drinks, cart);
                    break;
                case "3": // 디저트 메뉴
                    menuprinter.print("Desserts", mainmenu.Desserts);
                    handleMenuSelection(mainmenu.Desserts, cart);
                    break;
                case "4": // 장바구니 확인
                    if (cart.isEmpty()) {
                        System.out.println("장바구니가 비어있습니다. 메뉴를 먼저 선택해주세요.");
                    } else {
                        cart.printCart();
                    }
                    break;
                case "5": // 주문취소
                    if (cart.isEmpty()) {
                        System.out.println("진행중인 주문이 없습니다.");
                    } else {
                        cart.clearCart();
                        System.out.println("주문이 취소되었습니다.");
                    }
                    break;
                case "0": // 종료
                    System.out.println("주문을 종료합니다.");
                    running = false;
                    break;
                default: // 예외
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
                    break;
            }
        }
    }

    private static void handleMenuSelection(java.util.List<menuitem> menuList, cart cart) {
        Scanner sc = new Scanner(System.in);
        int itemChoice = input(sc);

        if (itemChoice == 0) {
            return; // 뒤로가기
        }

        if (itemChoice < 1 || itemChoice > menuList.size()) {
            System.out.println("잘못된 선택입니다.");
            return;
        }

        menuitem selectedItem = menuList.get(itemChoice - 1);
        System.out.printf("%s | W %.1f | %s\n", selectedItem.getName(), selectedItem.getPrice(), selectedItem.getDescription());
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인    2. 취소");

        int confirm = input(sc);
        if (confirm == 1) {
            cart.addItem(selectedItem);
        } else {
            System.out.println("취소되었습니다.");
        }
    }

    public static int input(Scanner sc) {
        while (true) {
            String input = sc.nextLine();
            try{
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }
    }
}

