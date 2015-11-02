/*
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.
*/

public class Solution 
{
    public int missingNumber(int[] nums) 
    {
        int j = 0, res = 0, n = nums.length;
        
        // Direct formula to xor 1 to n numbers.
        if(n % 2 == 1) 
        {
             res = (n % 4 == 1) ? 1 : 0;
        } 
        else 
        {
             res = (n % 4 == 0) ? n : n + 1;
        }
        
        for(int i = 0; i < n; i++)
        {
            res = res ^ nums[i];
        }
        return res;
    }
}
