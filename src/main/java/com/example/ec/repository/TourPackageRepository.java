package com.example.ec.repository;

import com.example.ec.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TourPackageRepository extends CrudRepository<TourPackage,String> {

    TourPackage findByName(@Param("name")String tourPackageName);
    TourPackage findByCode(@Param("code")String touPackageCode);
}
