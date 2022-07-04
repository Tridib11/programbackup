package com.tridib;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
import java.util.Arrays;

public class twosum2 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    static int[] twoSum(int[] numbers, int target) {
        int start =0;//taking the sum as zero
        int end = numbers.length-1;//taking the end
        while(start<end)//checking if the start is less than end
        {
            int sum = numbers[start]+numbers[end];//finding the sum
            if(target == sum) {//checking if target is equal to the sum
                break;// if it is then break
            }
            if(target < sum)//if the sum is greater than the target the its for sure that adding something with the last index
            {               // will be greater than that so we are ignorring the last index.
                end--;     //ignoring the last
            }
            else if(target>sum)  //if the sum is greater than the sum then adding something with the first index will be less than it
            {                    //as it is also in sorted array
                start++;        //ignorring the first
            }


            }
        return new int[] {start+1,end+1}; // returning the first+1 and the last+1 as given in the question.
    }
}
