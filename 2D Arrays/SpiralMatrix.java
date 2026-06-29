import java.util.*;

public class SpiralMatrix {

    // Print Input Matrix
    public static void printMatrix(int matrix[][], int n, int m) {
        System.out.println("Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Spiral MAtrix
    public static void spiralMatrix(int matrix[][], int n, int m) {
        int startRow = 0;
        int startColn = 0;
        int endColn = m - 1;
        int endRow = n - 1;

        System.out.println("Spiral Matrix: ");
        while (startRow <= endRow && startColn <= endColn) {
            //Top
            for (int j = startColn; j <= endColn; j++) {
                System.out.print(matrix[startRow][j]+" ");
            }
            //Right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endColn]+" ");
            }
            //Bottom
            for(int j=endColn-1;j>=startColn;j--){
                System.out.print(matrix[endRow][j]+" ");
            }
            //Left
            for(int i=endRow-1;i>=startRow+1;i--){
                System.out.print(matrix[i][startColn]+" ");
            }

            startColn++;
            startRow++;
            endColn--;
            endRow--;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[4][4];
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        printMatrix(matrix, n, m);
        spiralMatrix(matrix, n, m);

    }
}
