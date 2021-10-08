public class Substring {
    public static void main(String[] args){
        Solution2 solver = new Solution2();
        Input input = new Input();

        System.out.println("abcabcbb " + solver.lengthOfLongestSubstring("abcabcbb") + " Should be 3\n");
        System.out.println("bbbbb " + solver.lengthOfLongestSubstring("bbbbb") + " Should be 1\n");
        System.out.println("pwwkew " + solver.lengthOfLongestSubstring("pwwkew") + " Should be 3\n");
        System.out.println("" + solver.lengthOfLongestSubstring("") + " Should be 0\n");
        System.out.println(" " + solver.lengthOfLongestSubstring(" ") + " Should be 1\n");
        System.out.println("au " + solver.lengthOfLongestSubstring("au") + " Should be 2\n");
        System.out.println("dvdf " + solver.lengthOfLongestSubstring("dvdf") + " Should be 3\n");
        System.out.println("jbpnbwwd " + solver.lengthOfLongestSubstring("jbpnbwwd") + " Should be 4\n");
        System.out.println("crazy long input" + solver.lengthOfLongestSubstring(input.text()) + " Should be 97\n");
    }
}
