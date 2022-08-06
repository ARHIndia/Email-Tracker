package com.arh.emailTracker.serviceImpl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.arh.emailTracker.service.GenrateUUIDService;

@Service
public class GenrateUUIDServiceImpl implements GenrateUUIDService {

	@Override
	public String randomUUID() {
		UUID uuid = UUID.randomUUID();
		String uuidAsString = uuid.toString();
		return uuidAsString;
	}

}
