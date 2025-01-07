class Solution {
    public boolean checkZeroOnes(String s) {
       int maxOne=0,maxZero=0;
       int currentOne=0,currentZero=0;

       for(char c:s.toCharArray()){
         if(c=='1'){
            currentOne++;
            maxOne=Math.max(maxOne,currentOne);
            currentZero=0;
       }else{
            currentZero++;
            maxZero=Math.max(maxZero,currentZero);
            currentOne=0;
       }
       }
       return maxOne > maxZero;
    }
}
