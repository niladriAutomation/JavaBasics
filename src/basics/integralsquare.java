package basics;

import java.util.Scanner;

public class integralsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int res = 0;
        while (true){
            res = i * i;
            if(res > n)
            {
                System.out.println(i - 1);
                return;
            }
            i++;
        }
    }
}
