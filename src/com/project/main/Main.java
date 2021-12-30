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
    private static List<Login> listLogin = new ArrayList<>();
    private static List<Mobil> listMobil = new ArrayList<>();
    private static Login login;
    private static Mobil mobil;
    private static Penyewa penyewa;
    private static Pemilik pemilik = new Pemilik("Aditya");

    public static void main(String[] args) {
        Login admin = new Login("Aditya","admin","root",1);
        listLogin.add(admin);
        home();
    }

    // Homepage
    private static void home(){
        Scanner input = new Scanner(System.in);
        boolean ulangi = true;

        while (ulangi) {
            clearScreen();
            menuAwal();
            System.out.print("\nSilahkan lakukan = ");
            int milih = input.nextInt();

            switch (milih) {
                case 1:
                    pendaftaran();

                    ulangi = true;

                    break;

                case 2:
                    login();

                    ulangi = false;
                    break;
                case 3:
                    pendaftaranPegawai();

                    ulangi = true;
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void menuAwal(){
        System.out.println("----------------------------------------");
        System.out.println("||<===== RENTAL MOBIL ADRIAZ =====>||");
        System.out.println("----------------------------------------");

        System.out.println();
        System.out.println("||=====================================||");
        System.out.println("1. Pendaftaran\n2. Login\n3. Ingin menjadi pegawai?\n4. Exit  ");
        System.out.println("||=====================================||");
    }

    private static void pendaftaran(){
        Scanner inputStr = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        clearScreen();

        System.out.println("\n||===== Pendaftaran =====||");
        System.out.print("Nama = ");
        String nama = inputStr.nextLine();

        System.out.print("Umur = ");
        int umur = inputInt.nextInt();

        System.out.print("Alamat = ");
        String alamat = inputStr.nextLine();

        System.out.print("Username = ");
        String user = inputStr.nextLine();

        System.out.print("Password = ");
        String pass = inputStr.nextLine();

        login = new Login(nama,user, pass,3);
        penyewa = new Penyewa(nama, umur, alamat);
        listLogin.add(login);

        System.out.println("\nBerhasil mendaftar!");
    }

    private static void login(){
        Scanner input = new Scanner(System.in);
        String username = "";
        String password = "";
        String nama = "";
        int role = 0;

        clearScreen();

        System.out.println();
        System.out.println("\n||===== Login =====||");
        System.out.print("Username = ");
        String userlog = input.next();

        System.out.print("Password = ");
        String passlog = input.next();
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
                    afterLoginPenyewa();
                } else {
                    System.out.println("Username dan password salah!");
                    clearScreen();

                    System.out.println();
                    System.out.println("\n||===== Login =====||");
                    System.out.print("Username = ");
                    userlog = input.next();

                    System.out.print("Password = ");
                    passlog = input.next();
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
                            afterLoginPenyewa();
                        } else {
                            System.out.println("Username dan password salah!");
                            login();
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
        Scanner inputStr = new Scanner(System.in);
        clearScreen();

        System.out.println("\n||===== Pendaftaran Pegawai =====||");
        System.out.print("Nama = ");
        String nama = inputStr.nextLine();

        Pegawai pegawai = new Pegawai(nama);
        boolean bisa = pemilik.tambahPegawai(pegawai);

        if (bisa == true){
            System.out.print("Username = ");
            String user = inputStr.nextLine();

            System.out.print("Password = ");
            String pass = inputStr.nextLine();

            login = new Login(nama,user,pass,2);
            listLogin.add(login);
            System.out.println("\nBerhasil mendaftar");
        } else {
            System.out.println("\nKuota sudah penuh!");
        }
    }


    // Fitur Pemilik

    private static void afterLoginPemilik(){

    }


    // Fitur Penyewa

    private static void afterLoginPenyewa(){
        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        Scanner inputChar = new Scanner(System.in);

        clearScreen();
        System.out.println("||<=====================================||");
        System.out.println("1. Cek Mobil    ||    2. Sewa Mobil     ");
        System.out.println("3. Pembayaran   ||    4. Nota Pembayaran");
        System.out.println("5. Logout       ||    ");
        System.out.println("||<=====================================||");

        System.out.print("\nSilahkan lakukan = ");
        int milih = inputInt.nextInt();

        switch (milih) {

            case 1:
                boolean back = false;
                System.out.println("\n|| Cek Mobil Ready ||");

                if (listMobil.size() == 0){
                    System.out.println("Belum ada data Mobil!");
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
                            char kembali = inputChar.next().charAt(0);

                            if (kembali == 'y' || kembali == 'Y'){
                                back = true;
                                afterLoginPenyewa();
                            } else {
                                back = false;
                            }
                        }

                    } catch (NullPointerException e) {
                        System.out.println("Belum ada data mobil");
                        afterLoginPenyewa();
                    }
                }


                break;

            case 2:
                boolean ulang = true;

                while (ulang){
                    System.out.println("\n|| Sewa Mobil  ||");


                    pemilik.tampilPegawai();

                    System.out.print("Pilih pegawai (masukkan nama) : ");
                    String pegawai = inputStr.next();

                    System.out.print("Pilih mobil (masukkan nama) : ");
                    String mobil = inputStr.next();
                    int index = 0;
                    boolean ketemu = false;

                    for (Mobil value : listMobil) {
                        index++;
                        if (value.getJenisMobil().equals(mobil)) {
                            ketemu = true;
                            break;
                        }
                    }

                    if (ketemu == true){
                        penyewa.setMobil(listMobil.get(index));
                        pemilik.getPegawai(pegawai).tambahPenyewa(penyewa);
                        System.out.println("Berhasil menyewa!");
                        ulang = false;
                        afterLoginPenyewa();
                    } else {
                        System.out.println("Nama mobil tidak ditemukan");

                        System.out.print("Kembali?(y/n)");
                        char kembali = inputChar.next().charAt(0);

                        if (kembali == 'y' || kembali == 'Y'){
                            ulang = false;
                            afterLoginPenyewa();
                        } else {
                            ulang = true;
                        }
                    }
                }

                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                home();
                break;

        }

    }


    // Fitur Pegawai

    private static void afterLoginPegawai(String namaPegawai){
        Scanner input = new Scanner(System.in);

        clearScreen();
        System.out.println("||<=====================================================||");
        System.out.println("1. Cek Mobil     ||    2. Tambah Mobil     ");
        System.out.println("3. Hapus Mobil   ||    4. Daftar Penyewa   ");
        System.out.println("5. Hapus Penyewa ||    6. Logout           ");
        System.out.println("||<=====================================================||");

        System.out.print("\nSilahkan lakukan = ");
        int milih = input.nextInt();

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
        }

    }

    private static void cekMobil(String namaPegawai){
        Scanner inputChar = new Scanner(System.in);

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
                    char kembali = inputChar.next().charAt(0);

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
        Scanner inputStr = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
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

            System.out.println("\nTambah lagi?(y/n): ");
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
        Scanner inputStr = new Scanner(System.in);
        boolean ulangi = true;

        System.out.println("|| Hapus Mobil ||");

        while (ulangi){ ;
            if (listMobil.size() == 0){
                System.out.println("Belum ada data mobil");
                afterLoginPegawai(namaPegawai);
            } else {
                boolean ketemu = false;
                int i;
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
                } else {
                    System.out.println("Mobil tidak ditemukan");
                }

                System.out.println("\nHapus lagi?(y/n): ");
                char ya = inputStr.next().charAt(0);

                if (ya == 'y' || ya == 'Y'){
                    ulangi = true;
                } else {
                    ulangi = false;
                    afterLoginPegawai(namaPegawai);
                }
            }
        }
    }

    private static void daftarPenyewa(String namaPegawai){
        Scanner inputStr = new Scanner(System.in);
        boolean ulangi = true;

        System.out.println("|| Daftar Penyewa ||");

        while (ulangi){
            pemilik.getPegawai(namaPegawai).bacaPenyewa();

            System.out.print("Masukkan nama penyewa: ");
            String nama = inputStr.next();

            Penyewa p = pemilik.getPegawai(namaPegawai).getPenyewa(nama);
            if (p != null){
                p.tampilData();

                System.out.println("\nIngin mengecek lagi?(y/n): ");
                char ya = inputStr.next().charAt(0);

                if (ya == 'y' || ya == 'Y'){
                    ulangi = true;
                } else {
                    ulangi = false;
                    afterLoginPegawai(namaPegawai);
                }

            } else {
                System.out.println("Tidak ada penyewa dengan nama "+nama);
                ulangi = true;
            }
        }
    }

    private static void hapusPenyewa(String namaPegawai){
        Scanner inputStr = new Scanner(System.in);
        boolean ulangi = true;

        System.out.println("|| Hapus Penyewa ||");

        while (ulangi){
            pemilik.getPegawai(namaPegawai).bacaPenyewa();

            System.out.print("Masukkan nama penyewa: ");
            String nama = inputStr.next();

            Penyewa p = pemilik.getPegawai(namaPegawai).hapusPenyewa(nama);
            if (p != null){
                System.out.println("Berhasil menghapus!");

                System.out.println("\nHapus lagi?(y/n): ");
                char ya = inputStr.next().charAt(0);

                if (ya == 'y' || ya == 'Y'){
                    ulangi = true;
                } else {
                    ulangi = false;
                    afterLoginPegawai(namaPegawai);
                }
            } else {
                System.out.println("Gagal menghapus!");
                ulangi = true;
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
