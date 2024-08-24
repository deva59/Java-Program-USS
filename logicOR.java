import java.util.*;
class and1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number ");
    int n = scanner.nextInt();
    if (n % 6 == 0 || n % 9 == 0) {
    System.out.println(n + " its completely divisible by both 6 and 9");
    } 
    else {
     System.out.println(n + " is not completely divisible by both 6 and 9");
        }
    }
}