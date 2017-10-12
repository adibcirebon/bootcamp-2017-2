package com.maryanto.dimas.springdi.repository;

import com.maryanto.dimas.springdi.ApplicationKe5;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TravelRepository extends PagingAndSortingRepository<ApplicationKe5.Travel, Integer> {
}
