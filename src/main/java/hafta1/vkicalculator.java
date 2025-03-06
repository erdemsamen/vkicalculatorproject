package hafta1;

import java.util.Scanner;

public class vkicalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        double boy = scanner.nextDouble();
        // Boyunu gösterir

        System.out.println("Lütfen kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();
        // Kilosunu gösterir

        double vki = kilo / (boy * boy);
        // Vücut kitle indeksini gösterir

        System.out.println("Vücut Kitle İndeksiniz: " + vki);
        scanner.close();


    }
}
