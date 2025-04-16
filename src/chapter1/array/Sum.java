package chapter1.array;

public class Sum {
    public static void main(String[] args) {
        int num[] ={2,5,8};
        int sum = 0;
        for(int a : num){
            sum+=a;
        }
        System.out.println("누적합: "+sum);
    }
}
