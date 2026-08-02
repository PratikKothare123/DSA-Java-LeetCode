package Recursions;

public class RemoveDuplicates {

    public static void removeDupl(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx== str.length()){
            System.out.println(newStr);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            //duplicates
            removeDupl(str, idx+1, newStr, map);
        }else{
            map[currChar-'a']=true;
            removeDupl(str, idx+1, newStr.append(currChar), map);
        }


    }
    public static void main(String[] args) {
        String str= "appnacollege";
        removeDupl(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
// apncoleg 