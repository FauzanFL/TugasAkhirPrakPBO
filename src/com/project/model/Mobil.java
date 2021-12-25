package com.project.model;

public class Mobil {
    private String jenisMobil;
    private String noPlat;
    private int kecepatan;
    private int maxPenumpang;

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

    void tampilMobil(){
        System.out.println("Jenis Mobil   : "+jenisMobil);
        System.out.println("Kecepatan     : "+kecepatan);
        System.out.println("Max Penumpang : "+maxPenumpang);
        System.out.println("No Plat       : "+noPlat);
    }
}
