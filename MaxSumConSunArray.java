package org.example;

public class MaxSumConSunArray {
    public static void main(String[] args) {
        int[] arr={-1,-2,-3,1,2,3};
//        int maxSum=0;
//        int p=0,q=0,i,j;
//        for(i=0;i<arr.length;i++){
//            int sum=0;
//            for(j=i;j<arr.length;j++){
//                sum=sum+arr[j];
//                if(sum>maxSum){
//                    maxSum=sum;
//                    p=i;
//                    q=j;
//                }
//            }
//
//        }
//        System.out.println(p+" "+q);
//        System.out.println(maxSum);

        //Kadarn's Algorithum
        int maxSum=0;
        int currentSum=1;
        for(int i=0;i<arr.length;i++){
            currentSum=currentSum*arr[i];
            if(currentSum>maxSum){
                maxSum=currentSum;

            }
            if(currentSum<=0){
                currentSum=1;
            }
        }
        System.out.println(maxSum);
    }
}
