import java.util.HashSet;
import java.util.Set;

class Solutions {
    public int findSubString(String str){
        int left = 0;
        int right = 0;
        int longestCount = 0;

        Set<Character> set = new HashSet<>();

        while( right < str.length()) {

            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));
            right++;

            if(right - left > longestCount) {
                longestCount =  Math.max(right - left, longestCount);
            }
        }
        return longestCount;
    }
}

public class longestSub {
    public static void main(String[] args) {
        Solutions obj = new Solutions();
        String str = "pwwkew";
        int result = obj.findSubString(str);
        System.out.println(result);
    }
}
    