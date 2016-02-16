package org.thenaf.score.backend.model;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.Wither;

@Value
@Builder
public class Match {

	private List<Match.Participant> participants = Lists.newArrayList();
	private int tableNumber;
	
	public boolean isWinner(Coach coach) {
		return isTie() ? false : participants.stream().max(Comparator.comparing(Match.Participant::getScore)).get().coach.equals(coach);
	}
	
	public boolean isTie() {
		return participants.stream().map(participant -> participant.getScore()).collect(Collectors.toSet()).size() == 1;
	}
	
	@Value
	@Builder
	public static class Participant{
		private final Coach coach;
		private final int teamValue;
		@Wither
		private Result result;
		
		public int getScore(){
			return result.getTouchdowns();
		}
	}
}
