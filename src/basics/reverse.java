package basics;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if(n == 0) {
            System.out.println(0);
            return;
        }


        while(n%10 == 0) {
            n = n/10;
        }

        while(n >0) {
            System.out.print(n%10);
            n = n/10;
        }


    }

}
