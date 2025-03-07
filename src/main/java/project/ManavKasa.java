package project;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double armutfiyat = 2.14 ;
        double elmafiyat = 3.67 ;
        double domatesfiyat = 1.11 ;
        double muzfiyat = 0.95 ;
        double patlicanfiyat = 5.00 ;
        // Ürünlerin fiyatlarını gösterir

        System.out.println("Armut Kaç Kilo ? : ");
        double armutkg = scanner.nextDouble();

        System.out.println("Elma Kaç Kilo ? : ");
        double elmakg = scanner.nextDouble();

        System.out.println("Domates Kaç Kilo ? : ");
        double domateskg = scanner.nextDouble();

        System.out.println("Muz Kaç Kilo ? : ");
        double muzkg = scanner.nextDouble();

        System.out.println("Patlıcan Kaç Kilo ? : ");
        double patlicankg = scanner.nextDouble();
        // Ürünlerin kaç kilo alındığını gösterir

        double toplamtutar = (armutfiyat * armutkg) + (elmafiyat * elmakg) + (domatesfiyat * domateskg) +
                (muzfiyat * muzkg) + (patlicanfiyat * patlicankg);
        // Ürünlerin toplam tutarını gösterir

        System.out.println("Toplam Tutar : " + toplamtutar);

        scanner.close();

       }

    }
