class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Traverse the row and columns
        for(int i = 0; i < 9; i++){
            Set<Character> rowSet = new HashSet<>();
            Set<Character> colSet = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    if(rowSet.contains(board[i][j])){
                        return false;
                    }
                    else {
                        rowSet.add(board[i][j]);
                    }
                }
                if(board[j][i] != '.'){
                    if(colSet.contains(board[j][i])){
                        return false;
                    }
                    else{
                        colSet.add(board[j][i]);
                    }
                }
            }
        }

        // Traverse 3x3 sub-boxes
        for(int i = 0; i < 9; i += 3){
            for(int j = 0; j < 9; j += 3){
                if(!checkSubBox(i, j, board)){
                    return false;
                }
            }
        }

        // Passes all 3 rules, therefore is valid
        return true;

    }

    // Helper function to check if a 3x3 sub-box is valid
    public static boolean checkSubBox(int rowIndex, int colIndex, char[][] board){
        int rowEndBound = rowIndex + 3;
        int colEndBound = colIndex + 3;

        Set<Character> subBox = new HashSet<>();
        for(int i = rowIndex; i < rowEndBound; i++){
            for(int j = colIndex; j < colEndBound; j++){
                if(board[i][j] != '.'){
                    if(subBox.contains(board[i][j])){
                        return false;
                    }
                    else{
                        subBox.add(board[i][j]);
                    }
                }
            }
        }

        // Sub-box contains no duplicates, therefore is valid
        return true;
    }
}
