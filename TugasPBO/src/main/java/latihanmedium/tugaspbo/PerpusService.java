/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmedium.tugaspbo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import static latihanmedium.tugaspbo.PerpusUtility.getConnection;

/**
 *
 * @author Bima4
 */
public class PerpusService {
    Connection koneksi = null;
    
    public PerpusService(){
        koneksi = getConnection();
    }
    
    public Buku makeBukuObject(){
        return new Buku();
    }
    
    public List<Buku> cariBuku(String judul, String penulis, String tahunTerbit) {
        List<Buku> bukuList = new ArrayList<>();
        StringBuilder query = new StringBuilder("SELECT * FROM buku WHERE 1=1");
        
        if (judul != null && !judul.isEmpty()) {
            query.append(" AND judul LIKE '%").append(judul).append("%'");
        }
        if (penulis != null && !penulis.isEmpty()) {
            query.append(" AND penulis LIKE '%").append(penulis).append("%'");
        }
        if (tahunTerbit != null && !tahunTerbit.isEmpty()) {
            query.append(" AND tahunTerbit LIKE '%").append(tahunTerbit).append("%'");
        }
        
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query.toString());
            while (rs.next()) {
                Buku buku = new Buku();
                buku.setID(rs.getInt("idbuku"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenulis(rs.getString("penulis"));
                buku.setTahunTerbit(rs.getString("tahunTerbit"));
                buku.setStok(rs.getInt("stok"));
                bukuList.add(buku);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return bukuList;
    }
    
    public Buku getByJudul(String judul) {
    Buku buku = new Buku();
    String query = "SELECT * FROM buku WHERE judul LIKE '%"+judul+"%'";
    try {
        Statement s = koneksi.createStatement();
        ResultSet rs = s.executeQuery(query);
        if (rs.next()) {
            buku.setID(rs.getInt("idbuku"));
            buku.setJudul(rs.getString("judul"));
            buku.setPenulis(rs.getString("penulis"));
            buku.setTahunTerbit(rs.getString("tahunTerbit"));
            buku.setStok(rs.getInt("stok"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
        }
        return buku;
    }

    public Buku getByNamaPenulis(String penulis) {
        Buku buku = new Buku();
        String query = "SELECT * FROM buku WHERE penulis='" + penulis + "'";
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()) {
                buku.setID(rs.getInt("idbuku"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenulis(rs.getString("penulis"));
                buku.setTahunTerbit(rs.getString("tahunTerbit"));
                buku.setStok(rs.getInt("stok"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return buku;
    }

    public Buku getByTahunTerbit(String tahunTerbit) {
        Buku buku = new Buku();
        String query = "SELECT * FROM buku WHERE tahunTerbit='" + tahunTerbit + "'";
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()) {
                buku.setID(rs.getInt("idbuku"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenulis(rs.getString("penulis"));
                buku.setTahunTerbit(rs.getString("tahunTerbit"));
                buku.setStok(rs.getInt("stok"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return buku;
    }

    public List<Buku> getByJudulAndPenulis(String judul, String penulis) {
        List<Buku> bukuList = new ArrayList<>();
        String query = "SELECT * FROM buku WHERE judul='" + judul + "' AND penulis='" + penulis + "'";
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                Buku buku = new Buku();
                buku.setID(rs.getInt("idbuku"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenulis(rs.getString("penulis"));
                buku.setTahunTerbit(rs.getString("tahunTerbit"));
                buku.setStok(rs.getInt("stok"));
                bukuList.add(buku);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bukuList;
    }

    public List<Buku> getByJudulAndTahunTerbit(String judul, String tahunTerbit) {
        List<Buku> bukuList = new ArrayList<>();
        String query = "SELECT * FROM buku WHERE judul='" + judul + "' AND tahunTerbit='" + tahunTerbit + "'";
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                Buku buku = new Buku();
                buku.setID(rs.getInt("idbuku"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenulis(rs.getString("penulis"));
                buku.setTahunTerbit(rs.getString("tahunTerbit"));
                buku.setStok(rs.getInt("stok"));
                bukuList.add(buku);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bukuList;
    }

    public List<Buku> getByPenulisAndTahunTerbit(String penulis, String tahunTerbit) {
        List<Buku> bukuList = new ArrayList<>();
        String query = "SELECT * FROM buku WHERE penulis='" + penulis + "' AND tahunTerbit='" + tahunTerbit + "'";
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                Buku buku = new Buku();
                buku.setID(rs.getInt("idbuku"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenulis(rs.getString("penulis"));
                buku.setTahunTerbit(rs.getString("tahunTerbit"));
                buku.setStok(rs.getInt("stok"));
                bukuList.add(buku);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bukuList;
    }

    public List<Buku> getByJudulPenulisAndTahunTerbit(String judul, String penulis, String tahunTerbit) {
        List<Buku> bukuList = new ArrayList<>();
        String query = "SELECT * FROM buku WHERE judul='" + judul + "' AND penulis='" + penulis + "' AND tahunTerbit='" + tahunTerbit + "'";
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                Buku buku = new Buku();
                buku.setID(rs.getInt("idbuku"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenulis(rs.getString("penulis"));
                buku.setTahunTerbit(rs.getString("tahunTerbit"));
                buku.setStok(rs.getInt("stok"));
                bukuList.add(buku);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bukuList;
    }
    public List<Buku> getAll() {
        List<Buku> bukuList = new ArrayList<>();
        String query = "SELECT * FROM buku";
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                Buku buku = new Buku();
                buku.setID(rs.getInt("idbuku"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenulis(rs.getString("penulis"));
                buku.setTahunTerbit(rs.getString("tahunTerbit"));
                buku.setStok(rs.getInt("stok"));
                bukuList.add(buku);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bukuList;
    }
    // Fungsi untuk mengupdate buku di database
    private void updateBuku(Buku buku) {
        String query = "UPDATE buku SET stok = " + buku.getStok() + ", bukuDipinjam = " + buku.getBukuDipinjam() + " WHERE idbuku = " + buku.getID();
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Fungsi untuk mengupdate stok dan buku dipinjam ketika buku dipinjam
    public void updatePinjamBuku(Buku buku) {
        buku.setStok(buku.getStok() - 1);
        buku.setBukuDipinjam(buku.getBukuDipinjam() + 1);
        updateBuku(buku);
    }

    // Fungsi untuk mengupdate stok dan buku dipinjam ketika buku dikembalikan
    public void updateKembalikanBuku(Buku buku) {
        buku.setStok(buku.getStok() + 1);
        buku.setBukuDipinjam(buku.getBukuDipinjam() - 1);
        updateBuku(buku);
    }




}
