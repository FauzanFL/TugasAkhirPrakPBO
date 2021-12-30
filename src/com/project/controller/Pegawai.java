package com.project.controller;

import com.project.model.Penyewa;

import java.util.List;

public class Pegawai {
    private String nama;
    private List<Penyewa> lisPenyewa;
    private int jml;

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public void bacaPenyewa(){
        System.out.println("Nama pegawai : "+nama);
        System.out.println("");
        try {
            for (int j = 0; j < lisPenyewa.size(); j++) {
                lisPenyewa.get(j).tampilData();
            }
        } catch (NullPointerException e){
            System.out.println("Belum ada data penyewa");
        }

    }

    public void hapusPenyewa(String penyewa){
        try {
            for (int j = 0; j < lisPenyewa.size(); j++) {
                if (lisPenyewa.get(j).getNama().equals(penyewa)){
                    lisPenyewa.remove(j);
                    System.out.println("Berhasil menghapus");
                    break;
                }
            }
        }catch (NullPointerException e){
            System.out.println("Belum ada data penyewa");
        }

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
