//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String input = scanner.nextLine().replaceAll("\\s+", "");
        double result = 0;
        if (input.contains("+")) {
            String[] parts = input.split("\\+");
            result = Double.parseDouble(parts[0]) + Double.parseDouble(parts[1]);
        } else if (input.contains("-")) {
            String[] parts = input.split("-");
            result = Double.parseDouble(parts[0]) - Double.parseDouble(parts[1]);
        } else if (input.contains("*")) {
            String[] parts = input.split("\\*");
            result = Double.parseDouble(parts[0]) * Double.parseDouble(parts[1]);
        } else if (input.contains("/")) {
            String[] parts = input.split("/");
            result = Double.parseDouble(parts[0]) / Double.parseDouble(parts[1]);
        } else {
            System.out.println("Неподдерживаемый оператор");
            return;
        }

        System.out.println("Результат: " + result);
    }
}