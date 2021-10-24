package basics;

import java.util.Scanner;

public class ScannerFunction {

    public static boolean checkfibonacci(int n) {

        int a = 0;
        int b = 1;
        if (n==a || n==b)
            return true;
        int c = a+b;
        while(c<=n)
        {
            if(c == n)
                return true;
            a = b;
            b = c;
            c = a + b;
        }
        return false;
    }


    public static void Main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = checkfibonacci(n);
        System.out.println(ans);
    }
}









