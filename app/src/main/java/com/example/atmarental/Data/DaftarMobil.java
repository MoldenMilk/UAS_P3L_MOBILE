package com.example.atmarental.Data;
import java.util.ArrayList;

public class DaftarMobil {
    public static ArrayList<Mobil> Mobil;
    public DaftarMobil(){
        Mobil = new ArrayList<>();
        Mobil.add(Vios);
        Mobil.add(Civic);
        Mobil.add(Agya);
        Mobil.add(Brio);
        Mobil.add(Rush);
        Mobil.add(Fortuner);
        Mobil.add(Avanza);
        Mobil.add(Alphard);
    }

    public static final Mobil Vios = new Mobil("Toyota Vios", "Sedan", "Merah", 400000, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.oto.com%2Fmobil-baru%2Ftoyota%2Fvios%2Fwarna&psig=AOvVaw1IJ9a7t9RuAuW1zfEIJyLF&ust=1653983548247000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCKiG14HfhvgCFQAAAAAdAAAAABAD");
    public static final Mobil Civic = new Mobil("Honda Civic", "Sedan", "Abu-abu", 500000, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.oto.com%2Fmobil-baru%2Fhonda%2Fcivic-type-r%2Fwarna&psig=AOvVaw31RXhYIfsDSOc2Hd02WisN&ust=1653983820907000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCJjPxY_ghvgCFQAAAAAdAAAAABAD");
    public static final Mobil Agya = new Mobil("Toyota Agya", "City Car", "Merah", 250000, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.oto.com%2Fmobil-baru%2Ftoyota%2Fagya%2Fwarna&psig=AOvVaw17dX8zyfb0tMQKmrXvZ-MN&ust=1653983944999000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCIDE4r_ghvgCFQAAAAAdAAAAABAO");
    public static final Mobil Brio = new Mobil("Honda Brio", "City Car", "Putih", 200000, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.honda-indonesia.com%2Ftrendsetter%2Fedisi-mei-2020%2Fmau-cat-mobil-putih-kamu-awet-ikuti-cara-berikut&psig=AOvVaw0SlyrUc7fnlBTfCzW8yphQ&ust=1653983990843000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCOD-gtXghvgCFQAAAAAdAAAAABAD");
    public static final Mobil Rush = new Mobil("Toyota Rush", "SUV", "Putih", 1000000, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fiprice.co.id%2Fharga%2Ftoyota-rush%2F&psig=AOvVaw3Ar2rpKx-uc3bhsR3AQ396&ust=1653984018776000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCMCKm-TghvgCFQAAAAAdAAAAABAD");
    public static final Mobil Fortuner = new Mobil("Toyota Fortuner", "SUV", "Hitam", 1250000, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.oto.com%2Fmobil-baru%2Ftoyota%2Ffortuner%2Fgambar&psig=AOvVaw3mLO1GNvHx_5dgS0lokXA8&ust=1653984050303000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCMCN8PHghvgCFQAAAAAdAAAAABAD");
    public static final Mobil Avanza = new Mobil("Toyota Avanza", "MPV", "Silver", 300000, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.toyotasemarang.id%2F2016%2F04%2Fpilihan-warna-eksterior-toyota-grand.html&psig=AOvVaw0u-PrAZ7pdHD8gxfNgneQ1&ust=1653984073015000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCKDf0_zghvgCFQAAAAAdAAAAABAD");
    public static final Mobil Alphard = new Mobil("Toyota Alphard", "MPV", "Putih", 1500000, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.cnbcindonesia.com%2Fnews%2F20210603144739-4-250354%2Fharga-toyota-alphard-terbaru-nyaris-rp-2-m-ini-penampakannya&psig=AOvVaw34H-q02qNB3qsmYo9VgLi6&ust=1653984095265000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCIj5qYjhhvgCFQAAAAAdAAAAABAD");
}
