package basics;

import java.util.Scanner;

public class ArraySum {
    public static int[] input(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i =1;i<=t;i++){
            for (int j=0;j<n;j++){
                arr[j]= sc.nextInt();
            }
        }
        return arr;
    }
    public static int sum(int[] arr){
        int total = 0;
        for (int i = 0;i<arr.length;i++){
            total = total+arr[i];
        }
        return total;
    }

    public static void main(String[] args) {
        int array[] = input();
        int total = sum(array);
        System.out.println(total);
    }
}
