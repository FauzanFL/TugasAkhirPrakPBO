# LAPORAN TUGAS BESAR PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK
  
<hr>

### PENDAHULUAN

<hr>

**1.1 Latar Belakang** <br>

Pada era modern seperti ini banyak masyarakat membutuhkan kendaraan untuk bepergian seperti kendaraan pribadi, kebanyakan kendaraan yang dibutuhkan dan diminati yaitu kendaraan roda empat. Dengan menggunakan kendaraan pribadi itu lebih leluasa dalam beraktivitas di bandingkan dengan menggunakan kendaraan umum. Oleh karena itu dengan menggunakan java kami mencoba membuat program yang nantinya dapat membantu kegiatan penyewaan kendaraan. <br>

**1.2 Tujuan** <br>

Selain untuk memenuhi tugas matakuliah Praktikum Pemrograman Berbasis Objek dengan membuat sebuah program bertemakan "Penyewaan Kendaraan", program ini dibuat juga untuk membantu masyarakat mendapatkan kendaraan yang aman dan nyaman. Juga untuk membantu mengembangkan usaha penyewaan yang terkadang masih sulit untuk mencari yang terpercaya. Dan juga selain tujuan di atas tersebut ini juga bertujuan untuk memudahkan mahasiswa mengerti tentang java dengan mengimplementasikan ilmu yang di peroleh pada semester ini.
<br><br>

<hr>

### DASAR TEORI

<hr>

**2.1 Definisi** <br>

Penyewaan adalah sebuah persetujuan di mana sebuah pembayaran dilakukan atas penggunaan suatu barang atau properti secara sementara oleh oranglain.
Ada beberapa pengertian tentang Penyewaan, tetapi semuanya hampir memiliki kesamaan pengertian yang mengarah pada penggunaan barang secara sementara. Berikut beberapa pengertian tentang Penyewaan.
a. Dalam KBBI
   penyewaan : pe.nye.wa.an
   proses, cara, perbuatan menyewa atau menyewakan.
b. Menurut Sadono Sukirno
   Sewa adalah bagian pembayaran ke atas suatu faktor produksi yang melebihi dari pendapatan yang diterimanya dari pilihan pekerjaan lain yang terbaik yang mungkin dilakukannya.
c. Menurut Raymodus
   Sewa sebagai sejumlah atau uang yang dibayarkan kepada pemilik tanah oleh pihak yang menggunakan tanah sebagai balas jasa untuk pengunaan tanah tersebut.
d. Menurut Kimmel
   Penyewaan adalah perjanjian dimana pemilik dari aset perusahaan memungkinkan pihak lain untuk menggunakan aset yang ada untuk jangka waktu tertentu pada harga yang telah disepakati. 
   
<br> **2.2 Java** <br>
Java adalah bahasa pemrograman yang multi platform dan multi device. Slogan Java adalah "Tulis sekali, jalankan manapun". Sekarang ini Java menjadi sebuah bahasa pemrograman yang populer dan dimanfaatkan secara luas untuk pengembangan perangkat lunak. Kebanyakan perangkat lunak yang menggunakan Java adalah ponsel feature dan ponsel pintar atau smartphone. Kelebihan dan kekurangan Java. Kelebihan Java yang pertama tentu  saja  multiplatform. Java dapat dijalankan dalam beberapa platform komputer dan sistem operasi yang berbeda. Hal ini sesuai dengan slogannya yangs sudah dibahas sebelumnya. Yang kedua adalah OOP   atau Object Oriented Programming. Java memiliki library yang lengkap. Library disini adalah sebuah kumpulan dari program yang disertakan dalam Java. Hal ini akan memudahkan pemrograman menjadi lebih mudah. Kelengkapan library semakin beragam jika ditambah dengan karya komunitas Java. Kekurangan Java yang pertama, kemudahan aplikasi Java yang di dekompilasi yaitu suatu proses membalikkan sebuah aplikasi menjadi kode sumbernya. Kedua, penggunaan memori cukup banyak lebih besar daripada bahasa tingkat tinggi sebelum generasi Java. Namun, apapun kekurangan yang dimiliki Java faktanya Java merupakan bahasa pemrograman yang populer dan digunakan di seluruh dunia.

<br> **2.3 Intellij IDEA** <br>

Sebuah IDE yang diekambangkan oleh Jetbrains. Intellij IDEA tersedia dalam dua versi, yaitu versi Community Edition dengan lisensi Apache 2 Licensed yang dapat digunakan secara gratis dan yang kedua versi Ultimate Edition untuk penggunaan komersial. IDE yang ditulis dengan Java dan Kotlin ini dirilis versi pertamanya pada januari 2011 dan langsung menjadi IDE pertama untuk pengembangan aplikasi berbasis Java. Ia mendukung navigasi kode tingkat lanjut dan kemampuan refactoring yang saling terintegrasi. Pada umumnya, sebuah IDE menyediakan beberapa fitur seperti text editor yang akan dapat digunakan untuk menulis kode, tools untuk mengotomatisasi proses build dari program yang di buat dan juga debugger yang akan membantu mendeteksi dan memperbaiki kesalahan yang terdapat pada program.

<br> **2.4 Dasar Pemrograman Java** <br>
* Identifier
  Penamaan identifier harus diawali dengan karakter unicode, tanda $ 
(dollar) atau tanda _ (underscore). Penamaan identifier ini bersifat casesensitive dan tidak dibatasi panjang maksimum.

* Kata Kunci
  Identifier yang telah dipesan untuk didefinisikan sebelumnya oleh Java untuk tujuan tertentu. Kita tidak dapat menggunakan keyword sebagai nama variabel, class, method.

* Tipe Data
  Java mempunyai 8 tipe dasar, yaitu boolean, char, byte, short, int, 
long, float, dan double.

* Variable
  Item yang digunakan data untuk menyimpan pernyataan objek.
  
<br> **2.5 Pengenalan Pemrograman Berorientasi Objek** <br>

* Pengenalan Pemrograman Berorientasi Objek
  Pemrograman Berorientasi Objek (Object Oriented Programming/OOP) merupakan pemrograman yang berorientasikan kepada objek, dimana semua data dan fungsi dibungkus dalam classclass atau object-object.

* Deklarasi Class
  Class adalah wadah yang berisi abstraksi (pemodelan) dari suatu 
fungsi objek (benda), yang mendeskripsikan data (sifat karakteristik) dan fungsi yang dimiliki oleh objek tersebut.

* Deklarasi Atribut
  Attributes merupakan nilai (type) data yang terdapat pada suatu object 
yang berasal dari class. Attributes merepresentasikan karakteristik dari 
suatu object.

* Deklarasi Metode
  Metode/method adalah sesuatu yang dapat dilakukan oleh objek. 
Method dalam implementasi program ditulis dalam bentuk fungsi. 
Metode menentukan apa yang terjadi ketika objek itu dibuat serta
berbagai operasi yang dapat dilakukan objek.

* Pengaksesan Anggota Obyek
  Untuk dapat mengakses anggota-anggota dari suatu obyek, maka 
harus dibuat instance dari class tersebut terlebih dahulu.

<br> **2.6 Dasar Pemrograman Berorientasi Objek** <br>

* Information Hiding
  Menyembunyikan atribut dan method suatu
objek dari objek lain. Informasi dari suatu class disembunyikan agar anggotaanggota tersebut tidak dapat diakses dari luar. Adapun caranya adalah cukup dengan memberikan akses control private ketika mendeklarasikan suatu atribut atau method.

* Enkapsulasi
  Suatu cara untuk menyembunyikan implementasi detail dari suatu class.

* Constructor
  Suatu method yang pertama kali dijalankan pada saat pembuatan suatu obyek. Konstruktor ini merupakan method yang berfungsi untuk menginisialisasi variabel-variabel instans yang akan di miliki oleh objek. Konstruktor dipanggil pada saat proses instansiasi kelas menjadi objek.

* Overloading Constructor
  Merupakan suatu class yang mempunyai lebih dari satu constructor dengan syarat daftar parameternya tidak boleh ada yang sama.
  
<br> **2.7 Mengelola Class** <br>

* Package
  Suatu cara untuk memanage class-class yang dibuat. Pakage akan sangat bermanfaat jika class-class yang dibuat sangat banyak sehingga perlu dikelompokan berdasarkan kategori tertentu. Yang harus diperhatikan adalah biasanya nama class utama harus sama dengan nama package.

* Import Class
  Digunakan untuk memberitahukan kepada program untuk mengacu pada class-class yang terdapat dalam package tertentu, bukan menjalankan class-class tersebut.

* Kata Kunci this
  Digunakan dalam sebuah kelas untuk menyatakan object sekarang. Kata kunci this sangat berguna untuk menunjukkan suatu member dalam class-nya sendiri. this dapat digunakan baik untuk data member maupun untuk function member, serta dapat juga digunakan untuk konstruktor.
  
<br> **2.8 Konsep Inheritance** <br>

* Pengertian Inheritance
  Dalam bahasa Indonesia inheritance disebut juga sebagai pewarisan atau penurunan. Inheritance merupakan konsep pemrograman dimana sebuah class dapat menurunkan property dan method yang di milikinya kepada class lain. Konsep inheritance digunakan untuk memanfaatkan fitur code reuse untuk menghindari duplikasi kode program. Konsep inheritance membuat sebuah struktur atau hierarchy class dalam kode program. Class yang akan diturunkan bisa disebut sebagai class induk (parents class), super class atau base class. Sedangkan class yang menerima penurunan bisa disebut juga sebagai class anak (child class), sub class, derrived class atau heir class. Tidak semua property dan method dari class induk akan diturunkan. Property dan method dengan hak akses perotected dan public saja yang dapat diakses dari class anak.
Suatu class yang mempunyai class turunan di namakan parents class atau base class sedangkan class turunan itu sendiri sering disebut subclass atau child class. Suatu subclass dapat mewarisi apa-apa yang di punyai oleh parents class. Karena suatu subclass dapat mewarisi apa-apa yang di punyai oleh parents class nya, maka member dari suatu subclass itu terdiri dari apa-apa yang di milikinya dan juga apa-apa yang di warisi dari class parent nya.

* Kata Kunci super
  Kata kunci super digunakan untuk merujuk pada member dari parents class, seperti pada kata kunci this yang digunakan untuk merujuk pada member dari class itu sendiri. Beberapa hal yang harus diingat ketika menggunakan pemanggil constructor this
  a. Pemanggil super() harus dijadikan pernyataan pertama dalam constructor
  b. Pemanggil super() hanya dapat digunakan dalam definisi constructor
  c. Constructor this() dan pemanggil super() tidak boleh terjadi dalam constructor yang sama 
  
<br> **2.9 Overloading dan Overriding** <br>

* Overloading
  Merupakan konsep pemrograman di mana beberapa method memiliki nama yang sama pada suatu class tetapi memiliki parameter yang berbeda. Yang artinya saat membuat sebuah class dan di dalam class tersebut terdapat beberapa method dengan nama yang sama dan memiliki parameter yang berbeda sehingga di namakan dengan overloading.

* Overriding
  Merupakan sebuah kondisi di mana method yang terdapat pada class utama (parent class) digunakan kembali pada sub class (class anak).
  
<br> **2.10 Polimorfisme** <br>

* Konsep Dasar Polimorfisme
  Polimorfisme dalam OOP adalah sebuah prinsip di mana class dapat memiliki banyak bentuk dengan method yang berbeda-beda meskipun namanya sama. Polimorfisme terjadi pada saat obyek bertipe parent class akan tetapi pemanggilan constructornya melalui subclass.

* Virtual Method Invocation
  Virtual Method Invocation dapat terjadi jika terjadi poliformisme dan overriding. Obyek yang sudah dibuat akan memanggil overriding method pada parent class dan setelah itu kompiler java akan melakukan invocation (pemanggilan) terhadap overriding method pada subclass.

* Polymorphic Arguments
  Merupakan suatu tipe parameter yang menerima suatu nilai yang bertipe subclass-nya.

* Pernyataan Instanceof
  Merupakan keyword pada java yang digunakan untuk membandingkan suatu objek apakah instansiasi dari suatu class atau tidak, hasil dari perbandingan tersebut akan menghasilkan nilai boolean berupa nilai true atau false.

* Casting Object
  Merupakan proses konversi data dari tipe data tertentu ke tipe data yang lain.
  
<br> **2.11 Exception** <br>

* Exception Handling
  Exception adalah singkatan dari Exceptional Events. Exception merupakan kondisi abnormal yang terjadi saat runtime (program berjalan). Dalam java terdapat sebuah teknik untuk menangani kondisi yang tidak biasa saat menjalankan operasi normal dalam program yang dinamakan dengan exception handling. Dalam java segala seusatu merupakan objek maka exception juga termasuk dalam sebuah object yang menjelaskan tentang exception tersebut.
<br><br>

<hr>

### KERANGKA PROGRAM

<hr>

1. Mulai
2. Pendaftaran
3. Pendaftaran Pegawai
4. Login
5. Input username dan password
6. Jika menu utama maka masuk menu utama
   Jika Pemilik maka masuk menu Pemilik
   Jika Penyewa maka masuk menu Penyewa
   Jika Pegawai maka masuk menu Pegawai
7. Menu Utama, terdapat 4 menu yaitu pendaftaran, pendaftaran menjadi pegawai, login, keluar
8. Menu 1 pada menu utama (Pendaftaran)
   * Inputkan nama, umur alamat, username dan password
   * Daftar dan Simpan
   * Kembali ke menu awal pada menu
9. Menu 2 pada menu utama (Pendaftaran pegawai)
   * Inputkan nama, username dan password
10. Menu 3 pada menu utama (Login)
   * Masukkan username dan pasword
11. Menu 4 pada menu utama (Logout)
12. Menu Pemilik, terdapat 8 menu yaitu cek mobil, tambah mobil, hapus mobil, daftar penyewa, hapus penyewa, daftar pegawai, hapus pegawai dan logout
13. Menu 1 pada menu pemilik (Cek mobil)
   Mengecek apakah data mobil sudah ada
14. Menu 2 pada menu pemilik (Tambah mobil)
   * Inputkan nama atau jenis mobil
   * Inputkan nomor plat
   * Inputkan kecepatan
   * Inputkan jumlah maksimal penumpang
   * inputkan harga
15. Menu 3 pada menu pemilik (Hapus mobil)
   * Inputkan nama atau jenis mobil
16. Menu 4 pada menu pemilik (Daftar penyewa)
   * Pilih nama pegawai
   * Inputkan nama penyewa
17. Menu 5 pada menu penilik (Hapus penyewa)
   * Pilih nama pegawai
   * Inputkan nama penyewa
18. Menu 6 pada menu pemilik (Daftar pegawai)
19. Menu 7 pada menu pemilik (Hapus pegawai)
   * Inputkan nama pegawai
20. Menu 8 pada menu pemilik (Logout)
21. Menu Penyewa, terdapat 5 menu yaitu cek mobil, sewa mobil, pengembalian, nota dan logout
22. Menu 1 pada menu penyewa (Cek mobil)
   Mengecek apakah data mobil sudah ada
23. Menu 2 pada menu penyewa (Sewa mobil)
   * Pilih atau inputkan nama pegawai
   * Pilih atau inputkan nama mobil
24. Menu 3 pada menu penyewa (Pengembalian)
25. Menu 4 pada menu penyewa (Nota pembayaran)
26. Menu 5 pada menu penyewa (Logout)
27. Menu Pegawai, terdapat 6 menu yaitu cek mobil, tambah mobil, hapus mobil, daftar penyewa, hapus penyewa dan logout
28. Menu 1 pada menu pegawai (cek mobil)
   Mengecek apakah data mobil sudah ada
29. Menu 2 pada menu pegawai (Tambah mobil)
   * Masukkan nama atau jenis mobil
   * Masukkan nomor plat
   * Masukkan kecepatan
   * Masukkan maksimal jumlah penumpang
   * Masukkan harga
30. Menu 3 pada menu pegawai (Hapus mobil)
   * Masukkan nama atau jenis mobil
31. Menu 4 pada menu pegawai (Daftar penyewa)
   * Masukkan nama penyewa
32. Menu 5 pada menu pegawai (Hapus penyewa)
   * Masukkan nama penyewa
33. Menu 6 pada menu pegawai (Logout)
<br><br>

<hr>

### PENERAPAN MATERI PBO

<hr>

**1. Penggunaan Method Void** <br>
![image](https://user-images.githubusercontent.com/92510019/148222195-2551e156-0679-4dea-9ddd-baedc108c274.png)

**2. Penggunaan Objek** <br>
![image](https://user-images.githubusercontent.com/92510019/148222573-0037fa39-b635-41d1-9106-c9bad25c1d6e.png) <br>
![image](https://user-images.githubusercontent.com/92510019/148222683-52182f85-c0ec-4d98-975f-7dfbc16fe2b4.png)

**3. Penggunaan Atribut** <br>
![image](https://user-images.githubusercontent.com/92510019/148222882-5a523653-c3ed-4315-b627-3aac777777cd.png)

**4. Penggunaan Method Berparameter** <br>
![image](https://user-images.githubusercontent.com/92510019/148223104-26de09d8-5243-4a0c-9209-c7a4aa162af7.png)

**5. Penggunaan Constructor Berparameter** <br> 
![image](https://user-images.githubusercontent.com/92510019/148223820-d49be2d5-364a-423f-ae77-90afa38a36a9.png)

**6. Penggunaan Inheritance** <br>
![image](https://user-images.githubusercontent.com/92510019/148223983-3f64ce6f-0990-497e-a4e5-2092963684fa.png)

**7. Penggunaan kata kunci this** <br>
![image](https://user-images.githubusercontent.com/92510019/148225079-14af876d-25b8-47e8-8c7d-3b9eb0d5a5aa.png)

**8. Penggunaan kata Package dan Import** <br>
![image](https://user-images.githubusercontent.com/92510019/148225187-949e5e5a-61e5-4691-afe5-70a89083ba9f.png)

**9. Penggunaan Overload Constructor** <br>
![image](https://user-images.githubusercontent.com/92510019/148232652-7db597ac-492e-4119-af32-19cca9e47d8b.png)

**10. Penggunaan Overload Method** <br>
![image](https://user-images.githubusercontent.com/92510019/148228888-b8cbff1d-449c-4e44-9308-2b2e0ad6d739.png)
![image](https://user-images.githubusercontent.com/92510019/148228939-3eed619f-2cf6-4996-8a77-8687eb2ef22f.png)

**11. Penggunaan Try Catch** <br>
![image](https://user-images.githubusercontent.com/92510019/148229060-0128d306-ff16-4800-8d33-f6c74c5ba1a9.png)

<hr>

### KESIMPULAN

<hr>

Dengan menggunakan Intellij IDEA, dapat dihasilkan suatu program penyewaan mobil. Dengan adanya program tersebut dapat mempermudah customer dalam memilih dan menyewa mobil dengan model dan harga yang di inginkan.
