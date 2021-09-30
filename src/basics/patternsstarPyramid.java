package basics;

import java.util.Scanner;

public class patternsstarPyramid {
    public static void main(String[] args) {
        //    1
        //    2 3
        //    3 4 5
        //    4 5 6 7
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        //int vAL = 1;
        while (i<=n){
            int space = 1;
            while (space < n-i){
                System.out.print(" ");
                space = space + 1;
            }
            int j = 1;
            while (j<=(2*i)-1){
                System.out.print("*");
                j = j+1;
            }
            System.out.println();
            i = i+ 1;
        }

    }
}
