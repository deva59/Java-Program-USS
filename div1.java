import java.util.*;

class div1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();
        
        if (n % 6 == 0 && n % 9 == 0) {  // Check for divisibility by 6 and 9
            System.out.println(n + " is completely divisible by 6 and 9.");
        } else {
            System.out.println(n + " is not completely divisible by 6 and 9.");
        }
        
        s.close();  // Close the scanner to avoid resource leak
    }
}
