package com.zza.leecode;

import java.util.Arrays;

public class no1 {
    public static void main(String[] args) {

    }

    /**
     * 查询一个有序数列的 对应数值下标 若没有则插入并获取下标
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        //方法1
//        for (int i=0;i<nums.length;i++){
//            if (nums[i]==target){
//                return i;
//            }
//        }
//        int[] newnums=new int[nums.length+1];
//        for (int i=0;i<nums.length;i++){
//            newnums[i]=nums[i];
//        }
//        newnums[newnums.length-1]=target;
//        Arrays.sort(newnums);
//        for (int i=0;i<newnums.length;i++){
//            if (target==newnums[i])
//                return i;
//        }
//        return 0;

        // 优化
        for (int i=0;i<nums.length;i++){
            if (target<=nums[i+1]){
                return i;
            }

        }
        return nums.length;
    }
}
