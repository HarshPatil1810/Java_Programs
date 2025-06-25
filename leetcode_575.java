class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> unique=new HashSet<>();
        for(int i:candyType){
            unique.add(i);
        }
        
        int maxallowd=candyType.length/2;
        
        return Math.min(unique.size(),maxallowd);
        
        
    }
}
