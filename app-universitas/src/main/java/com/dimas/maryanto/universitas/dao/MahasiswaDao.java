package com.dimas.maryanto.universitas.dao;

import com.dimas.maryanto.universitas.konfig.KonfigDB;
import com.dimas.maryanto.universitas.model.Jurusan;
import com.dimas.maryanto.universitas.model.Kelas;
import com.dimas.maryanto.universitas.model.Mahasiswa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MahasiswaDao {

    public List<Mahasiswa> semuaDataMahasiswa() {
        List<Mahasiswa> listMahasiswa = new ArrayList<>();

        String sql = "select mhs.id as id_mahasiswa,\n" +
                "  mhs.nama as nama_mahasiswa,\n" +
                "  mhs.nim as nim_mahasiswa,\n" +
                "  kelas.id as id_kelas,\n" +
                "  kelas.nama as nama_kelas,\n" +
                "  kelas.angkatan as angkatan_kelas,\n" +
                "  jur.id as id_jurusan,\n" +
                "  jur.nama as nama_jurusan\n" +
                "from \n" +
                "  universitas.mahasiswa mhs join universitas.kelas kelas on (mhs.kelas = kelas.id) \n" +
                "    join universitas.jurusan jur on (jur.id = mhs.jurusan)";
        try {
            Connection connection = KonfigDB.getDatasource().getConnection();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
//                iterasi ke 1 105
//                iterasi ke 2 106
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id_mahasiswa"));
                mhs.setNama(rs.getString("nama_mahasiswa"));
                mhs.setNim(rs.getString("nim_mahasiswa"));

                Jurusan jur = new Jurusan();
                jur.setId(rs.getInt("id_jurusan"));
                jur.setNama(rs.getString("nama_jurusan"));
                mhs.setJurusan(jur);

                Kelas kelas = new Kelas();
                kelas.setId(rs.getInt("id_kelas"));
                kelas.setNama(rs.getString("nama_kelas"));
                kelas.setAngkatan(rs.getInt("angkatan_kelas"));
                mhs.setKelas(kelas);

                listMahasiswa.add(mhs);
            }
            rs.close();
            st.close();
            connection.close();

        } catch (SQLException error) {
            error.printStackTrace();
        }
        return listMahasiswa;
    }

}
