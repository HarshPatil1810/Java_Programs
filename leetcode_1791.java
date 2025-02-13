class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int total_edges=edges.length;

        for(int i=0;i<=edges.length;i++){
            int v1=edges[i][0];
            int v2=edges[i][1];
            hm.put(v1,hm.getOrDefault(v1,0)+1);
            hm.put(v2,hm.getOrDefault(v2,0)+1);

            if(hm.get(v1)==total_edges) return v1;

            if(hm.get(v2)==total_edges) return v2;
        }
        return -1;
    }
}
