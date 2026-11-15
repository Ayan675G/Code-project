import java.util.Scanner;
public class ch1p1 {
    public static void main(String[] args) {
        System.out.println("Taking the number from the user");
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter a number");
        int b = sc.nextInt();
        System.out.println("Enter a number");
        int c = sc.nextInt();
       int sum = a+b+c;
        System.out.println("Sum of the three number is = " + sum);
        
    }
    
}
