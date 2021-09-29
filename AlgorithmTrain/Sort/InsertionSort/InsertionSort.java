package AlgorithmTrain.Sort.InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    private static void insertionSort(int[] nums) {
        int i, j, n = nums.length;
        for (i = 1; i < n; i++) {
            int tmp = nums[i];
            for (j = i - 1; j >= 0 && tmp < nums[j]; j--) {
                nums[j + 1] = nums[j];
            }
            nums[j + 1] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 2, 13, 7, 5 };
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
