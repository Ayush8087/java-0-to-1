import java.util.Scanner;
public class perfectnumbercheck {
    public static boolean isPerfectNumber(int n) {
        if (n<=1) {
            return false;
        }       
        int sum = 0;
        for (int i = 1; i<=n/2; i++) {
            if (n%i == 0) {
                sum += i;
            }
        }       
        return sum == n;
    }   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = scanner.nextInt();       
        boolean result = isPerfectNumber(num);
        System.out.println("ss " + num + " a perfect number? " + result);      
        scanner.close();
    }
}
