import java.util.Scanner;
public class sumnaturalnumbers {
    public static int sumOfNaturalNumbers(int n) {
        if (n==1) {
            return 1;
        }
        return n + sumOfNaturalNumbers(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = scanner.nextInt();   
        int result = sumOfNaturalNumbers(num);
        System.out.println("sum of first " + num + " natural number: " + result);
        scanner.close();
    }
}
