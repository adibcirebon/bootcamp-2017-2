package com.maryanto.dimas.springdi.repository;

import com.maryanto.dimas.springdi.ApplicationKe5;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TiketRepository extends PagingAndSortingRepository<ApplicationKe5.Tiket, Integer> {


    public interface PenumpangRepository extends PagingAndSortingRepository<ApplicationKe5.Penumpang, Integer> {

    }

    public interface TravelRepository extends PagingAndSortingRepository<ApplicationKe5.Travel, Integer> {

    }

}
