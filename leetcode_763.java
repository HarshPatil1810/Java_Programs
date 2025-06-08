class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> part=new ArrayList<>();
        for(int i=0;i<s.length();){
            int startindex=i;
            int endindex=s.lastIndexOf(s.charAt(startindex));
            
            for(int a=startindex+1;a<=endindex-1;a++){
                int lastindexofnext=s.lastIndexOf(s.charAt(a));
                
                if(lastindexofnext > endindex){
                    endindex=lastindexofnext;
                }
            }
            
            part.add(endindex-startindex+1);
            i=endindex+1;
        }
        return part;
    }
}
