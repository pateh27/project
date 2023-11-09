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

        Scanner yo = new Scanner(System.in);
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
        System.out.println("Pilih Rak : ");
        pilihan = yo.nextInt();

        if (pilihan == 1) {
            System.out.println("======================================================");
            for (int i=0; i<rakSembako.length; i++) {
                String element = rakSembako[i];
                System.out.println("" + (i+1) + " " +element);}
                System.out.println("Masukkan input list barang :");
                pilSembako = yo.nextInt();
                if (pilSembako == 1) {
                    System.out.println("Tambahan Beras");
                    jmlMasuk = yo.nextInt();
                    totStok1 = stokBeras+jmlMasuk;
                    System.out.println("Stok beras = "+stokBeras+" + "+jmlMasuk+" = "+totStok1);
                    System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokBeras = totStok1 - jmlKeluar;
                    System.out.println("jumlah barang saat ini :"+ stokBeras);
                    System.out.println("Masukkan Harga barang ");
                    hargaBeras = yo.nextInt();
                    valBeras = hargaBeras * stokBeras;
                    System.out.println("Valuasi : " +valBeras);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
                else if (pilSembako == 2) {
                    System.out.println("Tambahan Gula");
                    jmlMasuk = yo.nextInt();
                    totStok1 = stokGula+jmlMasuk;
                    System.out.println("Stok Gula = "+stokGula+" + "+jmlMasuk+" = "+totStok1);
                    System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokGula = totStok1 - jmlKeluar;
                    System.out.println("jumlah barang saat ini :"+ stokGula);
                    System.out.println("Masukkan Harga barang ");
                    hargaGula = yo.nextInt();
                    valGula = hargaGula * stokBeras;
                    System.out.println("Valuasi : " +valGula);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
                else if (pilSembako == 3) {
                    System.out.println("Tambahan Telur");
                    jmlMasuk = yo.nextInt();
                    totStok1 = stokTelur+jmlMasuk;
                    System.out.println("Stok Telur= "+stokTelur+" + "+jmlMasuk+" = "+totStok1);
                    System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokTelur = totStok1 - jmlKeluar;
                    System.out.println("jumlah barang saat ini :"+ stokTelur);
                    System.out.println("Masukkan Harga barang ");
                    hargaTelur = yo.nextInt();
                    valTelur = hargaTelur * stokBeras;
                    System.out.println("Valuasi : " +valTelur);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
                else if (pilSembako == 4) {
                    System.out.println("Tambahan Minyak");
                    jmlMasuk = yo.nextInt();
                    totStok1 = stokMinyak+jmlMasuk;
                    System.out.println("Stok Minyak= "+stokMinyak+" + "+jmlMasuk+" = "+totStok1);
                    System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokMinyak = totStok1 - jmlKeluar;
                    System.out.println("jumlah barang saat ini :"+ stokMinyak);
                    System.out.println("Masukkan Harga barang ");
                    hargaMinyak = yo.nextInt();
                    valMinyak = hargaMinyak * stokBeras;
                    System.out.println("Valuasi : " +valMinyak);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
                else if (pilSembako == 5) {
                    System.out.println("Tambahan Kopi");
                    jmlMasuk = yo.nextInt();
                    totStok1 = stokKopi+jmlMasuk;
                    System.out.println("Stok Kopi= "+stokKopi+" + "+jmlMasuk+" = "+totStok1);
                    System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokKopi = totStok1 - jmlKeluar;
                    System.out.println("jumlah barang saat ini :"+ stokKopi);
                    System.out.println("Masukkan Harga barang ");
                    hargaKopi = yo.nextInt();
                    valKopi = hargaKopi * stokBeras;
                    System.out.println("Valuasi : " +valKopi);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
                else if (pilSembako == 6) {
                    System.out.println("Tambahan Teh");
                    jmlMasuk = yo.nextInt();
                    totStok1 = stokTeh+jmlMasuk;
                    System.out.println("Stok Teh= "+stokTeh+" + "+jmlMasuk+" = "+totStok1);
                    System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokTeh = totStok1 - jmlKeluar;
                    System.out.println("jumlah barang saat ini :"+ stokTeh);
                    System.out.println("Masukkan Harga barang ");
                    hargaTeh = yo.nextInt();
                    valteh = hargaTeh * stokBeras;
                    System.out.println("Valuasi : " +valteh);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
                else if (pilSembako == 7) {
                    System.out.println("Tambahan Kecap");
                    jmlMasuk = yo.nextInt();
                    totStok1 = stokKecap+jmlMasuk;
                    System.out.println("Stok Kecap= "+stokKecap+" + "+jmlMasuk+" = "+totStok1);
                    System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokKecap = totStok1 - jmlKeluar;
                    System.out.println("jumlah barang saat ini :"+ stokKecap);
                    System.out.println("Masukkan Harga barang ");
                    hargaKecap = yo.nextInt();
                    valKecap = hargaKecap * stokBeras;
                    System.out.println("Valuasi : " +valKecap);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
                else if (pilSembako == 8) {
                    System.out.println("Tambahan Garam");
                    jmlMasuk = yo.nextInt();
                    totStok1 = stokGaram+jmlMasuk;
                    System.out.println("Stok Garam= "+stokGaram+" + "+jmlMasuk+" = "+totStok1);
                    System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokGaram = totStok1 - jmlKeluar;
                    System.out.println("jumlah barang saat ini :"+ stokGaram);
                    System.out.println("Masukkan Harga barang ");
                    hargaGaram = yo.nextInt();
                    valGaram = hargaGaram * stokBeras;
                    System.out.println("Valuasi : " +valGaram);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
                else if (pilSembako == 9) {
                    System.out.println("Tambahan Mie");
                    jmlMasuk = yo.nextInt();
                    totStok1 = stokMie+jmlMasuk;
                    System.out.println("Stok Mie= "+stokMie+" + "+jmlMasuk+" = "+totStok1);
                    System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokMie = totStok1 - jmlKeluar;
                    System.out.println("jumlah barang saat ini :"+ stokMie);
                    System.out.println("Masukkan Harga barang ");
                    hargaMie = yo.nextInt();
                    valMie = hargaMie * stokBeras;
                    System.out.println("Valuasi : " +valMie);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
            
        }else if(pilihan == 2){
            System.out.println("======================================================");
            for(int i=0; i<rakKosmetik.length; i++){
                String element = rakKosmetik[i];
                System.out.println("" + (i+1) + " " +element);}
                System.out.print("Masukkan input list barang :");
                pilKosmetik = yo.nextInt();
                if (pilKosmetik == 1) {
                    System.out.print("Tambahkan Facewash :" );
                    jmlMasuk = yo.nextInt();
                    totStok2 = stokFacewash+jmlMasuk;
                    System.out.println("Stok toner = "+stokFacewash+" + "+jmlMasuk+" = "+totStok2);
                     System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokFacewash = totStok2 - jmlKeluar;
                    System.out.println("jumlah barang saat ini :"+ stokFacewash);
                    System.out.println("Masukkan Harga barang ");
                    harga2 = yo.nextInt();
                    valFacewash = harga2 * stokFacewash;
                    System.out.println("Valuasi : " +valFacewash);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
                else if (pilKosmetik == 2) {
                    System.out.print("Tambahkan toner :" );
                    jmlMasuk = yo.nextInt();
                    totStok2 = stoktoner+jmlMasuk;
                    System.out.println("Stok toner = "+stoktoner+" + "+jmlMasuk+" = "+totStok2);
                     System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stoktoner = totStok2 - jmlKeluar;
                    System.out.println("jumlah barang saat ini :"+ stoktoner);
                    System.out.println("Masukkan Harga barang ");
                    harga2 = yo.nextInt();
                    valToner = harga2 * stoktoner;
                    System.out.println("Valuasi : " +valToner);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
                else if (pilKosmetik == 3) {
                    System.out.print("Tambahkan Serum :" );
                    jmlMasuk = yo.nextInt();
                    totStok2 = stokSerum+jmlMasuk;
                    System.out.println("Stok toner = "+stokSerum+" + "+jmlMasuk+" = "+totStok2);
                     System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokSerum = totStok2 - jmlKeluar;
                    System.out.println("jumlah barang saat ini :"+ stokSerum);
                    System.out.println("Masukkan Harga barang ");
                    harga2 = yo.nextInt();
                    valSerum = harga2 * stokSerum;
                    System.out.println("Valuasi : " +valSerum);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
                else if (pilKosmetik == 4) {
                    System.out.print("Tambahkan Sunscreen :" );
                    jmlMasuk = yo.nextInt();
                    totStok2 = stokSunscreen +jmlMasuk;
                    System.out.println("Stok Sunscreen = "+stokSunscreen+" + "+jmlMasuk+" = "+totStok2);
                     System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokSunscreen = totStok2 - jmlKeluar;
                    System.out.println("jumlah barang saat ini :"+ stokSunscreen);
                    System.out.println("Masukkan Harga barang ");
                    harga2 = yo.nextInt();
                    valSunscren = harga2 * stokSunscreen;
                    System.out.println("Valuasi : " +valSunscren);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
                 else if (pilKosmetik == 5) {
                    System.out.print("Tambahkan lipcream :" );
                    jmlMasuk = yo.nextInt();
                    totStok2 = stokLipcream+jmlMasuk;
                    System.out.println("Stok Lipcream = "+stokLipcream+" + "+jmlMasuk+" = "+totStok2);
                     System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokLipcream = totStok2 - jmlKeluar;
                    System.out.println("jumlah barang saat ini :"+ stokLipcream);
                    System.out.println("Masukkan Harga barang ");
                    harga2 = yo.nextInt();
                    valLipcream = harga2 * stokLipcream;
                    System.out.println("Valuasi : " +valLipcream);System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
                 else if (pilKosmetik == 6) {
                    System.out.print("Tambahkan Liptint :" );
                    jmlMasuk = yo.nextInt();
                    totStok2 = stokLiptint+jmlMasuk;
                    System.out.println("Stok Liptint = "+stokLiptint+" + "+jmlMasuk+" = "+totStok2);
                     System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokLiptint = totStok2 - jmlKeluar;
                    System.out.println("jumlah barang saat ini :"+ stokLiptint);
                    System.out.println("Masukkan Harga barang ");
                    harga2 = yo.nextInt();
                    valLiptint = harga2 * stokLiptint;
                    System.out.println("Valuasi : " +valLiptint);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
                 else if (pilKosmetik == 7) {
                    System.out.print("Tambahkan Bodyserum :" );
                    jmlMasuk = yo.nextInt();
                    totStok2 = stokBodyserum+jmlMasuk;
                    System.out.println("Stok bodyserum = "+stokBodyserum+" + "+jmlMasuk+" = "+totStok2);
                     System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokBodyserum = totStok2 - jmlKeluar;
                    System.out.println("jumlah barang saat ini :"+ stokBodyserum);
                    System.out.println("Masukkan Harga barang ");
                    harga2 = yo.nextInt();
                    valBodyser = harga2 * stokBodyserum;
                    System.out.println("Valuasi : " +valBodyser);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
            
           
            
        }else if(pilihan == 3){
            System.out.println("======================================================");
            for(int i =0; i<rakPakaian.length; i++){
                String element = rakPakaian[i];
                System.out.println("" +(i+1) +" " +element);}
                System.out.println("Masukkan input list barang : ");
                pilPakaain = yo.nextInt();
                if (pilPakaain == 1) {
                    System.out.println("Tambahan kaos : ");
                    jmlMasuk = yo.nextInt();
                    totStok3 = stokKaos+jmlMasuk;
                    System.out.println("Stok kaos = "+stokKaos+" + "+jmlMasuk+" = "+totStok3);
                    System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokKaos = totStok3 - jmlKeluar;
                    System.out.println("Jumlah barang saat ini :"+ stokKaos);
                    System.out.println("Masukkan harga barang ");
                    harga3 = yo.nextInt();
                    valKaos = harga3 * stokKaos;
                    System.out.println("Valuasi : " +valKaos);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);

                }else if (pilPakaain == 2) {
                    System.out.println("Tambahkan Kemeja : ");
                    jmlMasuk = yo.nextInt();
                    totStok3 = stokKemeja+jmlMasuk;
                    System.out.println("Stok Kemeja = "+stokKemeja+" + "+jmlMasuk+" = "+totStok3);
                    System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokKemeja = totStok3 - jmlKeluar;
                    System.out.println("Jumlah barang saat ini :"+ stokKemeja);
                    System.out.println("Masukkan harga barang ");
                    harga3 = yo.nextInt();
                    valKemeja = harga3 * stokKemeja;
                    System.out.println("Valuasi : "+valKemeja);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);

                }else if (pilPakaain == 3) {
                    System.out.println("Tambahkan Rok : ");
                    jmlMasuk = yo.nextInt();
                    totStok3 = stokRok+jmlMasuk;
                    System.out.println("Stok Rok = "+stokRok+" + "+jmlMasuk+" = "+totStok3);
                    System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokRok = totStok3 - jmlKeluar;
                    System.out.println("Jumlah barang saat ini :"+ stokRok);
                    System.out.println("Masukkan harga barang ");
                    harga3 = yo.nextInt();
                    valRok = harga3 * stokRok;
                    System.out.println("Valuasi : "+valRok);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);

                }else if (pilPakaain == 4) {
                    System.out.println("Tambahkan Celana Jeans : ");
                    jmlMasuk = yo.nextInt();
                    totStok3 = stokCelanaJeans+jmlMasuk;
                    System.out.println("Stok Celana Jeans = "+stokCelanaJeans+" + "+jmlMasuk+" = "+totStok3);
                    System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokCelanaJeans = totStok3 - jmlKeluar;
                    System.out.println("Jumlah barang saat ini :"+ stokCelanaJeans);
                    System.out.println("Masukkan harga barang ");
                    harga3 = yo.nextInt();
                    valCelanaJeans = harga3 * stokCelanaJeans;
                    System.out.println("Valuasi : "+valCelanaJeans);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);

                }else if (pilPakaain == 5) {
                    System.out.println("Tambahkan Jaket : ");
                    jmlMasuk = yo.nextInt();
                    totStok3 = stokJaket+jmlMasuk;
                    System.out.println("Stok Jaket = "+stokJaket+" + "+jmlMasuk+" = "+totStok3);
                    System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokJaket = totStok3 - jmlKeluar;
                    System.out.println("Jumlah barang saat ini :"+ stokJaket);
                    System.out.println("Masukkan harga barang ");
                    harga3 = yo.nextInt();
                    valJaket = harga3 * stokJaket;
                    System.out.println("Valuasi : "+valJaket);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);

                }else if (pilPakaain == 6) {
                    System.out.println("Tambahkan Hoodie : ");
                    jmlMasuk = yo.nextInt();
                    totStok3 = stokHoodie+jmlMasuk;
                    System.out.println("Stok Hoodie = "+stokHoodie+" + "+jmlMasuk+" = "+totStok3);
                    System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokHoodie = totStok3 - jmlKeluar;
                    System.out.println("Jumlah barang saat ini :"+ stokHoodie);
                    System.out.println("Masukkan harga barang ");
                    harga3 = yo.nextInt();
                    valHoodie = harga3 * stokHoodie;
                    System.out.println("Valuasi : "+valHoodie);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);

                }else if (pilPakaain == 7) {
                    System.out.println("Tambahkan Sweater : ");
                    jmlMasuk = yo.nextInt();
                    totStok3 = stokSweater+jmlMasuk;
                    System.out.println("Stok Kemeja = "+stokSweater+" + "+jmlMasuk+" = "+totStok3);
                    System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokSweater = totStok3 - jmlKeluar;
                    System.out.println("Jumlah barang saat ini :"+ stokSweater);
                    System.out.println("Masukkan harga barang ");
                    harga3 = yo.nextInt();
                    valSweater = harga3 * stokSweater;
                    System.out.println("Valuasi : "+valSweater);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);

                }else if (pilPakaain == 8) {
                    System.out.println("Tambahkan Cardigan : ");
                    jmlMasuk = yo.nextInt();
                    totStok3 = stokCardigan+jmlMasuk;
                    System.out.println("Stok Cardigan = "+stokCardigan+" + "+jmlMasuk+" = "+totStok3);
                    System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokCardigan = totStok3 - jmlKeluar;
                    System.out.println("Jumlah barang saat ini :"+ stokCardigan);
                    System.out.println("Masukkan harga barang ");
                    harga3 = yo.nextInt();
                    valCardigan = harga3 * stokCardigan;
                    System.out.println("Valuasi : "+valCardigan);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
           
        } 

    }
}