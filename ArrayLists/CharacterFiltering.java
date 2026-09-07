
/**
 * Problem Name: Character Filtering (Smallest Balanced String)
 * 
 * Problem Description:
 * 1. Count the frequency of each character in the string.
 * 2. For each character that occurs more than once:
 *    - Keep only the first occurrence (earliest position).
 *    - Remove all later occurrences of that character.
 * 3. After removal, rearrange the remaining characters so that:
 *    - All vowels (a, e, i, o, u) come first, sorted in ascending order.
 *    - All consonants come next, sorted in ascending order.
 * 
 * Input Format:
 * - A single string s (only lowercase English letters)
 * 
 * Output Format:
 * - The transformed string
 * 
 * Sample Input:
 * bcabca
 * 
 * Sample Output:
 * abc
 * 
 * Explanation:
 * - Vowels present: "a" -> sorted -> "a"
 * - Consonants present: "b", "c" -> sorted -> "bc"
 * - Merge vowels and consonants: "a" + "bc" -> "abc"
 */

import java.util.Scanner;

public class CharacterFiltering {

    public static String smallestBalancedString(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        // Arrays to track whether a character is present in the input string
        boolean[] presentVowels = new boolean[26];
        boolean[] presentConsonants = new boolean[26];

        // Process each character in the input string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                presentVowels[ch - 'a'] = true;
            } else if (ch >= 'a' && ch <= 'z') {
                presentConsonants[ch - 'a'] = true;
            }
        }

        StringBuilder result = new StringBuilder();

        // 1. Append unique vowels in sorted ascending order
        for (int i = 0; i < 26; i++) {
            if (presentVowels[i]) {
                result.append((char) ('a' + i));
            }
        }

        // 2. Append unique consonants in sorted ascending order
        for (int i = 0; i < 26; i++) {
            if (presentConsonants[i]) {
                result.append((char) ('a' + i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String s = sc.nextLine().trim();
            System.out.println(smallestBalancedString(s));
        }
        sc.close();
    }
}