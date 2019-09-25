package Sort;

public class BubbleSort {
    public int[] bubbleSort(int[] nums) {
        int len = nums.length;
        for (int i = len - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] >= nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
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
