package com.example.mindtree.feedbackservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import feign.Param;

@Repository
public interface FeedBackFormRepository  extends JpaRepository<FeedBackForm, Long>{
	
	@Query(value = "SELECT * FROM FEED_BACK_TBL WHERE CUST_ID = :customerId", nativeQuery = true)
	public FeedBackForm getCustomer(@Param("customerId") Long number);

}
