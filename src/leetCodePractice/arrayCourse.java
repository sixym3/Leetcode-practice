import java.util.Random;

public class arrayCourse {

	public static void main(String[] args) {
		int[] testArr = generateIntArr(20);
		printArr(testArr);
		moveZeroes(testArr);
		printArr(testArr);
	}
	
	public static void moveZeroes(int[] nums) {
		int zeros = 0;
		for (int num:nums) {
			if (num == 0) {
				zeros++;
			}
		}
        int i = 0;
        int j = 0;
        while (j < nums.length - zeros) {
        	while (i < nums.length - 1 && nums[i] == 0) {
        		i++;
        	}
        	nums[j] = nums[i];
        	j++;
        	i++;
        }
        for (int k = nums.length - zeros; k < nums.length; k++) {
        	nums[k] = 0;
        }
    }
	
	public static int[] generateIntArr(int n) {
		int[] arr = new int[n];
		Random rnd = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = rnd.nextInt(10);
		}
		return arr;
	}
	
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static int[] replaceElements(int[] arr) {
		if (arr.length == 0) return arr;
		for (int i = 0; i < arr.length; i++) {
			int max = -1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > max) max = arr[j];
			}
			arr[i] = max;
		}
        return arr;
    }
	
	// Generate an array given a size, display the generated array
	public static int[] generateArray(int size) { 
		int[] array = new int[size];
		return array;
	}
	
	// Checks if an array is a strictly mountain array and return true or false
    public boolean validMountainArray(int[] arr) {
        if (arr.length > 2) {
            boolean inc = true;
            if (arr[0] > arr[1]) return false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == arr[i+1]) {
                    return false;
                }
                if (inc) {
                    if (arr[i] > arr[i+1]) {
                        inc = false;
                    }
                } else {
                    if (arr[i] < arr[i+1]) {
                        return false;
                    }
                }
            } return (!inc);
        } else {
            return false;
        }
    }

	
	// Iterate through an array and check if there exist an element that is two times another element
	public static boolean checkIfMultiplesOfTwoLinearSearch(int[] arr) {  
        for (int i = 0; i < arr.length; i++) {
        	for (int j = i+1; j < arr.length; j++ ) {
        		if (arr[i] == arr[j] * 2) {
        			return true;
        		} else if (arr[i] * 2 == arr[j]) {
        			return true;
        		}
        	}
        }
        return false;
    }
	
	// Iterate through an array and remove
	public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        else {
            // the first element is always unique
            // keep track of a list of unique nums in the array nums
            // using a pointer, where everything before the pointer is unique
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
