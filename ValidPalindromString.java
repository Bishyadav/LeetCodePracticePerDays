package org.example;

import java.sql.SQLSyntaxErrorException;

public class ValidPalindromString {
    public static void main(String[] args) {
        String s="race a car";
        String str="";
        String rev="";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>=97 && ch<=122)||(ch>=48 && ch<=57)) {
                str = str + ch;
            }
        }
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        boolean b=false;
        if(str.equals(rev)){
            b=true;
        }else {
            b=false;
        }
        System.out.println(b);
    }
}
