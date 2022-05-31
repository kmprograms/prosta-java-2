import java.util.Scanner;

/*
    Napisz program, w którym pobierzesz od użytkownika trzy liczby całkowite i sprawdzisz,
    czy w podanej kolejności tworzą ciąg arytmetyczny.
    Przykład ciągu arytmetycznego: 2, 4, 6
*/
public class App {

    static int getIntNumber(String message) {
        var sc = new Scanner(System.in);
        System.out.printf("%s:%n", message);
        return sc.nextInt();
    }

    static boolean checkArithmeticSequence(int a, int b, int c) {
        return b - a == c - b;
    }

    public static void main(String[] args) {
        var n1 = getIntNumber("Podaj pierwszą liczbę");
        var n2 = getIntNumber("Podaj drugą liczbę");
        var n3 = getIntNumber("Podaj trzecią liczbę");
        System.out.println(checkArithmeticSequence(n1, n2, n3) ? "TAK" : "NIE");
    }
}
