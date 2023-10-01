import java.util.Scanner;

public class cobaaa {
    public static void main(String[] args) {

        Scanner yo = new Scanner(System.in);
        String naBarang1, naBarang2, naBarang3, naBarang4, naBarang5;
        int totStok1, totStok2, totStok3, totStok4, totStok5, stokBrg1 = 10, stokBrg2 = 7, stokBrg3 = 15, stokBrg4 = 20, stokBrg5 = 12; 
        int jmlMasuk, jmlKeluar, pilihan,harga1, harga2, harga3, harga4, harga5, val1, val2, val3;

        System.out.println("====================Menu Utama=======================");
        System.out.println("| \t 1. RAK SEMBAKO                             |");
        System.out.println("| \t 2. RAK KOSMETIK                            |");
        System.out.println("| \t 3. RAK PAKAIAN                             |");
        System.out.println("=====================================================");
        System.out.println("Pilih Rak : ");
        pilihan = yo.nextInt();

        if (pilihan == 1) {
            System.out.println("======================================================");
            System.out.println("Masukkan nama barang : ");
            naBarang1 = yo.next();
            System.out.println("Masukkan tambahan barang : ");
            jmlMasuk = yo.nextInt();
            totStok1 = stokBrg1 + jmlMasuk;
            System.out.println("Stok saat ini : "+ totStok1);
            System.out.println("Jumlah barang yang akan anda ambil ");
            jmlKeluar = yo.nextInt();
            stokBrg1 = totStok1 - jmlKeluar;
            System.out.println("jumlah barang saat ini :"+ stokBrg1);
            System.out.println("Masukkan Harga barang ");
            harga1 = yo.nextInt();
            val1 = harga1 * stokBrg1;
            System.out.println("Valuasi : " +val1 );
            
        }else if(pilihan == 2){
            System.out.println("======================================================");
            System.out.println("Masukkan nama barang : ");
            naBarang2 = yo.next();
            System.out.println("Masukkan tambahan barang : ");
            jmlMasuk = yo.nextInt();
            totStok2 = stokBrg2 + jmlMasuk;
            System.out.println("Stok saat ini : "+ totStok2);
            System.out.println("Jumlah barang yang akan anda ambil ");
            jmlKeluar = yo.nextInt();
            stokBrg2 = totStok2 - jmlKeluar;
            System.out.println("jumlah barang saat ini :"+ stokBrg2);
            System.out.println("Masukkan Harga barang ");
            harga2 = yo.nextInt();
            val2 = harga2 * stokBrg2;
            System.out.println("Valuasi : " +val2);
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