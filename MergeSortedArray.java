package org.example;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=3;// count of first array element with non zero
        int n=3;// count of first array element with non zero
        int[] arr=new int[m+n];
        sortedArray(nums1,nums2,arr,m,n);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            nums1[i]=arr[i];
        }
        for(int i=0;i<nums1.length;i++){
            System.out.println(nums1[i]+" ");
        }
    }
    public static int[] sortedArray(int[] nums1,int[] nums2,int[] arr,int m,int n){
        for(int i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            arr[m+i]=nums2[i];
        }
        return arr;
    }
}
