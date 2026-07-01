
package String;

import java.util.*;

// A String is a sequence of characters.
public class BasicString {
    public static void main(String[] args) {
        // Comman Ways to create String
        // 1. String Literal
        // String str = "Pratik Kothare";
        // System.out.println(str);
        // Pratik Kothare

        // 2.Using new
        // String str1 = new String("Pratik Kothare");
        // System.out.println(str1); // Pratik Kothare

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Your Name: ");
        // String name1 = sc.next(); //it gives only 1st name
        // String name = sc.nextLine(); // it gives complete name i,e Prajwal Kothare
        // System.out.println("My Name is "+name);

        // Length of String
        // System.out.println("String Length:"+name.length());
        // System.out.println(name.charAt(0)); // p

        // String str2 = "Hello";

        // for (int i = 0; i < str2.length(); i++) {
        // System.out.print(str2.charAt(i) + " ");
        // }

        // String first = "Pratik";
        // String last = "Kothare";

        // String full = first + " " + last;

        // System.out.println(full); //Pratik Kothare

        // String s1 = "Hello"; //if(str1 == str2) Wrong not possible
        // String s2 = "Hello";

        // System.out.println(s1.equals(s2)); //true

        // String Concatenate
        // String s1="Pratik";
        // String s2 = "Kothare";

        // System.out.println(s1.length());
        // System.out.println("Concatenation String: "+s1+" "+s2);
        // //or
        // String s3 = s1 + " " + s2;
        // System.out.println(s3);

        // Extract Numbers from String
        // String s="Pra12ko23";
        // for(int i =0;i<s.length();i++){
        // char ch = s.charAt(i);
        // if(ch>'0' && ch<='9'){
        // System.out.print(ch+"");
        // }
        // }

        // Print All Characters
        // String s2 = "Kothare Family";
        // for(int i=0;i<s2.length();i++){
        // char ch = s2.charAt(i);
        // System.out.print(ch+" ");
        // }

        // Count Vowels
        // String s2 = "kothare family";
        // int vowelscount=0;
        // int consonentcount=0;
        // for(int i=0;i<s2.length();i++){
        // char ch = s2.charAt(i);
        // if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        // vowelscount++;
        // }else{
        // consonentcount++;
        // }
        // }
        // System.out.println("consonentcount: "+consonentcount+" vowelscount:
        // "+vowelscount);


        //Count Special Characters

        // String str = "a!b@12#";
        // int count = 0;

        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if (!(ch >= 'a' && ch <= 'z') &&
        //             !(ch >= 'A' && ch <= 'Z') &&
        //             !(ch >= '0' && ch <= '9')) {
        //         count++;
        //     }
        // }
        // System.out.println(count);


        String s="Kothare234koth";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                System.out.print(ch);
            }
        }
    }
}
