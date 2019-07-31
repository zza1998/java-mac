package com.zza.leecode;

public class no4 {
    public static void main(String[] args) {
        queen(4);
    }


    /**
     * 4皇后问题 回溯算法
     * @param max
     */
    public static void queen(int max){
        max=4;
        int[][] queens = new int[max][max];
        queenSet(queens,0,null);
        for (int i=0;i<max;i++){
            for (int j=0;j<max;j++){
                if (j==max-1)
                System.out.println(queens[i][j]);
                else System.out.print(queens[i][j]);
            }
        }

    }
    private static boolean isok(int[][] queens ,int row,int l){
        for (int i=0;i<4;i++){
            if ((queens[row][i]==1)||(queens[i][l]==1)){
                return false;
            }
        }
        for (int i=0;i<4;i++){
           if (row+i<4&&l+i<4&&queens[row+i][l+i]==1){
               return false;
           }
           if (row-i>=0&&l-i>=0&&queens[row-i][l-i]==1){
               return false;
           }
        }
        return true;
    }

    private static void queenSet(int[][] queens,int row,int[] err){
        if (row>queens.length){
            return;
        }
        for (int i=0;i<4;i++){
            if (err!=null){
                for (int value : err) {
                    if (value != i) {
                        return;
                    }
                }
            }
            if(isok(queens,row,i)){
                queens[row][i]=1;
                row+=1;
                queenSet(queens,row,null);
                return;
            }
        }
        for(int i=0;i<4;i++){
            queens[row-1][i]=0;
        }
        queenSet(queens,row-1,null);
    }
}
