import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a credit card number as a long integer: ");
        long creditCardNumber = Long.parseLong(scanner.nextLine().trim());

        if (CreditCardValidator.isValid(creditCardNumber)) {
            System.out.println(creditCardNumber + " is valid");
        } else {
            System.out.println(creditCardNumber + " is invalid");
        }
    }
}