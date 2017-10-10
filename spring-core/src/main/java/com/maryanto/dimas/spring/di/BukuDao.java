package com.maryanto.dimas.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class BukuDao {

    @Autowired
    private Connection connection;

    public void saveBuku(String judulBuku, String pengarang, Integer jumlahBuku) throws SQLException {
        System.out.println(connection);
        PreparedStatement statement = connection.prepareStatement("INSERT INTO perpus.buku (judul_buku, pengarang, jumlah_buku) VALUES (?, ?, ?)");
        statement.setString(1, judulBuku);
        statement.setString(2, pengarang);
        statement.setInt(3, jumlahBuku);
        statement.executeUpdate();

        statement.close();
    }

    public void updateBuku(String jumlahBuku, Integer id) throws SQLException {
        System.out.println(connection);
        PreparedStatement statement = connection.prepareStatement("UPDATE perpus.buku SET judul_buku = ? WHERE id = ?");
        statement.setInt(2, id);
        statement.setString(1, jumlahBuku);
        statement.executeUpdate();
        statement.close();
    }
}
