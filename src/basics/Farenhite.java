package basics;

import java.util.Scanner;

public class Farenhite {
    public static void  calculate(int start,int end,int step){
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
    public static void main(String[] args) {
        int start = 0;
        int end  = 0;
        int step  = 0;

        calculate(start,end,step);
    }
}
