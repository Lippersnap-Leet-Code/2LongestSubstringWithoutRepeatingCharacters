public class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        }

        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            String longSubString = longestSubString(s.substring(i, s.length()), answer);
            if (answer.length() < longSubString.length()) {
                answer = longSubString;
            }
        }

        //System.out.println(answer);
        return answer.length();
    }

    private String longestSubString(String s, String longest) {
        StringBuilder substring = new StringBuilder();
        String longestSubString = "";

        //if (longest.contains())

        for (int i = 0; i < s.length(); i++) {
            String letter = s.substring(i, i + 1);
            if (!substring.toString().contains(letter)) { //if the substring does not contain the current letter
                substring.append(letter);
                if (substring.length() > longestSubString.length()) {
                    longestSubString = substring.toString();
                }
            } else {
                substring.delete(0, substring.length());
                substring.append(letter);
            }
        }

        return longestSubString;
    }
}