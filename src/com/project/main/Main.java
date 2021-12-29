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
        Scanner input = new Scanner(System.in);
        boolean ulangi = true;

        while (ulangi) {
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
        Scanner input = new Scanner(System.in);

            System.out.println("||<=====================================||");
            System.out.println("1. Cek Mobil    ||    2. Sewa Mobil     ");
            System.out.println("3. Pembayaran   ||    4. Nota Pembayaran");
            System.out.println("||<=====================================||");

            System.out.print("\nSilahkan lakukan = ");
            int milih = input.nextInt();

            switch (milih) {

                case 1:
                    System.out.println("\n|| Cek Mobil Ready ||");
                    for (int i = 0; i < listMobil.size(); i++) {
                        System.out.println((i+1)+". "+listMobil.get(i).getJenisMobil());
                    }

                    break;

                case 2:
                    System.out.println("\n|| Sewa Mobil  ||");
                    System.out.println("Pilih mobil : ");
                    String mobil = input.next();

                    break;

            }

    }

    private static void afterLoginAdmin(){

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
        Scanner input = new Scanner(System.in);
        clearScreen();

        System.out.println("\n||===== Pendaftaran =====||");
        System.out.print("Nama = ");
        String nama = input.next();

        System.out.print("Umur = ");
        int umur = input.nextInt();

        System.out.print("Alamat = ");
        String alamat = input.next();

        System.out.print("Username = ");
        String user = input.next();

        System.out.print("Password = ");
        String pass = input.next();

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
            if (login.getUsername().equals(userlog) && login.getPassword().equals(passlog)) {
                afterLoginPenyewa();
            } else if (admin.getUsername().equals(userlog) && admin.getPassword().equals(passlog)) {
                afterLoginAdmin();
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
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Belum ada data login");
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
