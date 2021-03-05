class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        else {
            // the first element is always unique
            // keep track of a list of unique nums in the array nums
            // using a pointer, where everything before the pointer is unqiue
            int pointer = 1;
            // equals 1 because everything before index 1 is unique
            // for each element in array that is after index 0, check if the element exist in the 
            // unique array, if not, move it to the pointer, and increment pointer by 1
            for (int index = 1; index < nums.length; index++) {
                boolean isnotunique = false;
                for (int unique_i = 0; unique_i < pointer; unique_i++) {
                    if (nums[unique_i] == nums[index]) {
                        isnotunique = true;
                        break;
                    }
                }
                if (!isnotunique) {
                    nums[pointer++] = nums[index];
                }
            }
            return pointer;
        }
    }
}