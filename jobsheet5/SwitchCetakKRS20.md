# JOBSHEET 5
# Percobaan 2
1. Apa fungsi dari sintaks break? 

jawab : break digunakan untuk menghentikan proses atau keluar dari blok tertentu.

2. Apa peran dari sintaks default pada struktur pemilihan SWITCH-CASE? 

jawab : default digunakan sebagai blok yang dijalankan ketika tidak ada satu pun case yang cocok.

3. Buat file baru dengan nama ifElseCetakKRSNoPresensi.java. File ini berisi program hasil transformasi dari program cetak KRS menggunakan struktur SWITCH-CASE yang telah dibuat ke dalam bentuk IF-ELSE IF-ELSE. 

jawab : 
```
import java.util.Scanner;

public class IfElseCetakKRS20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan semester saat ini: ");
        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("KRS Semester 1 ditampilkan");
        } else if (semester == 2) {
            System.out.println("KRS Semester 2 ditampilkan");
        } else if (semester == 3) {
            System.out.println("KRS Semester 3 ditampilkan");
        } else if (semester == 4) {
            System.out.println("KRS Semester 4 ditampilkan");
        } else if (semester == 5) {
            System.out.println("KRS Semester 5 ditampilkan");
        } else if (semester == 6) {
            System.out.println("KRS Semester 6 ditampilkan");
        } else if (semester == 7) {
            System.out.println("KRS Semester 7 ditampilkan");
        } else if (semester == 8) {
            System.out.println("KRS Semester 8 ditampilkan");
        } else {
            System.out.println("semester tidak valid");
        }
        sc.close();
    }
}
```
4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 2” 

jawab : “Modifikasi Percobaan 2”