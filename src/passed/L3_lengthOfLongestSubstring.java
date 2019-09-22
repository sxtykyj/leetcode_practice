package passed;

import java.util.HashMap;

/**
 * @Author: yk
 * @Date: 2019/9/6 16:30
 */
public class L3_lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> myMap = new HashMap<>();
        int res = 0;
        int start = 0;
        int end = 0;
        for (; start < s.length() && end < s.length(); end++) {
            if (myMap.containsKey(s.charAt(end))) {
                start = Math.max(myMap.get(s.charAt(end)), start);

            }
            myMap.put(s.charAt(end), end + 1);
            res = Math.max(res, end - start + 1);
        }
        return res;
    }
}
