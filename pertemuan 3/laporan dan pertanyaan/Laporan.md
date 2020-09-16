# Laporan Tugas Jobsheet 3

1. Cobalah program dibawah ini dan tuliskan hasil outputnya

~ source code EncapDemo :

<img src = "2.png">

~ source code EncapTest :

<img src = "1.png">


~ output :

<img src = '3.png'>

2. Pada program diatas, pada class EncapTest kita mengeset age dengan nilai 35, namun pada saat ditampilkan ke layar nilainya 30, jelaskan mengapa.

jawaban : karena terdapat if (newAge > 30) {
            age = 30;
        } yang artinya umur diatas 30 tahun dianggap 30 sehingga saat memasukkan nilai 35 yang keluar tetaplah 30.

3. Ubah program diatas agar atribut age dapat diberi nilai maksimal 30 dan minimal 18.

~ source code EncapDemo :

<img src = "4.png">

~ source code EncapTest :

<img src = "5.png">


~ output :

<img src = '6.png'>

4. Pada sebuah sistem informasi koperasi simpan pinjam, terdapat class Anggota yang memiliki
atribut antara lain nomor KTP, nama, limit peminjaman, dan jumlah pinjaman. Anggota
dapat meminjam uang dengan batas limit peminjaman yang ditentukan. Anggota juga dapat
mengangsur pinjaman. Ketika Anggota tersebut mengangsur pinjaman, maka jumlah
pinjaman akan berkurang sesuai dengan nominal yang diangsur. Buatlah class Anggota
tersebut, berikan atribut, method dan konstruktor sesuai dengan kebutuhan. Uji dengan
TestKoperasi berikut ini untuk memeriksa apakah class Anggota yang anda buat telah sesuai
dengan yang diharapkan

<img src = '7.png'>

<img src = '8.png'>

~ output :

<img src = '9.png'>

5. Modifikasi soal no. 4 agar nominal yang dapat diangsur minimal adalah 10% dari jumlah
pinjaman saat ini. Jika mengangsur kurang dari itu, maka muncul peringatan “Maaf,
angsuran harus 10% dari jumlah pinjaman”.

~ source code Anggota :

<img src = '10.png'>

<img src = '12.png'>


~ source code TestKoperasi :

<img src = '13.png'>

~ output :

<img src = '11.png'>

6. Modifikasi class TestKoperasi, agar jumlah pinjaman dan angsuran dapat menerima input
dari console.

~ source code :

<img src = '20.png'>

<img src = '21.png'>

~ output :

1.
<img src = '14.png'>

2.
<img src = '15.png'>

3.
<img src = '16.png'>
