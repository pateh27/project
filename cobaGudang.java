import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class cobaGudang {
    Scanner yo = new Scanner(System.in);
     private static final String usnBenar ="admin", pinBenar ="gudang123";
     
        
     public static void main(String[] args) {

        System.out.println("=================SISTEM GUDANG=======================");
        System.out.println("|               SELAMAT DATANG                      |");
        System.out.println("|        MASUKKAN USERNAME DAN PIN ANDA             |");
        System.out.println("=====================================================");

        Scanner input = new Scanner(System.in);
        int maksPercobaan = 3;

        for (int i = 1; i <= maksPercobaan; i++) {
            System.out.print("Username : ");
            String usnBenar = input.nextLine();
            System.out.print("PIN : ");
            String pinBenar = input.nextLine();

            if (usnBenar.equalsIgnoreCase("admin") && pinBenar.equalsIgnoreCase("gudang123")) {
                System.out.println("Login Berhasil");
                break;
            } else {
                System.out.println("Login Gagal. Sisa percobaan : " +(maksPercobaan - i));

                if ( i == maksPercobaan) {
                    System.out.println("Anda telah mencapai batas percobaan. Akun diblokir");
                    return;
                }
            }
        }

        Scanner print = new Scanner(System.in);
        int maksLoop = 3, chanceLoop = 3;

        LocalDate tanggalHariIni = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate tanggalKadaluwarsa = tanggalHariIni.plusMonths(6);

        String formatTanggalKadaluwarsa = tanggalKadaluwarsa.format(formatter);


        String[] rakSembako = {"beras", "gula", "telur", "minyak", "kopi", "teh", "kecap", "garam", "mie"};
        String[] rakKosmetik = {"facewash", "toner", "serum", "sunscreen", "lipcream", "liptint", "body serum"};
        String[] rakPakaian = {"kaos", "kemeja", "rok", "celana jeans", "jaket", "hoodie", "sweater", "cardigan"};
        int totStok1, totStok2, totStok3;
        int stokBeras = 10, stokGula = 8, stokTelur = 13, stokMinyak = 17, stokKopi = 4, stokTeh = 9, stokKecap = 5, stokGaram = 10, stokMie = 20;
        int stokFacewash = 9, stoktoner = 7, stokSerum = 8, stokSunscreen = 12, stokLipcream = 15, stokLiptint = 18, stokBodyserum=11; 
        int stokKaos = 10, stokKemeja = 9, stokRok = 8, stokCelanaJeans = 12, stokJaket = 15, stokHoodie = 13, stokSweater = 20, stokCardigan = 10;
        int valBeras, valGula, valTelur, valMinyak, valKopi,valteh, valKecap, valGaram, valMie;
        int valFacewash, valToner, valSerum, valSunscren, valLipcream, valLiptint, valBodyser;
        int hargaBeras, hargaGula, hargaTelur, hargaMinyak, hargaKopi, hargaTeh, hargaKecap, hargaGaram, hargaMie;
        int valKaos, valKemeja, valRok, valCelanaJeans, valJaket, valHoodie, valSweater, valCardigan;
        int jmlMasuk, jmlKeluar, pilihan,pilKosmetik, pilSembako, pilPakaain, harga2, harga3;

        System.out.println("====================Menu Utama=======================");
        System.out.println("| \t 1. RAK SEMBAKO                             |");
        System.out.println("| \t 2. RAK KOSMETIK                            |");
        System.out.println("| \t 3. RAK PAKAIAN                             |");
        System.out.println("=====================================================");
        System.out.print("Pilih Rak : ");
        pilihan = yo.nextInt();

        public static void tampilItem() {
    LocalDate tanggalHariIni = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDate tanggalKadaluwarsa = tanggalHariIni.plusMonths(6);
    String formatTanggalKadaluwarsa = tanggalKadaluwarsa.format(formatter);
    // inisiasi data utama
    /*String[] rakSembako = { "beras", "gula", "garam", "telur", "minyak" };
    String[] rakKosmetik = {
      "facewash",
      "toner",
      "serum",
      "sunscreen",
      "lipcream",
    };
    String[] rakPakaian = { "kaos", "kemeja", "rok", "celana jeans", "jaket" };*/
    int stok, jmlMasuk, jmlKeluar, harga;
    System.out.println();
    System.out.println("====================Pilih Item=======================");

    if (pilihan == 1) {
      for (int i = 0; i < rakSembako.length; i++) {
        String element = rakSembako[i];
        System.out.println("| " + (i + 1) + ". " + element + "\t\t\t\t\t    |");
      }
      System.out.println(
        "====================================================="
      );
      System.out.print(" Pilih Item : ");
      int pilSembako = print.nextInt();
      System.out.println(
        "====================================================="
      );

      //pemilihan item
      if (pilSembako == 1) {
        //perhitungan stok
        System.out.println();

        System.out.println(
          "====================================================="
        );
        System.out.println("|\t            Invetaris Beras        \t    |");
        System.out.println(
          "====================================================="
        );

        System.out.print(" Tambahan Beras : ");
        jmlMasuk = print.nextInt();
        stok = 34;
        stok = tambahStok(stok, jmlMasuk);
        System.out.println(
          "-------------------------------------------------------"
        );
        System.out.print("Pengambilan Beras : ");
        jmlKeluar = print.nextInt();
        stok = kurangStok(stok, jmlKeluar);
        System.out.println(
          "-------------------------------------------------------"
        );
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
        if (kurangStok(stok, jmlKeluar) < 0) {
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
        if (kurangStok(stok, jmlKeluar) < 0) {
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
        if (kurangStok(stok, jmlKeluar) < 0) {
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
        if (kurangStok(stok, jmlKeluar) < 0) {
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
        if (kurangStok(stok, jmlKeluar) < 0) {
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
        if (kurangStok(stok, jmlKeluar) < 0) {
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
        if (kurangStok(stok, jmlKeluar) < 0) {
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
        if (kurangStok(stok, jmlKeluar) < 0) {
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
        if (kurangStok(stok, jmlKeluar) < 0) {
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
        kurangStok(stok, jmlKeluar);
        // jika pengambilan barang minus
        if (kurangStok(stok, jmlKeluar) < 0) {
          System.out.print(
            "Stok tidak mencukupi, Apakah anda ingin mengulangi pengambilan(y/n) : "
          );
          String konfir = print.nextLine();
          if (konfir.equalsIgnoreCase("y")) {
            kurangStok(stok, jmlKeluar);
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
        kurangStok(stok, jmlKeluar);
        // jika pengambilan barang minus
        if (kurangStok(stok, jmlKeluar) < 0) {
          System.out.print(
            "Stok tidak mencukupi, Apakah anda ingin mengulangi pengambilan(y/n) : "
          );
          String konfir = print.nextLine();
          if (konfir.equalsIgnoreCase("y")) {
            kurangStok(stok, jmlKeluar);
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
        kurangStok(stok, jmlKeluar);
        // jika pengambilan barang minus
        if (kurangStok(stok, jmlKeluar) < 0) {
          System.out.print(
            "Stok tidak mencukupi, Apakah anda ingin mengulangi pengambilan(y/n) : "
          );
          String konfir = print.nextLine();
          if (konfir.equalsIgnoreCase("y")) {
            kurangStok(stok, jmlKeluar);
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
        kurangStok(stok, jmlKeluar);
        // jika pengambilan barang minus
        if (kurangStok(stok, jmlKeluar) < 0) {
          System.out.print(
            "Stok tidak mencukupi, Apakah anda ingin mengulangi pengambilan(y/n) : "
          );
          String konfir = print.nextLine();
          if (konfir.equalsIgnoreCase("y")) {
            kurangStok(stok, jmlKeluar);
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
        kurangStok(stok, jmlKeluar);
        // jika pengambilan barang minus
        if (kurangStok(stok, jmlKeluar) < 0) {
          System.out.print(
            "Stok tidak mencukupi, Apakah anda ingin mengulangi pengambilan(y/n) : "
          );
          String konfir = print.nextLine();
          if (konfir.equalsIgnoreCase("y")) {
            kurangStok(stok, jmlKeluar);
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