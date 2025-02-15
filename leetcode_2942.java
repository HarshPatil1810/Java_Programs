class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indices=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String fchar=String.valueOf(x);
            if(words[i].contains(fchar)){
                indices.add(i);
            }
        }
        return indices;
    }
}
