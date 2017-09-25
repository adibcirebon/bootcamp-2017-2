/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dimas.maryanto.universitas.dao;

import com.dimas.maryanto.universitas.konfig.KonfigDB;
import com.dimas.maryanto.universitas.model.Kelas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dimmaryanto93
 */
public class KelasDao {

    public List<Kelas> semuaDataKelas() {

        List<Kelas> listKelas = new ArrayList<>();
        try {
            Connection koneksiDB = KonfigDB.getDatasource().getConnection();
            String sql = "select id, nama, angkatan from universitas.kelas";
            Statement s = koneksiDB.createStatement();
            ResultSet r = s.executeQuery(sql);
            while (r.next()) {
                Kelas kelas = new Kelas();
                kelas.setId(r.getInt("id"));
                kelas.setNama(r.getString("nama"));
                kelas.setAngkatan(r.getInt("angkatan"));
                listKelas.add(kelas);
            }
            
            r.close();
            s.close();
            koneksiDB.close();
        } catch (SQLException ex) {
            Logger.getLogger(KelasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listKelas;
    }

    public void save(Kelas objKelas) {
        try {
            Connection koneksiDB = KonfigDB.getDatasource().getConnection();

            String sql = "insert into universitas.kelas(nama, angkatan) values (?, ?)";
            PreparedStatement ps = koneksiDB.prepareStatement(sql);
            ps.setString(1, objKelas.getNama());
            ps.setInt(2, objKelas.getAngkatan());
            ps.executeUpdate();

            ps.close();
            koneksiDB.close();
        } catch (SQLException ex) {
            Logger.getLogger(KelasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Kelas objKelas) {
        try {
            Connection koneksiDB = KonfigDB.getDatasource().getConnection();

            String sql = "update universitas.kelas set nama = ?, angkatan = ? where id = ?";
            PreparedStatement ps = koneksiDB.prepareStatement(sql);
            ps.setString(1, objKelas.getNama());
            ps.setInt(2, objKelas.getAngkatan());
            ps.setInt(3, objKelas.getId());

            ps.executeUpdate();

            ps.close();
            koneksiDB.close();
        } catch (SQLException ex) {
            Logger.getLogger(KelasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
