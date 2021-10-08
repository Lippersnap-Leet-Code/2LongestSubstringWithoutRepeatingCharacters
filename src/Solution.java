public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        }

        StringBuilder used = new StringBuilder();
        int answer = 0;
        int current_substring = 0;

        for (int j = 0; j < s.length(); j++) {

            for (int i = 0 + j; i < s.length(); i++) {

                Character c = s.charAt(i);

                if (!used.toString().contains(c.toString())) {
                    current_substring++;
                    used.append(c);
                } else if (current_substring > answer) {
                    answer = current_substring;
                    used.delete(0, used.length());
                    used.append(c);
                    current_substring = 1;
                }
            }
            if (current_substring > answer) {
                answer = current_substring;
            }

            System.out.println(used);
            used.delete(0, used.length());
            current_substring = 0;
        }

        return answer;
    }
}

