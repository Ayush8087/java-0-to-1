import java.util.Scanner;

public class lcm {
    public static int lcm(int a, int b) {
        int max=Math.max(a, b);
        int lcm=max;
        
        while (true) {
            if (lcm%a == 0 && lcm%b == 0) {
                return lcm;
            }
            lcm += max;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("enter second number: ");
        int num2 = scanner.nextInt();
        
        int result = lcm(num1, num2);
        System.out.println("lcm:" + result);
        
        scanner.close();
    }
}
