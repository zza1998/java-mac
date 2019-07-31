package com.zza.jianzhiOffer.no9;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        reOrderArray(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void reOrderArray(int [] array) {
        int[] arrcopy = array.clone();
        int l=0;
        int r=array.length-1;
        for (int i = 0; i<arrcopy.length; i++){
            if (arrcopy[i]%2 ==1){
                array[l]=arrcopy[i];
                l++;
            }
            if (arrcopy[arrcopy.length-1-i]%2 == 0){
                array[r] = arrcopy[arrcopy.length-1-i];
                r--;
            }
        }

    }
}
