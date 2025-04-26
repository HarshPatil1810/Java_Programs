class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        
        for(int num:nums){
            if(num % 2==0){
                hm.put(num,hm.getOrDefault(num,0)+1);
            }
            
        }
        
        int maxfreq=0;
        int res=-1;
        
        for (Map.Entry<Integer,Integer> entry : hm.entrySet()){
            int num=entry.getKey();
            int freq=entry.getValue();
            
            if(freq>maxfreq || (freq==maxfreq && num < res)){
                maxfreq=freq;
                res=num;
            }
        }
        return res;
    }
}
