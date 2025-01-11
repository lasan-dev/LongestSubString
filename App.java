import java.util.HashSet;
import java.util.Set;

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

        for(int i = 0; i < s.length(); i++) {
            Set<Character> subs = new HashSet<>();

            for(int j = i; j < s.length(); j++) {
                if (subs.contains(s.charAt(j))){
                    break;
                }
                subs.add(s.charAt(j));
                maxSbstrLen = Math.max(maxSbstrLen, subs.size());
            }
        }
        return maxSbstrLen;
    }
}
