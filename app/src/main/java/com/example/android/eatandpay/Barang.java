package com.example.android.eatandpay;

public class Barang {
    private Integer Harga;
    private Integer StokAwal;
    private Integer JmlSisa;
    private String NamaBarang;

    public void Barang(){
    }

    public void Barang(Integer harga, Integer stokAwal, Integer jmlSisa, String namaBarang) {
        Harga = harga;
        StokAwal = stokAwal;
        JmlSisa = jmlSisa;
        NamaBarang = namaBarang;
    }

    public Integer getHarga() {
        return Harga;
    }

    public void setHarga(Integer harga) {
        Harga = harga;
    }

    public Integer getStokAwal() {
        return StokAwal;
    }

    public void setStokAwal(Integer stokAwal) {
        StokAwal = stokAwal;
    }

    public Integer getJmlSisa() {
        return JmlSisa;
    }

    public void setJmlSisa(Integer jmlSisa) {
        JmlSisa = jmlSisa;
    }

    public String getNamaBarang() {
        return NamaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        NamaBarang = namaBarang;
    }
}





