package basics;

import java.util.Scanner;

public class ArrayDuplicate {
    public static int [] input(){
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
    public static int duplicate(int[] arr) {
        int found = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr.length;j++){
                if (arr[i] == arr[j] && i!=j) {
                    found = arr[i];
                    break;
                }
            }

        }
        return found;
    }







    public static void main(String[] args) {
        int[] array = input();
        int result = duplicate(array);
        System.out.println(result);

    }
}
