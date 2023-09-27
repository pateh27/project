import java.util.Scanner;
import java.time.LocalDate;
public class cobaGudang {
    public static void main(String[] args) {
        Scanner yo = new Scanner(System.in);
        String naBarang1, naBarang2, naBarang3, eta1, eta2, eta3;
        int totStok1, totStok2, totStok3, stokBarang1 = 10, stokBarang2 = 7, stokBarang3 = 15;
        int jmlMasuk, jmlKeluar;
        String exp1L, exp2L, exp3L, exp1B, exp2B, exp3B;

        System.out.println("Masukkan nama barang ke 1: ");
        naBarang1 = yo.nextLine();
        System.out.println("Masukkan tambahan barang : ");
        jmlMasuk = yo.nextInt();
        totStok1 = stokBarang1 + jmlMasuk;
        System.out.println("Stok saat ini : "+ totStok1);
        System.out.println("Jumlah barang yang akan anda ambil ");
        jmlKeluar = yo.nextInt();
        stokBarang1 = totStok1 - jmlKeluar;
        System.out.println("jumlah barang saat ini :"+ stokBarang1);
        System.out.println("Masukkan tanggal kadaluarsa");
        exp1L = yo.next();
        
        System.out.println("Masukkan nama barang ke 2: ");
        naBarang2 = yo.next();
        System.out.println("Masukkan tambahan barang : ");
        jmlMasuk = yo.nextInt();
        totStok2 = stokBarang2 + jmlMasuk;
        System.out.println("Stok saat ini : "+ totStok2);
        System.out.println("Jumlah barang yang akan anda ambil ");
        jmlKeluar = yo.nextInt();
        stokBarang2 = totStok2 - jmlKeluar;
        System.out.println("jumlah barang saat ini :"+ stokBarang2);
        System.out.println("Masukkan tanggal kadaluarsa");
        exp2L = yo.next();
        
        System.out.println("Masukkan nama barang ke 3: ");
        naBarang3 = yo.next();
        System.out.println("Masukkan tambahan barang : ");
        jmlMasuk = yo.nextInt();
        totStok3 = stokBarang3 + jmlMasuk;
        System.out.println("Stok saat ini : "+ totStok3);
        System.out.println("Jumlah barang yang akan anda ambil ");
        jmlKeluar = yo.nextInt();
        stokBarang3 = totStok3 - jmlKeluar;
        System.out.println("jumlah barang saat ini :"+ stokBarang3);
        System.out.println("Masukkan tanggal kadaluarsa");

        
    }
}