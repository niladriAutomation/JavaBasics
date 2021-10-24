package basics;

import java.util.Scanner;

public class ArrayIntersection {
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
    public static int [] input2(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr2[] = new int[n];
        for (int j=0;j<n;j++){
            arr2[j]= sc.nextInt();
        }
        return arr2;
    }
    public static void duplicate(int[] arr1,int[] arr2) {
        int change = Integer.MIN_VALUE;
        int found = 0;
        for (int i = 0; i < arr1.length; i++) {
            int j = 0;
            for(j=0;j<arr2.length;j++){
                if (arr1[i] == arr2[j]) {
                    found = arr1[i];
                    System.out.print(found + " ");
                    arr2[j] = change;
                    break;
                }
            }

        }

    }








    public static void main(String[] args) {
        int[] array1 = input1();
        int [] array2 = input2();
       duplicate(array1,array2);


    }
}
