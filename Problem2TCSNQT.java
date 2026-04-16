package org.example;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Problem2TCSNQT {
    public static void main(String[] args) {
        /*
        Joseph is learning digital logic subject which will be
         for his next semester. He usually tries to solve unit
         assignment problems before the lecture. Today he got one
          tricky question. The problem statement is “A positive
          integer has been given as an input. Convert decimal value
           to binary representation. Toggle all bits of it after the most significant bit including the most significant bit. Print the positive integer value after toggling all bits”.

        Constrains-
1<=N<=100
Example 1:
Input :
10  -> Integer
Output :
5    -> result- Integer
Explanation:
Binary representation of 10 is 1010. After toggling the bits(1010),
 will get 0101 which represents “5”. Hence output will print “5”.
        */
        int no=10;
        print(no);
    }
    public static void print(int no){
        String binaryNo="";
     while (no!=0){
         int rev=no%2;
         binaryNo=binaryNo+rev;
         no=no/2;
     }
     System.out.println(binaryNo+" ");
     String rev="";
     for(int i=binaryNo.length()-1;i>=0;i--){
         rev=rev+binaryNo.charAt(i);
     }
        int originalNo=Integer.parseInt(rev,2);
        System.out.println(originalNo+" ");
     System.out.println(rev+" ");
     int decimal = Integer.parseInt(binaryNo, 2);
     System.out.println(decimal);

    }
}
