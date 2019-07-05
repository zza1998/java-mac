package com.zza.suanfa;

import sun.security.util.Length;

public class Main {
    public static void main(String[] args) {

        System.out.println(reverseInt(901000));
    }

    /**
     * 求两数之和
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return null;
    }

    public static int LenthOfString(String s) {
        int maxlength = 0;
        for (int j = 0; j < s.length() - 1; j++) {
            for (int i = 2; i < s.length() - j; i++) {
                if (s.substring(j, i - 1).contains(s.substring(i - 1, i))) {
                    maxlength = maxlength > i - j ? maxlength : i - j;
                } else {
                    maxlength++;
                }

            }
        }

        return maxlength;
    }

    /**
     * @param nums
     * @return
     */
    public static int arrayPairSum(int[] nums) {
        int sum = 0;
        int swap;
        int[] newNums = new int[nums.length];
        for (int j = 0; j < nums.length - 1; j++) {
            for (int i = 0; i < nums.length - 1 - j; i++) {
                if (nums[i] < nums[i + 1]) {
                    swap = nums[i + 1];
                    nums[i + 1] = nums[i];
                    nums[i] = swap;
                }
            }
        }
        for (int i = 1; i < nums.length; i = i + 2) {
            sum += nums[i];
        }

        return sum;
    }

    /**
     * 快速排序
     *
     * @param arr
     * @param low
     * @param high
     */
    public static void quickSort(int[] arr, int low, int high) {
        int i, j, temp, t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        //temp就是基准位
        temp = arr[low];

        while (i < j) {
            //先看右边，依次往左递减
            while (temp <= arr[j] && i < j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp >= arr[i] && i < j) {
                i++;
            }
            //如果满足条件则交换
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j - 1);
        //递归调用右半数组
        quickSort(arr, j + 1, high);
    }

    /**
     * 翻转int
     * @param num
     * @return
     */
    public static int reverseInt(int num) {
        StringBuilder stringBuffer=new StringBuilder();
        int isfu=0; //是否负数
        int canadd=0; //是否可以追加字符
        if (num<0){
            num=Math.abs(num);
            isfu=1;
        }
        for (int i = 0; ; i++) {
            int last = num % 10;
            if (last!=0&&canadd==0){
                stringBuffer.append(last);
                canadd=1;
                num = num / 10;
                if (num == 0) {
                    break;
                }
                continue;
            }
            if (canadd==1) {
                stringBuffer.append(last);
            }
            num = num / 10;
            if (num == 0) {
                break;
            }
        }
       String result= stringBuffer.toString();
        try {
            int res= Integer.parseInt(result);
            if (isfu==1){
                res=-res;
            }
            return res;
        }
        catch (Exception e){
            return 0;
        }

    }

}
