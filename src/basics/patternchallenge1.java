package basics;

import java.util.Scanner;

public class patternchallenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i<=n){
            int j = 1;
            while (j<=n-i){
                System.out.print(n-j+1);
                j++;
            }
            int k = i;
           while (k<=i){
               System.out.print("*");
               k++;
           }
            int counter = i-1;
            int x = 1;
            while (x<=i-1){
                System.out.print(counter);
                counter--;
               x++;
            }


            System.out.println();
            i++;
        }
    }
}
