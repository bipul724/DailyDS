class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();

        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                char ch = board[r][c];
                if(ch=='.'){
                    continue;
                }
                String row = ch+"row"+r;
                String col = ch+"col"+c;
                String box = ch+"box"+(r/3)*3+(c/3);

                if(!set.add(row) || !set.add(col) || !set.add(box)){
                    return false;
                }
            }
        }
        return true;
    }
}