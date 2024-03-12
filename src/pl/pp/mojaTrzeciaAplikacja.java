package pl.pp;
import java.util.Scanner;
public class mojaTrzeciaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj proszę liczbę większą od 100:");
        var number1 = scanner.nextDouble();
        while (number1 <= 100) {
            System.out.println("Liczba nie jest większa od 100, podaj jeszcze raz:");
            number1 = scanner.nextDouble();
        }
        System.out.println("Dziękuję! Podałeś liczbę: " + number1);
        double number2;
        do {
            System.out.println("Podaj proszę liczbę większą od 200:");
            number2 = scanner.nextDouble();
        } while (number2 <= 200);
        System.out.println("Dziękuję! Podałeś liczbę: " + number2);
        int wynik = 0;
        for (var i = 1; i <= 10; i++) {
            wynik = wynik + i;
            System.out.println("Przebieg numer " + i + " w pętli for, a zmienna wynik = " + wynik);
        }
        System.out.println("Podaj proszę liczbę x: ");
        var x = scanner.nextDouble();
        System.out.println("Podaj proszę liczbę y: ");
        var y = scanner.nextDouble();
        if(x > y){
            System.out.println("x jest większe od y");
        } else if (x < y) {
            System.out.println("x jest mniejsze od y");
        } else {
            System.out.println("x jest równe y");
        }
        while(true)
        {
            System.out.println("Wpisz wartość -1 żeby wyjść z programu");
            var input = scanner.nextDouble();
            if(input == -1){
                System.out.println("Wyjście...");
                break;
            }
        }

        //zadanie 2
        //1
        int liczbadni;
        while(true) {
            System.out.println("Proszę podaj liczbę dni :");
            liczbadni = scanner.nextInt();
            int tygodni = liczbadni / 7;
            int dni = liczbadni % 7;
            System.out.println(liczbadni + " dni " + " to " + tygodni + " tygodni " + " i " + dni + " dni ");
            System.out.println("Wpisz wartość -1 żeby wyjść z programu");
            var input = scanner.nextInt();
            if(input < 0) {
                System.out.println("Program zakonczony: ");
                break;
            }
        }

        //2
        while(true) {
            System.out.println("Proszę wpisac licby Celsjum");
            double Celsjum = scanner.nextDouble();
            double Kelwin = Celsjum + 273.16;
            double Fahrenheit= 1.8 * Celsjum + 32.0;
            System.out.println("Celsjum " + Celsjum);
            System.out.println("Kelwin " + Kelwin);
            System.out.println("Fahrenheit " + Fahrenheit);
            System.out.println("Wpisz wartość -1 żeby wyjść z programu ");
            var input = scanner.nextInt();
            if(input < 0) {
                System.out.println("Program zakonczony: ");
                break;
            }

        }

    }
}
