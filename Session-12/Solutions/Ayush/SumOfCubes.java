import java.util.Scanner;

public class SumOfCubes {
    public static int sumOfCubes(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i * i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int result = sumOfCubes(num);
        System.out.println("Sum of cubes of first " + num + " natural numbers is: " + result);
        
        scanner.close();
    }
}
