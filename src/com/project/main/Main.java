package com.project.main;

import com.project.controller.Pegawai;
import com.project.controller.Pemilik;
import com.project.model.Login;
import com.project.model.Mobil;
import com.project.model.Penyewa;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner inputStr = new Scanner(System.in);
    private static Scanner inputInt = new Scanner(System.in);
    private static List<Login> listLogin = new ArrayList<>();
    private static List<Mobil> listMobil = new ArrayList<>();
    private static List<Penyewa> listPenyewa = new ArrayList<>();
    private static Login login;
    private static Mobil mobil;
    private static final Pemilik pemilik = new Pemilik("Aditya");

    public static void main(String[] args) {
        Login admin = new Login("Aditya","admin","root",1);
        listLogin.add(admin);
        home();
    }

    // Homepage
    private static void home(){
        boolean ulangi = true;

        clearScreen();
        System.out.println("----------------------------------------");
        System.out.println("||<===== RENTAL MOBIL ADRIAZ =====>||");
        System.out.println("----------------------------------------");
        menuAwal();

        while (ulangi) {
            System.out.print("\nPilih Menu = ");
            int milih = inputInt.nextInt();

            switch (milih) {
                case 1:
                    pendaftaran();

                    ulangi = false;

                    break;

                case 2:
                    login();

                    ulangi = false;
                    break;
                case 3:
                    pendaftaranPegawai();

                    ulangi = false;
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Tidak ada pilihan menu silakan ulangi");
                    ulangi = true;
                    break;
            }
        }
    }

    private static void menuAwal(){
        System.out.println();
        System.out.println("||=====================================||");
        System.out.println("1. Pendaftaran\n2. Login\n3. Ingin menjadi pegawai?\n4. Exit  ");
        System.out.println("||=====================================||");
    }

    private static void pendaftaran(){
        clearScreen();

        System.out.println("\n||===== Pendaftaran =====||");
        System.out.print("Nama = ");
        String nama = inputStr.next();

        System.out.print("Umur = ");
        int umur = inputInt.nextInt();

        System.out.print("Alamat = ");
        String alamat = inputStr.next();

        System.out.print("Username = ");
        String user = inputStr.next();

        System.out.print("Password = ");
        String pass = inputStr.next();

        login = new Login(nama,user, pass,3);
        Penyewa penyewa = new Penyewa(nama, umur, alamat);
        listPenyewa.add(penyewa);
        listLogin.add(login);

        System.out.println("\nBerhasil mendaftar!");
        home();
    }

    private static void login(){
        Penyewa penyewa;
        String username = "";
        String password = "";
        String nama = "";
        int role = 0;

        clearScreen();

        System.out.println();
        System.out.println("\n||===== Login =====||");
        System.out.print("Username = ");
        String userlog = inputStr.next();

        System.out.print("Password = ");
        String passlog = inputStr.next();
        try {

            for (int i = 0; i < listLogin.size(); i++) {
                if (listLogin.get(i).getUsername().equals(userlog) && listLogin.get(i).getPassword().equals(passlog)){
                    username = listLogin.get(i).getUsername();
                    password = listLogin.get(i).getPassword();
                    role = listLogin.get(i).getRole();
                    nama = listLogin.get(i).getNama();
                    break;
                }

            }
                if (username.equals(userlog) && password.equals(passlog) && role==1){
                    afterLoginPemilik();
                } else if (username.equals(userlog) && password.equals(passlog) && role==2) {
                    afterLoginPegawai(nama);
                } else if (username.equals(userlog) && password.equals(passlog) && role==3) {
                    for (int i = 0; i < listPenyewa.size(); i++) {
                        if (listPenyewa.get(i).getNama().equals(nama)){
                            penyewa = listPenyewa.get(i);
                            afterLoginPenyewa(penyewa);
                            break;
                        }
                    }
                } else {
                    System.out.println("Username dan password salah!");
                    System.out.print("\nKembali?(y/n)");
                    char kembali = inputStr.next().charAt(0);

                    if (kembali == 'y' || kembali == 'Y'){
                        home();
                    }

                    clearScreen();

                    System.out.println();
                    System.out.println("\n||===== Login =====||");
                    System.out.print("Username = ");
                    userlog = inputStr.next();

                    System.out.print("Password = ");
                    passlog = inputStr.next();
                    try {
                        for (int i = 0; i < listLogin.size(); i++) {
                            if (listLogin.get(i).getUsername().equals(userlog) && listLogin.get(i).getPassword().equals(passlog)){
                                username = listLogin.get(i).getUsername();
                                password = listLogin.get(i).getPassword();
                                role = listLogin.get(i).getRole();
                                nama = listLogin.get(i).getNama();
                                break;
                            }
                        }
                        if (username.equals(userlog) && password.equals(passlog) && role==1){
                            afterLoginPemilik();
                        } else if (username.equals(userlog) && password.equals(passlog) && role==2) {
                            afterLoginPegawai(nama);
                        } else if (username.equals(userlog) && password.equals(passlog) && role==3) {
                            for (int i = 0; i < listPenyewa.size(); i++) {
                                if (listPenyewa.get(i).getNama().equals(nama)){
                                    penyewa = listPenyewa.get(i);
                                    afterLoginPenyewa(penyewa);
                                    break;
                                }
                            }
                        } else {
                            System.out.println("Username dan password salah!");
                            System.out.print("\nKembali?(y/n)");
                            kembali = inputStr.next().charAt(0);

                            if (kembali == 'y' || kembali == 'Y'){
                                home();
                            } else {
                                login();
                            }
                        }
                    } catch (NullPointerException e) {
                        System.out.println("Belum ada data login");
                        home();
                    }
                }

        } catch (NullPointerException e) {
            System.out.println("Belum ada data login");
            home();
        }


    }

    private static void pendaftaranPegawai(){
        clearScreen();

        System.out.println("\n||===== Pendaftaran Pegawai =====||");
        System.out.print("Nama = ");
        String nama = inputStr.next();

        Pegawai pegawai = new Pegawai(nama);
        boolean bisa = pemilik.tambahPegawai(pegawai);

        if (bisa == true){
            System.out.print("Username = ");
            String user = inputStr.next();

            System.out.print("Password = ");
            String pass = inputStr.next();

            login = new Login(nama,user,pass,2);
            listLogin.add(login);
            System.out.println("\nBerhasil mendaftar");

            home();
        } else {
            System.out.println("\nKuota sudah penuh!");
            home();
        }
    }


    // Fitur Pemilik

    private static void afterLoginPemilik(){
        clearScreen();
        System.out.println("||<=====================================================||");
        System.out.println("1. Cek Mobil        ||  5. Hapus Penyewa");
        System.out.println("2. Tambah Mobil     ||  6. Daftar Pegawai");
        System.out.println("3. Hapus Mobil      ||  7. Hapus Pegawai");
        System.out.println("4. Daftar Penyewa   ||  8. Logout");
        System.out.println("||<=====================================================||");

        System.out.print("\nPilih menu: ");
        int milih = inputInt.nextInt();

        switch (milih){
            case 1:
                cekMobil();
                break;
            case 2:
                tambahMobil();
                break;
            case 3:
                hapusMobil();
                break;
            case 4:
                daftarPenyewa();
                break;
            case 5:
                hapusPenyewa();
                break;
            case 6:
                daftarPegawai();
                break;
            case 7:
                hapusPegawai();
                break;
            case 8:
                home();
                break;
            default:
                System.out.println("Tidak ada pilihan menu silakan ulangi");
                afterLoginPemilik();
                break;
        }
    }

    private static void cekMobil(){

        System.out.println("|| Cek Mobil Ready ||");
        try {
            boolean back = false;
            if (listMobil.size() == 0){
                System.out.println("Belum ada mobil tersedia");
                afterLoginPemilik();
            } else {
                while (back == false){
                    for (int i = 0; i < listMobil.size(); i++) {
                        System.out.println("----------------------------------------");
                        System.out.println((i + 1) + ". " + listMobil.get(i).getJenisMobil());
                        listMobil.get(i).tampilMobil();
                        System.out.println("----------------------------------------");
                    }

                    System.out.print("Kembali?(y/n)");
                    char kembali = inputStr.next().charAt(0);

                    if (kembali == 'y' || kembali == 'Y'){
                        back = true;
                        afterLoginPemilik();
                    } else {
                        back = false;
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Belum ada data mobil");
            afterLoginPemilik();
        }
    }

    private static void tambahMobil(){
        boolean ulangi = true;

        System.out.println("|| Tambah Mobil ||");

        while (ulangi){
            System.out.print("Masukkan nama/jenis mobil: ");
            String nama = inputStr.next();
            System.out.print("Masukkan nomor plat: ");
            String plat = inputStr.next();
            System.out.print("Masukkan kecepatan: ");
            int kecepatan = inputInt.nextInt();
            System.out.print("Masukkan jumlah maksimal penumpang: ");
            int penumpang = inputInt.nextInt();
            System.out.print("Masukkan harga: ");
            int harga = inputInt.nextInt();

            mobil = new Mobil(nama,plat,kecepatan,penumpang,harga);
            listMobil.add(mobil);

            System.out.print("\nTambah lagi?(y/n): ");
            char ya = inputStr.next().charAt(0);

            if (ya == 'y' || ya == 'Y'){
                ulangi = true;
            } else {
                ulangi = false;
                afterLoginPemilik();
            }
        }
    }

    private static void hapusMobil(){
        boolean ulangi = true;

        System.out.println("|| Hapus Mobil ||");

        while (ulangi){ ;
            if (listMobil.size() == 0){
                System.out.println("Belum ada data mobil");
                afterLoginPemilik();
            } else {
                boolean ketemu = false;
                int i;

                for (int j = 0; j < listMobil.size(); j++) {
                    System.out.println((j+1)+". "+listMobil.get(j).getJenisMobil());
                }

                System.out.print("Masukkan nama/jenis mobil: ");
                String nama = inputStr.next();
                for ( i = 0; i < listMobil.size(); i++) {
                    if (listMobil.get(i).getJenisMobil().equals(nama)){
                        ketemu = true;
                        break;
                    } else {
                        ketemu = false;
                    }
                }

                if (ketemu == true){
                    listMobil.remove(i);
                    System.out.println("Mobil berhasil dihapus");

                    System.out.print("\nHapus lagi?(y/n): ");
                    char ya = inputStr.next().charAt(0);

                    if (ya == 'y' || ya == 'Y'){
                        ulangi = true;
                    } else {
                        ulangi = false;
                        afterLoginPemilik();
                    }
                } else {
                    System.out.println("Mobil tidak ditemukan");

                    System.out.print("\nKembali?(y/n): ");
                    char ya = inputStr.next().charAt(0);

                    if (ya == 'y' || ya == 'Y'){
                        ulangi = false;
                        afterLoginPemilik();
                    } else {
                        ulangi = true;
                    }
                }

            }
        }
    }

    private static void daftarPenyewa(){
        boolean ulangi = true;

        System.out.println("|| Daftar Penyewa ||");

        while (ulangi){
            pemilik.tampilPegawai(true);

            try {
                System.out.print("Pilih nama pegawai: ");
                String namaPegawai = inputStr.next();

                if (namaPegawai.equals(pemilik.getNama())){
                    pemilik.bacaPenyewa();

                    System.out.print("Masukkan nama penyewa: ");
                    String nama = inputStr.next();

                    Penyewa p = pemilik.getPenyewa(nama);

                    if (p != null){
                        p.tampilData();

                        System.out.print("\nIngin mengecek lagi?(y/n): ");
                        char ya = inputStr.next().charAt(0);

                        if (ya == 'y' || ya == 'Y'){
                            ulangi = true;
                        } else {
                            ulangi = false;
                            afterLoginPemilik();
                        }

                    } else {
                        System.out.println("Tidak ada penyewa dengan nama "+nama);
                        System.out.print("Kembali?(y/n): ");
                        char kembali = inputStr.next().charAt(0);

                        if (kembali == 'y' || kembali == 'Y'){
                            ulangi = false;
                            afterLoginPemilik();
                        } else {
                            ulangi = true;
                        }
                    }

                } else {
                    pemilik.getPegawai(namaPegawai).bacaPenyewa();

                    System.out.print("Masukkan nama penyewa: ");
                    String nama = inputStr.next();

                    Penyewa p = pemilik.getPegawai(namaPegawai).getPenyewa(nama);
                    if (p != null){
                        p.tampilData();

                        System.out.print("\nIngin mengecek lagi?(y/n): ");
                        char ya = inputStr.next().charAt(0);

                        if (ya == 'y' || ya == 'Y'){
                            ulangi = true;
                        } else {
                            ulangi = false;
                            afterLoginPemilik();
                        }

                    } else {
                        System.out.println("Tidak ada penyewa dengan nama "+nama);
                        ulangi = true;
                    }
                }
            } catch (Exception n){
                System.out.println("Tidak ada nama pegawai");

                System.out.print("Kembali?(y/n): ");
                char u = inputStr.next().charAt(0);
                if (u == 'y' || u == 'Y'){
                    ulangi = false;
                    afterLoginPemilik();
                } else {
                    ulangi = true;
                }
            }
        }
    }

    private static void hapusPenyewa(){
        boolean ulangi = true;

        System.out.println("|| Hapus Penyewa ||");

        while (ulangi){
            pemilik.tampilPegawai(true);

            try {
                System.out.print("Pilih nama pegawai: ");
                String namaPegawai = inputStr.next();

                if (namaPegawai.equals(pemilik.getNama())){
                    pemilik.bacaPenyewa();

                    System.out.print("Masukkan nama penyewa: ");
                    String nama = inputStr.next();

                    Penyewa p = pemilik.hapusPenyewa(nama);

                    if (p != null){
                        System.out.println("Berhasil menghapus!");

                        System.out.print("\nHapus lagi?(y/n): ");
                        char ya = inputStr.next().charAt(0);

                        if (ya == 'y' || ya == 'Y'){
                            ulangi = true;
                        } else {
                            ulangi = false;
                            afterLoginPemilik();
                        }
                    } else {
                        System.out.println("Gagal! tidak ada penyewa dengan nama "+nama);

                        System.out.print("Kembali?(y/n): ");
                        char u = inputStr.next().charAt(0);
                        if (u == 'y' || u == 'Y'){
                            ulangi = false;
                            afterLoginPemilik();
                        } else {
                            ulangi = true;
                        }
                    }
                } else {
                    System.out.print("Masukkan nama penyewa: ");
                    String nama = inputStr.next();

                    Penyewa p = pemilik.getPegawai(namaPegawai).hapusPenyewa(nama);
                    if (p != null){
                        System.out.println("Berhasil menghapus!");

                        System.out.print("\nHapus lagi?(y/n): ");
                        char ya = inputStr.next().charAt(0);

                        if (ya == 'y' || ya == 'Y'){
                            ulangi = true;
                        } else {
                            ulangi = false;
                            afterLoginPemilik();
                        }
                    } else {
                        System.out.println("Gagal! tidak ada penyewa dengan nama "+nama);

                        System.out.print("Kembali?(y/n): ");
                        char u = inputStr.next().charAt(0);
                        if (u == 'y' || u == 'Y'){
                            ulangi = false;
                            afterLoginPemilik();
                        } else {
                            ulangi = true;
                        }
                    }
                }
            } catch (Exception e){
                System.out.println("Tidak ada nama pegawai");

                System.out.print("Kembali?(y/n): ");
                char u = inputStr.next().charAt(0);
                if (u == 'y' || u == 'Y'){
                    ulangi = false;
                    afterLoginPemilik();
                } else {
                    ulangi = true;
                }
            }
        }
    }

    private static void daftarPegawai(){
        boolean ulangi = true;

        System.out.println("|| Daftar Pegawai ||\n");

        while (ulangi){
            pemilik.tampilPegawai(false);

            System.out.print("Kembali?(y/n): ");
            char kembali = inputStr.next().charAt(0);

            if (kembali == 'y' || kembali == 'Y'){
                ulangi = false;
                afterLoginPemilik();
            } else {
                ulangi = true;
            }
        }
    }

    private static void hapusPegawai(){
        boolean ulangi = true;

        System.out.println("|| Daftar Pegawai ||");

        while (ulangi){
            pemilik.tampilPegawai(false);

            System.out.print("Masukkan nama pegawai: ");
            String nama = inputStr.next();

            Pegawai p = pemilik.hapusPegawai(nama);
            if ( p != null){
                System.out.println("Berhasil dihapus!");
                ulangi = false;
                afterLoginPemilik();
            } else {
                System.out.println("Gagal menghapus!");

                System.out.print("Kembali?(y/n): ");
                char kembali = inputStr.next().charAt(0);

                if (kembali == 'y' || kembali == 'Y'){
                    ulangi = false;
                    afterLoginPemilik();
                } else {
                    ulangi = true;
                }
            }
        }
    }


    // Fitur Penyewa

    private static void afterLoginPenyewa(Penyewa penyewa){
        clearScreen();
        System.out.println("||<=====================================||");
        System.out.println("1. Cek Mobil          || 4. Nota Penyewaan     ");
        System.out.println("2. Sewa Mobil         || 5. Logout");
        System.out.println("3. Pengembalian Mobil ||    ");
        System.out.println("||<=====================================||");

        System.out.print("\nPilih Menu = ");
        int milih = inputInt.nextInt();

        switch (milih) {

            case 1:
                cekMobil(penyewa);

                break;

            case 2:
                sewaMobil(penyewa);

                break;
            case 3:
                pengembalianMobil(penyewa);

                break;
            case 4:
                notaPenyewaan(penyewa);

                break;
            case 5:
                home();
                break;
            default:
                System.out.println("Tidak ada pilihan menu, silakan ulangi");
                afterLoginPenyewa(penyewa);
                break;
        }

    }

    private static void cekMobil(Penyewa penyewa){
        boolean back = false;
        System.out.println("\n|| Cek Mobil Ready ||");

        if (listMobil.size() == 0){
            System.out.println("Belum ada data Mobil!");
            afterLoginPenyewa(penyewa);
        } else {
            try {
                while (back == false){
                    for (int i = 0; i < listMobil.size(); i++) {
                        System.out.println("----------------------------------------");
                        System.out.println((i + 1) + ". " + listMobil.get(i).getJenisMobil());
                        listMobil.get(i).tampilMobil();
                        System.out.println("----------------------------------------");
                    }

                    System.out.print("Kembali?(y/n)");
                    char kembali = inputStr.next().charAt(0);

                    if (kembali == 'y' || kembali == 'Y'){
                        back = true;
                        afterLoginPenyewa(penyewa);
                    } else {
                        back = false;
                    }
                }

            } catch (NullPointerException e) {
                System.out.println("Belum ada data mobil");
                afterLoginPenyewa(penyewa);
            }
        }
    }

    private static void sewaMobil(Penyewa penyewa){
        boolean ulang = true;

        while (ulang){
            System.out.println("\n|| Sewa Mobil  ||");

            if (penyewa.getMobil() == null){
                for (int i = 0; i < listMobil.size(); i++) {
                    System.out.println((i+1)+". "+listMobil.get(i).getJenisMobil());
                }

                System.out.print("Pilih mobil (masukkan nama) : ");
                String mobil = inputStr.next();

                pemilik.tampilPegawai(true);

                System.out.print("Pilih pegawai (masukkan nama) : ");
                String pegawai = inputStr.next();


                int i;
                boolean ketemu = false;

                for ( i = 0; i < listMobil.size(); i++) {
                    if (listMobil.get(i).getJenisMobil().equals(mobil)){
                        ketemu = true;
                        break;
                    }
                }

                if (ketemu == true){
                    System.out.print("Yakin untuk menyewa?(y/n): ");
                    char y = inputStr.next().charAt(0);
                    if (y == 'y' || y == 'Y'){
                        if (pegawai.equals("Aditya")){
                            penyewa.setMobil(listMobil.get(i));
                            pemilik.tambahPenyewa(penyewa);
                        } else {
                            penyewa.setMobil(listMobil.get(i));
                            pemilik.getPegawai(pegawai).tambahPenyewa(penyewa);
                        }
                        listMobil.remove(i);
                        System.out.println("Berhasil menyewa!");
                        ulang = false;
                        afterLoginPenyewa(penyewa);
                    } else {
                        afterLoginPenyewa(penyewa);
                    }

                } else {
                    System.out.println("Nama mobil tidak ditemukan");

                    System.out.print("Kembali?(y/n)");
                    char kembali = inputStr.next().charAt(0);

                    if (kembali == 'y' || kembali == 'Y'){
                        ulang = false;
                        afterLoginPenyewa(penyewa);
                    } else {
                        ulang = true;
                    }
                }
            } else {
                System.out.println("Anda belum mengembalikan mobil \nSilakan kembalikan terlebih dahulu");
                afterLoginPenyewa(penyewa);
            }


        }
    }

    private static void pengembalianMobil(Penyewa penyewa){
        boolean ulang = true;

        while (ulang){
            System.out.println("\n|| Pengembalian Mobil ||");

            Mobil temp = penyewa.getMobil();

            if (temp == null){
                System.out.println("Belum ada mobil yang disewa");
                System.out.print("Kembali?(y/n): ");
                char y = inputStr.next().charAt(0);
                if (y == 'y' || y == 'Y'){
                    ulang = false;
                    afterLoginPenyewa(penyewa);
                } else {
                    ulang = true;
                }
            } else {
                System.out.println("\n Mobil yang disewa \n");
                System.out.println("-------------------------");
                temp.tampilMobil();
                System.out.println("-------------------------");

                System.out.print("Kembalikan?(y/n): ");
                char y = inputStr.next().charAt(0);
                if (y == 'y' || y == 'Y'){
                    penyewa.kembalikanMobil();
                    pemilik.hapusPenyewa(penyewa.getNama());
                    pemilik.kembalikanMobil(penyewa.getNama());
                    listMobil.add(temp);
                    System.out.println("Mobil dikembalikan");
                    ulang = false;
                    afterLoginPenyewa(penyewa);
                } else {
                    afterLoginPenyewa(penyewa);
                    ulang = true;
                }
            }
        }
    }

    private static void notaPenyewaan(Penyewa penyewa){
        boolean ulang = true;

        while (ulang){
            System.out.println("\n|| Nota Pembayaran ||\n");

            Penyewa tmp = pemilik.getPenyewa(penyewa.getNama());
            if (tmp == null){
                tmp = pemilik.getPenyewaFromPegawai(penyewa.getNama());
                if (tmp != null){
                    tmp.tampilNota();

                    System.out.print("Kembali?(y/n): ");
                    char y = inputStr.next().charAt(0);
                    if (y == 'y' || y == 'Y'){
                        ulang = false;
                        afterLoginPenyewa(penyewa);
                    } else {
                        ulang = true;
                    }
                } else {
                    System.out.println("Tidak ada nota pembayaran");
                    System.out.print("Kembali?(y/n): ");
                    char y = inputStr.next().charAt(0);
                    if (y == 'y' || y == 'Y'){
                        ulang = false;
                        afterLoginPenyewa(penyewa);
                    } else {
                        ulang = true;
                    }
                }
            } else {
                tmp.tampilNota();

                System.out.print("Kembali?(y/n): ");
                char y = inputStr.next().charAt(0);
                if (y == 'y' || y == 'Y'){
                    ulang = false;
                    afterLoginPenyewa(penyewa);
                } else {
                    ulang = true;
                }
            }
        }
    }


    // Fitur Pegawai

    private static void afterLoginPegawai(String namaPegawai){
        clearScreen();
        System.out.println("||<=====================================================||");
        System.out.println("1. Cek Mobil        ||    4. Daftar Penyewa    ");
        System.out.println("2. Tambah Mobil     ||    5. Hapus Penyewa   ");
        System.out.println("3. Hapus Mobil      ||    6. Logout           ");
        System.out.println("||<=====================================================||");

        System.out.print("\nPilih Menu = ");
        int milih = inputInt.nextInt();

        switch (milih){
            case 1:
                cekMobil(namaPegawai);
                break;
            case 2:
                tambahMobil(namaPegawai);
                break;
            case 3:
                hapusMobil(namaPegawai);
                break;
            case 4:
                daftarPenyewa(namaPegawai);
                break;
            case 5:
                hapusPenyewa(namaPegawai);
                break;
            case 6:
                home();
                break;
            default:
                System.out.println("Tidak ada pilihan menu, silakan ulangi");
                afterLoginPegawai(namaPegawai);
                break;
        }

    }

    private static void cekMobil(String namaPegawai){

        System.out.println("|| Cek Mobil Ready ||");
        try {
            boolean back = false;
            if (listMobil.size() == 0){
                System.out.println("Belum ada mobil tersedia");
                afterLoginPegawai(namaPegawai);
            } else {
                while (back == false){
                    for (int i = 0; i < listMobil.size(); i++) {
                        System.out.println("----------------------------------------");
                        System.out.println((i + 1) + ". " + listMobil.get(i).getJenisMobil());
                        listMobil.get(i).tampilMobil();
                        System.out.println("----------------------------------------");
                    }

                    System.out.print("Kembali?(y/n)");
                    char kembali = inputStr.next().charAt(0);

                    if (kembali == 'y' || kembali == 'Y'){
                        back = true;
                        afterLoginPegawai(namaPegawai);
                    } else {
                        back = false;
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Belum ada data mobil");
            afterLoginPegawai(namaPegawai);
        }
    }

    private static void tambahMobil(String namaPegawai){
        boolean ulangi = true;

        System.out.println("|| Tambah Mobil ||");

        while (ulangi){
            System.out.print("Masukkan nama/jenis mobil: ");
            String nama = inputStr.next();
            System.out.print("Masukkan nomor plat: ");
            String plat = inputStr.next();
            System.out.print("Masukkan kecepatan: ");
            int kecepatan = inputInt.nextInt();
            System.out.print("Masukkan jumlah maksimal penumpang: ");
            int penumpang = inputInt.nextInt();
            System.out.print("Masukkan harga: ");
            int harga = inputInt.nextInt();

            mobil = new Mobil(nama,plat,kecepatan,penumpang,harga);
            listMobil.add(mobil);

            System.out.print("\nTambah lagi?(y/n): ");
            char ya = inputStr.next().charAt(0);

            if (ya == 'y' || ya == 'Y'){
                ulangi = true;
            } else {
                ulangi = false;
                afterLoginPegawai(namaPegawai);
            }
        }
    }

    private static void hapusMobil(String namaPegawai){
        boolean ulangi = true;

        System.out.println("|| Hapus Mobil ||");

        while (ulangi){ ;
            if (listMobil.size() == 0){
                System.out.println("Belum ada data mobil");
                afterLoginPegawai(namaPegawai);
            } else {
                boolean ketemu = false;
                int i;

                for (int j = 0; j < listMobil.size(); j++) {
                    System.out.println((j+1)+". "+listMobil.get(j).getJenisMobil());
                }

                System.out.print("Masukkan nama/jenis mobil: ");
                String nama = inputStr.next();
                for ( i = 0; i < listMobil.size(); i++) {
                    if (listMobil.get(i).getJenisMobil().equals(nama)){
                        ketemu = true;
                        break;
                    } else {
                        ketemu = false;
                    }
                }

                if (ketemu == true){
                    listMobil.remove(i);
                    System.out.println("Mobil berhasil dihapus");
                    System.out.print("\nHapus lagi?(y/n): ");
                    char ya = inputStr.next().charAt(0);

                    if (ya == 'y' || ya == 'Y'){
                        ulangi = true;
                    } else {
                        ulangi = false;
                        afterLoginPegawai(namaPegawai);
                    }
                } else {
                    System.out.println("Mobil tidak ditemukan");
                    System.out.print("\nKembali?(y/n): ");
                    char ya = inputStr.next().charAt(0);

                    if (ya == 'y' || ya == 'Y'){
                        ulangi = false;
                        afterLoginPegawai(namaPegawai);
                    } else {
                        ulangi = true;
                    }
                }


            }
        }
    }

    private static void daftarPenyewa(String namaPegawai){
        boolean ulangi = true;

        System.out.println("|| Daftar Penyewa ||");

        while (ulangi){
            pemilik.getPegawai(namaPegawai).bacaPenyewa();

            System.out.print("Masukkan nama penyewa: ");
            String nama = inputStr.next();

            Penyewa p = pemilik.getPegawai(namaPegawai).getPenyewa(nama);
            if (p != null){
                p.tampilData();

                System.out.print("\nIngin mengecek lagi?(y/n): ");
                char ya = inputStr.next().charAt(0);

                if (ya == 'y' || ya == 'Y'){
                    ulangi = true;
                } else {
                    ulangi = false;
                    afterLoginPegawai(namaPegawai);
                }

            } else {
                System.out.println("Tidak ada penyewa dengan nama "+nama);
                System.out.print("Kembali?(y/n): ");
                char kembali = inputStr.next().charAt(0);

                if (kembali == 'y' || kembali == 'Y'){
                    ulangi = false;
                    afterLoginPegawai(namaPegawai);
                } else {
                    ulangi = true;
                }
            }
        }
    }

    private static void hapusPenyewa(String namaPegawai){
        boolean ulangi = true;

        System.out.println("|| Hapus Penyewa ||");

        while (ulangi){
            pemilik.getPegawai(namaPegawai).bacaPenyewa();

            System.out.print("Masukkan nama penyewa: ");
            String nama = inputStr.next();

            Penyewa p = pemilik.getPegawai(namaPegawai).hapusPenyewa(nama);
            if (p != null){
                System.out.println("Berhasil menghapus!");

                System.out.print("\nHapus lagi?(y/n): ");
                char ya = inputStr.next().charAt(0);

                if (ya == 'y' || ya == 'Y'){
                    ulangi = true;
                } else {
                    ulangi = false;
                    afterLoginPegawai(namaPegawai);
                }
            } else {
                System.out.println("Gagal menghapus!");
                System.out.print("Kembali?(y/n): ");
                char kembali = inputStr.next().charAt(0);

                if (kembali == 'y' || kembali == 'Y'){
                    ulangi = false;
                    afterLoginPegawai(namaPegawai);
                } else {
                    ulangi = true;
                }
            }
        }
    }

    // Clear screen

    private static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception ex){
            System.err.println("\nTidak bisa clear scree");
        }
    }


}
