package basics;

import java.util.Scanner;

public class evenADD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count =0;
        int counter = 1;
        while (counter<=num){
            if (counter % 2 ==0){
                count = count + counter;
            }
            counter ++;
        }
        System.out.println(count);



    }
}
