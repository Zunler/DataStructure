/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: InsertionSort
 * Author:   pengzijun
 * Date:     2019/10/9 11:34 上午
 * Description: 插入排序
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Sort;

/**
 * 〈一句话功能简述〉<br> 
 * 〈插入排序 〉
 *
 * @author pengzijun
 * @create 2019/10/9
 * @since 1.0.0
 */
public class InsertionSort {
    //课本上的方法，while是精髓奥
    public void sort_standard(int[] nums){
        int len=nums.length;
        for (int i = 1; i <len ; i++) {
            int v  =nums[i];
            int j=i-1;
            while (j>=0&&nums[j]>v){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=v;
        }

    }
 public void sort(int[] nums){
     int len=nums.length;
     for (int i = 1; i <len ; i++) {
         for (int j = 0; j <i ; j++) {
             if(nums[i]<nums[j]){
                 int temp =nums[i];
                 for (int k = i; k > j; k--) {
                     nums[k]=nums[k-1];
                 }
                 nums[j]=temp;
             }


         }
     }
 }

    public static void main(String[] args) {
        int[] nums ={8,3,1,5,2,1};
        InsertionSort insertionSort=new InsertionSort();
        insertionSort.sort_standard(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}