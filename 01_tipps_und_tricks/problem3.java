import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        int n = scanner.nextInt();
        while (n > 0) {
            int k = scanner.nextInt();
            System.out.println(k + 1);
            n--;
        }
    }
}
