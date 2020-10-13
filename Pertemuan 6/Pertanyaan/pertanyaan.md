### Percobaan 1 (extends)
<img src = "1_1.png">

pertanyaan 1 :

1. Pada percobaan 1 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga
program tersebut bisa dijalankan dan tidak error!
<img src = "1_2.png">
<img src = "1_12.png">

2. Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!
~code error karena kita belum menambahkan command extends pada class b

### Percobaan 2 (hak akses)
<img src = "2.png">

pertanyaan 2 : 

1.Pada percobaan 2 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga
program tersebut bisa dijalankan dan tidak error!
<img src = "2_1.png">
<img src = "2_12.png">
<img src = "2_13.png">

2.Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!
Terdapat eror didalam 2 class yang akan saya jelaskan seperti berikut ini:
~Pada ClassA terjadi error karena tipe modifiernya adalah private sehingga tidak bisa terbaca pada ClassB
~Belum ditambahkan extends ClassA sehingga data yang ada pada ClassA belum tertambahkan ke dalam ClassB

### percobaan 3 
<img src = "3.png">

pertanyaan no 3 : 
1. Jelaskan fungsi “super” pada potongan program berikut di class Tabung!

jawab : Fungsi dari super yang berapa pada super.phi dan super.r adalah untuk mengisi variabel yang ada diluar class. Karena variabel phi dan r berada pada Bangun dan baru diisi didalam Tabung sehingga kita perlu menggunkan super untuk mengisi variabel phi dan r yang berada diluar Tabung. 

2.Jelaskan fungsi “super” dan “this” pada potongan program berikut di class Tabung!

jawab : Fungsi "super" dan "this" pada method volume adalah sama sama memanggil variabel, tetapi "super" untuk memanggil variabel yang berada diluar class sedangkan untuk "this" memanggil variabel yang ada di dalam class.

3. Jelaskan mengapa pada class Tabung tidak dideklarasikan atribut “phi” dan “r” tetapi class
tersebut dapat mengakses atribut tersebut!

jawab : Pada Class Tabung tidak dideklarasikan "phi" dan "r" tetapi class tersebut dapat mengakses atribut tersebut dikarenakan penggunan "super" pada atribut mereka. Karena fungsi "super" sendiri adalah mengisi variabel yang ada diluar class. Serta ditambahkannya extends Bangun yang digunakan sebagai jembatan atau penghubung dari Bangun dan Tabung sehingga atributnya juga dapat dideklarasi pada class Tabung.

### percobaan 4
<img src = "4.png">

pertanyaan 4 :
1. Pada percobaan 4 sebutkan mana class yang termasuk superclass dan subclass, kemudian
jelaskan alasannya!

Jawab : - superclass adalah ClassA
	- subclass adalah ClassB dan ClassC
	Hal tersebut dikarenakan ClassB dan ClassC maarupakan turunan atau mendapatkan warisan dari ClassA.

2. Tambahkan kata super() di baris Pertaman dalam konstruktor defaultnya. Coba jalankan
kembali class Percobaan4 dan terlihat tidak ada perbedaan dari hasil outputnya!

Jawab : Tidak ada perubahan dari hasil outputnya, tetap sama dengan sebelumnya.

3. Ketika mengubah posisi super() dibaris kedua dalam kontruktor defaultnya dan terlihat ada
error. Kemudian kembalikan super() kebaris pertama seperti sebelumnya, maka errornya
akan hilang.
Perhatikan hasil keluaran ketika class Percobaan4 dijalankan. Kenapa bisa tampil output
seperti berikut pada saat instansiasi objek test dari class ClassC 

Jawab : Terjadi eror apabila "super();" dituliskan setelah konstruktor dikarenakan objek akan mengeksekusi di konstruktor parentclass karena ClassC merupakan turunan dari ClassB dan ClassB adalah turunan dari ClassA.

4. Apakah fungsi super() pada potongan program dibawah ini di ClassC!

Jawab : Fungsi dari "super();" adalah agar dapat merujuk ke konstruktor parentclass.