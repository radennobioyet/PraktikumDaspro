import java.util.Scanner;

public class IfCetakKRS20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS Siakad ---");
        System.out.println("Apakah UKT Sudah Lunas? (ya/tidak): ");
        boolean uktLunas = sc.nextBoolean();

               // Tambahan:versiTernaryOperator
        String hasil = uktLunas ? "Pembayaran UKT terverifikasi\n Silakan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu";
        System.out.println("\n===Versi Ternary Operator===");
        System.out.println(hasil);
    }
}
