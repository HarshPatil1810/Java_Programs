class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] columns = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for(int i=0;i<9;i++){
            rows[i]=new HashSet<>();
            columns[i]=new HashSet<>();
            boxes[i]=new HashSet<>();
        }

        for(int r=0;r<9;r++)
        {
            for(int c=0;c<9;c++){
                char num=board[r][c];
                if(num == '.') continue;
            
            if (rows[r].contains(num)) {
                    return false;
                }
                rows[r].add(num);
            if (columns[c].contains(num)) {
                    return false;
                }
                columns[c].add(num);

            int boxindex=(r/3)*3+(c/3);
            if (boxes[boxindex].contains(num)) {
                    return false;
                }
                boxes[boxindex].add(num);
        }
        
    }
    return true;
    }
}
