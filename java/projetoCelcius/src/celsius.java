import java.util.Scanner;

public class celsius {
    public static void main(String[] args) {
       try( Scanner scan = new Scanner(System.in)) {
        System.out.print("Digite a temperatura em Celsius (C): ");
        while (!scan.hasNextDouble()) {
            scan.next();
            System.out.print("Digite a temperatura em Celsius (C): ");
        }
        double celsius = scan.nextDouble();
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        double kelvin = celsius + 273.15;

        System.out.printf("Temperatura em Celsius: %.1f C%n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.1f F%n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);

        scan.close();
    }
}
}