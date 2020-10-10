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
        
    }
    public void pergiKeSekolah (){
       mesinBerjalan();
       bahanBakar = 49;
       uang = 70000;
       air = 20;
    }
    
    public void pergiKePasar (){
       mesinBerjalan();
        bahanBakar = 20;
       uang = 60000;
       air = 15;
    }
    
    public void pergiKeBengkelBan (){
       mesinBerjalan();
        bahanBakar = 50;
       uang = 50000;
       air = 14;
    }
    
    public void pergiKePomBensin (){
       mesinBerjalan();
        bahanBakar = 45;
       uang = 30000;
       air = 13;
    }
    
    public void pergiKePeternakan (){
       mesinBerjalan();
        bahanBakar = 25;
       uang = 25000;
       air = 5;
    }
    public void mesinBerjalan(){
     for (int x=1; x<8; x++) {
            System.out.println("mobil berjalan .... brrrmmmm....");
        }
           
            
    }
    
}
