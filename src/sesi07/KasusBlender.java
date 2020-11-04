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
public class KasusBlender {

    int level = 0;
    String kondisiMesin = "baru";
    String merek = "YAMAHA";
    int harga = 450000;

    public void  startLevel(int angka) {
        level = angka;
        System.out.println("Mesin mulai hidup di level " + level);
                        

    }

    public void stop() {
        level = 0;
        System.out.println("Mesin kini berhenti level " + level);

    }

    public void rendahkanLevel() {
        level--;
        System.out.println("Meisn turun ke level " + level);

    }

    public void naikkanLevel() {
        level++;
        System.out.println("Mesin naik ke level " + level);
    }

    public void siap() {
        System.out.println("=====================");
        System.out.println(" kondisi : " + kondisiMesin);
        System.out.println("Merek : " + merek);
        System.out.println("Harga : " + harga);
        System.out.println("=====================");
    }

    public static void main(String[] args) {
        KasusBlender mesin = new KasusBlender();
        mesin.siap();
        mesin.startLevel(2);
        mesin.naikkanLevel();
        mesin.naikkanLevel();
        mesin.rendahkanLevel();
        mesin.stop();
    }
}
