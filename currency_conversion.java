import java.util.Scanner;

public class currency_conversion {
    public static String convert_currency(String currency, double amount) {
        String lowercase_currency = currency.toLowerCase();
        if (lowercase_currency.equals("usd")) {
            return String.valueOf(amount * 4000);
        } else if (lowercase_currency.equals("yuan")) {
            return String.valueOf(amount * 643);
        } else if (lowercase_currency.equals("baht")) {
            return String.valueOf(amount * 123);
        } else {
            return "not found";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type 'yuan', 'baht', 'usd': ");
        String currency = scanner.nextLine();

        System.out.print("amount: ");
        double amount = scanner.nextDouble();

        String result = convert_currency(currency, amount);
        System.out.println("the conversion from " + currency + " to riel is: " + result);
    }
}

