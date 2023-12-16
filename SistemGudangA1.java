import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SistemGudangA1 {

  static String[][] rakSembako;
  static String[][] rakKosmetik;
  static String[][] rakPakaian;
  // static int[][] stokBarang;
  // static int[] stokSembako;
  // static int[] stokKosmetik;
  // static int[] stokPakain;
  static int stok;
  static int stokBarang;
  static int stokBaru;
  static int harga;
  static int valuasi;
  static int totalVal;
  static int jmlMasuk;
  static int b;
  static int jumlah;
  static int pilihItem;

  public static void Title() {
    System.out.println("=================SISTEM GUDANG A1====================");
    System.out.println("|          SELAMAT DATANG DI GUDANG A1              |");
    System.out.println("|        MASUKKAN USERNAME DAN PIN ANDA             |");
    System.out.println("=====================================================");
  }

  public static Scanner print = new Scanner(System.in);
  public static int pilihan;

  public static void main(String[] args) {
    Title();
    // percobaan login
    login();
    // tampilMenu();

    boolean Exit = true;
    int choose = 0;

    while (choose != 5) {
      tampilMenu();
      switch (pilihan) {
        case 1:
          tampilItemSembako();
          break;
        case 2:
          tampilItemKosmetik();
        case 3:
          tampilItemPakaian();
        default:
          break;
      }
      System.out.println("==============================");
      System.out.println("|     TAMPIL FITUR GUDANG    |");
      System.out.println("==============================");
      System.out.println("|   1. Tambah Stok           |");
      System.out.println("|   2. Kurang Stok           |");
      System.out.println("|   3. Hitung Valuasi        |");
      System.out.println("|   4. Surat Jalan           |");
      System.out.println("|   5. Exit                  |");
      System.out.println("==============================");
      System.out.print("Pilih menu : ");
      choose = print.nextInt();
      System.out.println("------------------------------");
      System.out.println();
      System.out.println();
      switch (choose) {
        case 1:
          tambahStok();
          break;
        case 2:
          kurangStok();
          break;
        case 3:
          hitungValuasi();
          break;
        case 4:
          suratjalan();
        case 5:
          System.out.println(
              "~~~~~~~~~~~~~~~~~~~Keluaaaarrrrrr~~~~~~~~~~~~~~~~~~");
          Exit = true;
          break;
      }
    }
  }

  public static void tampilMenu() {
    System.out.println("====================Menu Utama=======================");
    System.out.println("| \t 1. RAK SEMBAKO                             |");
    System.out.println("| \t 2. RAK KOSMETIK                            |");
    System.out.println("| \t 3. RAK PAKAIAN                             |");
    System.out.println("=====================================================");
    System.out.print(" Pilih Rak : ");
    pilihan = print.nextInt();
    System.out.println("=====================================================");
  }

  public static void tampilItem() {
    LocalDate tanggalHariIni = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDate tanggalKadaluwarsa = tanggalHariIni.plusMonths(6);
    String formatTanggalKadaluwarsa = tanggalKadaluwarsa.format(formatter);
    System.out.println();
    System.out.println("====================Pilih Item=======================");
  }

  static void login() {
    int maksPercobaan = 3;
    for (int i = 1; i <= maksPercobaan; i++) {
      System.out.print(" Username : ");
      // String usnLogin = print.nextLine();
      String usnLogin = "admin";
      System.out.print(" PIN      : ");
      // String pinLogin = print.nextLine();
      String pinLogin = "gudang123";
      // cek usn dan pin
      if (usnLogin.equalsIgnoreCase("admin") &&
          pinLogin.equalsIgnoreCase("gudang123")) {
        System.out.println(
            "=====================================================");
        System.out.println("| Login Berhasil sebagai Admin        |");
        System.out.println(
            "=====================================================");
        System.out.println();
        break;
      } else if (usnLogin.equalsIgnoreCase("owner") && pinLogin.equalsIgnoreCase("11924")) {
        System.out.println("Login Berhasil sebagai Owner");
        break;
      } else {
        System.out.println(
            "=====================================================");
        System.out.println(
            "| Login Gagal. Sisa percobaan : " + (maksPercobaan - i) + " |");
        System.out.println(
            "=====================================================");
        if (i == maksPercobaan) {
          System.out.println(
              "| Anda telah mencapai batas percobaan. Akun diblokir |");
          System.out.println(
              "=====================================================");
          return;
        }
      }
    }
  }

  static int tambahStok() {
    System.out.println(stok);
    if (stok == 0) {
      System.out.print("Masukkan stok : ");
      stok = print.nextInt();
      System.out.print("Mau nambah stok (y/n): ");
      String ulang = print.next();
      if (ulang.equalsIgnoreCase("y")) {
        System.out.print("Masukkan tambahan jumlah: ");
        jmlMasuk = print.nextInt();
        stokBaru = stok + jmlMasuk;
        stok += jmlMasuk;
        System.out.println(" jumlah stok saat ini adalah : " + stokBaru);
      } else {
        stokBaru = stok + jmlMasuk;
        stok += jmlMasuk;
        System.out.println(" jumlah stok saat ini adalah : " + stokBaru);
      }
    } else {
      System.out.print("Masukkan tambahan jumlah: ");
      jmlMasuk = print.nextInt();
      stokBaru = stok + jmlMasuk;
      stok += jmlMasuk;
      System.out.println(" jumlah stok saat ini adalah : " + stokBaru);
    }

    return stokBaru;
  }

  static int kurangStok() {
    int a = stokBaru;
    int stokBarang = 0;
    System.out.println(a);
    System.out.print("Masukkan jumlah pengambilan : ");
    int b = print.nextInt();
    if (b > a) {
      System.err.println("Stok tidak cukup");
      // stokBarang = stokBaru;
    } else if (a > b) {
      stokBarang = a - b;
      a -= b;
      // stok = stokBaru;
      System.out.println("jumlah stok saat ini: " + stokBarang);
      System.out.print("Mau mengambil stok lagi (y/n): ");
      String ulang = print.next();
      if (ulang.equalsIgnoreCase("y")) {
        System.out.print("Masukkan jumlah pengambilan : ");
        b = print.nextInt();
        stokBarang = a - b;
        a -= b;
        System.out.println("jumlah stok saat ini: " + stokBarang);
      } else {
        System.out.println(
            "~~~~~~~~~~~~~~~~~~~~~Keluaaaarrrrrr~~~~~~~~~~~~~~~~~~~~");
        System.exit(0);
      }
      System.out.println("jumlah stok saat ini adalah : " + stokBarang);
    }
    return stokBarang;
  }

  static int hitungValuasi() {
    int jumlah = pilihItem;
    int totalValuasi = 0;
    switch (pilihItem) {
      case 1:
        tampilItemSembako();
        for (int i = pilihItem; i < rakSembako.length; i++) {
          int harga = Integer.parseInt(rakSembako[1][i]);
          jumlah = Integer.parseInt(rakSembako[2][i]);
          totalValuasi = harga * jumlah;
        }
        System.out.println(harga + " x " + jumlah + " = " + totalValuasi);
        break;
      case 2:
        tampilItemKosmetik();
        for (int i = pilihItem; i < rakKosmetik.length; i++) {
          int harga = Integer.parseInt(rakKosmetik[1][i]);
          jumlah = Integer.parseInt(rakKosmetik[2][i]);
          System.out.println(harga + " x " + jumlah);

          totalValuasi = harga * jumlah;
        }
        break;
      case 3:
        tampilItemPakaian();
        for (int i = pilihItem; i < rakPakaian.length; i++) {
          int harga = Integer.parseInt(rakPakaian[1][i]);
          jumlah = Integer.parseInt(rakPakaian[2][i]);
          System.out.println(harga + " x " + jumlah);

          totalValuasi = harga * jumlah;
        }
        break;
      default:
        break;
    }
    System.out.println("Valuasi barang : " + totalValuasi);
    return totalValuasi;

  }

  static {
    print = new Scanner(System.in);
    int pilihItem;
    rakSembako = new String[][] {
        { "", "beras", "garam", "gula", "telur", "minyak" },
        { "0", "12000", "5000", "8000", "27000", "30000" },
        { "0", "45", "76", "67", "56", "44" }
    };
    rakKosmetik = new String[][] {
        { "", "facewash", "toner", "serum", "sunsreen", "lipcream" },
        { "0", "35000", "25000", "60000", "45000", "40000" },
        { "0", "24", "34", "43", "37", "49" }
    };
    rakPakaian = new String[][] {
        { "", "kaos", "kemeja", "rok", "celana jeans", "jaket" },
        { "0", "60000", "80000", "50000", "120000", "150000" },
        { "0", "57", "66", "41", "77", "79  " }
    };
  }

  static void tampilItemSembako() {
    System.out.println("==============================");
    System.out.println("|     TAMPIL ITEM SEMBAKO    |");
    System.out.println("==============================");
    System.out.println("|   1. Beras                 |");
    System.out.println("|   2. Garam                 |");
    System.out.println("|   3. Gula                  |");
    System.out.println("|   4. Telur                 |");
    System.out.println("|   5. Minyak                |");
    System.out.println("==============================");
    System.out.print("| Pilih barang : ");
    pilihItem = print.nextInt();
  }

  static void tampilItemKosmetik() {
    System.out.println("==============================");
    System.out.println("|     TAMPIL ITEM KOSMETIK    |");
    System.out.println("==============================");
    System.out.println("|   1. Facewash               |");
    System.out.println("|   2. Toner                  |");
    System.out.println("|   3. Serum                  |");
    System.out.println("|   4. Sunscreen              |");
    System.out.println("|   5. Lipcream                |");
    System.out.println("==============================");
    pilihItem = print.nextInt();
  }

  static void tampilItemPakaian() {
    System.out.println("==============================");
    System.out.println("|     TAMPIL ITEM PAKAIAN    |");
    System.out.println("==============================");
    System.out.println("|   1. Kaos                   |");
    System.out.println("|   2. Kemeja                 |");
    System.out.println("|   3. Rok                    |");
    System.out.println("|   4. Celana Jeans           |");
    System.out.println("|   5. Jaket                  |");
    System.out.println("==============================");
    pilihItem = print.nextInt();
  }

  static void suratjalan() {
    int jenisBarang, jumlahBarang;
    System.out.println("Masukkan nama barang: ");
    jenisBarang = print.nextInt();
    System.out.print("Masukkan jumlah barang: ");
    jumlahBarang = print.nextInt();
    print.close();
    System.out.println("==============================");
    System.out.println("|     SURAT JALAN BARANG     |");
    System.out.println("==============================");
    System.out.println("|   Nama Barang: " + (jenisBarang));
    System.out.println("|   jumlah Barang: " + jumlahBarang);
    System.out.println("==============================");
    System.exit(0);
  }
}
