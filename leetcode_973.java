class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxheap=new PriorityQueue<>((a, b) ->           Integer.compare(distance(b), distance(a))
        ); 
        
        for(int point[]:points){
            maxheap.offer(point);
            if(maxheap.size()>k){
                maxheap.poll();
            }
        }
        
        int[][] result=new int[k][2];
        int index=0;
        for (int[] point : maxheap) {
            result[index++] = point;
        }
        
        return result;
    }
    
     private int distance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
