import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiService imt = new BmiService();
        System.out.println("Укажите ваш рост в метрах");
        double height = scanner.nextDouble();
        System.out.println("Укажите ваш вес в килограммах");
        double weight = scanner.nextDouble();
        System.out.println("Ваш интекс массы тела составляет " + imt.calculate(height, weight));

    }
}
