package com.project.controller;

import com.project.model.Penyewa;

public class Pegawai {
    private String nama;
    private Penyewa[] penyewas;
    private int i, jml;

    public void bacaPenyewa(){
        System.out.println("Nama pegawai : "+nama);
        System.out.println("");
        for (int j = 0; j < i; j++) {
            penyewas[j].tampilData();
        }
    }

    public Penyewa hapusPenyewa(){
        Penyewa temp = penyewas[i];
        i--;
        return temp;
    }

    public void tambahPenyewa(Penyewa x){
        i++;
        penyewas[i] = x;
    }

    public Pegawai(String nama, int j) {
        this.nama = nama;
        this.jml = j;
        penyewas = new Penyewa[jml];
        for (int i = 0; i < penyewas.length; i++) {
            penyewas[i] = null;
        }
        i = -1;
    }
}
