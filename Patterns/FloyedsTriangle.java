public class FloyedsTriangle {
    public static void main(String[] args) {
        // int i=1,j=1,count=1;
        // int n=5;
        // for(i=1;i<=n;i++){
        //     for(j=1;j<=i;j++){
        //         System.out.print(count+" ");
        //         count++;
        //     }
        //     System.out.println();
        // }

        
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
             System.out.println();
        }
       
    }
    
}