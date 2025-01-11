import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        // Given a string s, find the length of the longest
        //substring
        // without repeating characters.

        String str = "abcabcbb";
        // Expected output: 3
        // longest substring:abc

        System.out.println(lengthOfLongestSubstring(str));

        String str2 = "bbbbb";
        // Output: 1
        // Explanation: The answer is "b", with the length of 1.
        System.out.println(lengthOfLongestSubstring(str2));

        String str3 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(str3));

        // Brute force approach
            // Iterate in all string
            // keep adding to the subtring until it finds duplicate char
            // When finds duplicade move the start pointer (left) on position to the right
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;

        int maxSbstrLen = 0;

        Map<Character, Integer> lastVisitedChar = new HashMap<>();
        for(int left = 0, right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if(lastVisitedChar.containsKey(currentChar) && lastVisitedChar.get(currentChar) >= left){
                left = lastVisitedChar.get(currentChar) + 1;
            }
            maxSbstrLen = Math.max(maxSbstrLen, right - left +1);
            lastVisitedChar.put(currentChar, right);
        }
        return maxSbstrLen;
    }
}
