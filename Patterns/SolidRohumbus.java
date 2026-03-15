public class SolidRohumbus {
    public static void main(String[] args) {
        int n = 10;
        // for (int i = 1; i <= n; i++) {
        //     // Print Space
        //     for (int j = 1; j <= (n - i); j++) {
        //         System.out.print(" ");
        //     }
        //     // Print star

        //     for (int j = 1; j <= n; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }


        // hollow Rhombus

        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
