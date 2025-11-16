import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        long x = scanner.nextInt();
        long y = scanner.nextInt();
        long z = x * y;
        System.out.println("Actually the multiplication of " + x + " and " + y + " equals " + z + ".");
    }
}
