package com.maryanto.dimas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "m_mahasiswa")
public class Mahasiswa {

    @Id
    @GeneratedValue
    private Integer id;
    private String nim;
    private String nama;
    private Integer semester;

}
