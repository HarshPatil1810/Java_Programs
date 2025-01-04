class Solution {
    public char findTheDifference(String s, String t) {  
        HashMap<Character,Integer> count=new HashMap<>();

        for(char c:s.toCharArray()){
            count.put(c,count.getOrDefault(c,0)+1);
        }

        for(char c:t.toCharArray()){
            count.put(c,count.getOrDefault(c,0)-1);
        }

        for(char c:t.toCharArray()){
            if(count.get(c)<0)
                return c;
            }
        return ' ';
    }
}
