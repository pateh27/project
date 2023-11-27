import java.util.Scanner;
public class login2user {
    
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
                    System.out.println("Login Berhasil sebagai Admin");
                    break;
                } else if (usnLogin.equalsIgnoreCase("owner") && pinLogin.equalsIgnoreCase("11924")) {
                    System.out.println("Login Berhasil sebagai Owner");
                    break;
                } else {
                    System.out.println("Login Gagal. Sisa percobaan : " +(maksPercobaan - i));
                    if ( i == maksPercobaan) {
                        System.out.println("Anda telah mencapai batas percobaan. Akun diblokir");
                        return;
                    }
                }
            }
        }
}



