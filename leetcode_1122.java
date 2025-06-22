class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:arr1){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        
        List<Integer> result=new ArrayList<>();
        
        for(int num2:arr2){
            int count=hm.get(num2);
            for(int i=0;i<count;i++){
                result.add(num2);
                
            }
            hm.remove(num2);
        }
        
        List<Integer> remaining=new ArrayList<>();
        for(int num:hm.keySet()){
            int count=hm.get(num);
            for(int i=0;i<count;i++){
                remaining.add(num);
            }
        }
        
        Collections.sort(remaining);
        result.addAll(remaining);
        
        int[] resarray=new int[result.size()];
        for(int i=0;i<resarray.length;i++){
            resarray[i]=result.get(i);
        }
        
        return resarray;
        
    }
}
