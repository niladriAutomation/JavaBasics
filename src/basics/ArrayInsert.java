package basics;

import java.util.Scanner;

public class ArrayInsert {
    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        return arr;
    }
    public static int farrange(int arr[]){
        int l = arr.length;
        int n1half = (l-1)/2 +1;
        int n = l-n1half;
        int Fanum = 1;
        for (int j =0;j<n1half;j++){
            System.out.print(Fanum+" ");
            Fanum=Fanum+2;
        }
        return n;
    }
    public static void arrange(int arr[],int n) {
        int l = arr.length;
        int num = l - 1;
        if (l % 2 == 1){
            for (int j = 0; j <n; j++){
                System.out.print(num+" ");
                num = num-2;
            }
        }
        else if (l % 2 == 0) {
            for (int k = 0; k <n; k++){
                System.out.print(l+" ");
                l = l-2;
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] length = input();
        int halflength = farrange(length);
        arrange(length,halflength);
    }
}/*
    public static void arrange(int[] arr, int n) {
        //Your code goes here
        int left = 0;
        int right = n - 1;
        int counter = 1;

        while(left <= right) {

            if(counter % 2 == 1) {
                arr[left] = counter;
                counter += 1;
                left += 1;
            } else {
                arr[right] = counter;
                counter += 1;
                right -= 1;
            }
        }
    }*/