package Hashing;
import java.util.*;

public class Valid_Anagram {
    public static boolean IsAnagram(String s,String t){

        if(s.length()!= t.length()){
            return false;
        }
         
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            Character ch= s.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }

        for(int i=0;i<t.length();i++){
            Character ch = t.charAt(i);
            if(map.get(ch) != null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1); 
                }
            }else{
                return false;
            }
        }
        return map.isEmpty(); 
    }
    public static void main(String[] args) {

       

        boolean result = IsAnagram("tulip", "lipid");
        System.out.println(result);

    }
}
