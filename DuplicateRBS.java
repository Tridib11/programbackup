package com.tridib;

public class DuplicateRBS {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 6, 1, 2, 3, 4};
        int target = 4;
        System.out.println(search(nums, target));
    }

    static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if ((nums[mid] == nums[start]) && (nums[mid] == nums[end])) {
                if (nums[start] > nums[start + 1]) {
                    start++;
                    end--;
                } else if (nums[start] <= nums[mid]) {
                    if (target >= nums[start] && target < nums[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else if (nums[mid] <= nums[end]) {
                    if (target > nums[mid] && target <= nums[end]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }

        }
        return false;
    }
}

