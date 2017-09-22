package com.dimas.maryanto;

import java.sql.*;

public class App {

    private final static String url = "jdbc:postgresql://localhost:5432/bootcamp_2";
    private final static String username = "bootcamp_2";
    private final static String password = "bootcamp";
    private final static String driverClassName = "org.postgresql.Driver";

    public static void main(String[] args) throws SQLException {

//        BasicDataSource ds = new BasicDataSource();
//        ds.setUrl(url);
//        ds.setPassword(password);
//        ds.setUsername(username);
//        ds.setDriverClassName(driverClassName);
//
//        buka koneksi ke database
//        Connection koneksiDb = ds.getConnection();
        Connection koneksiDb = DriverManager.getConnection(url, username, password);

        String sql = "select id, uname, fullname, email, tanggal_lahir from s_user";
        Statement statement = koneksiDb.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

//        load data dari server
        while (resultSet.next()) {
            Integer idUser = resultSet.getInt("id");
            String username = resultSet.getString("uname");
            Date tanggalLahir = resultSet.getDate("tanggal_lahir");

            System.out.println("userid " + idUser + ", username " + username + ", tanggal lahir " + tanggalLahir);
        }

//        tutup semua koneksi
        resultSet.close();
        statement.close();
        koneksiDb.close();

        System.out.println("Hello it works!");
    }
}
