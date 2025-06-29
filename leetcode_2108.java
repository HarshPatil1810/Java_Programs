class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words){
            if(isPalindrome(word)){
                return word;
            }
           // break;
        }
        return "";
    }

    private boolean isPalindrome(String word){
        String reversed=new StringBuilder(word).reverse().toString();
       return word.equals(reversed);
    }
}
