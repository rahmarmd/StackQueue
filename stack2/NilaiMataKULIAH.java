/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack2;

/**
 *
 * @author HP
 */
public class NilaiMataKULIAH {
     private String nim;
   private String nama;
   private double nilai;
   
   NilaiMataKULIAH(){   
   }
   
   void setNIM(String nim){
       this.nim = nim;      
   }
   String getNIM(){
       return nim;
   }
   
   void setNama(String nama){
       this.nama = nama;      
   }
   String getNama(){
       return nama;
   }
   
   void setNilai(double nilai){
       this.nilai = nilai;      
   }
   double getNilai(){
       return nilai;
   }
}


