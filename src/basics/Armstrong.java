package basics;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String sa = String.valueOf(n);
        int count = sa.length();
        int sum = 0;
       try{
           for(int i = 0;i<=count;i++){
               int j = Integer.parseInt(String.valueOf(sa.charAt(i)));
               sum = (int) Math.pow(j,count) + sum;
           }
       }
       catch (Exception e){
       }
        if (sum==n){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}
