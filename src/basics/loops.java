package basics;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        int a =2;
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        while (a<= d-1){
            if (d%2==0){
                System.out.println("Non prime");
                return;
            }
            d=+1;
        }
        System.out.println("Prime");

    }
}
