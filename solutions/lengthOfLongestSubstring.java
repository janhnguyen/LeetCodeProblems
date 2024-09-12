class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.length() <= 1) return s.length();

        int ans = 0, temp = 0;

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j < s.length(); j++) {
                temp = s.substring(i, j).length();
                if (s.substring(i, j).indexOf(s.charAt(j)) > -1) {
                    break;
                } else {
                    temp += 1;
                }

            }

            if (temp > ans) {
                ans = temp;
            }

        }

        return ans;

    }
}