import java.util.Scanner;
public class sumofsquares {
    public static int sumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i<=n; i++) {
            sum += i*i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = scanner.nextInt();
        
        int result = sumOfSquares(num);
        System.out.println("sum of squares of first " + num + " natural number is: " + result);
        
        scanner.close();
    }
}