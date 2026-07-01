public class Assigment {

    public static int countelement(int matrix[][],int key){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    count++;
                }
            }

        }
        return count;
    }

    public static void transposeMatrix(int matrix[][]){
        System.out.println("Transpose Of Matrix:");
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }

    public static int secondRowSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==1){
                    sum+=matrix[i][j];
                }
            }

        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{ 1,4,9},{11,4,3},{2,2,3}
                };
                // int key=20;
                // int count = countelement(matrix,key);
                // System.out.println(count);
                // transposeMatrix(matrix);
                // int sum = secondRowSum(matrix);
                // System.out.println("Sum of 2nd row:"+sum);
    }
}
