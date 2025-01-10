class Solution {
    public List<String> stringMatching(String[] words) {
    Set<String> substring = new HashSet<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(!words[i].equalsIgnoreCase(words[j])){
                    if(words[j].contains(words[i]))
                        substring.add(words[i]);
                }
            }
        }
    return new ArrayList<>(substring);
    }
}
