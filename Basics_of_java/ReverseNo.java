import java.util.Scanner;
public class ReverseNo {

    public static void main(String[] args) {
        // int num = 10899;
        // int rev = 0;
        // while(num>0){
            
        //     rev=num%10;
        //     System.out.print(rev+" ");
        //     num = num/10;
        // }
        Scanner sc = new Scanner(System.in);

        
        while(true){
            // System.out.print("Enter ur no: ");
            // int num = sc.nextInt();
            //  if (num%10==0){
            //     break;
            // }
            // System.out.println(num);
            System.out.print("Enter ur no: ");
            int num = sc.nextInt();
             if (num%10==0){
                continue;
            }
            System.out.println(num);
           
        }

        
    }
}