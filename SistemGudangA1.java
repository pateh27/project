import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SistemGudangA1 {
  static String[] rakSembako;
  static String[] rakKosmetik;
  static String[] rakPakaian;
  static int stok;
  static int stokBaru;
  static int harga;
  static int valuasi;
  static int totalVal;
  static int jmlMasuk;
  static int jmlKeluar;
  static int hasil;
  static int jamMasuk;
  static int jamKeluar;

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
    tampilMenu();
      switch(pilihan) {
      case 1:
        tampilItemSembako();
        System.out.println();
        System.out.println("====================Pilih Item=======================");
        features();
        break;
      case 2:
        tampilItemKosmetik();
        System.out.println();
        System.out.println("====================Pilih Item=======================");
        features();
        break;
      case 3:
        tampilItemPakaian();
        System.out.println();
        System.out.println("====================Pilih Item=======================");
        features();
        break;
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
      String usnLogin = print.nextLine();
      //   String usnLogin = "admin";
      System.out.print(" PIN      : ");
      String pinLogin = print.nextLine();
      //   String pinLogin = "gudang123";
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
    int hasil = stok + jmlMasuk;
    System.out.println(" Jumlah stok saat ini adalah : " + hasil);
    return hasil;
  }

  static int kurangStok(int a, int b) {
    //Scanner print = new Scanner(System.in);
    //System.out.print("Pengambilan Stok : ");
    //int jmlKeluar = print.nextInt();
    // int kurang = tambahStok(a, b) - jmlKeluar;
    int stokBaru = 0;
    if (a > b) {
      stokBaru = a - b;
    } else {
      System.out.println("Stok tidak cukup");
      stokBaru = a;
    }

    System.out.println("Jumlah stok saat ini adalah : " + stokBaru);
    return stokBaru;
  }

  static int hitungValuasi(int harga, int angka) {
    int val = harga * kurangStok(angka, angka);
    System.out.println("Valuasi : " + val);
    return val;
  }
  static {
    print = new Scanner(System.in);
    int pilihan;
    String rakSembako [] =
      {"beras", "garam", "gula","telur","minyak"};
    String rakKosmetik[] = 
      {"facewash","toner","serum","sunsreen","lipcream"};
    String rakPakaian[] =
      {"kaos","kemeja","rok","celana jeans","jaket"};
  } 
  static void tampilItemSembako(){
    System.out.println("==============================");
    System.out.println("|     TAMPIL ITEM SEMBAKO    |");
    System.out.println("==============================");
    System.out.println("|   1. Beras\t\t\t|");
    System.out.println("|   2. Garam\t\t\t|");
    System.out.println("|   3. Gula\t\t\t|");
    System.out.println("|   4. Telur\t\t\t|");
    System.out.println("|   5. Minyak\t\t\t|");
    System.out.println("==============================");
  }
  static void tampilItemKosmetik(){
    System.out.println("==============================");
    System.out.println("|     TAMPIL ITEM KOSMETIK    |");
    System.out.println("==============================");
    System.out.println("|   1. Facewash\t\t\t|");
    System.out.println("|   2. Toner\t\t\t|");
    System.out.println("|   3. Serum\t\t\t|");
    System.out.println("|   4. Sunscreen\t\t\t|");
    System.out.println("|   5. Lipcream\t\t\t|");
    System.out.println("==============================");
  }
  static void tampilItemPakaian(){
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
  static void features(){
    System.out.println("==============================");
    System.out.println("|     TAMPIL FITUR GUDANG    |");
    System.out.println("==============================");
    System.out.println("|   1. Tambah Stok\t\t|");
    System.out.println("|   2. Kurang Stok\t\t|");
    System.out.println("|   3. Hitung Valuasi\t\t|");
    System.out.println("|   4. Surat Jalan\t\t|");
    System.out.println("|   5. Exit\t\t|");
    System.out.println("==============================");
  }
}
