package basics;

import java.util.Scanner;

public class BasicPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i<=n){
            if (n>=0 && n<= 50){
                int j = 1;
                while (j<=n){
                    System.out.print(n);
                    j++;
                }
                System.out.println();
                i++;
            }



        }

    }
}
