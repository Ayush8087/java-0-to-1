import java.util.Scanner;

public class binarysearchrecursive {
    public static boolean binarySearch(int low, int high, int target) {
        if (low > high) {
            return false;
        }
        int mid = low + (high - low) / 2;
        if (mid == target) {
            return true;
        }
        if (target < mid) {
            return binarySearch(low, mid - 1, target);
        }
        return binarySearch(mid + 1, high, target);
    }  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the lower limit: ");
        int low = scanner.nextInt();
        System.out.print("enter the upper limit: ");
        int high = scanner.nextInt();
        System.out.print("enter the number to search: ");
        int target = scanner.nextInt();
        
        boolean result = binarySearch(low, high, target);
        System.out.println("number found: " + result);
        
        scanner.close();
    }
}
