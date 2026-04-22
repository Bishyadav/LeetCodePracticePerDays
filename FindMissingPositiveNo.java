package org.example;
import java.util.Arrays;
import java.util.HashMap;
public class FindMissingPositiveNo
{
    public static void main(String[] args) {
        int[] nums={-5};
       System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int missingNo=0;
        int count=0;
        int max=nums[nums.length-1];
        if(max>0) {
            for (int i = 1; i <= max; i++) {
                if (!map.containsKey(i)) {
                    missingNo = i;
                    count++;
                    break;
                }
            }
        }

        if(count==0)
        {
            missingNo=max+1;
        }
        if(max<0){
            missingNo=1;
        }
       return missingNo;
    }
}
