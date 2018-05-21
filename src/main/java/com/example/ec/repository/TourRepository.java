package com.example.ec.repository;

import com.example.ec.domain.Tour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TourRepository extends PagingAndSortingRepository<Tour, Integer> {

    Page<Tour> findByTourPackageCode(@Param("code")String tourPackageCode, Pageable pageable);
}
