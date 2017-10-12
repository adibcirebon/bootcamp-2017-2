package com.maryanto.dimas.springdi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "master_manufacture", schema = "rental")
public class Manufacture {

    @Id
    @Column(name = "id_manufacture")
    private String id;

    @Column(name = "nama_manufacture", nullable = false)
    private String nama;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
