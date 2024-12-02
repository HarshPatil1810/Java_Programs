class Solution {
    public int maxVowels(String s, int k) {
        int i = 0, j = 0;
        int maxV = 0;
        int count = 0;
        int n = s.length();

        while (j < n) {
            // Check if the current character is a vowel
            if (isVowel(s.charAt(j))) {
                count++;
            }

            // When the window size reaches 'k'
            if (j - i + 1 == k) {
                maxV = Math.max(maxV, count);

                // If the character at the start of the window is a vowel, decrement count
                if (isVowel(s.charAt(i))) {
                    count--;
                }
                i++; // Move the window forward
            }
            j++; // Expand the window
        }
        return maxV;
    }

    // Helper method to check if a character is a vowel
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
