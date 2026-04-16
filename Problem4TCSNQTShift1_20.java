package org.example;
import java.util.Scanner;
public class Problem4TCSNQTShift1_20 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int no=s.nextInt();
    int cost=0;
    if(no%12==0){
     cost=cost+(no/12)*15000;
    } else if (no%9==0) {
        cost=cost+(no/9)*12000;
        System.out.println(cost);
    } else if (no%6==0) {
        cost=cost+(no/6)*7000;
        System.out.println(cost);
    } else if (no%3==0) {
        cost=cost+(no/3)*5000;
        System.out.println(cost);
    }else {
        System.out.println("Error");
    }
    }
}
