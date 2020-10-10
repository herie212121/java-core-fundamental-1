/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi03;

import sesi02.Manusia;

/**
 *
 * @author HERIADIE
 */
public class LatihanDeklarasi {
    //deklarsi di dalam class
    double hargaKendaran = 245.88;
    int jumlahKendaran = 33;
    
    public static void main(String[] args) {
        //kode di isi di sini 
        
        
        /*for (int x=1;x<19;x++) {
            
            System.out.println("oke sekarang " + x);
        }*/
    /*int nomor = 1;
    while (nomor<20){
        System.out.println("antian ke " + nomor);
        nomor++;
        }*/
       
    int nomor = 1;
    do{
        System.out.println("antian ke " + nomor);
        nomor++;
        } while (nomor<20);
    
    }
    public void cobaAksesKelasLain (){
        
        Manusia orangLain = new Manusia ();
        
        
    }
    
      
    
    public void prepareData () {
        
        jumlahKendaran = 40;
        hargaKendaran = 500;
        
        int kodeSeri = 1234;
        
                
    }
    
    public void  reset() {
       jumlahKendaran = 50;
       hargaKendaran = 700;
       
    }
    
    
    
    
    
}
