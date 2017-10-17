package com.maryanto.dimas.springdi.repository;

import com.maryanto.dimas.springdi.ApplicationKe5;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.sql.Timestamp;
import java.util.List;

public interface TiketRepository extends PagingAndSortingRepository<ApplicationKe5.Tiket, Integer> {

    public List<ApplicationKe5.Tiket> findAll();

    public List<ApplicationKe5.Tiket> findByJadwal(Timestamp jadwal);
}
