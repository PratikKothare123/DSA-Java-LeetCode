package Backtracking;

public class FindSubset {

    public static void findSubsets(String str,String ans,int i){
        //BASE 
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            
            return;
        }
        //YES
        findSubsets(str,ans+str.charAt(i),i+1);
        //No
        findSubsets(str, ans, i+1);


    }
    public static void main(String[] args) {
        String str = "abc";
        // String ans = " ";
        findSubsets(str,"",0);
    }
}