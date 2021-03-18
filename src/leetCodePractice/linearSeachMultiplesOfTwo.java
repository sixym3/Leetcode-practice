
public class linearSeachMultiplesOfTwo {

	public static void main(String[] args) {
		int[] arr = new int[]{-2,0,10,-19,4,6,-8};
		System.out.print(checkIfExist(arr));
	}
	
	public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
        	for (int j = i+1; j < arr.length; j++ ) {
        		if (arr[i] == arr[j] * 2) {
        			System.out.print(i + " " + j);
        			return true;
        		} else if (arr[i] * 2 == arr[j]) {
        			System.out.print(i + " " + j);
        			return true;
        		}
        	}
        }
        return false;
    }

}
