package basics;

import java.util.Scanner;

public class ArrayLinearSearch {
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
    public static int linearSearch(int[] arr) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int found = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == t) {
                found = 1;
                System.out.println(i);
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        int array[] = input();
        int found = linearSearch(array);
        if (found==0){
            System.out.println("-1");
        }
    }
}
/*
public static int linearSearch(int arr[], int x) {
		//Your code goes here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
 */
