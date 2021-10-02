package basics;

import java.util.Scanner;

public class BasicPattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i<=n){
            int j = 1;
            while (j<=n-i){
                System.out.print(" ");
                j++;

            }
            int var = i;
            j = 1;

            while (j<=i){
                System.out.print(var);

                j++;
                var++;
            }
             var = j+i-3;
             j = 1;
            while (j<=i-1){
                System.out.print(var);
              var--;
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
