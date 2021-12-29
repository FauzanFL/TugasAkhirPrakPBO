package com.project.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("||<===== RENTAL MOBIL AMAOZAN =====>||");
        System.out.println("----------------------------------------");

        System.out.println();
        System.out.println("||<=====================================");
        System.out.println("1. Pendaftaran           ||2. Login     ");
        System.out.println("||<=====================================");

        System.out.print("\nSilahkan lakukan = ");
        int milih = input.nextInt();

        switch (milih) {
            case 1:
                System.out.println("\n||===== Pendaftaran =====||");
                System.out.print("Nama = ");
                String nama = input.next();

                System.out.print("Umur = ");
                int umur = input.nextInt();

                System.out.println("Alamat = ");
                String alamat = input.next();

                System.out.println("Username = ");
                String user = input.next();

                System.out.println("Password = ");
                String pass = input.next();

                break;

            case 2:
                System.out.println();
                System.out.println("\n||===== Login =====||");
                System.out.print("Username = ");
                String userlog = input.next();

                System.out.print("Password = ");
                String passlog = input.next();

                break;
        }
        System.out.println("||<=====================================");
        System.out.println("1. Cek Mobil        ||2. Sewa Mobil     ");
        System.out.println("3. Pembayaran       ||4. Nota Pembayaran     ");
        System.out.println("||<=====================================");

        System.out.print("\nSilahkan lakukan = ");
        int milih2 = input.nextInt();

        switch (milih2) {

            case 1:
                System.out.println("\n|| Cek Mobil Ready ||");
                System.out.println("1. Avanza");
                System.out.println("2. Xenia");
                System.out.println("3. Apv");
                System.out.println("4. Brio");
                System.out.println("5. Jazz");
                System.out.println("6. Yaris");

                break;

            case 2:
                System.out.println("\n|| Sewa Mobil  ||");
                System.out.println("Nama Penyewa : ");
                String penyewa = input.next();





        }

    }
}
