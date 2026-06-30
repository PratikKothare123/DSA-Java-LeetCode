import java.util.Scanner;

public class DiagonalSum {

    //Function for MatrixDiagonalSum

    public static int MatrixDiagonalSum(int matrix[][],int n,int m){
        int sum=0;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }else if(i+j == n-1){
        //             sum+=matrix[i][j];
        //         }

        //     }
        // }
        // System.out.println("Sum of Diagonal MAtrix:"+sum);

        //Optimize in O(n) 
        for(int i=0;i<n;i++){
            //Primary
            sum+=matrix[i][i];
            //Before that we calculate -> i+j == n-1  
            // Now we can calculate 'j' value by using Above eqn.  "j=n-1-i"
            //Secondary 
            if(i!=n-1-i){
                sum+=matrix[i][n-1-i];
            }

        }
        return sum;
    }


    public static void main(String[] args){
        //Input Matrix
        Scanner sc = new Scanner(System.in); 
        int matrix [][] = new int [3][3];
        int n= matrix.length; // we get total rows of matrix
        int m = matrix[0].length; //we get the cplumn of matrix
        System.out.println("Enter " +(n*m)+ " elements:");
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

        int sum = MatrixDiagonalSum(matrix,n,m);
        System.out.println(sum);

    }
}
