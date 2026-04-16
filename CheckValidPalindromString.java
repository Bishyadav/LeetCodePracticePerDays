package org.example;

public class CheckValidPalindromString {
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";
        String s="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            str.toLowerCase();
            if(ch>=97 && ch<=122){
                s=s+ch;
            }
        }
        String res="";
        for(int i=s.length()-1;i>=0;i--){
         res=res+s.charAt(i);
        }
        if(str.equals(s)){
            System.out.println("true");
        }else{
            System.out.println("Not Ture");
        }
    }
}
