package chapter1.array;

public class Even {
    public static void main(String[] args) {
        int num[] = {3,4,7,10,15,20};
        System.out.print("짝수 : ");
        for (int i = 0; i < num.length; i++) {
            if(num[i]%2==0){
                System.out.print(num[i] + " ");
            }
        }
    }
}
