class Solution {
    public String reverseOnlyLetters(String s) {
        char[] sarray=s.toCharArray();
        int left=0,right=sarray.length-1;

        while(left<right){
            if(!Character.isLetter(sarray[left])){
                left++;
            }
            else if(!Character.isLetter(sarray[right])){
                right--;
            }
            else{
                char temp=sarray[left];
                sarray[left]=sarray[right];
                sarray[right]=temp;

                left++;
                right--;
            }
        }
        return new String(sarray);
    }
}
