package basics;

import java.util.Scanner;

public class Binary2decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String sa = String.valueOf(n);
        int count = sa.length();
        int finalvalue = 0;
        int i = 1;
        int num = 0;
        int sum = 0;
        try{
            while (i<=count){

                int lastnum = n%10;
                sum = (int) (Math.pow(2,num));
                finalvalue = finalvalue+sum*lastnum;
                int newn = n/10;
                n=newn;
                num++;
                i++;
            }
        }
        catch (Exception e){

        }
        System.out.println(finalvalue);

    }
}
