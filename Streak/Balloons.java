package Streak;

import java.util.Scanner;

public class Balloons {
    public static int maxNumberOfBalloons(String text) {

        int[] freq = new int[26];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch - 'a']++;
        }

        int b = freq['b' - 'a'];
        int a = freq['a' - 'a'];
        int l = freq['l' - 'a'] / 2;
        int o = freq['o' - 'a'] / 2;
        int n = freq['n' - 'a'];

        return Math.min(Math.min(Math.min(b, a), Math.min(l, o)), n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int result = maxNumberOfBalloons(text);

        System.out.println("Maximum number of 'balloon' words = " + result);

        sc.close();
    }
}


// Enter a string: nlaebolko
// Maximum number of 'balloon' words = 1
