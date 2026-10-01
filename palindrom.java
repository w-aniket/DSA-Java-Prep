import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class palindrom {

    static boolean checkPalindrom(String str) {
        String t = str.toLowerCase().replaceAll("\\s", "");
        return new StringBuffer(t).reverse().toString().equals(t);

    }

    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int need = target - nums[i];
            if (seen.containsKey(need)){
                return new int[] {seen.get(need), i};
            }
            seen.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        String str = "Mad aam";
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9))); 

        System.out.println(checkPalindrom(str));
    }
}
