package com.zza.jianzhiOffer.no18;

import java.util.Stack;

public class Test18 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{4, 3, 5, 1, 2};
        System.out.println(IspopOrder(a, b));
    }

    public static boolean IspopOrder(int[] pushA, int[] popA){
        if (pushA.length == 0){
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int popIndex = 0;
        for (int i = 0; i<pushA.length; i++){
            stack.push(pushA[i]);

            while (!stack.empty()&&stack.peek()==popA[popIndex]){
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }
    public static boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA.length == 1 && popA.length == 1) {
            return popA[0] == pushA[0];
        }
        Stack<Integer> myStack = new Stack<>();
        int index = 0;
        for (int i = 0; i < popA.length; i++) {
            if (i != 0) {
                if (popA[i] == myStack.peek()) {
                    myStack.pop();
                    continue;
                }
            }
            for (int u = 0; u < pushA.length; u++) {
                if (popA[i] == pushA[u]) {
                    if (u > index) {
                        for (int y = 0; y <= u; y++) {
                            if (pushA[y] != -1)
                                myStack.push(pushA[y]);
                            pushA[y] = -1;
                        }
                        myStack.pop();
                    } else {
                        if (pushA[u] != myStack.peek()) {
                            return false;
                        }
                    }
                    index = u;
                    break;
                } else if (u == pushA.length - 1) {
                    return false;
                }

            }

        }
        return true;
    }
}

