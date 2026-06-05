package org.example;

public class SubStringMatching
{
    public static void main(String[] args) {
        String s="ADOBECODEBANC";
        String t="ANC";
        boolean b=false;
        int l=0;
        int m=0;
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<=s.length();j++){
                String str=s.substring(i,j);
                if(str.equals(t)){
                    l=i-1;
                    m=j;
                    b=true;
                    break;
                }
            }
            if(b){
                break;
            }
        }
        String res="";
        for(int k=l;k<m;k++){
           res=res+s.charAt(k);
        }
        System.out.println(res);
    }
}
