import java.util.Scanner;
public class squarerootcalculation {
    public static double squareRoot(double n) {
        double x = n;
        double epsilon = 0.00001;
        while (Math.abs(x*x-n) > epsilon) {
            x = (x+n/x)/2;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        double result = squareRoot(num);
        System.out.println("square root of " + num + " is approximately: " + result);
        scanner.close();
    }
}
