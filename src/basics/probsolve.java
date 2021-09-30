package basics;

import java.util.Scanner;

public class probsolve {
    public static void main(String[] args) {
        //  totalSalary = basic + hra + da + allow – pf
        /*hra   = 20% of basic
                da    = 50% of basic
                allow = 1700 if grade = ‘A’
        allow = 1500 if grade = ‘B’
        allow = 1300 if grade = ‘C' or any other character
        pf    = 11% of basic.
        */
        // 0 <= Basic Salary <= 7,500,000

        Scanner scan=new Scanner(System.in);
        int bs=scan.nextInt();
        String grade=scan.next();
        double hra=0.2*bs;
        double da=0.5*bs;
        int allow;
        if(grade.charAt(0)=='A') {
            allow=1700;
        }
        else if(grade.charAt(0)=='B') {
            allow=1500;
        }
        else {
            allow = 1300;
        }
        double pf=0.11*bs;

        int totalSalary=(int)(Math.round(bs+hra+da+allow-pf));
        System.out.println(totalSalary);
    }
}
