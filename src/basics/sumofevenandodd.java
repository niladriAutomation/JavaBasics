package basics;

import java.util.Scanner;

public class sumofevenandodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int   n = sc.nextInt();
        //int len = n.length();

        int evencount = 0;
        int oddcount = 0;
        while(n>0)
        {
            int last=n%10;
            if(last%2==0)
            {
                evencount=last+evencount;
            }else
            {
                oddcount=oddcount+last;
            }
            n=n/10;
        }
        System.out.println(evencount+ " "+ oddcount);


    }
}
