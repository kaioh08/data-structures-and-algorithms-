import java.util.Arrays;

/**
 * Level: Easy
 * Link: https://leetcode.com/problems/merge-sorted-array/
 * Description:
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold
 * additional elements from nums2.
 * <p>
 * Example:
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * Output: [1,2,2,3,5,6]
 *
 * @author kaioh
 * @version 2022
 */
public class MergeSortedArray {

    public static void merge(final int[] nums1, int m, final int[] nums2, int n) {
        for (int i = m + n - 1; i >= 0; i--) {
            if (m == 0) {
                nums1[i] = nums2[--n];
            } else if (n == 0) {
                return;
            } else if (nums1[m - 1] > nums2[n - 1]) {
                nums1[i] = nums1[--m];
            } else {
                nums1[i] = nums2[--n];
            }
        }
    }

    public static void main(final String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {4, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int[]{2, 7, 9, 0, 0, 0};
        nums2 = new int[]{3, 4, 5};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
// need to think of the edge case (what if an array is not sorted when it is imputed)
