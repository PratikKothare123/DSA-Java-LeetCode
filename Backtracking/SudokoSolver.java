package Backtracking;

public class SudokoSolver{

    public static boolean isSafe(int sudoku[][],int row, int col, int digit){
        //Column
        for(int i=0;i<=8;i++){
            if(sudoku[i][col]==digit){
                return false;
            }

        //Row
        for(int j=0;j<=8;j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }

        //Grid-> Check 3X3 grid 
        

        }
    }

    public static boolean sudokuSolver(int sudoku[][],int row, int col){

        //Base Case

        if(row==9 && col==9){
            return true;
        }else if (row==9){
            return false;
        }

        //Recursion
        int nextRow = row, nextCol = col+1;
        if(col+1 ==9){
            nextCol = col+1;
            nextRow = 0;
        }

        //if alreday present Digit, we directly switch to the nextrow and column 
        if(sudoku[row][col] != 0){ 
            return sudokuSolver(sudoku, nextRow, nextCol);
        }


        for(int i=1;i<=9;i++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col]= digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){ // Solution exists
                    return true;
                }
                sudoku[row][col]= 0;
            }
        }

        return false;
    }
  public static void main(String args[]) {
    int sudoku[][] = { {0, 0, 8, 0, 0, 0, 0, 0, 0},
    {4, 9, 0, 1, 5, 7, 0, 0, 2},
    {0, 0, 3, 0, 0, 4, 1, 9, 0},
    {1, 8, 5, 0, 6, 0, 0, 2, 0},
    {0, 0, 0, 0, 2, 0, 0, 6, 0},
    {9, 6, 0, 4, 0, 5, 3, 0, 0},
    {0, 3, 0, 0, 7, 2, 0, 0, 4},
    {0, 4, 9, 0, 3, 0, 0, 5, 7},
    {8, 2, 7, 0, 0, 9, 0, 1, 3} };
}


}