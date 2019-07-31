package com.zza.leecode;

import java.util.Stack;

public class no6 {
    public static void main(String[] args) {
        String[] a=new String[]{"3","-4","+"};
        System.out.println(evalRPN(a));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
       for (int i=0;i<tokens.length;i++){
           try {
               stack.push(Integer.parseInt(tokens[i]));
           }catch (NumberFormatException e){
               switch (tokens[i]){
                   case "+": stack.push(stack.pop()+stack.pop()); break;
                   case "-": stack.push(-stack.pop()+stack.pop()); break;
                   case "/":
                       int a=stack.pop();
                       int b=stack.pop();
                       if (a==0 || b==0){
                           stack.push(0);
                       }else {
                           stack.push(b/a);
                       } break;

                   case "*": stack.push(stack.pop()*stack.pop()); break;
                   default:
               }
           }
       }
       return stack.pop();
    }
}
