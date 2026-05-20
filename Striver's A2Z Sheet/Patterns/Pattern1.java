// public class Pattern1 {
//     public static void StarPatt(int n) {
    
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print("* ");
//             }
//             System.out.println("");
//         }
//     }
//     public static void main(String[] args) {
//         StarPatt(4);
//     }
// }
//OutPut
// * * * * 
// * * * *
// * * * *
// * * * *


// public class Pattern1 {
//     public static void StarPatt(int n) {
    
//         for(int i=0;i<n;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println("");
//         }
//     }
//     public static void main(String[] args) {
//         StarPatt(5);
//     }
// }
//OutPut
// * 
// * *
// * * *
// * * * *
// * * * * *

// public class Pattern1 {
//     public static void StarPatt(int n) {
    
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println("");
//         }
//     }
//     public static void main(String[] args) {
//         StarPatt(5);
//     }
// }
// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5


// public class Pattern1 {
//     public static void StarPatt(int n) {
    
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println("");
//         }
//     }
//     public static void main(String[] args) {
//         StarPatt(5);
//     }
// }
// 1 
// 2 2 
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5


// public class Pattern1 {
//     public static void StarPatt(int n) {
    
//         for(int i=1;i<=n;i++){
//             for(int j=n;j>=i;j--){
//                 System.out.print("* ");
//             }
//             System.out.println("");
//         }
//     }
//     public static void main(String[] args) {
//         StarPatt(5);
//     }
// }
// * * * * * 
// * * * *
// * * *
// * *
// *

// public class Pattern1 {
//     public static void StarPatt(int n) {
    
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i+1;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println("");
//         }
//     }
//     public static void main(String[] args) {
//         StarPatt(5);
//     }
// }
// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2
// 1

// public class Pattern1 {
//      public static void PatterPrint(int n){
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n-i-1;j++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<2*i+1;j++){
//                 System.out.print("*");
//             }
//             for(int j=0;j<n-i-1;j++){
//                 System.out.print(" ");
//             }

//             System.out.println("");
//         }
//      }
//      public static void main(String[] args) {
//         PatterPrint(5);
//      }
// }                            
//     *    
//    ***
//   *****
//  *******
// *********

// public class Pattern1 {
//      public static void PatterPrint(int n){
//         for(int i=0;i<n;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<2*n-(2*i+1);j++){
//                 System.out.print("*");
//             }
//             for(int j=0;j<n;j++){
//                 System.out.print(" ");
//             }

//             System.out.println("");
//         }
//      }
//      public static void main(String[] args) {
//         PatterPrint(5);
//      }
// }     
// *********     
//  *******
//   *****
//    ***
//     *                       

// public class Pattern1 {
//     public static void Pattern10(int n){
//         for(int  i=1;i<=2*n-1;i++){
//             int stars = i;
//             if(i>n)
//                 stars = 2*n -i;
//             for(int j=1;j<=stars;j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }

//     public static void main(String[] args) {
//         Pattern10(5);
//     }
// }
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

