public class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();  // Convert the input string to a character array
        
        for (int i = 0; i < arr.length; i += 2 * k) {
            int left = i;  // Start of the k-length segment to reverse
            int right = Math.min(i + k - 1, arr.length - 1);  // End index: reverse only up to k or end of string
            
            // Reverse characters from index 'left' to 'right'
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(arr);  // Convert the modified array back to a string and return
    }
}
