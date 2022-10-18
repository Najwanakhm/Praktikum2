/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK201_2110817210006_AhmaddinNajwan;

/**
 *
 * @author LENOVO
 */
public class Buahbuah {
    String nama;
    float berat;
    int jumlahbeli;
    float totalberat;
    int totalharga;
    int harga;
    
    
    //konstraktor
public Buahbuah (String n,float b, int jb,float tb,int h){

nama=n;
berat=b;
jumlahbeli=jb;
totalberat=tb;
harga=h;
        

}

//method
public void Warung(){

    totalharga= jumlahbeli*harga;
    
    System.out.println("Nama Mangga : " + nama);
    System.out.println("Berat : " + berat+" kg");
    System.out.println("Jumkah Beli : "+jumlahbeli);
    System.out.println("Total Berat : "+ totalberat+" kg"); 
    System.out.println("Total Harga : Rp "+ totalharga);
     
}

}

