package basics;

import java.util.Scanner;

public class revnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String sa = String.valueOf(n);
        int count = sa.length();
        int i = 1;
        while (i<=count){
            System.out.println(n%10);
            n = n/10;
            i++;

        }
    }
}
