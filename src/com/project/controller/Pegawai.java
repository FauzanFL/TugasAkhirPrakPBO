package com.project.controller;

import com.project.model.Penyewa;

import java.util.ArrayList;
import java.util.List;

public class Pegawai {
    private String nama;
    private List<Penyewa> lisPenyewa = new ArrayList<>();

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public Pegawai(){}

    protected String getNama() {
        return nama;
    }

    protected void setNama(String nama) {
        this.nama = nama;
    }

    public void bacaPenyewa(){
        System.out.println("Nama pegawai : "+nama);
        System.out.println("");
        try {
            for (int j = 0; j < lisPenyewa.size(); j++) {
                System.out.println((j+1)+". "+lisPenyewa.get(j).getNama());
            }
        } catch (NullPointerException e){
            System.out.println("Belum ada data penyewa");
        }

    }

    public Penyewa hapusPenyewa(String penyewa){
        try {
            for (int j = 0; j < lisPenyewa.size(); j++) {
                if (lisPenyewa.get(j).getNama().equals(penyewa)){
                    Penyewa temp = lisPenyewa.get(j);
                    lisPenyewa.remove(j);
                    return temp;
                }
            }
        }catch (NullPointerException e){
            System.out.println("Belum ada data penyewa");
        }

        return null;
    }

    public void tambahPenyewa(Penyewa x){
        lisPenyewa.add(x);
    }

    public Penyewa getPenyewa(String nama){
        try {
            for (int i = 0; i < lisPenyewa.size(); i++) {
                if (lisPenyewa.get(i).getNama().equals(nama)){
                    return lisPenyewa.get(i);
                }
            }
        }catch (NullPointerException e){
            System.out.println("Belum ada data penyewa");
        }

        return null;
    }

}
