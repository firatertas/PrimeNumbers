import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean b = false;
        int number = 100;
        System.out.print("2 ");
        for (int i = 1; i <= number; i++) {

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                } else {
                    b = true;
                    break;
                }
            }
            if (b){
                System.out.print(i+" ");
            }
        }
    }
}