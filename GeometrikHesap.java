/*
 * Ad Soyad: [Binnur Aslan]
 * Ogrenci No: [250541084]
 * Tarih: [06.11.2025]
 * Aciklama: Gorev 2 - Geometrik Hesap Sistemi
 * 
 * Bu program kullanicidan yaricap bilgisi alir 
 * geometrik hesaplamalar yaptirir ve ekrana yazdirir.

   import java.util.Scanner;

  void main() {
    Scanner input = new Scanner(System.in);
      final double PI = 3.14159;

      System.out.println("=== GEOMETRIK HESAPLAYICI ===");
      System.out.print("Dairenin yaricapini girin (cm): ");
      double r = input.nextDouble();

      double daireAlani = PI * Math.pow(r, 2);
      double daireCevresi = 2 * PI * r;
      double daireCapi = 2 * r;
      double kureHacmi = (4.0 / 3.0) * PI * Math.pow(r, 3);
      double kureYuzeyAlani = 4 * PI * Math.pow(r, 2);

      System.out.println("\nSONUCLAR:");
      System.out.println("----------");
      System.out.printf("%-20s: %.2f cm²%n", "Daire Alani", daireAlani);
      System.out.printf("%-20s: %.2f cm%n", "Daire Cevresi", daireCevresi);
      System.out.printf("%-20s: %.2f cm%n", "Daire Capi", daireCapi);
      System.out.printf("%-20s: %.2f cm³%n", "Kure Hacmi", kureHacmi);
      System.out.printf("%-20s: %.2f cm²%n", "Kure Yuzey Alani", kureYuzeyAlani);

      input.close();
  }
