package com.project.model;

public class Penyewa {
    private Mobil mobil;
    private String nama, umur, alamat;

    public Penyewa(Mobil mobil, String nama, String umur, String alamat) {
        this.mobil = mobil;
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void tampilData(){
        mobil.tampilMobil();
        System.out.println("Nama Penyewa : "+nama);
        System.out.println("Umur         : "+umur);
        System.out.println("Alamat       : "+alamat);
    }
}
