import java.util.*;


public class loopingRak {
    public static void main(String[] args) {
        Scanner yo = new Scanner(System.in);
        String naBarang1, naBarang2, naBarang3;
        int totStok1, totStok2, totStok3, stokBarang1 = 10, stokBarang2 = 7, stokBarang3 = 15, maksLoop = 3;
        int jmlMasuk, jmlKeluar, pilihan,harga1, harga2, harga3, val1, val2, val3;

        System.out.println("====================Menu Utama=======================");
        System.out.println("| \t 1. RAK SEMBAKO                             |");
        System.out.println("| \t 2. RAK KOSMETIK                            |");
        System.out.println("| \t 3. RAK PAKAIAN                             |");
        System.out.println("=====================================================");
        System.out.print("Pilih Rak : ");
       

        for (int i = 1; i <= maksLoop; i++){
            pilihan = yo.nextInt();
            switch (pilihan) {
                case 1:
                System.out.println("======================================================");
                System.out.println("\t RAK SEMBAKO                                      ");
                System.out.println("======================================================");
                System.out.println("Masukkan nama barang : ");
                naBarang1 = yo.next();
                System.out.println("Masukkan tambahan barang : ");
                jmlMasuk = yo.nextInt();
                totStok1 = stokBarang1 + jmlMasuk;
                System.out.println("Stok saat ini : "+ totStok1);
                System.out.println("Jumlah barang yang akan anda ambil ");
                jmlKeluar = yo.nextInt();
                stokBarang1 = totStok1 - jmlKeluar;
                System.out.println("jumlah barang saat ini :"+ stokBarang1);
                System.out.println("Masukkan Harga barang ");
                harga1 = yo.nextInt();
                val1 = harga1 * stokBarang1;
                System.out.println("Valuasi : " +val1 );
                    
                case 2:
                System.out.println("======================================================");
                 System.out.println("\t RAK KOSMETIK                                     ");
                System.out.println("======================================================");
                System.out.println("Masukkan nama barang : ");
                naBarang2 = yo.next();
                System.out.println("Masukkan tambahan barang : ");
                jmlMasuk = yo.nextInt();
                totStok2 = stokBarang2 + jmlMasuk;
                System.out.println("Stok saat ini : "+ totStok2);
                System.out.println("Jumlah barang yang akan anda ambil ");
                jmlKeluar = yo.nextInt();
                stokBarang2 = totStok2 - jmlKeluar;
                System.out.println("jumlah barang saat ini :"+ stokBarang2);
                System.out.println("Masukkan Harga barang ");
                harga2 = yo.nextInt();
                val2 = harga2 * stokBarang2;
                System.out.println("Valuasi : " +val2);
                
                case 3:
                System.out.println("======================================================");
                 System.out.println("\t RAK PAKAIAN                                      ");
                System.out.println("======================================================");
                System.out.println("Masukkan nama barang : ");
                naBarang3 = yo.next();
                System.out.println("Masukkan tambahan barang : ");
                jmlMasuk = yo.nextInt();
                totStok3 = stokBarang3 + jmlMasuk;
                System.out.println("Stok saat ini : "+ totStok3);
                System.out.println("Jumlah barang yang akan anda ambil ");
                jmlKeluar = yo.nextInt();
                stokBarang3 = totStok3 - jmlKeluar;
                System.out.println("jumlah barang saat ini :"+ stokBarang3);
                System.out.println("Masukkan Harga barang");
                harga3 = yo.nextInt();
                val3 = harga3 * stokBarang3;
                System.out.println("Valuasi : " +val3);
            
                default:
                    break;
            }
        }

    }
}
