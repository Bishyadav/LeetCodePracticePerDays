package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Pairs {
    int first;
    int second;

    Pairs(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class Problem6TCSNQTShift2_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of pairs:");
        int no = sc.nextInt();

        ArrayList<Pairs> al = new ArrayList<>();

        for (int i = 0; i < no; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            al.add(new Pairs(a, b));
        }
        Collections.sort(al,(p1,p2)->{
            if(p1.first==p2.first){
                return p1.second-p2.second;
            }
            return p1.first-p2.first;

        });

        for (Pairs p : al) {
            System.out.println(p.first + " " + p.second);
        }
    }
}