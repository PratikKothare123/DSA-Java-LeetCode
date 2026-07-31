package Recursions;

public class TowerOfHanoi {
        public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) { // Base case
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper); // Step 1
        System.out.println("transfer disk " + n + " from " + src + " to " + dest); // Step 2
        towerOfHanoi(n-1, helper, src, dest); // Step 3
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        towerOfHanoi(n, "A", "B", "C"); // Solve the problem
    
}
}
