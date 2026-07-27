// 33. Search in Rotated Sorted Array

// There is an integer array nums sorted in ascending order (with distinct values).

// Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].

// Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4

//either the left half will be sorted or the right because it is sorted array but rotation is done .
// so first we will check that if left half is sorted and if yes then target is in btw them then search left side so high=mid-1;
// if not then go to else right must be sorted .

class lc_33_rotatedSorted {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                break;
            }
            if(nums[mid]>=nums[low]){
                if(nums[low]<=target && target<nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else {
                if(nums[high]>=target && nums[mid]<target){
                        low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return ans;
    }
}