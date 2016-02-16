package org.thenaf.score.backend.model;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Coach {

	private final String id = UUID.randomUUID().toString();
	
	private String name;
	private String username;
	private long nafId;
	
	private Team team;
}
