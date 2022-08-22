package com.arh.emailTracker.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arh.emailTracker.model.EmailDetails;

@Repository
public interface EmailDetailsRepo extends JpaRepository<EmailDetails, Integer> {

	EmailDetails findById(int id);
	
	@Query(value="SELECT * FROM email_details where sent=0",nativeQuery=true)
	List<EmailDetails> findBySent();

}
