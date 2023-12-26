import java.time.LocalDate;
import java.util.Scanner;

public class SistemGudangA1 {

  static int[][] Sembako;
  static int[][] Kosmetik;
  static int[][] Pakaian;
  static int stok;
  static int stokBaru;
  static int stokBarang;
  static int stokBaruSkincare;
  static int harga;
  static int valuasi;
  static int totalVal;
  static int jmlMasuk;
  static int b;
  static int jumlah;
  static int pilihItem;
  static int pilihSembako;

  public static void Title() {
    System.out.println("=================SISTEM GUDANG A1====================");
    System.out.println("|          SELAMAT DATANG DI GUDANG A1              |");
    System.out.println("|        MASUKKAN USERNAME DAN PIN ANDA             |");
    System.out.println("=====================================================");
  }

  public static Scanner print = new Scanner(System.in);
  public static int pilihan;

  public static void main(String[] args) {
    Title();
   
    login();
    

    boolean Exit = true;
    int choose = 0;

    while (choose != 3) {
      tampilMenu();
      switch (pilihan) {
        case 1:
          tampilItemSembako();
          break;
        case 2:
          tampilItemKosmetik();
          break;
        case 3:
          tampilItemPakaian();
          break;
        default:
          break;
      }
      System.out.println("==============================");
      System.out.println("|     TAMPIL FITUR GUDANG    |");
      System.out.println("==============================");
      System.out.println("|   1. Tambah Stok           |");
      System.out.println("|   2. Kurang Stok           |");
      System.out.println("|   3. Hitung Valuasi        |");
      System.out.println("|   4. Surat Jalan           |");
      System.out.println("|   5. Exit                  |");
      System.out.println("==============================");
      System.out.print("Pilih menu : ");
      choose = print.nextInt();
      System.out.println("------------------------------");
      System.out.println();
      System.out.println();
      switch (choose) {
        case 1:
          tambahStok();
          break;
        case 2:
          kurangStok();
          break;
        case 3:
          hitungValuasi(totalVal);
          break;
        case 4:
          suratjalan();
          break;
        case 5:
          System.out.println(
              "~~~~~~~~~~~~~~~~~~~Keluaaaarrrrrr~~~~~~~~~~~~~~~~~~");
          Exit = true;
          break;
      }
    }
  }

  public static void tampilMenu() {
    System.out.println("====================Menu Utama=======================");
    System.out.println("| \t 1. RAK SEMBAKO                             |");
    System.out.println("| \t 2. RAK KOSMETIK                            |");
    System.out.println("| \t 3. RAK PAKAIAN                             |");
    System.out.println("=====================================================");
    System.out.print(" Pilih Rak : ");
    pilihan = print.nextInt();
    System.out.println("=====================================================");
  }

  public static void tampilItem() {
    System.out.println("====================Pilih Item=======================");
  }

  static void login() {
    // menentukan maksimal percobaan login (3kali)
    int maksPercobaan = 3;
    //perulangan untuk proses login berjalan maksimal 3 kali
    for (int i = 1; i <= maksPercobaan; i++) {
      // meminta input username dan pin
      System.out.print(" Username : ");
      String usnLogin = print.nextLine();
      // String usnLogin = "admin";
      System.out.print(" PIN      : ");
      String pinLogin = print.nextLine();
      // String pinLogin = "gudang123";
      // pengecekan usn dan pin
      if (usnLogin.equalsIgnoreCase("admin") &&
          pinLogin.equalsIgnoreCase("gudang123")) {
        // pesan jika login berhasil
        System.out.println(
            "=====================================================");
        System.out.println("| Login Berhasil                     |");
        System.out.println(
            "=====================================================");
        System.out.println();
        break;
      } else {
        //pesan jika login gagal
        System.out.println(
            "=====================================================");
        System.out.println(
            "| Login Gagal. Sisa percobaan : " + (maksPercobaan - i) + " |");
        System.out.println(
            "=====================================================");
        if (i == maksPercobaan) {
          System.out.println(
              "| Anda telah mencapai batas percobaan. Akun diblokir |");
          System.out.println(
              "=====================================================");
          System.out.println(
              "~~~~~~~~~~~~~~~~~~~~~Keluaaaarrrrrr~~~~~~~~~~~~~~~~~~~~");
          System.exit(0);
        }
      }
    }
  }

  static int tambahStok() {
    // inisialisasi variabel
    int stok = pilihItem;

    if (pilihan == 1) {
        //perulangan untuk mencari indeks baris yang sesuai
        for (int x = pilihItem; x < Sembako.length; x++) {
          stok = Sembako[0][pilihItem];
        }
        // mencetak nama barang
        System.out.println(Sembako[0][pilihItem]);
        // meminta input untuk konfirmasi ingin menambah stok/tidak
        System.out.print("Mau nambah stok (y/n): ");
        String ulang = print.next();
        // jika user ingin menambah stok
        if (ulang.equalsIgnoreCase("y")) {
          // meminta input jumlah stok yang akan ditambah
          System.out.print("Masukkan tambahan jumlah: ");
          //menyimpan input ke dalam variabel
          jmlMasuk = print.nextInt();
          // menghitung stok baru
          stokBaru = stok + jmlMasuk;
          // mengubah stok barang saat ini menjadi stok baru
          stok += jmlMasuk;
          // mencetak stok baru
          System.out.println(" jumlah stok saat ini adalah : " + stokBaru);
          // jika user tidak ingin menambah stok
        } else {
          // menghitung stok baru dengan dan mengubah stok barang menjadi stok baru
          stokBaru = stok + jmlMasuk;
          stok += jmlMasuk;
          // mencetak stok baru
          System.out.println(" jumlah stok saat ini adalah : " + stokBaru);
        }
      
    } else if (pilihan == 2) {
         
        for (int x = pilihItem; x < Kosmetik.length; ++x) {
          stok = Kosmetik[0][pilihItem];
        }
        System.out.println(Kosmetik[0][pilihItem]);
        System.out.print("Mau nambah stok (y/n): ");
        String ulang = print.next();
        if (ulang.equalsIgnoreCase("y")) {
          System.out.print("Masukkan tambahan jumlah: ");
          jmlMasuk = print.nextInt();
          stokBaru = stok + jmlMasuk;
          stok += jmlMasuk;
          System.out.println(" jumlah stok saat ini adalah : " + stokBaru);
        } else {
          stokBaru = stok + jmlMasuk;
          stok += jmlMasuk;
          System.out.println(" jumlah stok saat ini adalah : " + stokBaru);
        
      }
    } else if (pilihan == 3) {
     
        for (int x = pilihItem; x < Pakaian.length; ++x) {
          stok = Pakaian[0][pilihItem];
        }
        System.out.println(Pakaian[0][pilihItem]);
        System.out.print("Mau nambah stok (y/n): ");
        String ulang = print.next();
        if (ulang.equalsIgnoreCase("y")) {
          System.out.print("Masukkan tambahan jumlah: ");
          jmlMasuk = print.nextInt();
          stokBaru = stok + jmlMasuk;
          stok += jmlMasuk;
          System.out.println(" jumlah stok saat ini adalah : " + stokBaru);
        } else {
          stokBaru = stok + jmlMasuk;
          stok += jmlMasuk;
          System.out.println(" jumlah stok saat ini adalah : " + stokBaru);
        }
      
    } else {
      System.out.print("Masukkan stok : ");
      stok = print.nextInt();
      System.out.print("Masukkan tambahan jumlah: ");
      jmlMasuk = print.nextInt();
      stokBaru = stok + jmlMasuk;
      stok += jmlMasuk;
      System.out.println(" jumlah stok saat ini adalah : " + stokBaru);
    }
    // mengembalikan stok barang baru
    return stokBaru;
  }

  
  static int kurangStok() {
    // inisialisasi variabel a dengan nilai variabel stokBaru
    int a = stokBaru;
    // inisialisasi dengan nilai 0
    int stokBaru = 0;
    // mencetak stok barang awal
    System.out.println(a);
    // mencetak pesan input dari user untuk memasukkan jumlah pengambilan barang
    System.out.print("Masukkan jumlah pengambilan : ");
    // menerima input dari user dan disimpan dalam variabel b
    int b = print.nextInt();
    // jika jumlah pengambilan barang > stok barang awal
    if (b > a) {
      // mencetak pesan stok tidak cukup
      System.err.println("Stok tidak cukup");
      // meminta konfirmasi user apakah ingin mengambil stok dgn jumlah berbeda
      System.out.print("Mau mengambil stok dengan jumlah yang berbeda? (y/n): ");
      // menerima input user dan disimpan dalam variabel ulang
      String ulang = print.next();
      // jika jumlah pengambilan berbeda
      if (ulang.equalsIgnoreCase("y")) {
        // meminta user input jumlah pengambilan
          System.out.print("Masukkan jumlah pengambilan : ");
          // menerima input dan disimpan dalam variabel b
          b = print.nextInt();
          // mengurangi stok
          stokBaru = a - b;
          a -= b;
          // mencetak stok barang setelah dikurangi
          System.out.println("jumlah stok saat ini: " + stokBaru);
        } else {
          // jika user tidak mengambil stok dgn jml berbeda
          System.out.println(
              "~~~~~~~~~~~~~~~~~~~~~Keluaaaarrrrrr~~~~~~~~~~~~~~~~~~~~");
          System.exit(0);
      }
    } else if (a > b) {
      stokBaru = a - b;
      a -= b;
      System.out.println("jumlah stok saat ini: " + stokBaru);
      System.out.print("Mau mengambil stok lagi (y/n): ");
      String ulang = print.next();
      if (ulang.equalsIgnoreCase("y")) {
        System.out.print("Masukkan jumlah pengambilan : ");
        b = print.nextInt();
        stokBaru = a - b;
        a -= b;
        System.out.println("jumlah stok saat ini: " + stokBaru);
      } else {
        System.out.println(
            "~~~~~~~~~~~~~~~~~~~~~Keluaaaarrrrrr~~~~~~~~~~~~~~~~~~~~");
        System.exit(0);
      }
      System.out.println("jumlah stok saat ini adalah : " + stokBaru);
    }
    // mengembalikan nilai stok barang baru
    return stokBaru;
  }

  static int hitungValuasi(int totalValuasi) {
    // inisialisasi variabel jumlah dengan nilai stokBaru
    int jumlah = stokBaru;
    
    switch (pilihan) {
      case 1:
      // memanggil fungsi untuk menampilkan daftar item sembako
        tampilItemSembako();
        // perulangan for
          for (int i = 0; i < Sembako.length; ++i) {
            // mengambil harga barang dari array sembako
            int harga = Sembako[i][pilihItem];
            // mencetak harga barang
            System.out.println(Sembako[i][pilihItem]);
            // menghitung valuasi barang 
            totalValuasi = jumlah * Sembako[1][pilihItem];
            System.out.println(harga + " x " + jumlah + " = " + totalValuasi);
          }
        // mengakhiri blok kode case
        break;
      case 2:
        tampilItemKosmetik();
          for (int i = 0; i < Kosmetik.length; ++i) {
            int harga = Kosmetik[i][pilihItem];
            System.out.println(Kosmetik[i][pilihItem]);
            totalValuasi = jumlah * Kosmetik[1][pilihItem];
            System.out.println(harga + " x " + jumlah + " = " + totalValuasi);
          }
          break;
      case 3:
        tampilItemPakaian();
        for (int i = 0; i < Pakaian.length; ++i) {
          int harga = Pakaian[i][pilihItem];
          totalValuasi = jumlah * Pakaian[1][pilihItem];
          System.out.println(harga + " x " + jumlah + " = "+ totalValuasi);
        }
        break;
      }
    System.out.println("Valuasi barang : " + totalValuasi);
    return totalValuasi;
      

  }

  static {
    print = new Scanner(System.in);

    Sembako = new int[][] {
        { 0, 45, 76, 67, 56, 44 },
        { 0, 12000, 5000, 8000, 27000, 30000 }
    };
    Kosmetik = new int[][] {
        { 0, 24, 34, 43, 37, 49 },
        { 0, 35000, 25000, 60000, 45000, 40000 }
    };
    Pakaian = new int[][] {
        { 0, 57, 66, 41, 77, 79 },
        { 0, 60000, 80000, 50000, 120000, 150000 }
    };
  }

  static void tampilItemSembako() {
    System.out.println("==============================");
    System.out.println("|     TAMPIL ITEM SEMBAKO    |");
    System.out.println("==============================");
    System.out.println("|   1. Beras                 |");
    System.out.println("|   2. Garam                 |");
    System.out.println("|   3. Gula                  |");
    System.out.println("|   4. Telur                 |");
    System.out.println("|   5. Minyak                |");
    System.out.println("==============================");
    System.out.print("| Pilih barang : ");
    pilihItem = print.nextInt();
  }

  static void tampilItemKosmetik() {
    System.out.println("==============================");
    System.out.println("|     TAMPIL ITEM KOSMETIK    |");
    System.out.println("==============================");
    System.out.println("|   1. Facewash               |");
    System.out.println("|   2. Toner                  |");
    System.out.println("|   3. Serum                  |");
    System.out.println("|   4. Sunscreen              |");
    System.out.println("|   5. Lipcream               |");
    System.out.println("==============================");
    System.out.print("| Pilih barang : ");
    pilihItem = print.nextInt();
  }

  static void tampilItemPakaian() {
    System.out.println("==============================");
    System.out.println("|     TAMPIL ITEM PAKAIAN    |");
    System.out.println("==============================");
    System.out.println("|   1. Kaos                   |");
    System.out.println("|   2. Kemeja                 |");
    System.out.println("|   3. Rok                    |");
    System.out.println("|   4. Celana Jeans           |");
    System.out.println("|   5. Jaket                  |");
    System.out.println("==============================");
    System.out.print("| Pilih barang : ");
    pilihItem = print.nextInt();
  }

  // mendeklarasikan fungsi tanpa mengemablikan nilai
  static void suratjalan() {
    // inisialisasi variabel
    int jumlahBarang;
    String jenisBarang;
    LocalDate tanggalHariIni = LocalDate.now();
    // meminta user memasukkan nama barang
    System.out.println("Masukkan nama barang: ");
    // menerima input dan disimpan dalam variabel jenisBarang
    jenisBarang = print.next();
    // meminta user memasukkan jumlah barang
    System.out.print("Masukkan jumlah barang: ");
    // menerima input dan disimpan dalam variabel jumlahBarang
    jumlahBarang = print.nextInt();
    // menutup objek scanner
    print.close();
    // mencetak surat jalan
    System.out.println("==============================");
    System.out.println("|     SURAT JALAN BARANG     |");
    System.out.println("==============================");
    System.out.println("|   Nama Barang: " + jenisBarang +"       |");
    System.out.println("|   Jumlah Barang: " + jumlahBarang +"        |");
    System.out.println("|   Tanggal : " + tanggalHariIni + "     |");
    System.out.println("==============================");
    // menghentikan eksekusi program
    System.exit(0);
  }
}
