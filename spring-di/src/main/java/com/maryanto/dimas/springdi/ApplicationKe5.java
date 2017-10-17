package com.maryanto.dimas.springdi;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ApplicationKe5 {

    public static void main(String[] args) {

        SpringApplication.run(ApplicationKe5.class, args);
//        ApplicationContext springContext =  SpringApplication.run(ApplicationKe5.class, args);
//        TiketRepository tiketRepository = springContext.getBean(TiketRepository.class);
//        PenumpangRepository penumpangRepository = springContext.getBean(PenumpangRepository.class);
//        TravelRepository travelRepository = springContext.getBean(TravelRepository.class);

//        Penumpang penumpang1 = penumpangRepository.save(new Penumpang(null, "dimas", "jl.", "0823", null));
//        System.out.println(penumpang1.toString());
//
//        Travel travel1 = travelRepository.save(new Travel(null, "dimas", "09834", "jl", "dlkasdjf", null));
//
//        tiketRepository.save(new Tiket(null, penumpang1, travel1, Timestamp.valueOf(LocalDateTime.now())));
//
//        Penumpang penumpang2 = penumpangRepository.save(new Penumpang(null, "dimas", "jl.", "0823", null));
//        System.out.println(penumpang1.toString());
//
//        Travel travel2 = travelRepository.save(new Travel(null, "dimas", "09834", "jl", "dlkasdjf", null));
//
//        tiketRepository.save(new Tiket(null, penumpang2, travel2, Timestamp.valueOf(LocalDateTime.now())));
//
//        Penumpang penumpang3 = penumpangRepository.save(new Penumpang(null, "dimas", "jl.", "0823", null));
//        System.out.println(penumpang1.toString());
//
//        Travel travel3 = travelRepository.save(new Travel(null, "dimas", "09834", "jl", "dlkasdjf", null));
//
//        tiketRepository.save(new Tiket(null, penumpang3, travel3, Timestamp.valueOf(LocalDateTime.now())));

    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table(name = "tbl_tiket", schema = "travel")
    public static class Tiket {
        @Id
        @GeneratedValue
        private Integer id;
        @ManyToOne
        @JoinColumn(name = "id_penumpang", nullable = false)
        private Penumpang penumpang;
        @ManyToOne
        @JoinColumn(name = "id_travel", nullable = false)
        private Travel travel;
        private Timestamp jadwal;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table(name = "tbl_penumpang", schema = "travel")
    public static class Penumpang {

        @Id
        @GenericGenerator(name = "gen_penumpang", strategy = "uuid2")
        @GeneratedValue(generator = "gen_penumpang")
        private String id;
        private String nama;
        private String alamat;
        private String nomorTelp;
        @JsonIgnore
        @OneToMany(mappedBy = "penumpang")
        private List<Tiket> daftarTiket = new ArrayList<>();
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @Entity
    @Table(name = "mobil", schema = "travel")
    public static class Travel {

        @Id
        @GeneratedValue
        private Integer id;
        private String namaSupir;
        private String nomorTelp;
        private String alamat;
        private String nomorPolisi;
        @JsonIgnore
        @OneToMany(mappedBy = "travel")
        private List<Tiket> daftarTiket = new ArrayList<>();
    }
}
