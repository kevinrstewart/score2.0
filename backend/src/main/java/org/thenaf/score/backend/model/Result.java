package org.thenaf.score.backend.model;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Wither;

@Data
@Builder
@Wither
public class Result {

	private Integer touchdowns;
	private Integer badlyHurt;
	private Integer seriousInjuries;
	private Integer kills;
}
