import java.util.Scanner;

public class cuberootcalculation {
    public static double cubeRoot(double n) {
        double x=n;
        double epsilon=0.0001;
        while (Math.abs(x*x*x-n) > epsilon) {
            x =(2*x+n/(x*x))/3;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        double num = scanner.nextDouble();
        double result = cubeRoot(num);
        System.out.println("cube root: " + result);
        scanner.close();
    }
}
