import java.util.*;
public class Matrix {

    public static boolean Findkey(int matrix[][], int key){
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matrix[i][j]== key){
                    System.out.println("key present at -> Row "+i+" Column "+j);
                }
            } 
        }
        return false;
    }

    public static void Findmax(int matrix[][]){
        int max = matrix[0][0];
        int min = matrix[0][0];
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                }
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                }
            } 
        }
    System.out.println("Maximum element = "+max);
    System.out.println("Minimum element = "+min);
    }
// Matrix:
// 43 56 78 
// 12 34 112 
// 45 67 8 
// Maximum element = 112
// Minimum element = 8


// Matrix:
// 1 2 3 
// 4 5 6 
// 7 8 9 
// key present at -> Row 2 Column 0
    public static void main (String [] args){
        //Input Matrix
        Scanner sc = new Scanner(System.in); 
        int matrix [][] = new int [3][3];
        int n= matrix.length; // we get total rows of matrix
        int m = matrix[0].length; //we get the cplumn of matrix
        System.out.println("Enter 9 elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //Printing Matrix
        System.out.println("Matrix:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Findkey(matrix,7);
        Findmax(matrix);
    }      
}

// Matrix:
// 1 2 3 
// 4 5 6 
// 7 8 9



// Java does NOT store a 2D array as one big continuous block like C/C++.

// Java stores it as an array of references.

// matrix
//    |
//    |------> row0 -----> [1,2,3]
//    |
//    |------> row1 -----> [4,5,6]
//    |
//    |------> row2 -----> [7,8,9]

//Memory Diagram
// matrix
// +-----+-----+-----+
// | 100 | 200 | 300 |
// +-----+-----+-----+
//     |      |      |
//     v      v      v

// 100 --> [1][2][3]

// 200 --> [4][5][6]

// 300 --> [7][8][9]