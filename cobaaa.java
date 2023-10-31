import java.util.Scanner;

public class cobaaa {
    public static void main(String[] args) {
        
        Scanner yo = new Scanner(System.in);
        String naBarang1, naBarang2, naBarang3, naBarang4, naBarang5;
        String[] rakSembako = {"beras", "gula", "telur", "minyak", "kopi", "teh", "kecap", "garam", "mie"};
        String[] rakKosmetik = {"facewash", "toner", "serum", "sunscreen", "lipcream", "liptint", "body serum"};
        String[] rakPakaian = {"kaos", "kemeja", "rok", "celana jeans", "jaket", "hoodie", "sweater", "cardigan"};
        int totStok1, totStok2, totStok3, totStok4, totStok5, stokBeras = 10, stoktoner = 7, stokBrg3 = 15, stokBrg4 = 20, stokBrg5 = 12; 
        int jmlMasuk, jmlKeluar, pilihan,pilKosmetik, pilSembako, harga1, harga2, harga3, harga4, harga5, val1, val2, val3;

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
                    System.out.println("Tambahkan beras");
                    jmlMasuk = yo.nextInt();
                    totStok1 = stokBeras+jmlMasuk;
                    System.out.println("Stok beras = "+stokBeras+" + "+jmlMasuk+" = "+totStok1);
                    System.out.println("Jumlah barang yang akan anda ambil ");
                    jmlKeluar = yo.nextInt();
                    stokBeras = totStok1 - jmlKeluar;
                    System.out.println("jumlah barang saat ini :"+ stokBeras);
                    System.out.println("Masukkan Harga barang ");
                    harga2 = yo.nextInt();
                    val1 = harga2 * stokBeras;
                    System.out.println("Valuasi : " +val1);
                }
                
            
        }else if(pilihan == 2){
            System.out.println("======================================================");
            for(int i=0; i<rakKosmetik.length; i++){
                String element = rakKosmetik[i];
                System.out.println("" + (i+1) + " " +element);}
                System.out.print("Masukkan input list barang :");
                pilKosmetik = yo.nextInt();
                if (pilKosmetik == 2) {
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
                    val2 = harga2 * stoktoner;
                    System.out.println("Valuasi : " +val2);
                }
           
            
           
            
        }else if(pilihan == 3){
            System.out.println("======================================================");
            System.out.println("Masukkan nama barang : ");
            naBarang3 = yo.next();
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