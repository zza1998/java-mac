package com.zza.jianzhiOffer.no17;

import java.util.Stack;

public class Test17 {
    public static void main(String[] args) {

    }
    Stack<Integer> myStack = new Stack<>();
    int min = Integer.MAX_VALUE;
    public void push(int node) {
        myStack.push(node);
        if (node<min){
            min = node;
        }
    }

    public void pop() {
        myStack.pop();
        Stack<Integer> temp = new Stack<>();
        min = Integer.MAX_VALUE;
        while (!myStack.empty()){

            if (myStack.peek()<min){
                min = myStack.peek();
            }
           temp.push( myStack.pop());

        }
        while (!temp.empty()){
            myStack.push(temp.pop());
        }
    }

    public int top() {
      return myStack.peek();

    }

    public int min() {
        return min;
    }
}
