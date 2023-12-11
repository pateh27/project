
import java.util.Scanner;

public class gudang {
    private static Scanner scanner;

static int[][] stokBarang = new int[3][5];
static int[] hargaBarang = {1000, 500, 1000, 1500, 2000};

public static void main(String[] args) {
    scanner = new Scanner(System.in);
    features();
    int pilihFeature = scanner.nextInt();
    switch (pilihFeature) {
        case 1: tambahStok(); break;
        case 2: kurangStok(); break;
        case 3: hitungValuasi(); break;
        case 4: suratJalan(); break;
        case 5: scanner.close(); System.exit(0);
        default: System.out.println("Feature tidak ditemukan!");
    }
}

static void tambahStok() {
    int jenisBarang, jumlahBarang;
    tampilJenisBarang();
    jenisBarang = scanner.nextInt();
    System.out.print("Masukkan jumlah barang: ");
    jumlahBarang = scanner.nextInt();
    tambahStokBarang(jenisBarang, jumlahBarang);
}

static void kurangStok() {
    int jenisBarang, jumlahBarang;
    tampilJenisBarang();
    jenisBarang = scanner.nextInt();
    System.out.print("Masukkan jumlah barang: ");
    jumlahBarang = scanner.nextInt();
    kurangStokBarang(jenisBarang, jumlahBarang);
}

static void hitungValuasi() {
    int jenisBarang, angka;
    tampilJenisBarang();
    jenisBarang = scanner.nextInt();
    System.out.print("Masukkan angka: ");
    angka = scanner.nextInt();
    int val = hitungValuasiBarang(jenisBarang, angka);
    System.out.println("Valuasi : " + val);
}

static void suratJalan() {
    int jenisBarang, jumlahBarang;
    tampilJenisBarang();
    jenisBarang = scanner.nextInt();
    System.out.print("Masukkan jumlah barang: ");
    jumlahBarang = scanner.nextInt();
    print.close();
    System.out.println("==============================");
    System.out.println("|     SURAT JALAN BARANG     |");
    System.out.println("==============================");
    System.out.println("|   Nama Barang: " + namaBarang(jenisBarang));
    System.out.println("|   Jumlah Barang: " + jumlahBarang);
    System.out.println("==============================");
    System.exit(0);
}

static void tampilJenisBarang() {
    System.out.println("==============================");
    System.out.println("|     TAMPIL JENIS BARANG    |");
    System.out.println("==============================");
    System.out.println("|   1. SEMBAKO\t\t\t |");
    System.out.println("|   2. KOSMETIK\t\t\t |");
    System.out.println("|   3. PAKAIAN\t\t\t |");
    System.out.println("==============================");
    System.out.print("Pilih jenis barang: ");
}

static String namaBarang(int jenisBarang) {
    String rakSembako[] = {"beras", "garam", "gula", "telur", "minyak"};
    String rakKosmetik[] = {"facewash", "toner", "serum", "sunscreen", "lipcream"};
    String rakPakaian[] = {"kaos", "celana", "jaket", "sepatu", "topi"};

    if (jenisBarang >= 1 && jenisBarang <= 5) {
        return rakSembako[jenisBarang - 1];
    } else if (jenisBarang >= 6 && jenisBarang <= 10) {
        return rakKosmetik[jenisBarang - 6];
    } else if (jenisBarang >= 11 && jenisBarang <= 15) {
        return rakPakaian[jenisBarang - 11];
    } else {
        return "Barang tidak ditemukan!";
    }
}

static void tambahStokBarang(int jenisBarang, int jumlahBarang) {
    if (jenisBarang >= 1 && jenisBarang <= 15) {
        stokBarang[jenisBarang - 1][1] += jumlahBarang;
        System.out.println("Stok berhasil ditambahkan!");
    } else {
        System.out.println("Barang tidak ditemukan!");
    }
}

static void kurangStokBarang(int jenisBarang, int jumlahBarang) {
    if (jenisBarang >= 1 && jenisBarang <= 15) {
        if (stokBarang[jenisBarang - 1][1] >= jumlahBarang) {
            stokBarang[jenisBarang - 1][1] -= jumlahBarang;
            System.out.println("Stok berhasil dikurangi!");
        } else {
            System.out.println("Stok barang tidak mencukupi!");
        }
    } else {
        System.out.println("Barang tidak ditemukan!");
    }
}

static int hitungValuasiBarang(int jenisBarang, int angka) {
    if (jenisBarang >= 1 && jenisBarang <= 15) {
        return hargaBarang[jenisBarang - 1] * angka;
    } else {
        return 0;
    }
}
//tak tambahi dewe iki
static void features(){
    System.out.println("==============================");
    System.out.println("|     TAMPIL FITUR GUDANG    |");
    System.out.println("==============================");
    System.out.println("|   1. Tambah Stok\t\t\t |");
    System.out.println("|   2. Kurang Stok\t\t\t |");
    System.out.println("|   3. Hitung Valuasi\t\t\t |");
    System.out.println("|   4. Surat Jalan\t\t\t |");
    System.out.println("|   5. Exit\t\t\t |");
    System.out.println("==============================");
  }
}


