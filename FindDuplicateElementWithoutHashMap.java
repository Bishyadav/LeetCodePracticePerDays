package org.example;

import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicateElementWithoutHashMap {
    public static void main(String[] args) {
        int[] arr={2,1,3,5,0,4};

        System.out.println(getDuplicateElement(arr));
    }
    public static String getDuplicateElement(int[] arr){
        HashSet<Integer> hs=new HashSet<>();
        String duplicate="";
        for(int i=0;i<arr.length;i++){
            if(!hs.contains(arr[i])){
                hs.add(arr[i]);
            }else{
                duplicate=duplicate+arr[i]+" ";
            }
        }
        if(duplicate.isEmpty()){
            return "-1";
        }
        return duplicate;
    }
}
