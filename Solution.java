public class Solution {

    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
       
        int[] nums = {1, 2, 1, 3, 5, 6, 4};

       
        Solution solution = new Solution();

       
        int peakIndex = solution.findPeakElement(nums);

        
        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element value: " + nums[peakIndex]);
    }
}
/*Basically here it is not like the greatest number in the array.
it A peak element is an element that is greater than its immediate neighbors.
The goal is to find any one peak element in the array, not necessarily the greatest number.
If there are multiple peaks, the algorithm returns any one of them based on the binary search logic.

here the key difference btn peak element and Greatest number

Aspect	                         Find Peak Element	                                                  Greatest Number
Definition	           Greater than immediate neighbors	                                     Largest number in the array
Goal	                         Find any one peak	                                                Find the greatest number
Multiple Peaks	               Any peak index is valid	                                                  Returns the maximum only
Algorithm Used	               Binary Search (O(log n))	                                                    Linear Search (O(n))*/

