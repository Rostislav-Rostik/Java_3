import java.lang.*;
import java.util.Scanner;
public class laba3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        String variable = scanner.nextLine();

        double catet = Double.parseDouble(variable);

        variable = scanner.nextLine();

        double catets = Double.parseDouble(variable);

        double hypotenuse = Math.hypot(catet,catets);

        double res = Math.asin (catet/hypotenuse);

        double result = Math.asin (catets/hypotenuse);

        System.out.println(Math.toDegrees (res) );
        System.out.println(Math.toDegrees (result) );

    }
}