class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> dicset=new HashSet<>(dictionary);
        String[] words=sentence.split(" ");

        StringBuilder result=new StringBuilder();
        for(String word:words){
        if (result.length() > 0) {
                result.append(" ");  
            }
            result.append(findRoot(word, dicset));
        }
        
        return result.toString();
        }

    private static String findRoot(String word,Set<String> dictionary){
        for(int i=1;i<=word.length();i++){
            String prifix=word.substring(0,i);

             if (dictionary.contains(prifix)) {
                return prifix; 
                 }
        }
        return word;
        }
    }
