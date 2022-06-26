package com.example.atmarental.Data;
import java.util.ArrayList;

public class DaftarPromo {
    public static ArrayList<Promo> Promo;
    public DaftarPromo(){
        Promo = new ArrayList<>();
        Promo.add(Mahasiswa);
        Promo.add(Veteran);
        Promo.add(OneTime);
        Promo.add(Lucky);
    }

    public static final Promo Mahasiswa = new Promo("MHSW", "Potongan harga untuk mahasiswa sebesar 20%");
    public static final Promo Veteran = new Promo("VTRN", "Potongan harga pelanggan diatas 80 tahun sebesar 40%");
    public static final Promo OneTime = new Promo("ONTM", "Cashback sebesar 30% untuk peminjaman lebih dari 3 hari");
    public static final Promo Lucky = new Promo("LCKY", "Gratis melakukan peminjaman mobil untuk 1 hari");

}
