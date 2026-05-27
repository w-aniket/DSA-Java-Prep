
class Solution {

    public int linearSearch(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
                return i;
        }
        return -1;
    }

    public int binarySearch(int num, int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

public class Search {

    public static void main(String args[]) {

        Solution s = new Solution();

        // System.err.println(s.linearSearch(4, new int[]{2,3,4,34,5,6,7}));
        System.err.println(s.binarySearch(2, new int[] { 2, 3, 4, 34, 35, 46, 70 }));
    }
}