
import java.util.Scanner;

public class IzinMasukPerpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean bawaKTM, sudahRegistrasi;

        System.out.println("=== Sistem Izin Masuk Perpustakaan ===");
        System.out.print("Apakah mahasiswa membawa kartu mahasiswa? (true/false): ");
        bawaKTM = input.nextBoolean();

        System.out.print("Apakah mahasiswa sudah melakukan registrasi online? (true/false): ");
        sudahRegistrasi = input.nextBoolean();

        // Logika izin masuk
        if (bawaKTM || sudahRegistrasi) {
            System.out.println("Izin masuk diberikan. Silakan masuk ke perpustakaan.");
        } else {
            System.out.println("Maaf, Anda tidak memenuhi syarat. Akses ditolak.");
        }

        input.close();
    }
}

