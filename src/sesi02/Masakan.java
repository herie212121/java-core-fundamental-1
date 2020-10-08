/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi02;

/**
 *
 * @author HERIADIE
 */
public class Masakan {
    
    String jenisHewan;
    int ketebalanPaha;
    double ketebalanDada;
    int panjangDada;
    
    public void prepare() {
        //disini mulai mempersiapkan masakan 
        /* nah ini jugs komen*/
        jenisHewan = "kalkun";
        ketebalanDada = 5;
        ketebalanPaha = 4;
        panjangDada = 7;
    }
    
    public void masak () {
        ketebalanDada = 3.5;
        panjangDada = 6;
        ketebalanPaha = 3;
    }
}
