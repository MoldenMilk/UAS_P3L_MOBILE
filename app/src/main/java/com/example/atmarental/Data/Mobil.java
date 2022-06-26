package com.example.atmarental.Data;
import android.widget.ImageView;
import androidx.databinding.BindingAdapter;
import com.bumptech.glide.Glide;
import com.example.atmarental.R;

public class Mobil {
    public String nama_mobil;
    public String tipe_mobil;
    public String warna_mobil;
    public int harga_sewa;
    public String img_mobil;

    public Mobil(String nama_mobil, String tipe_mobil, String warna_mobil, int harga_sewa, String img_mobil){
        this.nama_mobil = nama_mobil;
        this.tipe_mobil = tipe_mobil;
        this.warna_mobil = warna_mobil;
        this.harga_sewa = harga_sewa;
        this.img_mobil = img_mobil;
    }

    public String getNama_mobil() { return nama_mobil; }

    public void setNama_mobil(String nama_mobil) { this.nama_mobil = nama_mobil; }

    public String getTipe_mobil() { return tipe_mobil; }

    public void setTipe_mobil(String tipe_mobil) { this.tipe_mobil = tipe_mobil; }

    public String getWarna_mobil() { return warna_mobil; }

    public void setWarna_mobil(String warna_mobil) { this.warna_mobil = warna_mobil; }

    public int getHarga_sewa() {
        return harga_sewa;
    }

    public void setHarga_sewa(int harga_sewa) {
        this.harga_sewa = harga_sewa;
    }

    public String getImg_mobil() { return img_mobil; }

    public void setImg_mobil(String img_mobil) { this.img_mobil = img_mobil; }

    @BindingAdapter({"imgMobil"})
    public static void image(ImageView view, String img) {
        Glide.with(view.getContext())
                .load(img)
                .into(view);
    }
}
