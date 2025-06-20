class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charcount=new int[26];
        for(char c:chars.toCharArray()){
            charcount[c-'a']++;
        }
        
        int totalLength=0;
        for(String word:words){
            int[] wordcount=new int[26];
            boolean isGood=true;
            
            for(char k:word.toCharArray()){
                wordcount[k-'a']++;
                if(wordcount[k-'a'] > charcount[k-'a']){
                    isGood=false;
                    break;
                }
            }
             if (isGood) {
                totalLength += word.length();
             }
            
        }
            return totalLength;
    }
}
