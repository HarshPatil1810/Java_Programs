class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedw=new HashSet<>(Arrays.asList(banned));
        
        paragraph=paragraph.replaceAll("[!?',;.]"," ").toLowerCase();
        String[] words=paragraph.split("\\s+");
        
        Map<String,Integer> wc=new HashMap<>();
        for(String word:words){
            if(!bannedw.contains(word)){
                wc.put(word,wc.getOrDefault(word,0)+1);
            }
        }
        
        String mostcomman=" ";
        int max=0;
        
        for(Map.Entry<String,Integer> entry:wc.entrySet() ){
            if(entry.getValue()>max){
                mostcomman = entry.getKey();
                max=entry.getValue();
            }
        }
        
        return mostcomman;
        
    }
}
