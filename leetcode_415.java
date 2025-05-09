class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        
        int carry = 0;  // Corrected variable name to "carry" instead of "carray"
        
        while (i >= 0 || j >= 0 || carry != 0) {
            int d1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int d2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
            
            int sum = d1 + d2 + carry;
            carry = sum / 10;  // Update the carry for the next iteration
            
            res.append(sum % 10);  // Append the digit (sum % 10)
            i--;
            j--;
        }
        
        return res.reverse().toString();  // Reverse the result to get the correct order
    }
}
