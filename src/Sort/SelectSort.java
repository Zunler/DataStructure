package Sort;

public class SelectSort {

    public int[] selectSort(int[] nums) {

        int len = nums.length;
        for (int i = len - 1; i > 0; i--) {
            int max = nums[i];
            for (int j = 0; j < i; j++) {
                if (nums[j] >= max) {
                    max = nums[j];
                }


            }
            nums[i] = max;
        }
        return nums;
    }


    public static void main(String[] args) {

        //test
        int[] nums = {1, 24, 124, 22, 12, 3, 4, 1};
        BubbleSort bubbleSort = new BubbleSort();
        int[] sorted = bubbleSort.bubbleSort(nums);
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);

        }

    }
}
