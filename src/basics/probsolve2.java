package basics;

import java.util.Scanner;

public class probsolve2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = 1;
        int count = 0;
        int checker = 1;
        while (checker<=x){
            count = (3*n)+2;
            if (count%4!=0){
                System.out.print(count+" ");
                checker++;

            }
            n++;
        }


    }
}
   /* mport java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int p=1;
        int i=1;
        while(i<=x)
        {
            if(((3*p)+2)%4 !=0)
            {
                System.out.print(3*p+2 +" ");
                p++;
                i++;
            }
            else
            {
                p++;
            }
        }

    }
}*/