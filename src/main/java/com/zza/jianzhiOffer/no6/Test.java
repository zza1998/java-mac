package com.zza.jianzhiOffer.no6;

public class Test {


    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.JumpFloor(1));
    }

    public int JumpFloor(int target) {
       times(target,0);
        return time;
    }
    int time=0;
    public void times(int target,int height){
        if (height==target){
            time++;
            return;
        }
        if (height>target){
            return;

        }
        for(int i=1;i<=target;i++)
        times(target,height+i);

    }
}
