import java.util.Scanner;

public class hailstonesequence {
    public static void hailstoneSequence(int n) {
        int length = 1;
        int max = n;
        
        System.out.print("Sequence: "+n+" ");
        
        while (n!=1) {
            if (n%2==0) {
                n=n/2;
            } else {
                n=3*n+1;
            }
            
            System.out.print(n + " ");
            
            if (n>max) {
                max=n;
            }
            
            length++;
        }
        
        System.out.println("\nLength:" + length);
        System.out.println("Max value:" + max);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = scanner.nextInt();
        
        hailstoneSequence(num);
        
        scanner.close();
    }
}
