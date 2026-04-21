package org.example;

import java.util.Arrays;

public class MaximumGap {
    public static void main(String[] args) {
        int[] arr={10000000,1};
        Arrays.sort(arr);
        int res=maxGap(arr);
        System.out.println(res);
    }
    public static int maxGap(int[] arr){
        if(arr.length<2) return 0;
        int max=0;
        for(int i=0;i<arr.length-1;i++){
            int currMax=arr[i+1]-arr[i];
            if(max<currMax){
                max=currMax;
            }
        }
        return max;

    }
}
