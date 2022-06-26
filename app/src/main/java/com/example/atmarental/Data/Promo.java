package com.example.atmarental.Data;
import com.example.atmarental.R;

public class Promo {
    public String kode_promo;
    public String deskripsi_promo;

    public Promo(String kode_promo, String deskripsi_promo){
        this.kode_promo = kode_promo;
        this.deskripsi_promo = deskripsi_promo;
    }

    public String getKode_promo() { return kode_promo; }

    public void setKode_promo(String kode_promo) { this.kode_promo = kode_promo; }

    public String getDeskripsi_promo() { return deskripsi_promo; }

    public void setDeskripsi_promo(String deskripsi_promo) { this.deskripsi_promo = deskripsi_promo; }

}
