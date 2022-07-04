package com.tridib;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
public class doubleduplicates {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,2,2,3,3,4,4};
        System.out.println(removeDuplicates(arr));
    }
    static int removeDuplicates(int[] nums) {
        if(nums.length<3)
        {
            return 2;
        }
        int j =2;
        for (int i = 2; i < nums.length; i++) {
            if(nums[i]!=nums[j-2])
            {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

}
