/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi03;

/**
 *
 * @author HERIADIE
 */
public class PetualanganChefJaya {

    String mobil = "Chevrolet Roda 4";
    int bahanBakar = 50;
    int air = 20;
    int uang = 750000;
    String destinasi = "Sekolah";

    public static void main(String[] args) {
        PetualanganChefJaya exercise = new PetualanganChefJaya();
        exercise.pergiKeSekolah();
        exercise.pergiKePasar();
        exercise.pergiKeBengkelBan();
        exercise.pergiKePomBensin();
        exercise.pergiKePeternakan();
        
    }

    public void pergiKeSekolah() {
        System.out.println("Bekal Yang tersedia sebelum petualangan: ");
        System.out.println("bahan bakar = " + bahanBakar + " Liter");
        System.out.println("uang = " + uang + " Rupiah");
        System.out.println("air " + air + " liter");
        System.out.println("Saatnya berangkat ke Sekolah");
        mesinBerjalan();
        bahanBakar = 49;
        uang = 70000;
        air = 20;
        System.out.println("Saat sampai Sekolah ");
        System.out.println("sisa bahan bakar =" + bahanBakar);
        System.out.println("sisa uang =" + uang);
        System.out.println("sisa air" + air);
    }

    public void pergiKePasar() {
        System.out.println("Saatnya pergi ke pasar");
        mesinBerjalan();
        bahanBakar = 20;
        uang = 60000;
        air = 15;
        System.out.println("setelah sampai Pasar");
        System.out.println("sisa bahan bakar =" + bahanBakar);
        System.out.println("sisa uang =" + uang);
        System.out.println("sisa air" + air);
    }

    public void pergiKeBengkelBan() {
        System.out.println("saatnya pergi ke bengkel ban ");
        mesinBerjalan();
        bahanBakar = 50;
        uang = 50000;
        air = 14;
        System.out.println("setelah sampai di bengkel ban");
        System.out.println("sisa bahan bakar =" + bahanBakar);
        System.out.println("sisa uang =" + uang);
        System.out.println("sisa air" + air);
    }

    public void pergiKePomBensin() {
        System.out.println("saatnya berangkat ke pom bensin");
        mesinBerjalan();
        bahanBakar = 45;
        uang = 30000;
        air = 13;
        System.out.println("setelah sampai di pom bensin ");
        System.out.println("sisa bahan bakar =" + bahanBakar);
        System.out.println("sisa uang =" + uang);
        System.out.println("sisa air" + air);
    }

    public void pergiKePeternakan() {
        System.out.println("saatnya berangkt ke peternakan ");
        mesinBerjalan();
        bahanBakar = 25;
        uang = 25000;
        air = 5;
        System.out.println("setelah sampai di peternakan");
        System.out.println("sisa bahan bakar =" + bahanBakar);
        System.out.println("sisa uang =" + uang);
        System.out.println("sisa air" + air);
        
    }

    public void mesinBerjalan() {
        for (int x = 1; x < 8; x++) {
            System.out.println("mobil berjalan .... brrrmmmm....");
        }

    }

}
