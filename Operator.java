import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer");

        int num = input.newInt();
        int x = num % 5;
        int y = num % 6;

        System.out.print("Is " + num + "divisible by 5 and 6? ");
        if (x == 0 && y == 0) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
        System.out.print("\nIs " + num + "divisible by 5 and 6? ");
        if (x == 0 || y == 0) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
        System.out.print("\nIS " + num + "divisible by 5 and 6, but not both? ");
        if (x == 0 ^ y == 0) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
