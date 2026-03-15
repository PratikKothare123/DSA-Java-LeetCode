public class Butterfly_Pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            // print star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Print Space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            // Print Star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Second Half
        for(int i=n;i>=1;i--){
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Print Space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            // Print Star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
}
