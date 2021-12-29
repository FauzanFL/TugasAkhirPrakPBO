package com.project.main;

import com.project.model.Login;
import com.project.model.Mobil;
import com.project.model.Penyewa;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Mobil> listMobil;
    private static Login login;
    private static Penyewa penyewa;
    private static Login admin = new Login("admin","root");

    public static void main(String[] args) {
        home();
    }

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
            }
        }
    }

    private static void afterLoginPenyewa(){
        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);

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
                System.out.println("\n|| Cek Mobil Ready ||");
                try {
                    for (int i = 0; i < listMobil.size(); i++) {
                        System.out.println((i + 1) + ". " + listMobil.get(i).getJenisMobil());
                    }
                } catch (NullPointerException e) {
                    System.out.println("Belum ada data mobil");
                    afterLoginPenyewa();
                }

                break;

            case 2:
                boolean ulang = true;

                while (ulang){
                    System.out.println("\n|| Sewa Mobil  ||");
                    System.out.println("Pilih mobil : ");
                    String mobil = inputStr.nextLine();
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
                        System.out.println("Berhasil menyewa!");
                        ulang = false;
                        afterLoginAdmin();
                    } else {
                        System.out.println("Nama mobil tidak ditemukan");
                        ulang = true;
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

    private static void afterLoginAdmin(){
        Scanner inputStr = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        Scanner inputChar = new Scanner(System.in);

        clearScreen();
        System.out.println("||<=====================================||");
        System.out.println("1. Cek Mobil    ||    2. Tambah Mobil     ");
        System.out.println("3. Hapus Mobil  ||    4. Logout     ");
        System.out.println("||<=====================================||");

        System.out.print("\nSilahkan lakukan = ");
        int milih = inputStr.nextInt();

        switch (milih){
            case 1:
                System.out.println("|| Cek Mobil Ready ||");
                try {
                    for (int i = 0; i < listMobil.size(); i++) {
                        System.out.println((i + 1) + ". " + listMobil.get(i).getJenisMobil());
                    }
                } catch (NullPointerException e) {
                    System.out.println("Belum ada data mobil");
                    afterLoginAdmin();
                }
                break;
            case 2:
                boolean ulang = true;

                System.out.println("|| Tambah Mobil ||");

                while (ulang){
                    System.out.print("Masukkan nama/jenis mobil: ");
                    String nama = inputStr.nextLine();
                    System.out.print("Masukkan nomor plat: ");
                    String plat = inputStr.nextLine();
                    System.out.print("Masukkan kecepatan: ");
                    int kecepatan = inputInt.nextInt();
                    System.out.print("Masukkan jumlah maksimal penumpang: ");
                    int penumpang = inputInt.nextInt();
                    System.out.print("Masukkan harga: ");
                    int harga = inputInt.nextInt();

                    Mobil mobil = new Mobil(nama,plat,kecepatan,penumpang,harga);
                    listMobil.add(mobil);

                    System.out.println("\nTambah lagi?(y/n): ");
                    char ya = inputChar.next().charAt(0);

                    if (ya == 'y' || ya == 'n'){
                        ulang = true;
                    } else {
                        ulang = false;
                        afterLoginAdmin();
                    }
                }
                break;
            case 3:
                break;
            case 4:
                home();
                break;
        }

    }

    private static void menuAwal(){
        System.out.println("----------------------------------------");
        System.out.println("||<===== RENTAL MOBIL AMAOZAN =====>||");
        System.out.println("----------------------------------------");

        System.out.println();
        System.out.println("||=====================================||");
        System.out.println("1. Pendaftaran\n2. Login     ");
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

        login = new Login(user, pass);
        penyewa = new Penyewa(nama, umur, alamat);
    }

    private static void login(){
        Scanner input = new Scanner(System.in);
        clearScreen();

        System.out.println();
        System.out.println("\n||===== Login =====||");
        System.out.print("Username = ");
        String userlog = input.next();

        System.out.print("Password = ");
        String passlog = input.next();
        try {
            if (admin.getUsername().equals(userlog) && admin.getPassword().equals(passlog)) {
                afterLoginAdmin();
            } else if (login.getUsername().equals(userlog) && login.getPassword().equals(passlog)) {
                afterLoginPenyewa();
            } else {
                System.out.println("Username dan password salah!");

                System.out.println();
                System.out.println("\n||===== Login =====||");
                System.out.print("Username = ");
                userlog = input.next();

                System.out.print("Password = ");
                passlog = input.next();
                try {
                    if (login.getUsername().equals(userlog) && login.getPassword().equals(passlog)) {
                        afterLoginPenyewa();
                    } else if (admin.getUsername().equals(userlog) && admin.getPassword().equals(passlog)) {
                        afterLoginAdmin();
                    } else {
                        System.out.println("Username dan password salah!");

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
