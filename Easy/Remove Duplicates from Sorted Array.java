// Problem: Remove Duplicates from Sorted Array
// Difficulty: Easy
// Date Solved: {date.today().strftime("%Y-%m-%d")}
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Approach: Two Pointer Technique
// Time Complexity: O(n)
// Space Complexity: O(1)class Solution {
public int removeDuplicates(int[] nums) {
        if(nums.length==0)return 0;

        int k=1;
        for(int i=1; i<nums.length;i++){
            if (nums [i] != nums[k-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
};
