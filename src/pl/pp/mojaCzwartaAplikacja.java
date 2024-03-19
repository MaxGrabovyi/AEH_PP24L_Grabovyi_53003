package pl.pp;

import java.util.Scanner;

public class mojaCzwartaAplikacja {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Enter lower and upper intager limit: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a <= b) {
            System.out.println("don`t correct limit");

        }
        int sumsSquares = calculateSumOfSqures(a, b);

        System.out.println("The sums of the squares from " + (a * a) + " to " + (b * b) + " is " + sumsSquares);
    }

    public static int
    calculateSumOfSqures(int lowerLimit, int upperLimit) {
        int totalSum = 0;
        for (int i = lowerLimit; i <= upperLimit; i++) {
            totalSum += i * i;
        }
        return totalSum;
    }

    {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("podaj dolny limit (liczba calkowita): ");
            int lowerLimit = scanner.nextInt();
            System.out.println("Podaj gorny limit (liczba calkowita): ");
            int upperLimit = scanner.nextInt();
            if (upperLimit <= lowerLimit) {
                System.out.println("blad: Gorny limit musi byc wiekszy od dolnego limitu lub rowny.");
                break;
            }
            int sumOfSquares = calculateSumOfSqures(lowerLimit, upperLimit);
            System.out.println("Suma kwadratow liczb calkowitych od " + lowerLimit + " do " + upperLimit + " to: " + sumOfSquares);
        }
    }
}