package com.example.ec.repository;


import com.example.ec.domain.TourRating;
import com.example.ec.domain.TourRatingPk;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TourRatingRepository extends CrudRepository<TourRating,TourRatingPk> {

    /**
     *@param tourId is the tour identifier
     *@return a list of any tourratings found
     */
    List<TourRating> findByPkTourId(@Param("tourId") Integer tourId);

    /**
     *@param tourId is the tour identifier
     *@param pageable is details of a desired page
     *@return a Page of any found touratings
     */
    Page<TourRating> findByPkTourId(Integer tourId, Pageable pageable);

    /**
     *@param tourId
     *@param customerId is customer identifier
     *@return one tour rating if found, null otherwise.
     */
    TourRating findByPkTourIdAndPkCustomerId(@Param("tourId")Integer tourId, @Param("customerId") Integer customerId);





}
