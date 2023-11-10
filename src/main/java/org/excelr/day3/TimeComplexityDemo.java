package org.excelr.day3;

public class TimeComplexityDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{2,15,4,77,13};
        sort(arr);
        search(arr,44);
    }

    public static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){ // O(n)2
            for(int j=0;j<arr.length - i - 1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
    public static void search(int[] arr, int searchItem){
        for(int i=0;i<arr.length;i++){ // Time Complexity of n =  which is length of array O(n), O(1)
            if(searchItem == arr[i]){
                System.out.println("Number found at index "+i);
                return;
            }
        }
        System.out.println("Number not found");

    }
}
