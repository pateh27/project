import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class cobaGudang {
    Scanner yo = new Scanner(System.in);
     private static final String usn="gudang", pin="123456";
        
     public static void main(String[] args) {

        System.out.println("=================SISTEM GUDANG=======================");
        System.out.println("|               SELAMAT DATANG                      |");
        System.out.println("|        MASUKKAN USERNAME DAN PIN ANDA             |");
        System.out.println("=====================================================");

        Scanner input = new Scanner(System.in);

        System.out.print("Username : ");
        String masukkanUsn = input.nextLine();
        System.out.print("PIN : ");
        String masukkanPin = input.nextLine();

        if (masukkanUsn.equals(usn)) {
            System.out.println("Username Benar");
        } else {
            System.out.println("Username Salah");
            System.exit(0);
        }

        if (masukkanPin.equals(pin)) {
            System.out.println("PIN Benar, Akses diberikan");
        } else {
            System.out.println("PIN Salah");
            System.exit(0);
        }

        Scanner yo = new Scanner(System.in);
        String naBarang1, naBarang2, naBarang3;
        int totStok1, totStok2, totStok3, stokBarang1 = 10, stokBarang2 = 7, stokBarang3 = 15;
        int jmlMasuk, jmlKeluar, pilihan,harga1, harga2, harga3, val1, val2, val3;
        
        LocalDate tanggalHariIni = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate tanggalKadaluwarsa = tanggalHariIni.plusMonths(6);

        String formatTanggalKadaluwarsa = tanggalKadaluwarsa.format(formatter);


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
            System.out.println("Tanggal hari ini: " + tanggalHariIni);
            System.out.println("Tanggal kadaluwarsa: " + tanggalKadaluwarsa);
            
        }else if(pilihan == 2){
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
            System.out.println("Tanggal hari ini: " + tanggalHariIni);
            System.out.println("Tanggal kadaluwarsa: " + tanggalKadaluwarsa);
            
        }else if(pilihan == 3){
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
            System.out.println("Tanggal hari ini: " + tanggalHariIni);
            System.out.println("Tanggal kadaluwarsa: " + tanggalKadaluwarsa);
        } 
        
    }   
}
