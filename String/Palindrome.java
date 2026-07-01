package String;

public class Palindrome {

    public static boolean CheckPalindrome(String s){
        int n = s.length();
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "madam";
       System.out.println(CheckPalindrome(s));
        
    }
}
