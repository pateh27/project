import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SistemGudangA1{
    public static void login(){
        System.out.println("=================SISTEM GUDANG A1====================");
        System.out.println("|          SELAMAT DATANG DI GUDANG A1              |");
        System.out.println("|        MASUKKAN USERNAME DAN PIN ANDA             |");
        System.out.println("=====================================================");
    }
    public static void tampilMenu(){
        System.out.println("====================Menu Utama=======================");
        System.out.println("| \t 1. RAK SEMBAKO                             |");
        System.out.println("| \t 2. RAK KOSMETIK                            |");
        System.out.println("| \t 3. RAK PAKAIAN                             |");
        System.out.println("=====================================================");
    }    
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        login();
        // percobaan login
        int maksPercobaan = 3;
        for(int i = 1; i <= maksPercobaan;i++){
            System.out.print("Username : ");
            String usnLogin = print.nextLine();
            System.out.print("PIN : ");
            String pinLogin = print.nextLine();
            // cek usn dan pin
            if(usnLogin.equalsIgnoreCase("admin")&& pinLogin.equalsIgnoreCase("gudang123")){
                System.out.println("Login Berhasil");
                break;
            } else {
                System.out.println("Login Gagal. Sisa percobaan : " +(maksPercobaan - i));
                if ( i == maksPercobaan) {
                    System.out.println("Anda telah mencapai batas percobaan. Akun diblokir");
                    return;
                }
            }
        }
        // inisiasi data utama
        String[] rakSembako = {"beras", "gula", "telur", "minyak", "kopi", "teh", "kecap", "garam", "mie"};
        String[] rakKosmetik = {"facewash", "toner", "serum", "sunscreen", "lipcream", "liptint", "body serum"};
        String[] rakPakaian = {"kaos", "kemeja", "rok", "celana jeans", "jaket", "hoodie", "sweater", "cardigan"};
        tampilMenu();
        // pemilihan rak 
        int pilihan = print.nextInt();
        if(pilihan == 1){
            for (int i=0; i<rakSembako.length; i++) {
                String element = rakSembako[i];
                System.out.println("" + (i+1) + " " +element);
            }
            //pemilihan item
            int pilSembako = print.nextInt();
            if (pilSembako == 1) {
                System.out.println("INVENTARIS BERAS");
                
            }
        }
    }
        
}    

