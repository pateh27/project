
import java.time.LocalDate;

public class coba {
    private String nama;
    private LocalDate tanggalKedaluwarsa;

    public coba(String nama, LocalDate tanggalKedaluwarsa) {
        this.nama = nama;
        this.tanggalKedaluwarsa = tanggalKedaluwarsa;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTanggalKedaluwarsa() {
        return tanggalKedaluwarsa;
    }

    public boolean isExpired() {
        LocalDate today = LocalDate.now();
        return tanggalKedaluwarsa.isBefore(today);
    }

    public static void main(String[] args) {
        LocalDate tanggalKedaluwarsa = LocalDate.of(2023, 9, 20); // Ganti dengan tanggal kedaluwarsa yang sesuai
        coba produk = new coba("Produk teh", tanggalKedaluwarsa);

        System.out.println("Nama Produk: " + produk.getNama());
        System.out.println("Tanggal Kedaluwarsa: " + produk.getTanggalKedaluwarsa());

        if (produk.isExpired()) {
            System.out.println("Produk telah kedaluwarsa.");
        } else {
            System.out.println("Produk masih berlaku.");
        }
    }
} 


