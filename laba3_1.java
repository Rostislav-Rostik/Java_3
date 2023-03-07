import java.lang.*;
import java.util.Scanner;
public class laba3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        String variable = scanner.nextLine();

        int count = Integer.parseInt(variable);

        for ( int i = 0; i < count; i++ ) {
            char c = (char)(Math.random()*26 + 'a');
            System.out.print(c + ": ");
            switch ( c ) {
            case 'a': case 'e': case 'i':
            case 'o': case 'u':
            System.out.println("vowel");
            break;
            case 'y': case 'w':
            System.out.println("some vowel");
            break;
            default:
            System.out.println("consonant");
            }
        }
           
    }
}