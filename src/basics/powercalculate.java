package basics;

import java.util.Scanner;

public class powercalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        if (x>=0 && x<=8){
            if (n>=0 && n<=9){
                int   power = (int) Math.pow(x,n);
                System.out.println(power);
            }
        }

    }
}
