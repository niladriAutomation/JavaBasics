package basics;

import java.util.Scanner;

public class ArrayTutorial {
    public static int[] input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        return arr;
    }
    public static void print(int arr[]){
        int n = arr.length;
        for (int j=0;j< n;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
    }
    public static int largest(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int array[] = input();
        print(array);
        int num = largest(array);
        System.out.println("Largest is "+num);


    }
}
