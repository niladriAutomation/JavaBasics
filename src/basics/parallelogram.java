package basics;

import java.util.Scanner;

public class parallelogram {
    static {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();
        if (b>0 && h>0 && b<100 && h<100){
            System.out.println(b*h);
        }
        else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");

        }

    }

    public static void main(String[] args) {

    }
}
