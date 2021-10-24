package basics;

import java.util.Scanner;

public class chknumSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num = String.valueOf(n);
        int count = num.length();
        int current ;
        System.out.println(count);
        System.out.println();
        int i = 1;
        int next ;
        boolean decrease = true;
        while (i<=count){
            current = num.charAt(i);
            next = num.charAt(i+1);
            if (current==next){
                return;
            }
            if (current<next){
                decrease = true;
                System.out.println("true");
            }

            if(current>next){
                decrease = false;
                System.out.println("true");

            }
            else {
                System.out.println("false");
            }

            i++;
        }

    }
}
