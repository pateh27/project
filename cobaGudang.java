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
        System.out.print("Pilih Rak : ");
        pilihan = yo.nextInt();

        if (pilihan == 1) {
            System.out.println("======================================================");
            for (int i=0; i<rakSembako.length; i++) {
                String element = rakSembako[i];
                System.out.println("" + (i+1) + " " +element);}
                System.out.print("Masukkan input list barang :");
                pilSembako = yo.nextInt();
                if (pilihan == 1) {
                    System.out.println("======================================================");
                    for (int i=0; i<rakSembako.length; i++) {
                        for(int j=0; j<rakSembako.length; j++){
                        String element = rakSembako[i];
                        System.out.println("" + (i+1) + " " +element);}
                    }
                        System.out.print("Masukkan input list barang :");
                        pilSembako = yo.nextInt();
                        if (pilSembako == 1) {
                            System.out.print("Tambahan Beras");
                            jmlMasuk = yo.nextInt();
                            int totStokBeras = stokBeras+jmlMasuk;
                            System.out.println("Stok beras = "+stokBeras+" + "+jmlMasuk+" = "+totStokBeras);
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stokBeras = totStokBeras - jmlKeluar;
                            if(stokBeras<0){
                                System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                                String konfir = yo.next();
                                if(konfir.equalsIgnoreCase("y")){
                                    System.out.print("Jumlah barang yang akan anda ambil ");
                                    jmlKeluar = yo.nextInt();
                                    stokBeras = totStokBeras - jmlKeluar;
                                    System.out.println(stokBeras);
                                }else if(konfir.equalsIgnoreCase("n")){
                                    System.out.println(totStokBeras);
                                    System.out.println("terimakasih");
                                    return;
                                }
                            }
                            System.out.println("jumlah barang saat ini :"+ stokBeras);
                            System.out.print("Masukkan Harga barang ");
                            hargaBeras = yo.nextInt();
                            valBeras = hargaBeras * stokBeras;
                            System.out.println("Valuasi : " +valBeras);
                            System.out.println("Tanggal hari ini:" + tanggalHariIni);
                            System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                        }
                        else if (pilSembako == 2) {
                            System.out.print("Tambahan Gula");
                            jmlMasuk = yo.nextInt();
                            int totStokGula = stokGula+jmlMasuk;
                            System.out.println("Stok Gula = "+stokGula+" + "+jmlMasuk+" = "+totStokGula);
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stokGula = totStokGula - jmlKeluar;
                            if(stokGula<0){
                                System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                                String konfir = yo.next();
                                if(konfir.equalsIgnoreCase("y")){
                                    System.out.print("Jumlah barang yang akan anda ambil ");
                                    jmlKeluar = yo.nextInt();
                                    stokGula = totStokGula - jmlKeluar;
                                    System.out.println(stokGula);
                                }else if(konfir.equalsIgnoreCase("n")){
                                    System.out.println(totStokGula);
                                    System.out.println("terimakasih");
                                    return;
                                }
                            }
                            System.out.println("jumlah barang saat ini :"+ stokGula);
                            System.out.print("Masukkan Harga barang ");
                            hargaGula = yo.nextInt();
                            valGula = hargaGula * stokGula;
                            System.out.println("Valuasi : " +valGula);
                            System.out.println("Tanggal hari ini:" + tanggalHariIni);
                            System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                        }
                        else if (pilSembako == 3) {
                            System.out.print("Tambahan Telur");
                            jmlMasuk = yo.nextInt();
                            int totStokTelur = stokTelur+jmlMasuk;
                            System.out.println("Stok Telur= "+stokTelur+" + "+jmlMasuk+" = "+totStokTelur);
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stokTelur = totStokTelur - jmlKeluar;
                            if(stokTelur<0){
                                System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                                String konfir = yo.next();
                                if(konfir.equalsIgnoreCase("y")){
                                    System.out.print("Jumlah barang yang akan anda ambil ");
                                    jmlKeluar = yo.nextInt();
                                    stokTelur = totStokTelur - jmlKeluar;
                                    System.out.println(stokTelur);
                                }else if(konfir.equalsIgnoreCase("n")){
                                    System.out.println(totStokTelur);
                                    System.out.println("terimakasih");
                                    return;
                                }
                            }
                            System.out.println("jumlah barang saat ini :"+ stokTelur);
                            System.out.print("Masukkan Harga barang ");
                            hargaTelur = yo.nextInt();
                            valTelur = hargaTelur * stokTelur;
                            System.out.println("Valuasi : " +valTelur);
                            System.out.println("Tanggal hari ini:" + tanggalHariIni);
                            System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                        }
                        else if (pilSembako == 4) {
                            System.out.print("Tambahan Minyak");
                            jmlMasuk = yo.nextInt();
                            int totStokMinyak = stokMinyak+jmlMasuk;
                            System.out.println("Stok Minyak= "+stokMinyak+" + "+jmlMasuk+" = "+totStokMinyak);
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stokMinyak = totStokMinyak - jmlKeluar;
                            if(stokMinyak<0){
                                System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                                String konfir = yo.next();
                                if(konfir.equalsIgnoreCase("y")){
                                    System.out.print("Jumlah barang yang akan anda ambil ");
                                    jmlKeluar = yo.nextInt();
                                    stokMinyak = totStokMinyak - jmlKeluar;
                                    System.out.println(stokMinyak);
                                }else if(konfir.equalsIgnoreCase("n")){
                                    System.out.println(totStokMinyak);
                                    System.out.println("terimakasih");
                                    return;
                                }
                            }
                            System.out.println("jumlah barang saat ini :"+ stokMinyak);
                            System.out.print("Masukkan Harga barang ");
                            hargaMinyak = yo.nextInt();
                            valMinyak = hargaMinyak * stokMinyak;
                            System.out.println("Valuasi : " +valMinyak);
                            System.out.println("Tanggal hari ini:" + tanggalHariIni);
                            System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                        }
                        else if (pilSembako == 5) {
                            System.out.print("Tambahan Kopi");
                            jmlMasuk = yo.nextInt();
                            int totStokKopi = stokKopi+jmlMasuk;
                            System.out.println("Stok Kopi= "+stokKopi+" + "+jmlMasuk+" = "+totStokKopi);
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stokKopi = totStokKopi - jmlKeluar;
                            if(stokKopi<0){
                                System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                                String konfir = yo.next();
                                if(konfir.equalsIgnoreCase("y")){
                                    System.out.print("Jumlah barang yang akan anda ambil ");
                                    jmlKeluar = yo.nextInt();
                                    stokKopi = totStokKopi - jmlKeluar;
                                    System.out.println(stokKopi);
                                }else if(konfir.equalsIgnoreCase("n")){
                                    System.out.println(totStokKopi);
                                    System.out.println("terimakasih");
                                    return;
                                }
                            }
                            System.out.println("jumlah barang saat ini :"+ stokKopi);
                            System.out.print("Masukkan Harga barang ");
                            hargaKopi = yo.nextInt();
                            valKopi = hargaKopi * stokKopi;
                            System.out.println("Valuasi : " +valKopi);
                            System.out.println("Tanggal hari ini:" + tanggalHariIni);
                            System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                        }
                        else if (pilSembako == 6) {
                            System.out.print("Tambahan Teh");
                            jmlMasuk = yo.nextInt();
                            int totStokTeh = stokTeh+jmlMasuk;
                            System.out.println("Stok Teh= "+stokTeh+" + "+jmlMasuk+" = "+totStokTeh);
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stokTeh = totStokTeh - jmlKeluar;
                            if(stokTeh<0){
                                System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                                String konfir = yo.next();
                                if(konfir.equalsIgnoreCase("y")){
                                    System.out.print("Jumlah barang yang akan anda ambil ");
                                    jmlKeluar = yo.nextInt();
                                    stokTeh = totStokTeh - jmlKeluar;
                                    System.out.println(stokTeh);
                                }else if(konfir.equalsIgnoreCase("n")){
                                    System.out.println(totStokTeh);
                                    System.out.println("terimakasih");
                                    return;
                                }
                            }
                            System.out.println("jumlah barang saat ini :"+ stokTeh);
                            System.out.print("Masukkan Harga barang ");
                            hargaTeh = yo.nextInt();
                            valteh = hargaTeh * stokTeh;
                            System.out.println("Valuasi : " +valteh);
                            System.out.println("Tanggal hari ini:" + tanggalHariIni);
                            System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                        }
                        else if (pilSembako == 7) {
                            System.out.print("Tambahan Kecap");
                            jmlMasuk = yo.nextInt();
                            int totStokKecap = stokKecap+jmlMasuk;
                            System.out.println("Stok Kecap= "+stokKecap+" + "+jmlMasuk+" = "+totStokKecap);
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stokKecap = totStokKecap - jmlKeluar;
                            if(stokKecap<0){
                                System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                                String konfir = yo.next();
                                if(konfir.equalsIgnoreCase("y")){
                                    System.out.print("Jumlah barang yang akan anda ambil ");
                                    jmlKeluar = yo.nextInt();
                                    stokKecap = totStokKecap - jmlKeluar;
                                    System.out.println(stokKecap);
                                }else if(konfir.equalsIgnoreCase("n")){
                                    System.out.println(totStokKecap);
                                    System.out.println("terimakasih");
                                    return;
                                }
                            }
                            System.out.println("jumlah barang saat ini :"+ stokKecap);
                            System.out.print("Masukkan Harga barang ");
                            hargaKecap = yo.nextInt();
                            valKecap = hargaKecap * stokKecap;
                            System.out.println("Valuasi : " +valKecap);
                            System.out.println("Tanggal hari ini:" + tanggalHariIni);
                            System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                        }
                        else if (pilSembako == 8) {
                            System.out.print("Tambahan Garam");
                            jmlMasuk = yo.nextInt();
                            int totStokGaram = stokGaram+jmlMasuk;
                            System.out.println("Stok Garam= "+stokGaram+" + "+jmlMasuk+" = "+totStokGaram);
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stokGaram = totStokGaram - jmlKeluar;
                            if(stokGaram<0){
                                System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                                String konfir = yo.next();
                                if(konfir.equalsIgnoreCase("y")){
                                    System.out.print("Jumlah barang yang akan anda ambil ");
                                    jmlKeluar = yo.nextInt();
                                    stokGaram = totStokGaram - jmlKeluar;
                                    System.out.println(stokGaram);
                                }else if(konfir.equalsIgnoreCase("n")){
                                    System.out.println(totStokGaram);
                                    System.out.println("terimakasih");
                                    return;
                                }
                            }
                            System.out.println("jumlah barang saat ini :"+ stokGaram);
                            System.out.print("Masukkan Harga barang ");
                            hargaGaram = yo.nextInt();
                            valGaram = hargaGaram * stokGaram;
                            System.out.println("Valuasi : " +valGaram);
                            System.out.println("Tanggal hari ini:" + tanggalHariIni);
                            System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                        }
                        else if (pilSembako == 9) {
                            System.out.print("Tambahan Mie");
                            jmlMasuk = yo.nextInt();
                            int totStokMie = stokMie+jmlMasuk;
                            System.out.println("Stok Mie= "+stokMie+" + "+jmlMasuk+" = "+totStokMie);
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stokMie = totStokMie - jmlKeluar;
                            if(stokMie<0){
                                System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                                String konfir = yo.next();
                                if(konfir.equalsIgnoreCase("y")){
                                    System.out.print("Jumlah barang yang akan anda ambil ");
                                    jmlKeluar = yo.nextInt();
                                    stokMie = totStokMie - jmlKeluar;
                                    System.out.println(stokMie);
                                }else if(konfir.equalsIgnoreCase("n")){
                                    System.out.println(totStokMie);
                                    System.out.println("terimakasih");
                                    return;
                                }
                            }
                            System.out.println("jumlah barang saat ini :"+ stokMie);
                            System.out.print("Masukkan Harga barang ");
                            hargaMie = yo.nextInt();
                            valMie = hargaMie * stokMie;
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
                    int totStokFacewash = stokFacewash+jmlMasuk;
                    System.out.println("Stok toner = "+stokFacewash+" + "+jmlMasuk+" = "+totStokFacewash);
                     System.out.print("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokFacewash = totStokFacewash - jmlKeluar;
                    if(stokFacewash<0){
                        System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                        String konfir = yo.next();
                        if(konfir.equalsIgnoreCase("y")){
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stokFacewash = totStokFacewash - jmlKeluar;
                            System.out.println(stokFacewash);
                        }else if(konfir.equalsIgnoreCase("n")){
                            System.out.println(totStokFacewash);
                            System.out.println("terimakasih");
                            return;
                        }
                    }
                    System.out.println("jumlah barang saat ini :"+ stokFacewash);
                    System.out.print("Masukkan Harga barang ");
                    int hargaFacewash = yo.nextInt();
                    valFacewash = hargaFacewash * stokFacewash;
                    System.out.println("Valuasi : " +valFacewash);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
                else if (pilKosmetik == 2) {
                    System.out.print("Tambahkan toner :" );
                    jmlMasuk = yo.nextInt();
                    int totStokToner = stoktoner+jmlMasuk;
                    System.out.println("Stok toner = "+stoktoner+" + "+jmlMasuk+" = "+totStokToner);
                     System.out.print("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stoktoner = totStokToner - jmlKeluar;
                    if(stoktoner<0){
                        System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                        String konfir = yo.next();
                        if(konfir.equalsIgnoreCase("y")){
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stoktoner = totStokToner - jmlKeluar;
                            System.out.println(stoktoner);
                        }else if(konfir.equalsIgnoreCase("n")){
                            System.out.println(totStokToner);
                            System.out.println("terimakasih");
                            return;
                        }
                    }
                    System.out.println("jumlah barang saat ini :"+ stoktoner);
                    System.out.print("Masukkan Harga barang ");
                    int hargatoner = yo.nextInt();
                    valToner = hargatoner * stoktoner;
                    System.out.println("Valuasi : " +valToner);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
                else if (pilKosmetik == 3) {
                    System.out.print("Tambahkan Serum :" );
                    jmlMasuk = yo.nextInt();
                    int totStokSerum = stokSerum+jmlMasuk;
                    System.out.println("Stok toner = "+stokSerum+" + "+jmlMasuk+" = "+totStokSerum);
                     System.out.print("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokSerum = totStokSerum - jmlKeluar;
                    if(stokSerum<0){
                        System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                        String konfir = yo.next();
                        if(konfir.equalsIgnoreCase("y")){
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stokSerum = totStokSerum - jmlKeluar;
                            System.out.println(stokSerum);
                        }else if(konfir.equalsIgnoreCase("n")){
                            System.out.println(totStokSerum);
                            System.out.println("terimakasih");
                            return;
                        }
                    }
                    System.out.println("jumlah barang saat ini :"+ stokSerum);
                    System.out.print("Masukkan Harga barang ");
                    int hargaSerum = yo.nextInt();
                    valSerum = hargaSerum * stokSerum;
                    System.out.println("Valuasi : " +valSerum);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
                else if (pilKosmetik == 4) {
                    System.out.print("Tambahkan Sunscreen :" );
                    jmlMasuk = yo.nextInt();
                    int totStokSunscreen = stokSunscreen +jmlMasuk;
                    System.out.println("Stok Sunscreen = "+stokSunscreen+" + "+jmlMasuk+" = "+totStokSunscreen);
                     System.out.print("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokSunscreen = totStokSunscreen - jmlKeluar;
                    if(stokSunscreen<0){
                        System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                        String konfir = yo.next();
                        if(konfir.equalsIgnoreCase("y")){
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stokSunscreen = totStokSunscreen - jmlKeluar;
                            System.out.println(stokSunscreen);
                        }else if(konfir.equalsIgnoreCase("n")){
                            System.out.println(totStokSunscreen);
                            System.out.println("terimakasih");
                            return;
                        }
                    }
                    System.out.println("jumlah barang saat ini :"+ stokSunscreen);
                    System.out.print("Masukkan Harga barang ");
                    int hargaSunscreen = yo.nextInt();
                    valSunscren = hargaSunscreen * stokSunscreen;
                    System.out.println("Valuasi : " +valSunscren);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
                 else if (pilKosmetik == 5) {
                    System.out.print("Tambahkan lipcream :" );
                    jmlMasuk = yo.nextInt();
                    int totStokLipcream = stokLipcream+jmlMasuk;
                    System.out.println("Stok Lipcream = "+stokLipcream+" + "+jmlMasuk+" = "+totStokLipcream);
                     System.out.print("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokLipcream = totStokLipcream - jmlKeluar;
                    if(stokLipcream<0){
                        System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                        String konfir = yo.next();
                        if(konfir.equalsIgnoreCase("y")){
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stokLipcream = totStokLipcream - jmlKeluar;
                            System.out.println(stokLipcream);
                        }else if(konfir.equalsIgnoreCase("n")){
                            System.out.println(totStokLipcream);
                            System.out.println("terimakasih");
                            return;
                        }
                    }
                    System.out.println("jumlah barang saat ini :"+ stokLipcream);
                    System.out.print("Masukkan Harga barang ");
                    int hargaLipcream = yo.nextInt();
                    valLipcream = hargaLipcream * stokLipcream;
                    System.out.println("Valuasi : " +valLipcream);System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
                 else if (pilKosmetik == 6) {
                    System.out.print("Tambahkan Liptint :" );
                    jmlMasuk = yo.nextInt();
                    int totStokLiptint = stokLiptint+jmlMasuk;
                    System.out.println("Stok Liptint = "+stokLiptint+" + "+jmlMasuk+" = "+totStokLiptint);
                     System.out.print("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokLiptint = totStokLiptint - jmlKeluar;
                    if(stokLiptint<0){
                        System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                        String konfir = yo.next();
                        if(konfir.equalsIgnoreCase("y")){
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stokLiptint = totStokLiptint - jmlKeluar;
                            System.out.println(stokLiptint);
                        }else if(konfir.equalsIgnoreCase("n")){
                            System.out.println(totStokLiptint);
                            System.out.println("terimakasih");
                            return;
                        }
                    }
                    System.out.println("jumlah barang saat ini :"+ stokLiptint);
                    System.out.print("Masukkan Harga barang ");
                    int hargaLiptint = yo.nextInt();
                    valLiptint = hargaLiptint * stokLiptint;
                    System.out.println("Valuasi : " +valLiptint);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
                 else if (pilKosmetik == 7) {
                    System.out.print("Tambahkan Bodyserum :" );
                    jmlMasuk = yo.nextInt();
                    int totStokBodyserum = stokBodyserum+jmlMasuk;
                    System.out.println("Stok bodyserum = "+stokBodyserum+" + "+jmlMasuk+" = "+totStokBodyserum);
                     System.out.print("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokBodyserum = totStokBodyserum - jmlKeluar;
                    if(stokBodyserum<0){
                        System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                        String konfir = yo.next();
                        if(konfir.equalsIgnoreCase("y")){
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stokBodyserum = totStokBodyserum - jmlKeluar;
                            System.out.println(stokBodyserum);
                        }else if(konfir.equalsIgnoreCase("n")){
                            System.out.println(totStokBodyserum);
                            System.out.println("terimakasih");
                            return;
                        }
                    }
                    System.out.println("jumlah barang saat ini :"+ stokBodyserum);
                    System.out.print("Masukkan Harga barang ");
                    int hargaBodyserum = yo.nextInt();
                    valBodyser = hargaBodyserum * stokBodyserum;
                    System.out.println("Valuasi : " +valBodyser);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
            
        }else if(pilihan == 3){
            System.out.println("======================================================");
            for(int i =0; i<rakPakaian.length; i++){
                String element = rakPakaian[i];
                System.out.println("" +(i+1) +" " +element);}
                System.out.print("Masukkan input list barang : ");
                pilPakaain = yo.nextInt();
                if (pilPakaain == 1) {
                    System.out.print("Tambahan kaos : ");
                    jmlMasuk = yo.nextInt();
                    int totStokKaos = stokKaos+jmlMasuk;
                    System.out.println("Stok kaos = "+stokKaos+" + "+jmlMasuk+" = "+totStokKaos);
                    System.out.print("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokKaos = totStokKaos - jmlKeluar;
                      if(stokKaos<0){
                        System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                        String konfir = yo.next();
                        if(konfir.equalsIgnoreCase("y")){
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stokBodyserum = totStokKaos - jmlKeluar;
                            System.out.println(stokBodyserum);
                        }else if(konfir.equalsIgnoreCase("n")){
                            System.out.println(totStokKaos);
                            System.out.println("terimakasih");
                            return;
                        }
                    }
                    System.out.println("Jumlah barang saat ini :"+ stokKaos);
                    System.out.print("Masukkan harga barang ");
                    int hargaKaos = yo.nextInt();
                    valKaos = hargaKaos * stokKaos;
                    System.out.println("Valuasi : " +valKaos);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);

                }else if (pilPakaain == 2) {
                    System.out.print("Tambahkan Kemeja : ");
                    jmlMasuk = yo.nextInt();
                    int totStokKemeja = stokKemeja+jmlMasuk;
                    System.out.println("Stok Kemeja = "+stokKemeja+" + "+jmlMasuk+" = "+totStokKemeja);
                    System.out.print("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokKemeja = totStokKemeja - jmlKeluar;
                      if(stokKemeja<0){
                        System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                        String konfir = yo.next();
                        if(konfir.equalsIgnoreCase("y")){
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stokKemeja = totStokKemeja - jmlKeluar;
                            System.out.println(stokKemeja);
                        }else if(konfir.equalsIgnoreCase("n")){
                            System.out.println(totStokKemeja);
                            System.out.println("terimakasih");
                            return;
                        }
                    }
                    System.out.println("Jumlah barang saat ini :"+ stokKemeja);
                    System.out.print("Masukkan harga barang ");
                    int hargaKemeja = yo.nextInt();
                    valKemeja = hargaKemeja * stokKemeja;
                    System.out.println("Valuasi : "+valKemeja);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);

                }else if (pilPakaain == 3) {
                    System.out.print("Tambahkan Rok : ");
                    jmlMasuk = yo.nextInt();
                    int totStokRok = stokRok+jmlMasuk;
                    System.out.println("Stok Rok = "+stokRok+" + "+jmlMasuk+" = "+totStokRok);
                    System.out.print("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokRok = totStokRok - jmlKeluar;
                      if(stokRok<0){
                        System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                        String konfir = yo.next();
                        if(konfir.equalsIgnoreCase("y")){
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stokRok = totStokRok - jmlKeluar;
                            System.out.println(stokRok);
                        }else if(konfir.equalsIgnoreCase("n")){
                            System.out.println(totStokRok);
                            System.out.println("terimakasih");
                            return;
                        }
                    }
                    System.out.println("Jumlah barang saat ini :"+ stokRok);
                    System.out.print("Masukkan harga barang ");
                    int hargaRok = yo.nextInt();
                    valRok = hargaRok * stokRok;
                    System.out.println("Valuasi : "+valRok);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);

                }else if (pilPakaain == 4) {
                    System.out.print("Tambahkan Celana Jeans : ");
                    jmlMasuk = yo.nextInt();
                    int totStokJeans = stokCelanaJeans+jmlMasuk;
                    System.out.println("Stok Celana Jeans = "+stokCelanaJeans+" + "+jmlMasuk+" = "+totStokJeans);
                    System.out.print("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokCelanaJeans = totStokJeans - jmlKeluar;
                      if(stokCelanaJeans<0){
                        System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                        String konfir = yo.next();
                        if(konfir.equalsIgnoreCase("y")){
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stokCelanaJeans = totStokJeans - jmlKeluar;
                            System.out.println(stokCelanaJeans);
                        }else if(konfir.equalsIgnoreCase("n")){
                            System.out.println(totStokJeans);
                            System.out.println("terimakasih");
                            return;
                        }
                    }
                    System.out.println("Jumlah barang saat ini :"+ stokCelanaJeans);
                    System.out.print("Masukkan harga barang ");
                    int hargaCelanaJeans = yo.nextInt();
                    valCelanaJeans = hargaCelanaJeans * stokCelanaJeans;
                    System.out.println("Valuasi : "+valCelanaJeans);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);

                }else if (pilPakaain == 5) {
                    System.out.print("Tambahkan Jaket : ");
                    jmlMasuk = yo.nextInt();
                    int totStokJaket = stokJaket+jmlMasuk;
                    System.out.println("Stok Jaket = "+stokJaket+" + "+jmlMasuk+" = "+totStokJaket);
                    System.out.print("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokJaket = totStokJaket - jmlKeluar;
                      if(stokJaket<0){
                        System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                        String konfir = yo.next();
                        if(konfir.equalsIgnoreCase("y")){
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stokJaket = totStokJaket - jmlKeluar;
                            System.out.println(stokJaket);
                        }else if(konfir.equalsIgnoreCase("n")){
                            System.out.println(totStokJaket);
                            System.out.println("terimakasih");
                            return;
                        }
                    }
                    System.out.println("Jumlah barang saat ini :"+ stokJaket);
                    System.out.print("Masukkan harga barang ");
                    int hargaJaket = yo.nextInt();
                    valJaket = hargaJaket * stokJaket;
                    System.out.println("Valuasi : "+valJaket);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);

                }else if (pilPakaain == 6) {
                    System.out.print("Tambahkan Hoodie : ");
                    jmlMasuk = yo.nextInt();
                    int totStokHoodie = stokHoodie+jmlMasuk;
                    System.out.println("Stok Hoodie = "+stokHoodie+" + "+jmlMasuk+" = "+totStokHoodie);
                    System.out.print("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokHoodie = totStokHoodie - jmlKeluar;
                      if(stokHoodie<0){
                        System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                        String konfir = yo.next();
                        if(konfir.equalsIgnoreCase("y")){
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stokHoodie = totStokHoodie - jmlKeluar;
                            System.out.println(stokHoodie);
                        }else if(konfir.equalsIgnoreCase("n")){
                            System.out.println(totStokHoodie);
                            System.out.println("terimakasih");
                            return;
                        }
                    }
                    System.out.println("Jumlah barang saat ini :"+ stokHoodie);
                    System.out.print("Masukkan harga barang ");
                    int hargaHoodie = yo.nextInt();
                    valHoodie = hargaHoodie * stokHoodie;
                    System.out.println("Valuasi : "+valHoodie);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);

                }else if (pilPakaain == 7) {
                    System.out.print("Tambahkan Sweater : ");
                    jmlMasuk = yo.nextInt();
                    int totStokSweater = stokSweater+jmlMasuk;
                    System.out.println("Stok Kemeja = "+stokSweater+" + "+jmlMasuk+" = "+totStokSweater);
                    System.out.print("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokSweater = totStokSweater - jmlKeluar;
                      if(stokSweater<0){
                        System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                        String konfir = yo.next();
                        if(konfir.equalsIgnoreCase("y")){
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stokSweater = totStokSweater - jmlKeluar;
                            System.out.println(stokSweater);
                        }else if(konfir.equalsIgnoreCase("n")){
                            System.out.println(totStokSweater);
                            System.out.println("terimakasih");
                            return;
                        }
                    }
                    System.out.println("Jumlah barang saat ini :"+ stokSweater);
                    System.out.print("Masukkan harga barang ");
                    int hargaSweater = yo.nextInt();
                    valSweater = hargaSweater * stokSweater;
                    System.out.println("Valuasi : "+valSweater);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);

                }else if (pilPakaain == 8) {
                    System.out.print("Tambahkan Cardigan : ");
                    jmlMasuk = yo.nextInt();
                    int totStokCardigan = stokCardigan+jmlMasuk;
                    System.out.println("Stok Cardigan = "+stokCardigan+" + "+jmlMasuk+" = "+totStokCardigan);
                    System.out.print("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokCardigan = totStokCardigan - jmlKeluar;
                      if(stokCardigan<0){
                        System.out.print("Stok Tidak mencukupi, maukah anda mengulang pengambilan(y/n)?");
                        String konfir = yo.next();
                        if(konfir.equalsIgnoreCase("y")){
                            System.out.print("Jumlah barang yang akan anda ambil ");
                            jmlKeluar = yo.nextInt();
                            stokCardigan = totStokCardigan - jmlKeluar;
                            System.out.println(stokCardigan);
                        }else if(konfir.equalsIgnoreCase("n")){
                            System.out.println(totStokCardigan);
                            System.out.println("terimakasih");
                            return;
                        }
                    }
                    System.out.println("Jumlah barang saat ini :"+ stokCardigan);
                    System.out.print("Masukkan harga barang ");
                    int hargaCardigan = yo.nextInt();
                    valCardigan = hargaCardigan * stokCardigan;
                    System.out.println("Valuasi : "+valCardigan);
                    System.out.println("Tanggal hari ini:" + tanggalHariIni);
                    System.out.println("Tanggal hari kadaluwarsa: " + tanggalKadaluwarsa);
                }
           
        } 
          
        } 

    }
}