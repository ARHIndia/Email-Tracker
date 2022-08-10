package com.arh.emailTracker.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arh.emailTracker.model.EmailTraking;

@Repository
public interface EmailTrakingRepo extends JpaRepository<EmailTraking, Integer> {

	EmailTraking findById(int id);

}
