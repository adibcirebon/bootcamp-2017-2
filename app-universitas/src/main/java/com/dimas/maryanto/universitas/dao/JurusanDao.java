package com.dimas.maryanto.universitas.dao;

import com.dimas.maryanto.universitas.konfig.KonfigDB;
import com.dimas.maryanto.universitas.model.Jurusan;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JurusanDao {

    public List<Jurusan> ambilSemuaData() {
        List<Jurusan> listJurusan = new ArrayList<>();

        try {
            String sql = "select * from universitas.jurusan";
            Connection connection = KonfigDB.getDatasource().getConnection();
            Statement statement = connection.createStatement();
            ResultSet hasil = statement.executeQuery(sql);
            while (hasil.next()) {
                Jurusan jur = new Jurusan();
                jur.setId(hasil.getInt("id"));
                jur.setNama(hasil.getString("nama"));
                listJurusan.add(jur);
            }

            hasil.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listJurusan;
    }
}
