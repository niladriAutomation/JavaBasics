package basics;

import java.util.Scanner;

public class CharPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i<=n){
            char cr = (char)('A'+i-1);
            int j = 1;
            while (j<=i){

                System.out.print(cr);
                j++;

            }
            System.out.println();
            i++;


        }

    }
}
