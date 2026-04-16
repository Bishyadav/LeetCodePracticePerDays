package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Problem7TCSNQTShift2_21 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number");
        int n= s.nextInt();
        System.out.println("Enter Weights of persons");
        int[] w=new int[n];
        for(int i=0;i<n;i++){
          w[i]=s.nextInt();
        }
        System.out.println("Enter Ballon capacities");
        int c=s.nextInt();
        Arrays.sort(w);
        int value=c;
        int count=0;
        for(int i=0;i<w.length;i++){
            value=value-w[i];
           if(value>0){
               count++;
           }else{
               break;
           }
        }
        System.out.println(count+" ");
    }
}
