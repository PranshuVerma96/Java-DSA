public class SudokuSolver {
    static boolean isSafeToPlace(
            char [][]board,
            char charValue,
            int rowIndex,
            int colIndex
    ){
        // rules
        // check for horizontal or same row
        // rowIndex sab cel k liye same rahega
        // and col ka index 0 to 9 tak move karega
        for(int col =0; col <9; col++){
            if(board[rowIndex][col] == charValue){
                return false;
            }
        }
        // check for vertical or same column
        // colIndex sab cell ke liye same rahega
        //row ka index 0 to 9 move kare ga
        for(int row= 0; row<9; row++){
            if(board[row][colIndex] == charValue){
                return false;
            }
        }
        // check for current 3*3 wala sub box
        int startRow = rowIndex - rowIndex%3;
        int startCol = colIndex - colIndex%3;

        // travel over that 3*3 wala sub box
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                int actualRow = startRow +i;
                int actualCol = startCol +j;
                if(board[actualRow][actualCol] == charValue){
                    return false;
                }
            }
        }
        // ager isa nahi he to return
        return true;

    }
    static boolean findEmptyCell(char board [][] ,int emptyCell[]){
        for(int i=0; i<9; i++){
            for(int j =0; j<9; j++){
                if(board[i][j] == '.'){
                    // store empty cell ki row
                    emptyCell[0] = i;
                    // store empty cell ki col ka index
                    emptyCell[1]=j;
                    // mil gay to return karo do
                    return true;
                }
            }
        }
        // kahi per bi empty cell nahi mia to main in false return karuga
        return false;
    }
    static boolean solveSudokuHelper(char[][] board){
        // base case
        // me tab manuga k mera puzzle solved hai , hab sare empty space fill hogye honge
        // when there is not empty sapces in side the board
        // then problem is solved

        int [] emptyCell = new int[2];
        if(!findEmptyCell(board,emptyCell)){
            return true;
        }
        // if lets say I found the empty cell
        int rowIndex = emptyCell[0];
        int colIndex = emptyCell[1];

        for(int value = 1; value<=9; value++){
            char charValue = (char)(value+ '0');
            if(isSafeToPlace(board,charValue,rowIndex,colIndex)){
                // place kardo
                board[rowIndex][colIndex] = charValue;
                // baki recursion sambal lega
                solveSudokuHelper(board);

                if(solveSudokuHelper(board) ==true){
                    return true;
                }
                // ager recursion nahi kar pya  or wapas a gaya
                // current value ko udo karo
                // backtracking bala step karo
                board[rowIndex][colIndex] = '.';
            }
        }
        // not able to solve the problem
        return false;

    }
    static void solveSudoku(char[][] board){
        solveSudokuHelper(board);
    }
}
