package com.project.controller;

import java.util.ArrayList;
import java.util.List;

public class Pemilik extends Pegawai {
    private String nama;
    private static List<Pegawai> listPegawai = new ArrayList<>();

    public Pemilik(String nama) {
        super();
        this.nama = nama;
    }

    @Override
    public String getNama() {
        return nama;
    }

    public boolean tambahPegawai(Pegawai pegawai){
        if (listPegawai.size() == 3){
            return false;
        } else {
            listPegawai.add(pegawai);
            return true;
        }
    }

    public Pegawai hapusData(String nama){
        for (int i = 0; i < listPegawai.size(); i++) {
            if (listPegawai.get(i).getNama().equals(nama)){
                Pegawai p = listPegawai.get(i);
                listPegawai.remove(i);
                return p;
            }
        }
        return null;
    }

    public Pegawai getPegawai(String nama){
        for (int i = 0; i < listPegawai.size(); i++) {
            if (listPegawai.get(i).getNama().equals(nama)){
                return listPegawai.get(i);
            }
        }
        return null;
    }

    public void tampilPegawai(){
        for (int i = 0; i < listPegawai.size(); i++) {
            System.out.println((i+1)+". "+listPegawai.get(i).getNama());
        }
    }

}
