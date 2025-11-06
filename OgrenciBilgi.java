/*
 * Ad Soyad: [Binnur Aslan]
 * Ogrenci No: [250541084]
 * Tarih: [06.11.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.

     import java.util.Scanner;

        void main() {
            Scanner input = new Scanner(System.in);

            System.out.print("Ad: ");
            String ad = input.nextLine();

            System.out.print("Soyad: ");
            String soyad = input.nextLine();

            System.out.print("Ogrenci No: ");
            int ogrNo = input.nextInt();

            System.out.print("Yas: ");
            int yas = input.nextInt();

            input.useLocale(Locale.US);
            System.out.print("GPA (0.00 - 4.00): ");
            double gpa = input.nextDouble();

            String durum = (gpa >= 2.0) ? "Basarili Ogrenci" : "Basarisiz Ogrenci";

            System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
            System.out.println("Ad Soyad: " + ad + " " + soyad);
            System.out.println("Ogrenci No: " + ogrNo);
            System.out.println("Yas: " + yas);
            System.out.println("GPA: " + String.format("%.2f", gpa));
            System.out.println("Durum: " + durum);

            input.close();
        }

