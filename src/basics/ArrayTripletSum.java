package basics;

import java.util.Scanner;

public class ArrayTripletSum {
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

    public static int pairsum(int[] arr) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int i,j,k,l,m,n,count=0;
        n=arr.length;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                for (k=j+1;k<n;k++){
                    if(i!=j&& j!=k){
                        if(arr[i]+arr[j]+arr[k]==sum){
                            count++;
                        }
                    }
                }

            }
        }
        return count;

    }








    public static void main(String[] args) {
        int[] array1 = input1();
        pairsum(array1);


    }
}
