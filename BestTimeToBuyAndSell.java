package org.example;

public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        int[] arr1=new int[arr.length];
        int min=arr[arr.length-1];
        int maxProfit=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=min){
             arr1[i]=arr[i];
             min=arr[i];
            }
            else {
                arr1[i]=min;
            }
        }
        for(int i=0;i< arr1.length;i++) {
            int currProfit=arr1[i]-arr[i];
            if(maxProfit<currProfit){
                maxProfit=currProfit;
            }
        }
        System.out.println(maxProfit+" ");
    }
}
