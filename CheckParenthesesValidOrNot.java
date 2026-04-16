package org.example;

import java.util.Stack;

public class CheckParenthesesValidOrNot {
    public static void main(String[] args) {
        String str = "()";
        System.out.println(checkParenthesesValidOrNot(str));
    }
        public static boolean checkParenthesesValidOrNot(String str){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i< str.length();i++){
            char ch= str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else if(!stack.isEmpty() && ch==')' && stack.peek()=='('){
                stack.pop();
            }
            else if(!stack.isEmpty() && ch=='}' && stack.peek()=='{'){
                stack.pop();
            }
            else if(!stack.isEmpty() && ch==']' && stack.peek()=='['){
                stack.pop();
            }
            else {
                stack.isEmpty();
                return false;
            }
        }
        return stack.isEmpty();
    }
}
