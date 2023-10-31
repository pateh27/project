import java.util.Scanner;

public class cobaaa {
    public static void main(String[] args) {
        
        Scanner yo = new Scanner(System.in);
        
        String[] rakSembako = {"beras", "gula", "telur", "minyak", "kopi", "teh", "kecap", "garam", "mie"};
        String[] rakKosmetik = {"facewash", "toner", "serum", "sunscreen", "lipcream", "liptint", "body serum"};
        String[] rakPakaian = {"kaos", "kemeja", "rok", "celana jeans", "jaket", "hoodie", "sweater", "cardigan"};
        int totStok1, totStok2, totStok3, totStok4, totStok5, stokBrg3 = 15, stokBrg4 = 20, stokBrg5 = 12; 
        int stokBeras = 10, stokGula = 8, stokTelur = 13, stokMinyak = 17, stokKopi = 4, stokTeh = 9, stokKecap = 5, stokGaram = 10, stokMie = 20;
        int stokFacewash = 9, stoktoner = 7, stokSerum = 8, stokSunscreen = 12, stokLipcream = 15, stokLiptint = 18, stokBodyserum=11; 
        int valBeras, valGula, valTelur, valMinyak, valKopi,valteh, valKecap, valGaram, valMie;
        int valFacewash, valToner, valSerum, valSunscren, valLipcream, valLiptint, valBodyser;
        int hargaBeras, hargaGula, hargaTelur, hargaMinyak, hargaKopi, hargaTeh, hargaKecap, hargaGaram, hargaMie;
        int jmlMasuk, jmlKeluar, pilihan,pilKosmetik, pilSembako, harga1, harga2, harga3, harga4, harga5, val2, val3;

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
                    System.out.println("Valuasi : " +valLipcream);
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
                }
            
           
            
        }else if(pilihan == 3){
            System.out.println("======================================================");
            System.out.println("Masukkan nama barang : ");
             
            System.out.println("Masukkan tambahan barang : ");
            jmlMasuk = yo.nextInt();
            totStok3 = stokBrg3 + jmlMasuk;
            System.out.println("Stok saat ini : "+ totStok3);
            System.out.println("Jumlah barang yang akan anda ambil ");
            jmlKeluar = yo.nextInt();
            stokBrg3 = totStok3 - jmlKeluar;
            System.out.println("jumlah barang saat ini :"+ stokBrg3);
            System.out.println("Masukkan Harga barang");
            harga3 = yo.nextInt();
            val3 = harga3 * stokBrg3;
            System.out.println("Valuasi : " +val3);
    } 

    }
}