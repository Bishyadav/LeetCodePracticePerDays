package org.example;

import java.util.HashMap;

public class Isomorphic {
    public static void main(String[] args) {
        String s="abba";
        String tr="cat dog dog cat ";
        String[] t=tr.split("\\s");
        boolean b=isIsomorphic(s,t);
        System.out.println(b);

    }
        public static boolean isIsomorphic(String s, String[] t) {
            HashMap<Character, Integer> charIndexS = new HashMap<>();
            HashMap<String, Integer> charIndexT = new HashMap<>();

         if(s.length()!=t.length) return false;
            for (int i = 0; i < s.length(); i++) {
                if (!charIndexS.containsKey(s.charAt(i))) {
                    charIndexS.put(s.charAt(i), i);
                }

                if (!charIndexT.containsKey(t[i])) {
                    charIndexT.put(t[i], i);
                }

                if (!charIndexS.get(s.charAt(i)).equals(charIndexT.get(t[i]))) {
                    return false;
                }
                // for c# replace like for get() with
              //  if (d1[s[i]] != d2[t[i]]){
               //     Console.WriteLine("false");
               // }
            }

            return true;
        }
    }
