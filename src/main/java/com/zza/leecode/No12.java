package com.zza.leecode;

public class No12 {
    public static void main(String[] args) {
        System.out.println(niuniuFangxiang("RRR"));
    }

    public static Character niuniuFangxiang(String move){
        char[] fangxiang = new char[]{'N','E','S','W'};
        char[] zhuan = move.toCharArray();
        int num = 0;
        for (Character c : zhuan) {
            if (c == 'L') {
                num--;
            }
            if (c == 'R') {
                num++;
            }
        }
        return fangxiang[(num+move.length()*4)%4];

    }

}
