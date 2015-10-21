/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
*/

public class Solution {
    public void moveZeroes(int[] nums) {
        
        // Initialize Two pointers
        int i=0,j=0;    
        
        // return if length of the array is 0 or 1
        if(nums.length<2)
            return;
            
        while(j<nums.length)
        {
            if(nums[i]==0)
            {
                // If number at ith position is zero and nuumber at jth position not equal to zero --> swap. 
                if(nums[j]!=0)
                {
                    nums[i] = nums[j];
                    nums[j] = 0;
                    i++;
                    j++;
                }
                // Else increase j till j not equal to zero. 
                else
                    j++;
            }
            //If i is not equal to zero increase both.
            else
            {
                i++;
                j++;
            }
        }
       
    }
}
