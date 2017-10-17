package com.maryanto.dimas.repository;

import com.maryanto.dimas.model.Mahasiswa;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MahasiswaRepository extends PagingAndSortingRepository<Mahasiswa, Integer> {
}
