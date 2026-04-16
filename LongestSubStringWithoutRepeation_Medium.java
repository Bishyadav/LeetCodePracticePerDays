package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LongestSubStringWithoutRepeation_Medium {
    public static void main(String[] args) {
        String s = "abcabcbb";
        HashSet<Character> map=new HashSet<>();
        char[] ch=s.toCharArray();
        int max=0;
        int res=0;
        for(int i=0;i<ch.length;i++){
            if(map.contains(ch[i])){
              max++;
            }else{
               if(res<max){
                   res=max;
                   max=0;
            }
        }
        }
        System.out.println(res+" ");
    }
}
