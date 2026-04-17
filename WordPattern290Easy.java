package org.example;

import java.util.HashMap;

public class WordPattern290Easy {
    public static void main(String[] args) {
        String pattern="abba";
        String s="dog cat cat dog";
    System.out.println(wordPattern(pattern,s));

    }
    public static  boolean wordPattern(String pattern,String s){
       char[] ch=pattern.toCharArray();
       String[] words=s.split("\\s");
        HashMap<Character,String> map=new HashMap<>();
        if(ch.length!=words.length)
            return  false;
        for(int i=0;i<ch.length;i++){
            if(map.containsKey(ch[i])){
            if(!map.get(ch[i]).equals(words[i])) {
                return  false;
            }
            }
            else {
                if(map.containsValue(words[i]))
                    return false;
                map.put(ch[i],words[i]);
            }
        }
        return true;
    }
}
