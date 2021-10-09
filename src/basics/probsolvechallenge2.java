package basics;

import java.util.Scanner;

public class probsolvechallenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ntwice = n*2+1;
        int nhalf = ntwice/2;
        System.out.println(nhalf);
        int i = 1;
        while (i<=n){
            int j = 1;
            while (j<=i-1){
                System.out.print(0);
                j++;
            }
            j = i;
            while (j<=i){
                System.out.print("*");
                j++;
            }
            j = 1;
            while (j<=n-i){
                System.out.print(0);
                j++;
            }

            j = n;
            while (j<n+1){
                System.out.print("*");
                j++;
            }
            j= 1;
            while (j<=nhalf-i){
                System.out.print(0);
                j++;
            }
            j = nhalf;
            while (j<nhalf+1){
                System.out.print("*");
                j++;
            }
            j = 1;
            while (j<=i-1){
                System.out.print(0);
                j++;
            }
            i++;
            System.out.println();
        }
        // easy method
        /*
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int start = 1;
        int end = 2*n + 1;
        int mid = n + 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*n + 1; j++){
                if(j == start || j == end || j == mid){
                    System.out.print("*");
                }
                else{
                    System.out.print('0');
                }
            }
            start++;
            end--;
            System.out.println();
        }
         */

    }
}
