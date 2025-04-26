class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            
            return false;
        }
        
        String combained=s+s;
        return combained.contains(goal);
    }
}
