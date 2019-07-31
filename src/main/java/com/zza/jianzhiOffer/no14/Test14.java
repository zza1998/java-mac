package com.zza.jianzhiOffer.no14;

public class Test14 {
    public static void main(String[] args) {
        System.out.println(GetUglyNumber_Solution(1));
    }

    public static int GetUglyNumber_Solution(int index) {
            if (index<=0){
                return 0;
            }
            if (index <= 5){
                return index;
            }
            int[] arr = new int[index];
            arr[0] =1;
            arr[1] =2;
            arr[2] =3;
            arr[3] =4;
            arr[4] =5;
            for (int i = 0;i<index-5;i++){
               arr[i+5]= getNextUgly(arr);
            }
            return arr[index-1];
    }
    public static int getNextUgly(int[] arr){
        int min = 0;
        int last = 0;
        int index = 0;
        for (int i=0 ;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                last=arr[i];
                min=2*arr[i];
                index = i;
                break;
            }
        }
        for (int i=0;i<index;i++){

            if (arr[i]*2>last&&arr[i]*2<min){
                min = arr[i]*2;
            }
            if (arr[i]*3>last&&arr[i]*3<min){
                min = arr[i]*3;
            }
            if (arr[i]*5>last&&arr[i]*5<min){
                min = arr[i]*5;
            }
        }
        return min;
    }
}
