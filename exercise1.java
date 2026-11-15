 import java.util.Scanner;
public class exercise1 {
    public static void main (String [] args) {
        System.out.println("Taking the number from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bengali number");
        int a = sc.nextInt();
        System.out.println("Enter the english number");
        int b = sc.nextInt();
        System.out.println("Enter the math number");
        int c = sc.nextInt();
        System.out.println("Enter the physics number");
        int d = sc.nextInt();
        System.out.println("Enter the chemistry number");
        int e = sc.nextInt();
        int total = a+b+c+d+e;
        System.out.println(total);
        double parcentage = (total/500.0)*100;
        System.out.println(parcentage + "%");  
    }

}