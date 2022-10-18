package PRAK203_2110817210006_AhmaddinNajwan;
public class Soal3Main {
 public static void main(String[] args) {
 Pegawai p1 = new Pegawai();
 p1.nama = "Roi"; // tanda petik tidak ada
 p1.asal = "Kingdom of Orvel";
 p1.setJabatan("Assasin");
 p1.umur= 17; //menambahkan umur
 System.out.println("Nama Pegawai: " + p1.getNama());
 System.out.println("Asal: " + p1.getAsal());
 System.out.println("Jabatan: " + p1.jabatan);
 System.out.println("Umur: " + p1.umur + " tahun"); //isi dari umurnya dan kata tahun diujungnya
 }
 }