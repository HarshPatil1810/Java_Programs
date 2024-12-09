class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i:nums1){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        List<Integer> intersection =new ArrayList();
        for (int num : nums2) {
        if(freq.containsKey(num) && freq.get(num)>0){
            intersection.add(num);
            freq.put(num, freq.get(num) - 1);
        }
        }
        int [] res=new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            res[i] = intersection.get(i);
        }

        return res;
    }
    
}
