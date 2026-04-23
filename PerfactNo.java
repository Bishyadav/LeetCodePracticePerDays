package org.example;

public class PerfactNo {
    public static void main(String[] args) {
        int no=7;
        boolean b=chechNoIsPerfactOrNot(no);
        System.out.println(b);

    }
    public static boolean chechNoIsPerfactOrNot(int no){
        int sum=0;
        for(int i=1;i<no;i++){
            if(no%i==0){
                sum=sum+i;
            }
        }
        if(sum==no) return true;
        else return false;
    }
}
