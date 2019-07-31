package com.zza.leecode;

import java.util.Arrays;

public class no3 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{2,9};
        int[] nums2 = new int[]{3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int [] nums3 = new int[nums1.length+nums2.length];
        for (int i=0;i<nums1.length;i++){
            nums3[i]=nums1[i];
        }
        for (int i=0;i<nums2.length;i++){
            nums3[i+nums1.length]=nums2[i];
        }
        Arrays.sort(nums3);
        int n=nums3.length%2;
        int len=nums3.length/2;
        if (n==0){
            return (nums3[len]+nums3[len-1])/2.0D;
        }else {
            return (double) nums3[len];
        }

    }

   }
