package basics;

import java.util.Scanner;

public class Decimal2binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        String sa = String.valueOf(n);
        int count = sa.length();
        int num = 1;
        int res = 0;
        int answ = 0;
        int pv = 1;
        while (i<=num){
            num = n/2;
            res = n%2;
            answ = res*pv;
            pv=pv+(pv*10);
            n = num;
            System.out.println(answ);

        }


    }
}


