package Backtracking;

public class FindPermutations {
    public static void findPermutations(String str,String ans){

        //Base
        if(str.length()==0){
            System.out.println(ans);
            return;
        }


        //Recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            //"abcde"--> "ab"+"de" = abde
            String newstr = str.substring(0, i) + str.substring(i+1);
            findPermutations(newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str,"");
    }
}
