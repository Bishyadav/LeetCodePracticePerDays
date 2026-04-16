package org.example;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        String[] str=s.split("\\s");
        int leng=str.length-1;
        boolean flag=true;
        if(flag){
          String st=str[leng];
          System.out.println(st.length());
        }

    }
}
