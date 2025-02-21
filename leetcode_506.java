class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] out=new String[n];

        int[][] indexscore=new int[n][2];
        for(int i=0;i<n;i++){
            indexscore[i][0]=score[i];
            indexscore[i][1]=i;
        }

        Arrays.sort(indexscore,(a,b)->b[0]-a[0]);
        for(int i=0;i<n;i++){
            int oindex=indexscore[i][1];
            if(i==0)
                out[oindex]="Gold Medal";
            else if(i==1)
                out[oindex]="Silver Medal";
            else if(i==2)
                out[oindex]="Bronze Medal";
            else
                out[oindex]=String.valueOf(i+1);
            
            
        }
        return out;
    }
} 
