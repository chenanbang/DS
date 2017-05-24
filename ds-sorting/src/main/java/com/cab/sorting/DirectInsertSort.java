package com.cab.sorting;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/5/24 0024.
 */
public class DirectInsertSort {

    @Test
    public void sortTest(){
        System.out.println("Start Sorting......");
        int[] arrays={3,4,9,7,6,2};
        int[] results=getSortResult(arrays);
        System.out.println(Arrays.toString(results));
    }

    /**
     * 直接插入排序算法的具体实现
     * @param values
     * @return
     */
    public static int[] getSortResult(int[] values){

        for(int i=1;i<values.length;i++){

            int temp=values[i],j;
            for(j=i-1;j>=0&&values[j]>temp;j--){
                values[j+1]=values[j];
            }
            System.out.println(j);
            values[j+1]=temp;
        }

        return values;

    }
}
