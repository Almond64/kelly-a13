import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the principal amount: ");
        int P = input.nextInt();
        System.out.println("What is the rate: ");
        double r = input.nextDouble();
        System.out.println("What is the number of years: ");
        int t = input.nextInt();
        System.out.println("What is the number of times the interest is compounded per year: ");
        int n = input.nextInt();
        //calculate the value of the investment compounded over time
        //double A = Math.pow((P * (1 + (r / 100) / n)), (n * t));
        double A = Math.pow( (1 + ( ( r / 100 ) / n ) ), ( n * t ) ) * 1500;
        //Try using Math.ceil in conjunction with %.2f
        System.out.printf("$%d invested at %.2f for %d years compounded %d times per year is $%.2f.\n", P, r, t, n, A);
    }
}
