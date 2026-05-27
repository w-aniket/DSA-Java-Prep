import java.util.ArrayList;
import java.util.List;

class Solution {
    public int fib(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        return fib(num - 1) + fib(num - 2);
    }

    public int facto(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * facto(n - 1);
    }

    public int sum(int n) {
        if (n == 1 || n == 0) {
            return n;
        }

        return n + sum(n - 1);
    }

    public boolean isSorted(int[] arr, int len) {
        if (len == 0) {
            return true;
        }
        if (arr[len] <= arr[len - 1]) {
            return false;
        }

        return isSorted(arr, len - 1);
    }

    public int recursiveBS(int[] arr, int t, int st, int end) {
        if (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == t) {
                return mid;
            } else if (arr[mid] > t) {
                return recursiveBS(arr, t, st, mid - 1);
            } else {
                return recursiveBS(arr, t, mid + 1, end);
            }
        }
        return -1;
    }

    public void subset(int[] arr, List<Integer> ans,int idx){
        if(idx == arr.length){
            for(int val : ans){
                System.out.print(val);
            }
            System.out.print(", ");
            return;
        }

        ans.add(arr[idx]);
        subset(arr, ans, idx+1);

        ans.removeLast();
        subset(arr, ans, idx+1);
    }
}

public class Rec {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Integer> ans = new ArrayList<>();
        int[] arr = { 1, 2, 3, 4 };
        int n = 4;

        System.out.println("Fibo of " + n + " : " + s.fib(n));

        System.out.println("Facto of " + n + " : " + s.facto(n));

        System.out.println("Sum of " + n + " : " + s.sum(n));

        System.out.print("Is Array Sorted: ");
        if (s.isSorted(arr, arr.length - 1)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

        System.out.println("\nElement " + n + " found at index: " + s.recursiveBS(arr, n, 0, arr.length - 1));

        s.subset(arr, ans, 0);

    }

}
