import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main() {

        // Level 1 – Easy
        // 1. Einfache Zahlenfolge ausgeben
        int[] myArray = {1, 2,3,4, 5};
        for (int i = 0; i < myArray.length; i++ ) {
            System.out.println(myArray[i]);
        }

        // 2. Alle Elemente eines Arrays anzeigen
        String[] names = {"Osama" , "Eva", "Mohammad", "Mahir" };
        for (String name: names ) {
            System.out.println(name);
        }

        // 3. Quadratzahlen berechnen
        int[] numbers = {2, 4, 6, 8};
        for (int i = 0; i < numbers.length; i++ ) {
            System.out.println(numbers[i] * numbers[i]);
        }

        // Level 2 – Medium
        // 1. Nur gerade Zahlen ausgeben
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("====== mit einer for-Schleife ========");
        for (int i = 0; i < numbers1.length; i++ ) {
            if((numbers1[i] % 2) == 0) {
                System.out.println(numbers1[i]);
            }
        }
        System.out.println("====== mit einer for-each-Schleife ========");
        for (int number: numbers1 ) {
            if((number % 2) == 0) {
                System.out.println(number);
            }
        }
        // 2. Summe berechnen
        int sum = 0;
        for (int number: numbers1 ) {
           sum += number;
        }
        System.out.println(sum);

        //3. Index mit ausgeben
        String[] cities = { "Berlin", "Hannover", "Osnabrück", "Hamburg", "Düsseldorf" };
        for (int i = 0; i < cities.length; i++ ) {
            System.out.println( (i + 1) + ". " + cities[i]);
        }
        //4. Minimum und Maximum finden
        int[] zahlen = { -10, 5, 30, 40, -70, 90, 150, 1000, -10000 };
        int max = -2147483648;
        int min = 2147483647;
        for (int zahl: zahlen ) {
            if(zahl > max) {
                max = zahl;
            }
            if(zahl < min) {
                min = zahl;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        // Level 3 – Bonus
        //1. Array-Werte verdoppeln
        int[] zahlen1 = { -10, 5, 30, 40, -70, 90, 150, 1000, -10000 };
        System.out.print("Before: ");
        System.out.println(Arrays.toString(zahlen1));
        for (int i = 0; i < zahlen1.length; i++ ) {
            zahlen1[i] = zahlen1[i] * 2;
        }
        System.out.print("After: ");
        System.out.println(Arrays.toString(zahlen1));

        //2. Zwei Arrays kombinieren
        String[] vornamen = {"Osama", "Mohammad", "Mahir"};
        String[] nachnamen = {"Sado", "Abdul Aziz", "Kumar"};
        for (int i = 0; i < vornamen.length; i++ ) {
            System.out.println((i+1) + ". " + vornamen[i] + " " + nachnamen[i]);
        }

        //3. Benutzereingabe verarbeiten
        Scanner scanner = new Scanner(System.in);
        int[] inputs = new int[5];
//        for(int i=0; i < 5; i++) {
//            System.out.print("Bitte gibe eine Zahl ein: ");
//            inputs[i] = scanner.nextInt();
//        }
        System.out.println("Die eingegebene Zahlen sind: ");
        for (int x: inputs){
            System.out.println(x);
        }

        //4. Einfacher Notenrechner
        int[] noten = { 85, 70, 95, 60};
        int summe = 0;
        int minimum = 70;
        for (int note: noten) {
            summe += note;
        }
        double durchschnitt = (double) summe / noten.length;
        System.out.println("Durchschnitt: " + durchschnitt);
        if(durchschnitt >= minimum ) {
            System.out.println("bestanden ");
        } else {
            System.out.println("Nicht bestanden");
        }

        //5. Zufallszahlen sortieren
        int[] myNumbers = {15, 10, 6, 45, 100, 88, 70, 60, 55, 40};
        System.out.println("Before: " + Arrays.toString(myNumbers));
        Arrays.sort(myNumbers);
        System.out.println("After: " + Arrays.toString(myNumbers));
    }
}
