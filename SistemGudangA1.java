import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SistemGudangA1 {

  public static void login() {
    System.out.println("=================SISTEM GUDANG A1====================");
    System.out.println("|          SELAMAT DATANG DI GUDANG A1              |");
    System.out.println("|        MASUKKAN USERNAME DAN PIN ANDA             |");
    System.out.println("=====================================================");
  }

  public static Scanner print = new Scanner(System.in);
  public static int pilihan;

  public static void tampilMenu() {
    System.out.println("====================Menu Utama=======================");
    System.out.println("| \t 1. RAK SEMBAKO                             |");
    System.out.println("| \t 2. RAK KOSMETIK                            |");
    System.out.println("| \t 3. RAK PAKAIAN                             |");
    System.out.println("=====================================================");
    System.out.print("Pilih Rak : ");
    pilihan = print.nextInt();
  }

  public static void tampilItem(){
     LocalDate tanggalHariIni = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDate tanggalKadaluwarsa = tanggalHariIni.plusMonths(6);
    String formatTanggalKadaluwarsa = tanggalKadaluwarsa.format(formatter);
    // inisiasi data utama
    String[] rakSembako = { "beras", "gula", "garam", "telur", "minyak" };
    String[] rakKosmetik = {
      "facewash",
      "toner",
      "serum",
      "sunscreen",
      "lipcream",
    };
    String[] rakPakaian = { "kaos", "kemeja", "rok", "celana jeans", "jaket" };
    int stok, jmlMasuk, jmlKeluar, harga;
 System.out.print("Pilih item");
    if (pilihan == 1) {
      for (int i = 0; i < rakSembako.length; i++) {
        String element = rakSembako[i];
        System.out.println("" + (i + 1) + " " + element);
      }
      //pemilihan item
      int pilSembako = print.nextInt();
      if (pilSembako == 1) {
        //perhitungan stok
        System.out.println("===============================================");
        System.out.println("\t INVENTARIS BERAS");
        System.out.print("Tambahan Beras : ");
        jmlMasuk = print.nextInt();
        stok = 34;
        stok = tambahStok(stok, jmlMasuk);
        System.out.print("Pengambilan Beras : ");
        jmlKeluar = print.nextInt();
        stok = kurangStok(stok, jmlKeluar);

        // jika pengambilan barang minus
        /*   if (stok<0) {
                    System.out.print("Stok tidak mencukupi, Apakah anda ingin mengulangi pengambilan(y/n) : ");
                    String konfir = print.nextLine();
                    if(konfir.equalsIgnoreCase("y")){
                        kurangStok(pilSembako, jmlKeluar);    
                    }else if(konfir.equalsIgnoreCase("n")){
                        System.out.println("terimakasih");
                        return;
                    }
                }*/
        //perhitungan valuasi item
        // System.out.print("Masukkan harga");
        // harga = print.nextInt();
        // hitungValuasi(harga, pilSembako);
        System.out.println("Tanggal hari ini:" + tanggalHariIni);
        System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
        tampilMenu();
        tampilItem();
      } else if (pilSembako == 2) {
        //perhitungan stok
        System.out.println("===============================================");
        System.out.println("\t INVENTARIS Gula");
        System.out.print("Tambahan Gula : ");
        jmlMasuk = print.nextInt();
        stok = 34;
        tambahStok(stok, jmlMasuk);
        System.out.print("Pengambilan Gula : ");
        jmlKeluar = print.nextInt();
        kurangStok(pilSembako, jmlKeluar);
        // jika pengambilan barang minus
        if (kurangStok(pilihan, jmlKeluar) < 0) {
          System.out.print(
            "Stok tidak mencukupi, Apakah anda ingin mengulangi pengambilan(y/n) : "
          );
          String konfir = print.nextLine();
          if (konfir.equalsIgnoreCase("y")) {
            kurangStok(pilSembako, jmlKeluar);
          } else if (konfir.equalsIgnoreCase("n")) {
            System.out.println("terimakasih");
            return;
          }
        }
        //perhitungan valuasi item
        System.out.print("Masukkan harga");
        harga = print.nextInt();
        hitungValuasi(harga, pilSembako);
        System.out.println("Tanggal hari ini:" + tanggalHariIni);
        System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
      } else if (pilSembako == 3) {
        //perhitungan stok
        System.out.println("===============================================");
        System.out.println("\t INVENTARIS GARAM");
        System.out.print("Tambahan Garam : ");
        jmlMasuk = print.nextInt();
        stok = 34;
        tambahStok(stok, jmlMasuk);
        System.out.print("Pengambilan Garam : ");
        jmlKeluar = print.nextInt();
        kurangStok(pilSembako, jmlKeluar);
        // jika pengambilan barang minus
        if (kurangStok(pilihan, jmlKeluar) < 0) {
          System.out.print(
            "Stok tidak mencukupi, Apakah anda ingin mengulangi pengambilan(y/n) : "
          );
          String konfir = print.nextLine();
          if (konfir.equalsIgnoreCase("y")) {
            kurangStok(pilSembako, jmlKeluar);
          } else if (konfir.equalsIgnoreCase("n")) {
            System.out.println("terimakasih");
            return;
          }
        }
        //perhitungan valuasi item
        System.out.print("Masukkan harga");
        harga = print.nextInt();
        hitungValuasi(harga, pilSembako);
        System.out.println("Tanggal hari ini:" + tanggalHariIni);
        System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
      } else if (pilSembako == 4) {
        //perhitungan stok
        System.out.println("===============================================");
        System.out.println("\t INVENTARIS Telur");
        System.out.print("Tambahan Telur : ");
        jmlMasuk = print.nextInt();
        stok = 34;
        tambahStok(stok, jmlMasuk);
        System.out.print("Pengambilan Telur : ");
        jmlKeluar = print.nextInt();
        kurangStok(pilSembako, jmlKeluar);
        // jika pengambilan barang minus
        if (kurangStok(pilihan, jmlKeluar) < 0) {
          System.out.print(
            "Stok tidak mencukupi, Apakah anda ingin mengulangi pengambilan(y/n) : "
          );
          String konfir = print.nextLine();
          if (konfir.equalsIgnoreCase("y")) {
            kurangStok(pilSembako, jmlKeluar);
          } else if (konfir.equalsIgnoreCase("n")) {
            System.out.println("terimakasih");
            return;
          }
        }
        //perhitungan valuasi item
        System.out.print("Masukkan harga");
        harga = print.nextInt();
        hitungValuasi(harga, pilSembako);
        System.out.println("Tanggal hari ini:" + tanggalHariIni);
        System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
      } else if (pilSembako == 5) {
        //perhitungan stok
        System.out.println("===============================================");
        System.out.println("\t INVENTARIS Minyak");
        System.out.print("Tambahan Minyak : ");
        jmlMasuk = print.nextInt();
        stok = 34;
        tambahStok(stok, jmlMasuk);
        System.out.print("Pengambilan Minyak : ");
        jmlKeluar = print.nextInt();
        kurangStok(pilSembako, jmlKeluar);
        // jika pengambilan barang minus
        if (kurangStok(pilihan, jmlKeluar) < 0) {
          System.out.print(
            "Stok tidak mencukupi, Apakah anda ingin mengulangi pengambilan(y/n) : "
          );
          String konfir = print.nextLine();
          if (konfir.equalsIgnoreCase("y")) {
            kurangStok(pilSembako, jmlKeluar);
          } else if (konfir.equalsIgnoreCase("n")) {
            System.out.println("terimakasih");
            return;
          }
        }
        //perhitungan valuasi item
        System.out.print("Masukkan harga");
        harga = print.nextInt();
        hitungValuasi(harga, pilSembako);
        System.out.println("Tanggal hari ini:" + tanggalHariIni);
        System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
      }
    } else if (pilihan == 2) {
      for (int i = 0; i < rakKosmetik.length; i++) {
        String element = rakKosmetik[i];
        System.out.println("" + (i + 1) + " " + element);
      }
      //pemilihan item
      int pilKosmetik = print.nextInt();
      if (pilKosmetik == 1) {
        //perhitungan stok
        System.out.println("===============================================");
        System.out.println("\t INVENTARIS FACEWASH");
        System.out.print("Tambahan Facewash : ");
        jmlMasuk = print.nextInt();
        stok = 34;
        tambahStok(stok, jmlMasuk);
        System.out.print("Pengambilan Facewash : ");
        jmlKeluar = print.nextInt();
        kurangStok(pilKosmetik, jmlKeluar);
        // jika pengambilan barang minus
        if (kurangStok(pilihan, jmlKeluar) < 0) {
          System.out.print(
            "Stok tidak mencukupi, Apakah anda ingin mengulangi pengambilan(y/n) : "
          );
          String konfir = print.nextLine();
          if (konfir.equalsIgnoreCase("y")) {
            kurangStok(pilKosmetik, jmlKeluar);
          } else if (konfir.equalsIgnoreCase("n")) {
            System.out.println("terimakasih");
            return;
          }
        }
        //perhitungan valuasi item
        System.out.print("Masukkan harga");
        harga = print.nextInt();
        hitungValuasi(harga, pilKosmetik);
        System.out.println("Tanggal hari ini:" + tanggalHariIni);
        System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
      } else if (pilKosmetik == 2) {
        //perhitungan stok
        System.out.println("===============================================");
        System.out.println("\t INVENTARIS Toner");
        System.out.print("Tambahan Toner : ");
        jmlMasuk = print.nextInt();
        stok = 34;
        tambahStok(stok, jmlMasuk);
        System.out.print("Pengambilan Toner : ");
        jmlKeluar = print.nextInt();
        kurangStok(pilKosmetik, jmlKeluar);
        // jika pengambilan barang minus
        if (kurangStok(pilihan, jmlKeluar) < 0) {
          System.out.print(
            "Stok tidak mencukupi, Apakah anda ingin mengulangi pengambilan(y/n) : "
          );
          String konfir = print.nextLine();
          if (konfir.equalsIgnoreCase("y")) {
            kurangStok(pilKosmetik, jmlKeluar);
          } else if (konfir.equalsIgnoreCase("n")) {
            System.out.println("terimakasih");
            return;
          }
        }
        //perhitungan valuasi item
        System.out.print("Masukkan harga");
        harga = print.nextInt();
        hitungValuasi(harga, pilKosmetik);
        System.out.println("Tanggal hari ini:" + tanggalHariIni);
        System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
      } else if (pilKosmetik == 3) {
        //perhitungan stok
        System.out.println("===============================================");
        System.out.println("\t INVENTARIS Serum");
        System.out.print("Tambahan Serum : ");
        jmlMasuk = print.nextInt();
        stok = 34;
        tambahStok(stok, jmlMasuk);
        System.out.print("Pengambilan Serum : ");
        jmlKeluar = print.nextInt();
        kurangStok(pilKosmetik, jmlKeluar);
        // jika pengambilan barang minus
        if (kurangStok(pilihan, jmlKeluar) < 0) {
          System.out.print(
            "Stok tidak mencukupi, Apakah anda ingin mengulangi pengambilan(y/n) : "
          );
          String konfir = print.nextLine();
          if (konfir.equalsIgnoreCase("y")) {
            kurangStok(pilKosmetik, jmlKeluar);
          } else if (konfir.equalsIgnoreCase("n")) {
            System.out.println("terimakasih");
            return;
          }
        }
        //perhitungan valuasi item
        System.out.print("Masukkan harga");
        harga = print.nextInt();
        hitungValuasi(harga, pilKosmetik);
        System.out.println("Tanggal hari ini:" + tanggalHariIni);
        System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
      } else if (pilKosmetik == 4) {
        //perhitungan stok
        System.out.println("===============================================");
        System.out.println("\t INVENTARIS Sunscreen");
        System.out.print("Tambahan Sunscreen : ");
        jmlMasuk = print.nextInt();
        stok = 34;
        tambahStok(stok, jmlMasuk);
        System.out.print("Pengambilan Sunscreen : ");
        jmlKeluar = print.nextInt();
        kurangStok(pilKosmetik, jmlKeluar);
        // jika pengambilan barang minus
        if (kurangStok(pilihan, jmlKeluar) < 0) {
          System.out.print(
            "Stok tidak mencukupi, Apakah anda ingin mengulangi pengambilan(y/n) : "
          );
          String konfir = print.nextLine();
          if (konfir.equalsIgnoreCase("y")) {
            kurangStok(pilKosmetik, jmlKeluar);
          } else if (konfir.equalsIgnoreCase("n")) {
            System.out.println("terimakasih");
            return;
          }
        }
        //perhitungan valuasi item
        System.out.print("Masukkan harga");
        harga = print.nextInt();
        hitungValuasi(harga, pilKosmetik);
        System.out.println("Tanggal hari ini:" + tanggalHariIni);
        System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
      } else if (pilKosmetik == 5) {
        //perhitungan stok
        System.out.println("===============================================");
        System.out.println("\t INVENTARIS Lipcream");
        System.out.print("Tambahan Lipcream : ");
        jmlMasuk = print.nextInt();
        stok = 34;
        tambahStok(stok, jmlMasuk);
        System.out.print("Pengambilan Lipcream : ");
        jmlKeluar = print.nextInt();
        kurangStok(pilKosmetik, jmlKeluar);
        // jika pengambilan barang minus
        if (kurangStok(pilihan, jmlKeluar) < 0) {
          System.out.print(
            "Stok tidak mencukupi, Apakah anda ingin mengulangi pengambilan(y/n) : "
          );
          String konfir = print.nextLine();
          if (konfir.equalsIgnoreCase("y")) {
            kurangStok(pilKosmetik, jmlKeluar);
          } else if (konfir.equalsIgnoreCase("n")) {
            System.out.println("terimakasih");
            return;
          }
        }
        //perhitungan valuasi item
        System.out.print("Masukkan harga");
        harga = print.nextInt();
        hitungValuasi(harga, pilKosmetik);
        System.out.println("Tanggal hari ini:" + tanggalHariIni);
        System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
      }
    } else if (pilihan == 3) {
      for (int i = 0; i < rakPakaian.length; i++) {
        String element = rakPakaian[i];
        System.out.println("" + (i + 1) + " " + element);
      }
      //pemilihan item
      int pilPakaian = print.nextInt();
      if (pilPakaian == 1) {
        //perhitungan stok
        System.out.println("===============================================");
        System.out.println("\t INVENTARIS FACEWASH");
        System.out.print("Tambahan Facewash : ");
        jmlMasuk = print.nextInt();
        stok = 34;
        tambahStok(stok, jmlMasuk);
        System.out.print("Pengambilan Facewash : ");
        jmlKeluar = print.nextInt();
        kurangStok(pilPakaian, jmlKeluar);
        // jika pengambilan barang minus
        if (kurangStok(pilihan, jmlKeluar) < 0) {
          System.out.print(
            "Stok tidak mencukupi, Apakah anda ingin mengulangi pengambilan(y/n) : "
          );
          String konfir = print.nextLine();
          if (konfir.equalsIgnoreCase("y")) {
            kurangStok(pilPakaian, jmlKeluar);
          } else if (konfir.equalsIgnoreCase("n")) {
            System.out.println("terimakasih");
            return;
          }
        }
        //perhitungan valuasi item
        System.out.print("Masukkan harga");
        harga = print.nextInt();
        hitungValuasi(harga, pilPakaian);
        System.out.println("Tanggal hari ini:" + tanggalHariIni);
        System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
      } else if (pilPakaian == 2) {
        //perhitungan stok
        System.out.println("===============================================");
        System.out.println("\t INVENTARIS FACEWASH");
        System.out.print("Tambahan Facewash : ");
        jmlMasuk = print.nextInt();
        stok = 34;
        tambahStok(stok, jmlMasuk);
        System.out.print("Pengambilan Facewash : ");
        jmlKeluar = print.nextInt();
        kurangStok(pilPakaian, jmlKeluar);
        // jika pengambilan barang minus
        if (kurangStok(pilihan, jmlKeluar) < 0) {
          System.out.print(
            "Stok tidak mencukupi, Apakah anda ingin mengulangi pengambilan(y/n) : "
          );
          String konfir = print.nextLine();
          if (konfir.equalsIgnoreCase("y")) {
            kurangStok(pilPakaian, jmlKeluar);
          } else if (konfir.equalsIgnoreCase("n")) {
            System.out.println("terimakasih");
            return;
          }
        }
        //perhitungan valuasi item
        System.out.print("Masukkan harga");
        harga = print.nextInt();
        hitungValuasi(harga, pilPakaian);
        System.out.println("Tanggal hari ini:" + tanggalHariIni);
        System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
      } else if (pilPakaian == 3) {
        //perhitungan stok
        System.out.println("===============================================");
        System.out.println("\t INVENTARIS FACEWASH");
        System.out.print("Tambahan Facewash : ");
        jmlMasuk = print.nextInt();
        stok = 34;
        tambahStok(stok, jmlMasuk);
        System.out.print("Pengambilan Facewash : ");
        jmlKeluar = print.nextInt();
        kurangStok(pilPakaian, jmlKeluar);
        // jika pengambilan barang minus
        if (kurangStok(pilihan, jmlKeluar) < 0) {
          System.out.print(
            "Stok tidak mencukupi, Apakah anda ingin mengulangi pengambilan(y/n) : "
          );
          String konfir = print.nextLine();
          if (konfir.equalsIgnoreCase("y")) {
            kurangStok(pilPakaian, jmlKeluar);
          } else if (konfir.equalsIgnoreCase("n")) {
            System.out.println("terimakasih");
            return;
          }
        }
        //perhitungan valuasi item
        System.out.print("Masukkan harga");
        harga = print.nextInt();
        hitungValuasi(harga, pilPakaian);
        System.out.println("Tanggal hari ini:" + tanggalHariIni);
        System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
      } else if (pilPakaian == 4) {
        //perhitungan stok
        System.out.println("===============================================");
        System.out.println("\t INVENTARIS FACEWASH");
        System.out.print("Tambahan Facewash : ");
        jmlMasuk = print.nextInt();
        stok = 34;
        tambahStok(stok, jmlMasuk);
        System.out.print("Pengambilan Facewash : ");
        jmlKeluar = print.nextInt();
        kurangStok(pilPakaian, jmlKeluar);
        // jika pengambilan barang minus
        if (kurangStok(pilihan, jmlKeluar) < 0) {
          System.out.print(
            "Stok tidak mencukupi, Apakah anda ingin mengulangi pengambilan(y/n) : "
          );
          String konfir = print.nextLine();
          if (konfir.equalsIgnoreCase("y")) {
            kurangStok(pilPakaian, jmlKeluar);
          } else if (konfir.equalsIgnoreCase("n")) {
            System.out.println("terimakasih");
            return;
          }
        }
        //perhitungan valuasi item
        System.out.print("Masukkan harga");
        harga = print.nextInt();
        hitungValuasi(harga, pilPakaian);
        System.out.println("Tanggal hari ini:" + tanggalHariIni);
        System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
      } else if (pilPakaian == 5) {
        //perhitungan stok
        System.out.println("===============================================");
        System.out.println("\t INVENTARIS FACEWASH");
        System.out.print("Tambahan Facewash : ");
        jmlMasuk = print.nextInt();
        stok = 34;
        tambahStok(stok, jmlMasuk);
        System.out.print("Pengambilan Facewash : ");
        jmlKeluar = print.nextInt();
        kurangStok(pilPakaian, jmlKeluar);
        // jika pengambilan barang minus
        if (kurangStok(pilihan, jmlKeluar) < 0) {
          System.out.print(
            "Stok tidak mencukupi, Apakah anda ingin mengulangi pengambilan(y/n) : "
          );
          String konfir = print.nextLine();
          if (konfir.equalsIgnoreCase("y")) {
            kurangStok(pilPakaian, jmlKeluar);
          } else if (konfir.equalsIgnoreCase("n")) {
            System.out.println("terimakasih");
            return;
          }
        }
        //perhitungan valuasi item
        System.out.print("Masukkan harga");
        harga = print.nextInt();
        hitungValuasi(harga, pilPakaian);
        System.out.println("Tanggal hari ini:" + tanggalHariIni);
        System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
      }
    }
    print.close();
  }


  public static void main(String[] args) {
    Scanner print = new Scanner(System.in);
    login();
    // percobaan login
    int maksPercobaan = 3;
    for (int i = 1; i <= maksPercobaan; i++) {
      System.out.print("Username : ");
      // String usnLogin = print.nextLine();
      String usnLogin = "admin";
      System.out.print("PIN : ");
      // String pinLogin = print.nextLine();
      String pinLogin = "gudang123";
      // cek usn dan pin
      if (
        usnLogin.equalsIgnoreCase("admin") &&
        pinLogin.equalsIgnoreCase("gudang123")
      ) {
        System.out.println("Login Berhasil");
        break;
      } else if (
        usnLogin.equalsIgnoreCase("owner") && pinLogin.equalsIgnoreCase("11924")
      ) {
        System.out.println("Login Berhasil sebagai Owner");
        break;
      } else {
        System.out.println(
          "Login Gagal. Sisa percobaan : " + (maksPercobaan - i)
        );
        if (i == maksPercobaan) {
          System.out.println(
            "Anda telah mencapai batas percobaan. Akun diblokir"
          );
          return;
        }
      }
    }



    tampilMenu();
    tampilItem();
    // pemilihan rak
  }
   

  static int tambahStok(int stok, int jmlMasuk) {
    int hasil = stok + jmlMasuk;
    System.out.println("Jumlah stok saat ini adalah : " + hasil);
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
}
