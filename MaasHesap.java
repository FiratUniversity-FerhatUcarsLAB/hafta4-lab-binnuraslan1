/*
 * Ad Soyad: [Binnur Aslan]
 * Ogrenci No: [250541084]
 * Tarih: [06.11.2025]
 * Aciklama: Gorev 3 - Maas Hesap Sistemi
 * 
 * Bu program kullanicidan ad,soyad,aylik brut maas,haftalik calisma saati,mesaai saati sayisi bilgilerini alir ve
 * gerekli hesaplamalar yapip duzenli bir formatta ekrana yazdirir.

   import java.util.Scanner;

    void main() {
        Scanner input = new Scanner(System.in);

        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;
        final int AYLIK_STANDART_SAAT = 160;
        final double MESAİ_KATSAYISI = 1.5;
        final int IS_GUNU = 22;


        System.out.println("=== MAAS HESAPLAMA SISTEMI ===");
        System.out.print("Calisanin Ad Soyad: ");
        String adSoyad = input.nextLine();

        input.useLocale(Locale.US);
        System.out.print("Aylik Brut Maas (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalik Calisma Saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai Saati Sayisi: ");
        int mesaiSaati = input.nextInt();


        double mesaiUcreti = (brutMaas / AYLIK_STANDART_SAAT) * mesaiSaati * MESAİ_KATSAYISI;
        double toplamGelir = brutMaas + mesaiUcreti;

        double sgkKesinti = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgkKesinti + gelirVergisi + damgaVergisi;

        double netMaas = toplamGelir - toplamKesinti;

        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / (AYLIK_STANDART_SAAT + mesaiSaati);
        double gunlukNetKazanc = netMaas / IS_GUNU;


        System.out.println("\n===================================");
        System.out.println("          MAAS BORDROSU");
        System.out.println("===================================");
        System.out.printf("Calisan           : %s%n", adSoyad);
        System.out.printf("Brut Maas         : %,.2f TL%n", brutMaas);
        System.out.printf("Mesai Saati       : %d saat%n", mesaiSaati);
        System.out.printf("Mesai Ucreti      : %,.2f TL%n", mesaiUcreti);
        System.out.println("-----------------------------------");
        System.out.printf("Toplam Gelir      : %,.2f TL%n", toplamGelir);
        System.out.println("-----------------------------------");
        System.out.printf("SGK Kesintisi (%%14.0)       : %,.2f TL%n", sgkKesinti);
        System.out.printf("Gelir Vergisi (%%15.0)       : %,.2f TL%n", gelirVergisi);
        System.out.printf("Damga Vergisi (%%0.8)        : %,.2f TL%n", damgaVergisi);
        System.out.println("-----------------------------------");
        System.out.printf("Toplam Kesinti    : %,.2f TL%n", toplamKesinti);
        System.out.printf("Net Maas          : %,.2f TL%n", netMaas);
        System.out.println("-----------------------------------");
        System.out.printf("Kesinti Orani     : %.1f%%%n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanc: %,.2f TL%n", saatlikNetKazanc);
        System.out.printf("Gunluk Net Kazanc : %,.2f TL%n", gunlukNetKazanc);
        System.out.println("===================================");

        input.close();
    }
