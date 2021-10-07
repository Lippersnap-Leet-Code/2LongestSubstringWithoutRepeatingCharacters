public class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder used = new StringBuilder();
        int answer = 0;

        for (int i = 0; i < s.length(); i++)
        {
            Character c = s.charAt(i);
            if (!used.toString().contains(c.toString())) {
                answer++;
                used.append(c);
            } else {

            }
        }
        return answer;
    }
}

