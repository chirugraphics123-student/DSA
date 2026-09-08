package Recursion;

import java.util.Arrays;

public class Bubble_Sort {
    static void sort(int []arr,int n){
         
        if(n==1){
            return;
        }
        for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                int t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
            }
        }
        sort(arr,n-1);
    }
    public static void main(String[] args) {
        int arr[]={12,3,1,67,43};
        System.out.println("Initial: "+Arrays.toString(arr));
        sort(arr,arr.length);
        System.out.println("After Sorting: "+Arrays.toString(arr));
    }
}
