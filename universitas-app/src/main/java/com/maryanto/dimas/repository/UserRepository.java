package com.maryanto.dimas.repository;

import com.maryanto.dimas.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Integer> {
    User findByUsername(String username);
}
