package org.example;

public class PalindromNumberEasy {
    public static void main(String[] args) {
        int nums=-121;
        System.out.println(solution(nums));

    }
    public static boolean solution(int nums){
        int rev=0;
        int originalNo=nums;
        while (nums>0){
            int rem=nums%10;
            rev=rev*10+rem;
            nums=nums/10;
        }
        if(rev==originalNo){
            return true;
        }else{
            return false;
        }
    }
}
