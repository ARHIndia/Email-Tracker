package com.arh.emailTracker.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arh.emailTracker.model.EmailDetails;

@Repository
public interface EmailDetailsRepo extends JpaRepository<EmailDetails, Integer> {

	EmailDetails findById(int id);

}
