import java.util.Scanner;
public class cobaGudang {
    public static void main(String[] args) {
        Scanner yo = new Scanner(System.in);
        String naBarang1, naBarang2, naBarang3, eta1, eta2, eta3;
        int totStok, stokBarang1 = 10, stokBarang2 = 7, stokBarang3 = 15;
        int jmlMasuk, jmlKeluar, exp1, exp2, exp3;

        System.out.println("Masukkan nama barang : ");
        naBarang1 = yo.nextLine();
        System.out.println(naBarang1);
        System.out.println("Masukkan tambahan barang : ");
        jmlMasuk = yo.nextInt();
        totStok = stokBarang1 + jmlMasuk;
        System.out.println("Stok saat ini : "+ totStok);
    }
}