package org.example;
import java.util.HashMap;
public class AddTwoNo {
    public static void main(String[] args) {
        int[] nums={2,7,5,1,9};
        int[] arr=new int[2];
        int target=9;
        solution(nums,arr,target);
    }
    public static void solution(int[] nums,int[] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                arr[0]=map.get(complement);
                arr[1]=i;
            }
            else {
                map.put(nums[i],i);
            }
        }
        System.out.println(arr[0]+" "+arr[1]);

    }
}
