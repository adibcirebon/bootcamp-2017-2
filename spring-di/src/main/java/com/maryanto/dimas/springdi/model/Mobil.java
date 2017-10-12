package com.maryanto.dimas.springdi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "master_mobil", schema = "rental")
public class Mobil {

    @Id
    @Column(name = "id_mobil", length = 120)
    private String id;

    @Column(name = "nama_mobil", nullable = false, length = 50, unique = true)
    private String nama;

    @Column(nullable = false, name = "jumlah_cylinder", length = 2)
    private Integer jumlahCylinder;

    @OneToOne
    @JoinColumn(name = "id_manufacture", nullable = false)
    private Manufacture manufacture;
}
