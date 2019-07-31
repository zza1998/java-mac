package com.zza.leecode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class no2 {
    public static void main(String[] args) {

    }

    /**
     * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
     * <p>
     * 注意：答案中不可以包含重复的三元组。
     * <p>
     * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
     * <p>
     * 满足要求的三元组集合为：
     * [
     * [-1, 0, 1],
     * [-1, -1, 2]
     * ]
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return null;
        }
        List<List<Integer>> lists = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int num1 = nums[i];
            int num2 = nums[i + 1];
            for (int j = i + 2; j < nums.length - i; j++) {
                int num3 = nums[j];
                if (num1 + num2 + num3 == 0) {
                    List<Integer> newnum = new LinkedList<>();
                    newnum.add(num1);
                    newnum.add(num2);
                    newnum.add(num3);
                    lists.add(newnum);
                }
            }

        }
        return lists;
    }

    /**
     * 优化正确解法
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum2(int[] nums) {
        //先排序
        Arrays.sort(nums);
        List<List<Integer>> list = new LinkedList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {

                int l = i + 1, r = nums.length - 1, sum = 0 - nums[i]; // 计算两个数相加等于 -nums[i]即可
                while (l < r) {
                    if (nums[l] + nums[r] == sum) {
                        list.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        while (l < r && nums[l] == nums[l + 1]) l++;
                        while (l < r && nums[r] == nums[r - 1]) r--;
                        l++;
                        r--;
                    } else if (nums[l] + nums[r] < sum) {
                        while (l < r && nums[l] == nums[l + 1]) l++; // 如果小了就加大一点的数
                        l++;
                    } else {
                        while (l < r && nums[r] == nums[r - 1]) r--; // 如果大了就加小一点的数
                        r--;
                    }
                }
            }
        }
        return list;
    }

}
