package com.tridib;
public class bolleansearchin2darray {
    public static void main(String[] args) {
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=search(matrix,target);
        if(r==-1)
        {
            return false;
        }
        boolean check=binarysearch(matrix,r,target);
        return check;
    }
    static boolean binarysearch(int[][] matrix,int r, int target)
    {
        int start = 0;
        int end = matrix[0].length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(target==matrix[r][mid])
            {
                return true;
            }
            else if(target>matrix[r][mid])
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return false;
    }
    static int search(int[][] matrix,int target)
    {
        int start =0;
        int end = matrix.length-1;
        int lc = matrix[0].length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(target>=matrix[mid][0] && target<=matrix[mid][lc])
            {
                return mid;
            }
            else if(matrix[mid][0]>target)
            {
                end = mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;


    }
}
