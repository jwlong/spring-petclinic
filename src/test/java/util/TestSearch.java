package util;

import org.junit.Test;

/**
 * Created by Administrator on 2017/7/16 0016.
 */
public class TestSearch {
    @Test
    public  void test1(){
        // 冒泡法来排序 吧
        int[] a = {1,4,1,3,0,14,9,8,56,2};
        rank(a);
        for(int i : a){
            System.out.print(i+"\t");
        }
    }
    //这个是冒泡排序法
    public void rank(int[]  a){

        for(int i = 0 ;i<a.length;i++ ){
            int tmp =  0 ;
            for(int  j = i+1;j<a.length;j++){
                if(a[i]> a[j]){
                    tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }
        }
    }
    // 二分法排序
    public void BinarySearchRank(int[] a){
        int mid =0;
    }

}
