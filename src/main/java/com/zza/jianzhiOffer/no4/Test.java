package com.zza.jianzhiOffer.no4;

public class Test {
    public static void main(String[] args) {

    }

    public int minNumberInRotateArray(int [] array) {
        int length = array.length;
        if (length == 0){
            return 0;
        }
        int low = 0;
        int high = length - 1;
        while (low<high){
            int mid = low + (high-low)/2;
            if (array[mid] > array[high]){
                low++;
            }
            else if (array[mid] == array[high]){
                high--;
            }
            else {
                high=mid;
            }
        }
        return array[low];
    }
}
