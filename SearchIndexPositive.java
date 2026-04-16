package org.example;

public class SearchIndexPositive {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println(getIndex(nums,target));
    }
        public static int getIndex(int[] nums,int target){
          int index=0;
          int i;
          for(i=0;i<nums.length;i++){
              if(nums[i]==target){
                  return i;
              }
              else if(nums[i]>target){
                  return i;
              }
              else if(nums[i]!=target && nums.length==i+1){
                  return i+1;
              }
        }
          return i;
    }
}
