# JOBSHEET 5
# Percobaan 3
1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? Mengapa demikian? 

jawab : 
```
Apakah Mahasiswa Sudah Bebas Kompen? (Ya/Tidak): 
tidak
Masukkan jumlah log bimbingan Pembimbing 1: 8
Masukkan jumlah log bimbingan Pembimbing 2: 8
Gagal! Mahasiswa masih memiliki tanggungan kompen.
PS C:\Daspro\PraktikumDaspro> 
```
jika menjawab "No" maka akan menjalankan else dan program menampilkan pesan bahwa mahasiswa belum bebas kompen.

2. Jelaskan maksud dari potongan kode berikut!
   ``` 
   if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
   ```

   jawab : Potongan kode tersebut bermaksud mengecek apakah kedua syarat bimbingan sudah terpenuhi, yaitu bimbingan P1 minimal 8 kali dan bimbingan P2 minimal 4 kali. Jika kedua syarat benar, maka program akan menjalankan perintah di dalam blok tersebut.

3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara runtut untuk semua kondisi! 

jawab : 
```
1 Program dimulai dengan meminta input dari pengguna:

Status apakah mahasiswa sudah bebas kompen (Ya/Tidak)

Jumlah log bimbingan Pembimbing 1

Jumlah log bimbingan Pembimbing 2

2 Pemeriksaan pertama – Status Bebas Kompen:

Jika mahasiswa menjawab “Tidak”, maka program langsung menampilkan:

“Gagal! Mahasiswa masih memiliki tanggungan kompen.”
(Pemeriksaan berhenti sampai di sini, karena belum bebas kompen.)

Jika mahasiswa menjawab “Ya”, maka dilanjutkan ke pemeriksaan jumlah log bimbingan.

3 Pemeriksaan kedua – Jumlah Log Bimbingan:
Dilakukan hanya jika mahasiswa sudah bebas kompen.

Kondisi 1:
Jika bimbingan P1 ≥ 8 dan bimbingan P2 ≥ 4,
maka semua syarat terpenuhi → “Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi.”

Kondisi 2:
Jika bimbingan P1 < 8 dan bimbingan P2 < 4,
maka kedua log bimbingan belum cukup → “Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali.”

Kondisi 3:
Jika hanya bimbingan P1 < 8, sedangkan P2 sudah memenuhi,
maka → “Gagal! Log bimbingan P1 belum mencapai 8 kali.”

Kondisi 4:
Jika hanya bimbingan P2 < 4, sedangkan P1 sudah memenuhi,
maka → “Gagal! Log bimbingan P2 belum mencapai 4 kali.”

4 Program berakhir dengan menampilkan pesan hasil pemeriksaan sesuai kondisi yang terjadi.
```