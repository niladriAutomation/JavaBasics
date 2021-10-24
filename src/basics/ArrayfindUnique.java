package basics;

import java.util.Scanner;

public class ArrayfindUnique {
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
    public static int unique(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=0;j<arr.length;j++){
                if(i!=j){
                    if(arr[i]==arr[j]){
                        break;
                    }
                }
            }
            if(j==arr.length){
                return arr[i];
            }
        }
        // return arr;
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        int array[] = input();
        unique(array);

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
