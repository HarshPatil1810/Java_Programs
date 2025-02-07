class Solution {
    int max=0;
    int start=0,end=0;
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s,i,j)==true){
                    if(j-i+1>max){
                        max=j-i+1;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }

    private boolean isPalindrome(String s, int i,int j){
        while(i<j){
            char ch=s.charAt(i);
            char ch2=s.charAt(j);
            if(ch!=ch2) return false;
            else{
                i++;
                j--;
            }
            

        }
        return true;
    }
}
