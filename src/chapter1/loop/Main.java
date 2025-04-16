package chapter1.loop;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[5];
        for(int i = 0; i < 5; i++) {
            arr[i] = i;
        }
        for (int a : arr){
            System.out.println("값: " +a);
        }
    }
}
