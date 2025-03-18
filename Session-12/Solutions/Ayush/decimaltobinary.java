import java.util.Scanner;

public class DecimalToBinary {
    public static String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        
        boolean isNegative = n < 0;
        if (isNegative) {
            n = -n;
        }
        
        String binary = "";
        while (n > 0) {
            binary = (n % 2) + binary;
            n = n / 2;
        }
        
        if (isNegative) {
            binary = "-" + binary;
        }
        
        return binary;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = scanner.nextInt();
        
        String result = decimalToBinary(num);
        System.out.println("Binary representation: " + result);
        
        scanner.close();
    }
}
