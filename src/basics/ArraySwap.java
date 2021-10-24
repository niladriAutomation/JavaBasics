package basics;

import java.util.Scanner;

public class ArraySwap {
    public static int[] input(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 1;i<=t;i++){
            for (int j = 0;j< arr.length;j++){
                arr[i] = sc.nextInt();
            }
        }
        return arr;
    }
    public static void swapAlternate(int arr[]) {
        //Your code goes here
        int l=arr.length;
        int temp;
        if(l%2==0){
            for(int i=0;i<l;i+=2){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;

            }
        }
        if(l%2!=0){
            for(int j=0;j<l-1;j+=2){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }
            arr[l-1]=arr[l-1];
        }
    }


    public static void main(String[] args) {
        int array[] = input();
        swapAlternate(array);
    }
}
