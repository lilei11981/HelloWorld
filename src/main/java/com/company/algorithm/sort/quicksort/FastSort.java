package com.company.algorithm.sort.quicksort;

import java.util.Arrays;

/**
 * @author lilei
 * @date 2017/9/14 上午11:28.
 */
public class FastSort {
    public static void sort(int[] a, int low, int high) {
        int i, j, index;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        // 用子表的第一个记录做基准
        index = a[i];
        // 从表的两端交替向中间扫描
        while (i < j) {
            while (i < j && a[j] >= index) {
                j--;
            }
            if (i < j) {
                // 用比基准小的记录替换低位记录
                a[i++] = a[j];
            }
            while (i < j && a[i] < index) {
                i++;
            }
            if (i < j) {
                // 用比基准大的记录替换高位记录
                a[j--] = a[i];
            }
        }
        // 将基准数值替换回 a[i]
        a[i] = index;
        // 对低子表进行递归排序
        sort(a, low, i - 1);
        // 对高子表进行递归排序
        sort(a, i + 1, high);

    }

    public static void quickSort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 2};
        quickSort(a);
        System.out.println(Arrays.toString(a));
    }
}
