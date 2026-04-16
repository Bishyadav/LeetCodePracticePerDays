package org.example;

public class BuyAndSell {
    public static void main(String[] args) {
        int[] arr={3,2,4,8,7,1,5};
        int min=arr[0];
        int max=0;
        int p=0,q=0;
        for(int i=0;i<arr.length;i++){
            if(min<arr[i]){
                min=arr[i];
                p=i;//1
            }
            if(max<arr[i]){
                max=arr[i];
                q=i;//3
            }
            if(p>q){
               max=0;
            }
        }
    }
}
