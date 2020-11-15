# Jawaban Pertanyaan Jobsheet 11

## Percobaan 1
1. Pada langkah ke 9, pada baris program ke 3 terdapat warning pada script tersebut. Jelaskan penyebab terjadinya hal tersebut ?
Jawab : Penyebab adanya warning pada baris program ke 3 adalah dikarenakan class interface ICumlaude yang dipanggil pada class interfacemain masih berada dalam satu package dan meskipun import pada class interfacemain dihapus program tetap berjalan.

2. Pada langkah ke 9, pada baris program ke 3. Apa yang terjadi jika script tersebut dihilangkan? Jelaskan menurut pemahaman anda.
Jawab : Apabila baris program ke 3 dihilangkan yang akan terjadi adalah pada saat dirun outputnya adalah build succesfull karena tidak ada intansiasi dari class-class yang dipanggil. Jadi eksekusi dari program berjalan dengan lancar namun tidak memiliki output dikarenakan tidak adanya instansiasi class-class yang dibutuhkan untuk mengisi class interfacemain.

3. Mengapa pada langkah nomor 9 terjadi error? Jelaskan!
Jawab : Pada langkah nomor 9 terjadi eror dikarenakan class mahasiswa belum melakukan implements ke class interface ICumlaude sehingga variabel mahasiswa yang tercantum pada class interfacelamain tidak dapat terbaca.

4. Dapatkah method kuliahDiKampus() dipanggil dari objek sarjanaCumlaude di class Program? Mengapa demikian?
Jawab : Apabila method kuliahDiKampus() dipanggil dari objek sarjanaCumlaude di class program yang terjadi adalah program eror. Hal tersebut dikarenakan method kuliahDiKampus() bukan termasuk bagian implementasi karena method kuliahDiKampus() merupakan bagian dari class mahasiswa.

5. Dapatkah method kuliahDiKampus() dipanggil dari parameter mahasiswa di method beriSertifikatCumlaude() pada class Rektor? Mengapa demikian?
Jawab : Method kuliahDiKampus() tidak dapat dipanggil dari parameter mahasiswa di method beriSertifikatCumlaude() pada class Rektor dikarenakan method kuliahDiKampus() bukan dalam bagian implementasi, karena method tersebut berada dalam class mahasiswa bukan di dalam method hasil implements

6. Modifikasilah method beriSertifikatCumlaude() pada class Rektor agar hasil eksekusi class Program menjadi seperti berikut ini:
Jawab : 
<img src = '1.png'>

<img src = '2.png'>

--OUTPUT--

<img src = 'Per6.png'>

## Percobaan 2
1. Pada script code interface IBerprestasi, modifikasi script tersebut sesuai dengan gambar
dibawah ini : Dari perubahan script diatas, apa yang terjadi ? serta jelaskan alasannya (capture hasilnya) 
Jawab: error karena secara implisit, modifier untuk method di interface adalah public dan abstract sehingga tanpa menuliskan modifier akan otomatis public dan abstract. artinya method abstract interface harus public, tidak boleh selain public.

<img src = 'P21.png'>

2. Perhatikan script code dibawah ini : Jelaskan menurut anda, mengapa hasil dari script code tersebut error ? 
Jawab: karena Interface tidak dapat dibuat objek instance-nya dengan kata kunci new.

<img src = 'P22.png'>

3. Apabila Sarjana Berprestasi harus menjuarai kompetisi NASIONAL dan
menerbitkan artikel di jurnal NASIONAL, maka modifikasilah class-class yang terkait
pada aplikasi Anda agar di class Program objek pakRektor dapat memberikan sertifikat
mawapres pada objek sarjanaCumlaude.
Jawab: 

-- SOURCE CODE --

- Class Sarjana

<img src = 'P23.png'>

-- OUTPUT --

<img src = 'P33.png'>