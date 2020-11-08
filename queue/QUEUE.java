/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author HP
 */
public class QUEUE {
    private int first;
    private int last;
    private NilaiMataKuliah[] data = new NilaiMataKuliah [10];
    QUEUE(){
        for(int i=0; i<10; i++){
            data [i] = new NilaiMataKuliah();
        }
    }
    void setFirst(int first){
    this.first = first;
    }
    
    int getFirst(){
        return first;
    }
    int getLast(){
        return last;
    }
    
    void createEmpty(){
        first = -1;
        last = -1;
    }
    
    boolean isEmpty(){
        boolean hasil = false;
        if(first == -1){
            hasil = true;
        }
    return hasil;
    }
    
    boolean isFull(){
        boolean hasil = false;
            if(last == 9){
                hasil = true;
            }
            return hasil;
            }
    
    void add(String nim, String nama, double nilai){
        if(isEmpty() == true){/*jika queue masih kosong*/
            last = 0;
            first = 0;
            data[0].setNIM(nim);
            data[0].setNama(nama);
            data[0].setNilai(nilai);
        }
        else{
            /*jika queue tidak kosong*/
            if(isFull () != true){
                last = last +1;
                data[last].setNIM(nim);
                data[last].setNama(nama);
                data[last].setNilai(nilai);
            }
            else{
                System.out.println("Antrian Penuh");
            }
        }
    }
    
    void del(){
        if (last == 0){
            first = -1;
            last = -1;
        }
        else {/*geser elemen antrian kedepan*/
            int i;
            for (i=(first+1); i <=last; i++) {
            data[i-1].setNIM(data[i].getNIM());
            data[i-1].setNama(data[i].getNama());
            data[i-1].setNilai(data[i].getNilai());
            }
            last = last -1;
            }
    }
    
    void printQueue (){
        if(first != -1){
            System.out.println("-------------------Isi Queue-----------------");
            int i;
            for(i = last; i >= first; i--){
                System.out.println("=========================================");
                System.out.println("Elemen ke:" +i);
                System.out.println("NIM : " + data[i].getNIM());
                System.out.println("Nama : " + data[i].getNama());
                System.out.println("Nilai : " + data[i].getNilai());
        }
            System.out.println("---------------------------------------------");
        }
        else{
            /*proses jika Queue kosong*/
            System.out.println("Queue Kosong");    
        }
    }
}
