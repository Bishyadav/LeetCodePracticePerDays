package org.example;

public class ContainDuplicateLeetCode220Problem {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        int indexDiff=3;
        int valueDiff=0;
        boolean flag=containsNearbyAlmostDuplicate(nums,indexDiff,valueDiff);
        System.out.println(flag);
    }
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int i,j;
        for(i=0;i<nums.length-1;i++){
            for(j=i+1;j<nums.length;j++){
                if(i!=j){
                    if(Math.abs(i-j)<=indexDiff){
                        if(Math.abs(nums[i]-nums[j])<=valueDiff){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
