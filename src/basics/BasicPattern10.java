package basics;

import java.util.Scanner;

public class BasicPattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = (n+1)/2;
        int n2 = n1-1;
        int i = 1;
        while (i<=n1){
            int j = 1;
            while (j<=n1-i){
                System.out.print(" ");
                j++;
            }

             j = 1;
            while (j<=i){
                System.out.print("*");
                j++;

            }
            int t = i-1;
            j = 1;
            while (j<=i-1){
                System.out.print("*");
                t--;
                j++;
            }

            System.out.println();
            i++;
        }
        int j = n2;
        while(j>0){
            int sp=1;
            while(sp<=n2-j+1){
                System.out.print(" ");
                sp=sp+1;
            }
            int st=1;
            while(st<=2*j-1){
                System.out.print("*");
                st=st+1;
            }

            System.out.println();
            j=j-1;
        }





    }
}
