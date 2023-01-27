import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        long b = scn.nextInt();
        double c = scn.nextDouble();
        double s = 1.0 * a + b + c;
        System.out.println("The sum is: " + s);
    }
}
