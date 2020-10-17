/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi05;

/**
 *
 * @author HERIADIE
 */
public class AktifitasChefJaya2 {

    int hariKunjungan = 1;
    String namaHari = "senin";
    int kunjunganTokoKe = 1;
    String namaToko;
    double tepung = 2000;
    double mentega = 5000;
    double ayam = 25000;
    double dada = 15000;
    double sendokGarpu = 50000;
    double panciBaru = 25000;
    double karcis = 5000;
    double potongan = 0;
    double kas = 300000;
    double tagihan = 0;

    public static void main(String[] args) {

        AktifitasChefJaya2 lat1 = new AktifitasChefJaya2();
        lat1.mengunjungi();
        lat1.mengunjungi();
        lat1.mengunjungi();
    }

    public void mengunjungi() {

        switch (hariKunjungan) {
            case 1:
                namaHari = "senin";
                System.out.println("Belanja Hari " + namaHari);
                listPembelian();
                hariKunjungan++;
                break;
            case 2:
                namaHari = "jumat";
                System.out.println("Belanja Hari " + namaHari);

                listPembelian();
                hariKunjungan++;
                break;
            case 3:
                namaHari = "Minggu";
                System.out.println("Belanja Hari " + namaHari);

                listPembelian();
                break;
            default:
                break;
        }

    }

    public void diskon() {
        if ("jumat".equalsIgnoreCase(namaHari) || "sabtu".equalsIgnoreCase(namaHari)) {
            System.out.println("Selamat pada hari " + namaHari + " anda dapat diskon");
            if ("Toko Kue".equalsIgnoreCase(namaToko)) {
                potongan = 0.1;
            } else if ("Toko Ayam".equalsIgnoreCase(namaToko)) {
                potongan = 0.35;

            } else if ("Toko Perkakas Dapur".equalsIgnoreCase(namaToko)) {
                potongan = 0.5;
            }
            System.out.println("diskon yang di dapat di " + namaToko + (potongan * 100) + "%");
        } else {
            potongan = 0;
            System.out.println("Pada hari " + namaHari + " tidak ada diskon di " + namaToko);
            System.out.println("diskon = " + potongan + "%");
            

        }
    }

    public void listPembelian() {

        System.out.println("Parkir Di Parkiran");
        melangkahKeToko();
        System.out.println("");
        System.out.println("");
        namaToko = "Toko Kue";
        System.out.println("    Sampai ke " + namaToko);
        diskon();
        System.out.println("beli tepung 1/4, dan mentega 1/4 ");
        System.out.println("Harga Mentega 1/4 = Rp " + mentega);
        System.out.println("harga Tepung 1/4 = Rp " + tepung);
        tagihan = mentega + tepung;
        System.out.println("total tagihan sebelum diskon  Rp " + tagihan);
        tagihan = tagihan - (tagihan * potongan);
        System.out.println("total tagihan setelah potongan Rp " + tagihan);
        kas = kas - tagihan;
        System.out.println("sisa Saldo = Rp " + kas);
        melangkahKeToko();
        System.out.println("");
        System.out.println("");
        namaToko = "Toko Ayam";
        System.out.println("    Sampai ke " + namaToko);
        diskon();
        System.out.println("beli ayam 1Kg, dan dada 4 potong");
        System.out.println("Harga Ayam 1Kg =Rp " + ayam);
        System.out.println("Harga dada 4 potong = Rp " + dada);
        tagihan = ayam + dada;
        System.out.println("total tagihan sebelum diskon  Rp " + tagihan);
        tagihan = tagihan - (tagihan * potongan);
        System.out.println("total tagihan setelah potongan Rp " + tagihan);
        kas = kas - tagihan;
        System.out.println("sisa Saldo = Rp " + kas);

        if (hariKunjungan < 2) {
            melangkahKeToko();
            System.out.println("");
            System.out.println("");
            namaToko = "Toko Perkakas Dapur";
            System.out.println("    Sampai ke Toko Perkakas dapur");
            diskon();
            System.out.println("beli Sendok garpu dan PanciBaru");
            System.out.println("harga Sendok Garpu = Rp " + sendokGarpu);
            System.out.println("harga Panci Baru = Rp " + panciBaru);
            tagihan = sendokGarpu + panciBaru;
            System.out.println("total tagihan sebelum diskon  Rp " + tagihan);
            tagihan = tagihan - (tagihan * potongan);
            System.out.println("total tagihan setelah potongan Rp " + tagihan);
            kas = kas - tagihan;
            System.out.println("sisa Saldo = Rp " + kas);
        }
        System.out.println("Menuju parkiran");
        melangkahKeToko();
        System.out.println("bayar parkir = Rp" + karcis);
        kas = kas - karcis;
        System.out.println("sisa Saldo = Rp " + kas);

    }

    public void melangkahKeToko() {
        for (int x = 5; x >= 1; x--) {
            System.out.println("berjalan..sejenak.." + x + "menit");
        }

    }

}
