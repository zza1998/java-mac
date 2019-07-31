package com.zza.check;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckString {
    /**
     * 字节跳动笔试题
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> aa = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            aa.add(sc.next());
        }
        for (int i = 0; i < n; i++) {
            String next = aa.get(i);
            System.out.println(checks(next));
        }

    }

    /**
     * 检查字符串
     *
     * @param s
     * @return
     */
    private static String checks(String s) {
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < sb.length() - 2; i++) {
            if (sb.charAt(i) == sb.charAt(i + 1) && sb.charAt(i) == sb.charAt(i + 2)) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        for (int i = 0; i < sb.length() - 3; i++) {
            System.out.println(sb.charAt(i) + "  " + sb.charAt(i + 2));
            if (sb.charAt(i) == sb.charAt(i + 1) && sb.charAt(i + 2) == sb.charAt(i + 3)) {
                sb.deleteCharAt(i + 2);
                i--;
            }
        }
        return sb.toString();
    }
}
