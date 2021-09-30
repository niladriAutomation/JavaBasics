package basics;

import java.util.Scanner;

public class patterns {
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
            int j = 1;
            int vAL = i;
            while (j<=i){
                System.out.print(vAL);
                vAL = vAL + 1;
                j = j+1;

            }
            System.out.println();
            i = i+ 1;
        }

    }
}
