class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];

        // Increment the count for each character in the magazine
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        // Decrement the count for each character in the ransom note
        for (char c : ransomNote.toCharArray()) {
            count[c - 'a']--;
            // If count goes below zero, it means magazine doesn't have enough characters
            if (count[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
