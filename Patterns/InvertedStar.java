public class InvertedStar {

    public static void main(String[] args) {
        int i,j;
        // for(i=1;i<=4;i++){
        //     for(j=4;j>=i;j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for(i=1;i<=4;i++){
        //     for(j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        char ch = 'A';
        for(i=1;i<=4;i++){
            for(j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}