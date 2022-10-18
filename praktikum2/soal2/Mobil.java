/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2.soal2;

import java.util.Locale;
import java.text.NumberFormat;

/**
 *
 * @author LENOVO
 */
public class Mobil {
    
    String merek;
    String tahun_keluaran;
    int kapasitas;
    int harga;
    private String pemilik;
    
    public void setPemilik(String pemilik ){
    this.pemilik =  pemilik;
    }
    public String getPemilik( ){
    return this.pemilik;
    }
    public String getPajak( ){
    return NumberFormat.getNumberInstance(Locale.US).format(this.harga*2/100);
    }
     
    //this.harga*2/100
    
    public void info(){
        System.out.println("Merek Mobil: " + merek);
        System.out.println("Harga: Rp. " + NumberFormat.getNumberInstance(Locale.US).format(harga));
        System.out.println("Tahun Keluaran: "+ tahun_keluaran);
        System.out.println("Kapasitas: " + kapasitas +" cc");
    }
}
//System.out.println(NumberFormat.getNumberInstance(Locale.US).format(35634646));