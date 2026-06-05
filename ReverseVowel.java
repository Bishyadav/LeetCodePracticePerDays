package org.example;

import java.util.HashSet;

public class ReverseVowel {
    public static void main(String[] args) {
        HashSet<Character> hs=new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        String s="Programmingdemtest";
        s=s.toLowerCase();
        char[] ch=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while (i<=j){
            if(!hs.contains(ch[i])){
             i++;
            }
            else{
                char c=ch[i];
                if(!hs.contains(ch[j])){
                   j--;
                }else{
                    char chh=c;
                    ch[i]=ch[j];
                    ch[j]=chh;
                    i++;
                    j--;
                }

            }
        }
        String ss="";
for(char rr:ch){
    ss=ss+rr;
}
System.out.println(ss);
    }
}
