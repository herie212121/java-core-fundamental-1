/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi07;

/**
 *
 * @author HERIADIE
 */
public class KasusOven {

    String[] daftarOven;

    public void setOvenNya(int x) {

    }

    public void tunggu() {

    }

    public void periksaMesin() {

    }

    public void kedatangan(String nama, int umur ) {

    }

    public static void main(String[] args) {

        Anak anakKetiga = new Anak();
        anakKetiga.setUmur(5);
        anakKetiga.setNama("nina");

        Oven ovenSamsung = new Oven();
        ovenSamsung.setWarningUmur(5);
        ovenSamsung.setKondisi("baru");
        ovenSamsung.setHarga(400);
        ovenSamsung.setMerk("Samsung");

        Oven ovenYamaha = new Oven();
        ovenYamaha.setWarningUmur(13);
        ovenYamaha.setKondisi("Baru");
        ovenYamaha.setHarga(300);
        ovenYamaha.setMerk("Yamaha");

        Oven ovenMiyako = new Oven();
        ovenMiyako.setWarningUmur(3);
        ovenMiyako.setKondisi("lama");
        ovenMiyako.setHarga(150);
        ovenMiyako.setMerk("Miyako");

        Oven daftarOven[] = new Oven();
        daftarOven[0] = ovenSamsung;
        daftarOven[1] = ovenYamaha;
        daftarOven[2] = ovenMiyako;

        KasusOven kejadianLuarBiasa = new KasusOven();
        //kejadianLuarBiasa.setOvenNya(daftarOven);
       // kejadianLuarBiasa.kedatangan(anakKetiga);
        kejadianLuarBiasa.tunggu();
        kejadianLuarBiasa.periksaMesin();

// lanjutkan dengan anakKedua, usia 13 tahun bernama eko
// deklarasi disini 
        Anak anakKedua = new Anak();
        anakKedua.setUmur(13);
        anakKedua.setNama("eko");
        kejadianLuarBiasa.kedatangan(anakKedua);
        kejadianLuarBiasa.tunggu();
        kejadianLuarBiasa.periksaMesin();

// lanjutkan dengan akanPertama, usia 24 tahun bernama cyntia
// deklarasi disini
        Anak anakPertama = new Anak();
        anakPertama.setUmur(24);
        anakPertama.setNama("Cyntia");
    }

}
