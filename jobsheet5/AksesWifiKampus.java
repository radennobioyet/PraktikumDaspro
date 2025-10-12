
import java.util.Scanner;

public class AksesWifiKampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Jenis Pengguna (dosen/mahasiswa): ");
        String user = sc.nextLine();
        
        if (user.equalsIgnoreCase("dosen")) {
            System.out.println("Akses WIFI diberikan (dosen)");
       
        } else if (user.equalsIgnoreCase("mahasiswa" )) {
            System.out.println("Masukkan sks : ");
            int sks = sc.nextInt();
            System.out.println( sks >= 12 ? "Akses wifi di berikan (mahasiswa aktif)" : "Akses wifi ditolak, SKS kurang dari 12");
        }
        
    }
}
