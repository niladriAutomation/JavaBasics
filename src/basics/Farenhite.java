package basics;

import java.util.Scanner;

public class Farenhite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();
         int   cel = 0;
        while (s<= e){
            cel =(int ) ((s-32)/1.8);
            System.out.println(s+" "+cel);
            s = s+w;

        }
    }
}
