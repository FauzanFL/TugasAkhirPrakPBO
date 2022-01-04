package com.project.model;

public class Mobil {
    private String jenisMobil;
    private String noPlat;
    private int kecepatan;
    private int maxPenumpang;
    private int harga;

    public Mobil(String jenisMobil, String noPlat, int kecepatan, int maxPenumpang, int harga) {
        this.jenisMobil = jenisMobil;
        this.noPlat = noPlat;
        this.kecepatan = kecepatan;
        this.maxPenumpang = maxPenumpang;
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getMaxPenumpang() {
        return maxPenumpang;
    }

    public void setMaxPenumpang(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public String getJenisMobil() {
        return jenisMobil;
    }

    public void setJenisMobil(String jenisMobil) {
        this.jenisMobil = jenisMobil;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void tampilMobil(){
        System.out.println("Jenis Mobil   : "+jenisMobil);
        System.out.println("Kecepatan     : "+kecepatan+" Km/jam");
        System.out.println("Max Penumpang : "+maxPenumpang+ " orang");
        System.out.println("No Plat       : "+noPlat);
        System.out.println("Harga         : Rp. "+harga);
    }
}
