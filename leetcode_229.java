class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> freqmap=new HashMap<>();
        int n=nums.length;
        
        for(int num:nums){
            freqmap.put(num,freqmap.getOrDefault(num,0)+1);
        }
        
        List<Integer> result=new ArrayList<>();
        
for (Map.Entry<Integer, Integer> entry : freqmap.entrySet()) {                      if(entry.getValue() > n/3){
                result.add(entry.getKey());
            }
        }
        
        return result;
    }
}
