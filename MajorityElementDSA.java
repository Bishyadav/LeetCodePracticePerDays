package org.example;

public class MajorityElementDSA {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,0,2,2,2,3,5,3,3,5,2,4,1,4,1,1};
        int maxCount=0;
        int index=0;
        int i,j;
        for(i=0;i<arr.length;i++){
            int count=0;
            for(j=0;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   count++;
               }
            }
            if(count>maxCount){
                maxCount=count;
                index=i;
            }

        }
        System.out.println(arr[index]+"->"+maxCount);
    }
}
