import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UAS {
   static Scanner sc;
   static String[] Film;
   static String[] Day;
   static String[] jam;
   static String[] Food;
   static int[] priceFood;
   static int pilihFilm;
   static int pilihDay;
   static int pilihJam;
   static int pilihFood;
   static int brpFood;
   static int brpOrang;
   static int hargaFilm;
   static int hargaFood;
   static int total;
   static int tunai;
   static double pocerTotal;
   static double uang;
   static double uang1;
   static String voucher;
   static List<String> pilihKursi;

   public static void main(String[] args) {
      int choose = 0;

      while(choose != 7) {
         System.out.println("==============================");
         System.out.println("|     Kasir Book My Tiket    |");
         System.out.println("==============================");
         System.out.println("|   1. Pesan Tiket\t\t\t |");
         System.out.println("|   2. Pesan Makanan\t\t |");
         System.out.println("|   3. Stok Tiket\t\t\t |");
         System.out.println("|   4. Voucher\t\t\t     |");
         System.out.println("|   5. Pembayaran\t\t\t |");
         System.out.println("|   6. Cetak Tiket\t\t\t |");
         System.out.println("|   7. Keluar\t\t\t\t |");
         System.out.println("==============================");
         System.out.print("Pilih menu : ");
         choose = Integer.parseInt(sc.nextLine());
         System.out.println("------------------------------");
         System.out.println();
         System.out.println();
         switch(choose) {
         case 1:
            pesanTiket();
            break;
         case 2:
            pesanFood();
            break;
         case 3:
            stokTiket();
            break;
         case 4:
            Voucher();
            break;
         case 5:
            payment();
            break;
         case 6:
            printTiket();
            break;
         case 7:
            System.out.println("~~~~~~~~~~~~~~~~~~~\n~~~Keluaaaaarrrr~~~\n~~~~~~~~~~~~~~~~~~~");
         }
      }

   }

   static void pesanTiket() {
      System.out.println("==============================");
      System.out.println("|\t\t  Daftar film\t\t |");
      System.out.println("==============================");
      System.out.println("|    0. Keluar\t\t\t\t |");

      int k;
      for(k = 1; k < 10; ++k) {
         System.out.printf("|    %d. %-21s|\n", k, Film[k]);
      }

      System.out.println("==============================");
      System.out.print("Pilih Film : ");
      pilihFilm = Integer.parseInt(sc.nextLine());
      System.out.println("------------------------------");
      System.out.println("");
      System.out.println();
      if (pilihFilm != 0) {
         System.out.println("==============================");
         System.out.println("|\t\t   List Hari   \t\t |");
         System.out.println("==============================");

         for(k = 1; k < 8; ++k) {
            System.out.printf("|    %d. %-21s|\n", k, Day[k]);
         }

         System.out.println("==============================");
         System.out.print("Pilih hari : ");
         pilihDay = Integer.parseInt(sc.nextLine());
         System.out.println("------------------------------");
         System.out.println();
         System.out.println();
         System.out.println("==============================");
         System.out.println("|\t   Daftar jam tayang\t |");
         System.out.println("==============================");

         for(k = 1; k < 5; ++k) {
            System.out.printf("|    %d. %-21s|\n", k, jam[k]);
         }

         System.out.println("==============================");
         System.out.print("Pilih jam tayang : ");
         pilihJam = Integer.parseInt(sc.nextLine());
         System.out.println("------------------------------");
         System.out.println();
         System.out.println();
         System.out.println("==============================");
         System.out.print("Masukkan jumlah Orang : ");
         brpOrang = Integer.parseInt(sc.nextLine());
         System.out.println("        ------------          ");

         for(k = 0; k < brpOrang; ++k) {
            System.out.print("Pilih kursi : ");
            pilihKursi.add(sc.nextLine());
         }

         System.out.println("==============================");
         System.out.println();
         System.out.println();
      }
   }

   static int PaymentFilm() {
      if (pilihDay != 1 && pilihDay != 2 && pilihDay != 3 && pilihDay != 4) {
         if (pilihDay == 5) {
            hargaFilm = 40000;
         } else if (pilihDay == 6 || pilihDay == 7) {
            hargaFilm = 45000;
         }
      } else {
         hargaFilm = 35000;
      }

      return hargaFilm *= brpOrang;
   }

   static void pesanFood() {
      System.out.println("===================================");
      System.out.println("|            Daftar Menu          |");
      System.out.println("===================================");
      System.out.println("| 0. Keluar\t\t\t\t\t\t  |");

      for(int i = 1; i < 7; ++i) {
         System.out.printf("| %d. %-20sRp %d |\n", i, Food[i], priceFood[i]);
      }

      System.out.println("===================================");
      System.out.print("Pilih Menu : ");
      pilihFood = Integer.parseInt(sc.nextLine());
      if (pilihFood == 0) {
         System.out.println();
         System.out.println();
      } else {
         System.out.println("            ------------          ");
         System.out.print("Beli : ");
         brpFood = Integer.parseInt(sc.nextLine());
         System.out.println("===================================");
         System.out.println();
         System.out.println();
      }
   }

   static int PaymentFood() {
      if (pilihFood == 1) {
         hargaFood = 15000 * brpFood;
      } else if (pilihFood == 2) {
         hargaFood = 20000 * brpFood;
      } else if (pilihFood == 3) {
         hargaFood = 25000 * brpFood;
      } else if (pilihFood == 4) {
         hargaFood = 25000 * brpFood;
      } else if (pilihFood == 5) {
         hargaFood = 10000 * brpFood;
      } else if (pilihFood == 6) {
         hargaFood = 30000 * brpFood;
      }

      return hargaFood;
   }

   static void stokTiket() {
      System.out.println("=================================");
      System.out.println("|             STOK              |");
      System.out.println("=================================");
      int stokTiket = 150;
      System.out.println("| Stok Sekarang     : " + stokTiket + "       |");
      int stokTerjual = brpOrang;
      System.out.println("| Stok Terjual      : " + stokTerjual + "         |");
      System.out.println("---------------------------------");
      int stokTersisa = stokTiket - stokTerjual;
      System.out.println("| Stok Tersisa      : " + stokTersisa + "       |");
      System.out.println("=================================");
      System.out.println();
      System.out.println();
   }

   static void Voucher() {
      System.out.println();
      System.out.println("--------------------------------------------------------");
      System.out.println("+                      Daftar Voucher                  +");
      System.out.println("--------------------------------------------------------");
      System.out.println("| Senin - Kamis                                        |");
      System.out.println("| Masukkan WEEKDAYS untuk potongan total pembelian 25% |");
      System.out.println("|                    ------------------                |");
      System.out.println("| Jum'at                                               |");
      System.out.println("| Masukkan JUMAT untuk potongan total pembelian 45%    |");
      System.out.println("|                    ------------------                |");
      System.out.println("| Sabtu - Minggu                                       |");
      System.out.println("| Masukkan WEEKEND untuk potongan total pembelian 75%  |");
      System.out.println("--------------------------------------------------------");
      System.out.println();
      System.out.print("Masukkan Kode Voucher : ");
      voucher = sc.nextLine();
      System.out.println();
   }

   static double pocer() {
      if (voucher.equals("WEEKDAYS")) {
         pocerTotal = (double)bayarTotal() * 0.25D;
      } else if (voucher.equals("JUMAT")) {
         pocerTotal = (double)bayarTotal() * 0.45D;
      } else if (voucher.equals("WEEKEND")) {
         pocerTotal = (double)bayarTotal() * 0.75D;
      } else {
         pocerTotal = 0.0D;
      }

      return pocerTotal;
   }

   static void payment() {
      System.out.println("=================================");
      System.out.println("|        MENU   PEMBAYARAN      |");
      System.out.println("=================================");
      System.out.println();
      System.out.println();
      GregorianCalendar date = new GregorianCalendar();
      int hari = date.get(5);
      int bulan = date.get(2) + 1;
      int tahun = date.get(1);
      int detik = date.get(13);
      int menit = date.get(12);
      int jam = date.get(11);
      System.out.println("=================================");
      System.out.println("|              NOTA             |");
      System.out.println("=================================");
      System.out.println("| Tanggal : " + hari + "-" + bulan + "-" + tahun + "          |");
      System.out.printf("| Jam     : %02d:%02d:%02d            |\n", jam, menit, detik);
      System.out.println("---------------------------------");
      System.out.printf("| %-14s x %d Rp. %d |\n", Film[pilihFilm], brpOrang, PaymentFilm());
      System.out.printf("| %-14s x %d Rp. %d  |\n", Food[pilihFood], brpFood, PaymentFood());
      System.out.println("---------------------------------");
      System.out.printf("\t\tHarga Total  Rp. %d\n", bayarTotal());
      System.out.printf("\t\tDiskon       Rp. %.1f\n", pocer());
      System.out.println("---------------------------------");
      System.out.print("\t\tTunai        Rp. ");
      tunai = Integer.parseInt(sc.nextLine());
      System.out.printf("\t\tKembalian    Rp. %.1f\n", sisa());
      System.out.println("=================================");
      System.out.println();
   }

   static int bayarTotal() {
      total = PaymentFilm() + PaymentFood();
      return total;
   }

   static double sisa() {
      uang = (double)tunai - ((double)bayarTotal() - pocer());
      return uang;
   }

   static void printTiket() {
      System.out.println("===============================");
      System.out.println("|                             |");
      System.out.println("|              CVG            |");
      System.out.println("|                             |");
      System.out.println("===============================");
      System.out.printf("| Nama Film : %-15s |\n", Film[pilihFilm]);
      System.out.printf("| Hari      : %-15s |\n", Day[pilihDay]);
      System.out.printf("| Jam       : %-15s |\n", jam[pilihJam]);
      System.out.print("| Kursi     : ");
      Iterator var0 = pilihKursi.iterator();

      while(var0.hasNext()) {
         String kursi = (String)var0.next();
         System.out.print(kursi + " ");
      }

      System.out.println("       |");
      System.out.println("-------------------------------");
      System.out.println("|       Total Harga : " + totalHargaTiket() + "|");
      System.out.println("-------------------------------");
      System.out.print("| NO. TIKET : ");

      for(int i = 0; i < 10; ++i) {
         char nomorTiket = (char)((int)(48.0D + Math.random() * 10.0D));
         System.out.print(nomorTiket);
      }

      System.out.print("      |");
      System.out.println();
      System.out.println("===============================");
      System.out.println();
   }

   static double totalHargaTiket() {
      uang1 = (double)bayarTotal() - pocer();
      return uang1;
   }

   static {
      sc = new Scanner(System.in);
      Film = new String[]{"", "Frozen", "Frozen 2", "Pocong", "Pocong 2", "Dilan 1990", "Milea", "Danur", "Kafir", "Yowis Ben"};
      Day = new String[]{"", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
      jam = new String[]{"", "09.00-11.30", "12.00-14.30", "15.00-17.30", "18.00-20.30"};
      Food = new String[]{"", "Kentang Goreng", "Hot Dog", "Nasi Goreng", "Soto", "Mie Spesial", "Mie Nyemek"};
      priceFood = new int[]{0, 15000, 20000, 25000, 25000, 10000, 30000, 22000};
      pilihFilm = 0;
      pilihDay = 0;
      pilihJam = 0;
      pilihFood = 0;
      brpFood = 0;
      brpOrang = 0;
      hargaFilm = 0;
      hargaFood = 0;
      total = 0;
      tunai = 0;
      pocerTotal = 0.0D;
      uang = 0.0D;
      uang1 = 0.0D;
      voucher = "";
      pilihKursi = new ArrayList();
   }
}

