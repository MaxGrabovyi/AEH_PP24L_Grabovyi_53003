package pl.pp;
import java.util.Scanner;
public class mojaDrugaAplikacja {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = 10;
        double y = 2;

        var result = x + y;
        System.out.println("x + y = " + result);

        result = x - y;
        System.out.println("x - y = "+ result);

        result = x * y;
        System.out.println("x * y = " + result);

        result = x / y;
        System.out.println("x / y = " + result);

        result = x % y;
        System.out.println("x % y = " + result);

        System.out.println("Wpisz dwie liczby rozdzielone klawiszem enter:");
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        System.out.println("x + y = " + (first + second));

        //Zadania 1
        int z;
        z = 10;
        System.out.println("z = " + z);
        z = z * 2;
        System.out.println("z * 2 = " + z);
        z = z * z;
        System.out.println("z * z = " + z);
        //2

        System.out.println("Proszę podaj ile masz lat: ");
        int age = scanner.nextInt();

        int convert = age * 365 * 24 * 60 * 60;
        System.out.println("Wiek w sekundach " + convert);


    }
}

