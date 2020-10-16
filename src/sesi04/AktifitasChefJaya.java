/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi04;

/**
 *
 * @author HERIADIE
 */
public class AktifitasChefJaya {

    int hariKunjungan = 1;
    String namaHari = "senin";
    int kunjunganTokoKe = 1;
    String namaToko = "Toko Bahan Kue";
    double tepung = 0;
    double mentega = 0;
    double ayam = 0;
    double dada = 0;
    double sendokGarpu = 0;
    double panciBaru = 0;
    double karcis = 0;
    double kas = 300000;

    public static void main(String[] args) {

        AktifitasChefJaya latihan = new AktifitasChefJaya();
        latihan.mengunjungi();
        latihan.mengunjungi();
        latihan.mengunjungi();
    }

    public void mengunjungi() {

        switch (hariKunjungan) {
            case 1:
                namaHari = "senin";
                System.out.println("Belanja Hari " + namaHari);
                diskon();
                listPembelian();
                hariKunjungan++;
                break;
            case 2:
                namaHari = "jumat";
                System.out.println("Belanja Hari " + namaHari);
                diskon();
                listPembelian();
                hariKunjungan++;
                break;
            case 3:
                namaHari = "Minggu";
                System.out.println("Belanja Hari " + namaHari);
                diskon();
                listPembelian();
                break;
            default:
                break;
        }

    }

    public void diskon() {
        if ("jumat".equals(namaHari) || "sabtu".equals(namaHari)) {

            System.out.println("selamat, hari ini anda dapat diskon");
            tepung = 2000 - (2000 * 0.1);
            mentega = 5000 - (5000 * 0.1);
            ayam = 25000 - (25000 * 0.35);
            dada = 15000 - (15000 * 0.35);
            sendokGarpu = 50000 - (50000 * 0.5);
            panciBaru = 25000 - (25000 * 0.5);
            karcis = 5000;

        } else {
            tepung = 2000;
            mentega = 5000;
            ayam = 25000;
            dada = 15000;
            sendokGarpu = 50000;
            panciBaru = 25000;
            karcis = 5000;

        }
    }

    public void listPembelian() {
        
        System.out.println("Parkir Di Parkiran");
        melangkahKeToko();
        System.out.println("    Sampai ke Toko Kue");
        System.out.println("beli tepung 1/4, dan mentega 1/4 ");
        System.out.println("Harga Mentega 1/4 = Rp " + mentega);
        System.out.println("harga Tepung 1/4 = Rp " + tepung);
        kas = kas - mentega - tepung;
        System.out.println("sisa Saldo = Rp " + kas);
        melangkahKeToko();
        System.out.println("    Sampai ke Toko Ayam");
        System.out.println("beli ayam 1Kg, dan dada 4 potong");
        System.out.println("Harga Ayam 1Kg =Rp " + ayam);
        System.out.println(" Harga dada 4 potong = Rp " + dada);
        kas = kas - ayam - dada;
        System.out.println("sisa Saldo = Rp " + kas);

        if (hariKunjungan < 2) {
            System.out.println("    Sampai ke Toko Perkakas dapur");
            System.out.println("beli Sendok garpu dan PanciBaru");
            System.out.println("harga Sendok Garpu = Rp " + sendokGarpu);
            System.out.println(" Harga Panci Baru = Rp " + panciBaru);
            kas = kas - sendokGarpu - panciBaru;
            System.out.println("sisa Saldo = Rp " + kas);
        }
        System.out.println("Menuju parkiran");
        melangkahKeToko();
        System.out.println("bayar parkir = Rp" + karcis);
        kas = kas -karcis;
         System.out.println("sisa Saldo = Rp " + kas);

    }

    public void melangkahKeToko() {
        for (int x = 5; x > -1; x--) {
            System.out.println("berjalan..sejenak.." + x + "menit");
        }

    }
}
