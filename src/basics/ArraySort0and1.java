package basics;

import java.util.Scanner;

public class ArraySort0and1 {
    public static int [] input1(){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int n = sc.nextInt();
    int arr1[] = new int[n];
        for (int i =1;i<=t;i++){
        for (int j=0;j<n;j++){
            arr1[j]= sc.nextInt();
        }
    }
        return arr1;
    }

    public static void sortZeroesAndOne(int[] arr) {
        int n = arr.length;

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count++;
        }


        for (int i = 0; i < count; i++)
            arr[i] = 0;



        for (int i = count; i < n; i++)
            arr[i] = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


    }








    public static void main(String[] args) {
        int[] array1 = input1();
        sortZeroesAndOne(array1);


    }
}
