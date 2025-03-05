class Solution {
    public int lengthOfLastWord(String s) {
        String l=s.trim();
        int c=0;
        for(int i=l.length()-1;i>=0;i--){
            if(l.charAt(i)!=' '){
                c++;
            }else{
                break;
            }
        }
        return c;
    
    }
}
