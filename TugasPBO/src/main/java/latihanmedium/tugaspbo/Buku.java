/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmedium.tugaspbo;

/**
 *
 * @author Bima4
 */
/**
 * NIM / Nama: 24060122140113 / Bima Aditya Aryono
 * File      : Buku.java
 * Deskripsi : Header dan Body kelas Buku
 * Tanggal   : 12-03-2024
 */


import java.util.ArrayList;
import java.util.List;
public class Buku {
    private int idbuku;
    private String judul;
    private String penulis;
    private String tahunTerbit;
    private int stok;
    private int bukuDipinjam;

    public Buku(){
        
    }
    public Buku(String judul, String penulis, String tahunTerbit, int stok) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.stok = stok;
        this.bukuDipinjam = bukuDipinjam;
    }

    // Getter dan Setter
    public int getID(){
        return this.idbuku;
    }
    
    public String getJudul() {
        return judul;
    }

    public void setID(int idbuku){
        this.idbuku=idbuku;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    public int getBukuDipinjam(){
        return this.bukuDipinjam;
    }
    
    public void setBukuDipinjam(int bukuDipinjam){
        this.bukuDipinjam= bukuDipinjam;
    }
    @Override
    public String toString() {
        return "Judul: " + judul + ", Penulis: " + penulis + ", Tahun Terbit: " + tahunTerbit + ", Stok: " + stok;
    }
}
