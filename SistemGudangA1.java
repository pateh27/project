import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SistemGudangA1 {

  static String[] rakSembako;
  static String[] rakKosmetik;
  static String[] rakPakaian;
  static int[][] stokBarang;
  // static int[] stokSembako;
  // static int[] stokKosmetik;
  // static int[] stokPakain;
  static int stok;
  static int stokBaru;
  static int harga;
  static int valuasi;
  static int totalVal;
  static int jmlMasuk;
  static int jmlKeluar;

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
      System.out.println("==============================");
      System.out.println("|     TAMPIL FITUR GUDANG    |");
      System.out.println("==============================");
      System.out.println("|   1. Tambah Stok\t\t|");
      System.out.println("|   2. Kurang Stok\t\t|");
      System.out.println("|   3. Hitung Valuasi\t\t|");
      System.out.println("|   4. Surat Jalan\t\t|");
      System.out.println("|   5. Exit\t\t|");
      System.out.println("==============================");
      System.out.print("Pilih menu : ");
      choose = print.nextInt();
      System.out.println("------------------------------");
      System.out.println();
      System.out.println();
      switch (choose) {
        case 1:
          tambahStok(stok, jmlMasuk);
          break;
        case 2:
          kurangStok(stokBaru);
          break;
        case 3:
          hitungValuasi(stokBaru, harga);
          break;
        case 4:
          suratjalan();
        case 5:
          System.out.println(
            "~~~~~~~~~~~~~~~~~~~\n~~~Keluaaaarrrrrr~~~\n~~~~~~~~~~~~~~~~~~"
          );
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
      if (
        usnLogin.equalsIgnoreCase("admin") &&
        pinLogin.equalsIgnoreCase("gudang123")
      ) {
        System.out.println(
          "====================================================="
        );
        System.out.println("| Login Berhasil sebagai Admin \t\t\t   |");
        System.out.println(
          "====================================================="
        );
        System.out.println();
        break;
      } else if (
        usnLogin.equalsIgnoreCase("owner") && pinLogin.equalsIgnoreCase("11924")
      ) {
        System.out.println("Login Berhasil sebagai Owner");
        break;
      } else {
        System.out.println(
          "====================================================="
        );
        System.out.println(
          "| Login Gagal. Sisa percobaan : " + (maksPercobaan - i) + "\t\t|"
        );
        System.out.println(
          "====================================================="
        );
        if (i == maksPercobaan) {
          System.out.println(
            "| Anda telah mencapai batas percobaan. Akun diblokir|"
          );
          System.out.println(
            "====================================================="
          );
          return;
        }
      }
    }
  }

  static int tambahStok(int stok, int jmlMasuk) {
    System.out.print("Masukkan stok saat ini: ");
    stok = print.nextInt();
    System.out.print("Masukkan tambahan jumlah: ");
    jmlMasuk = print.nextInt();
    stokBaru = stok + jmlMasuk;
    System.out.println(" Jumlah stok saat ini adalah : " + stokBaru);
    return stokBaru;
  }

  static int kurangStok(int a) {
    System.out.println(a);
    // Scanner print = new Scanner(System.in);
    // System.out.print("Pengambilan Stok : ");
    // int jmlKeluar = print.nextInt();
    // int kurang = tambahStok(a, b) - jmlKeluar;
    int stokBaru = 0;
    // String ulang = ;
    // if (a > b) {
    System.out.print("Masukkan jumlah pengambilan : ");
    int b = print.nextInt();
    if (b > a) {
      System.err.println("Stok tidak cukup");
      stokBaru = a;
    } else {
      stokBaru = a - b;
      System.out.println("Jumlah stok saat ini: " + stokBaru);
    }
    // stokBaru = a - b;
    // System.out.println("Jumlah stok saat ini: "+stokBaru);
    // stokBaru = a - b;
    // System.out.println("Jumlah stok saat ini: "+stokBaru);
    // } else {
    System.out.print("Silahkan mengulang (y/n): ");
    String ulang = print.next();
    if (ulang.equalsIgnoreCase("y")) {
      System.out.print("Masukkan jumlah pengambilan : ");
      b = print.nextInt();
      stokBaru = a - b;
      System.out.println("Jumlah stok saat ini: " + stokBaru);
    } else {
      System.out.println(
        "~~~~~~~~~~~~~~~~~~~\n~~~Keluaaaarrrrrr~~~\n~~~~~~~~~~~~~~~~~~"
      );
      // }
      //else{
      //System.err.println("Inputan anda tidak valid!!!!");
      //}
    }
    System.out.println("Jumlah stok saat ini adalah : " + stokBaru);
    return stokBaru;
  }

  static int hitungValuasi(int harga, int angka) {
    System.out.print("Masukkan harga barang: ");
    harga = print.nextInt();
    int val = stokBaru * harga;
    System.out.println("Valuasi : " + val);
    return val;
  }

  static {
    print = new Scanner(System.in);
    int pilihan;
    rakSembako =
      new String[] { "", "beras", "garam", "gula", "telur", "minyak" };
    // stokSembako = new int[]{0, 45, 30, 40, 60, 50};
    rakKosmetik =
      new String[] { "", "facewash", "toner", "serum", "sunsreen", "lipcream" };
    // stokKosmetik = new int[]{0,50, 27, 30, 45, 41};
    rakPakaian =
      new String[] { "", "kaos", "kemeja", "rok", "celana jeans", "jaket" };
    // stokPakaian = new int[]{0, 37, 45, 67, 34, 54};
  }

  static void tampilItemSembako() {
    System.out.println("==============================");
    System.out.println("|     TAMPIL ITEM SEMBAKO    |");
    System.out.println("==============================");
    System.out.println("|   1. Beras\t\t\t|");
    System.out.println("|   2. Garam\t\t\t|");
    System.out.println("|   3. Gula\t\t\t|");
    System.out.println("|   4. Telur\t\t\t|");
    System.out.println("|   5. Minyak\t\t\t|");
    System.out.println("==============================");
    System.out.print("| Pilih barang : ");
    pilihan = print.nextInt();
  }

  static void tampilItemKosmetik() {
    System.out.println("==============================");
    System.out.println("|     TAMPIL ITEM KOSMETIK    |");
    System.out.println("==============================");
    System.out.println("|   1. Facewash\t\t\t|");
    System.out.println("|   2. Toner\t\t\t|");
    System.out.println("|   3. Serum\t\t\t|");
    System.out.println("|   4. Sunscreen\t\t\t|");
    System.out.println("|   5. Lipcream\t\t\t|");
    System.out.println("==============================");
    pilihan = print.nextInt();
  }

  static void tampilItemPakaian() {
    System.out.println("==============================");
    System.out.println("|     TAMPIL ITEM PAKAIAN    |");
    System.out.println("==============================");
    System.out.println("|   1. Kaos\t\t\t|");
    System.out.println("|   2. Kemeja\t\t\t|");
    System.out.println("|   3. Rok\t\t\t|");
    System.out.println("|   4. Celana Jeans\t\t\t|");
    System.out.println("|   5. Jaket\t\t\t|");
    System.out.println("==============================");
  }

  static void suratjalan() {
    int jenisBarang, jumlahBarang;
    jenisBarang = print.nextInt();
    System.out.print("Masukkan jumlah barang: ");
    jumlahBarang = print.nextInt();
    print.close();
    System.out.println("==============================");
    System.out.println("|     SURAT JALAN BARANG     |");
    System.out.println("==============================");
    System.out.println("|   Nama Barang: " + (jenisBarang));
    System.out.println("|   Jumlah Barang: " + jumlahBarang);
    System.out.println("==============================");
    System.exit(0);
  }
}
