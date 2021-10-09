package basics;

import java.util.Scanner;

public class probsolve1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int  c = s.nextInt();
        if (c==1){
            int sum = 0;
            for (int i =1;i<=n;i++){
                sum = sum+i;
            }
            System.out.println(sum);

        }
        if (c==2){
            int product = 1;
            for (int j = 1;j<=n;j++){
                product = product*j;
            }
            System.out.println(product);

        }
        if(c>2) {

            System.out.println("-1");
        }

    }
}
