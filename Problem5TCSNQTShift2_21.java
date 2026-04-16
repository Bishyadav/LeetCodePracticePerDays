package org.example;

import java.util.Scanner;

public class Problem5TCSNQTShift2_21 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter hours");
        int h=s.nextInt();
        int parkPrice=100;
        if(h<=2){
          parkPrice=h*100;
        } else if (h>2 && h<=5) {
            parkPrice= (2*100)+(h-2)*50;
        } else if (h>5) {
            parkPrice=(2*100)+(3*50)+(h-5)*20;
        }
        System.out.println(parkPrice);
    }
}
