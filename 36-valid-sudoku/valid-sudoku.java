class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> []rows=new HashSet[9];
        HashSet<Character> []cols=new HashSet[9];
        HashSet<Character> []boxes=new HashSet[9];
        for(int i=0;i<9;i++){
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
            boxes[i]=new HashSet<>();
        }
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                char ch=board[row][col];
                int boxIndex=(row/3)*3+(col/3);
                if(ch=='.'){ 
                    continue;
                }
                else if(rows[row].contains(ch)){
                    return false;
                }
                else if(cols[col].contains(ch)){
                    return false;
                }
                else if(boxes[boxIndex].contains(ch)){
                    return false;
                }
                rows[row].add(ch);
                cols[col].add(ch);
                boxes[boxIndex].add(ch);
            }
        }
        return true;
    }
}