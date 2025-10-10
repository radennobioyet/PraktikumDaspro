1. Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan operator relasional? 
   jawab : karena nilai boolean sudah mewakili kondisi benar atau salah, operator relasional tidak diperlukan.
2. Saat program dijalankan, kemudian Anda mengisikan nilai false, bagaimana hasilnya? 
   jawab : tidak muncul apapun, program langsung selesai tanpa output. 
3. Sistem perlu memberikan informasi apabila pengguna memasukkan nilai false, maka terdapat keluaran “Registrasi ditolak. Silakan lunasi UKT terlebih dahulu”. Modifikasi program tersebut dengan menambahkan struktur ELSE! 
   jawab : 
   
```
import java.util.Scanner;

public class IfCetakKRS20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS Siakad ---");
        System.out.println("Apakah UKT Sudah Lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan Cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }
    }
}
```
