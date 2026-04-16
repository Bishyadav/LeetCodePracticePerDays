package org.example;
import java.util.HashMap;
import java.util.Map;
//LinkedHashMap has insertion order
//HashMap do not have Insertion Order
public class LongestSubStringWithoutRep {
    public static void main(String[] args) {
        String str="ababcabf";
        int maxCount=0;
        //4
        //abcf
        HashMap<Character,Integer>map=new HashMap<>();
        /*for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,i);
            }else{
                i=map.get(ch);
                map.clear();
            }
            if(maxCount<map.size()){
                maxCount=map.size();
            }
        }
        String s="";
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            s=s+entry.getKey();
        }*/
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
           if(map.containsKey(ch)) {
               map.put(ch,map.get(ch)+1);
           }else{
               map.put(ch,1);
           }
        }
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
        //System.out.println(maxCount+" ");
        //System.out.println(s+" ");
    }
}
