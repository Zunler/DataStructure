/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ShellSort
 * Author:   pengzijun
 * Date:     2019/10/13 11:04 下午
 * Description: 希尔排序
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Sort;

/**
 * 〈一句话功能简述〉<br> 
 * 〈希尔排序〉
 *
 * @author pengzijun
 * @create 2019/10/13
 * @since 1.0.0
 */
public class ShellSort {
    static int cnt = 0;

    public void insertionSort(int[] A, int n, int g) {
        for (int i = g; i < n; i++) {
            int v = A[i];
            int j = i - g;
            while (j >= 0 && A[j] > v) {
                A[j + g] = A[j];
                j = j - g;
                cnt++;

            }
            A[j + g] = v;


        }
    }

    public void sort(int[] A) {
        int n = A.length;
        int m = (int) Math.ceil((A.length - 1) / 3.0);
        int[] G = new int[m];
        G[0] = 1;
        for (int i = 1; i < m; i++) {
            G[i] = 3 * G[i-1] + 1;

        }
        for (int i = m - 1; i >=    0; i--) {
            insertionSort(A, n, G[i]);

        }


    }

    public static void main(String[] args) {

        int[] nums = {1, 23, 12, 234, 13, 4};
        ShellSort shellSort = new ShellSort();
        shellSort.sort(nums);
        for (int num :
                nums) {
            System.out.println(num);

        }
    }
}