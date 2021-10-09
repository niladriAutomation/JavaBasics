package basics;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int a = 0, b = 1, sum = 0;

        if(n == 1 || n == 2){
            System.out.println(1);
            return;
        }
        int i = 1;
        while(i <= n){
            sum = a + b;
            a = b;
            b = sum;
            i++;
        }

        System.out.println(a);

    }
}
