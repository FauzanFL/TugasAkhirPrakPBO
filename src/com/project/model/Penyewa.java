package com.project.model;

public class Penyewa {
    private Mobil mobil;
    private String nama, alamat;
    private int umur;

    public Penyewa(String nama, int umur, String alamat) {
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

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void kembalikanMobil(){
        mobil = null;
    }

    public void tampilNota(){
        if (mobil != null){
            System.out.println("==============================");
            System.out.println("Nama Penyewa  : "+nama);
            System.out.println("Umur          : "+umur);
            System.out.println("Alamat        : "+alamat);
            mobil.tampilMobil();
            System.out.println("==============================");
        } else {
            System.out.println("Tidak ada mobil yang disewa");
        }
    }

    public void tampilData(){
        System.out.println("==============================");
        System.out.println("Nama Penyewa  : "+nama);
        System.out.println("Umur          : "+umur);
        System.out.println("Alamat        : "+alamat);
        mobil.tampilMobil();
        System.out.println("==============================");
    }
}
