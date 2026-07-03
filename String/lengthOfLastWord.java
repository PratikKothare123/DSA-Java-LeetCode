package String;

public class lengthOfLastWord {
    public static int lengthOfLastWords(String s){
        s = s.trim();
       return s.length() - 1 - s.lastIndexOf(' ');
    }
    public static void main(String[] args) {
        // String s = "Hello World";
         String s = "   fly me   to   the moon  ";
        System.out.println("Length of Last Word: "+lengthOfLastWords(s));
    }
}
