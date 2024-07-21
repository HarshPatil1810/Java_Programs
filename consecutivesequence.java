class Solution {
    public int longestConsecutive(int[] nums) {
        int longstlength=0;
        Map<Integer,Boolean> hm=new HashMap<>();
        for(int num:nums)
        {
            int cl=1;
            int nn=num+1;
            while(hm.containsKey(nn) && hm.get(nn)==false)
            {
                cl++;
                hm.put(nn,Boolean.True)
                nn++;
            }
            int pn=num-1;
             while(hm.containsKey(pn) && !hm.get(nn)==false)
             {
                cl++;
                 hm.put(pn,Boolean.True);
                 pn--;
             }
             longstlength=Math.max(longstlength,cl);
        }
        return longstlength;
    }
}