package org.example;

public class CheckPowerOfFourOrNot {
    public static void main(String[] args) {
        int n=4*4*4*4;
        System.out.println(ispower(n));
    }
    public static boolean ispower(int n){
        while (n%4==0){
            n=n/4;
        }
        if(n==1) return true;
        else  return false;
    }
}
