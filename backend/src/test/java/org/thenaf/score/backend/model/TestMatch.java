package org.thenaf.score.backend.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.thenaf.score.backend.model.Match.Participant;

public class TestMatch {

	private Match.Participant player1;
	private Match.Participant player2;
	private Match match;

	@Before
	public void setupTest() {
		player1 = Participant.builder().coach(Coach.builder().name("test1").build())
				.result(Result.builder().touchdowns(1).build()).build();
		player2 = Participant.builder().coach(Coach.builder().name("test2").build())
				.result(Result.builder().touchdowns(1).build()).build();

		match = Match.builder().tableNumber(1).build();
		match.getParticipants().add(player1);
		match.getParticipants().add(player2);
	}

	@Test
	public void tiedMatch() {
		Assert.assertTrue(match.isTie());

		match.getParticipants().remove(player2);
		match.getParticipants().add(player2.withResult(player2.getResult().withTouchdowns(2)));

		Assert.assertFalse(match.isTie());
	}

	@Test
	public void pickWinner() {
		match.getParticipants().get(0).getResult().setTouchdowns(2);
		
		Assert.assertTrue(match.isWinner(player1.getCoach()));
		Assert.assertFalse(match.isWinner(player2.getCoach()));
		
		match.getParticipants().get(0).getResult().setTouchdowns(1);
		
		Assert.assertFalse(match.isWinner(player1.getCoach()));
		Assert.assertFalse(match.isWinner(player2.getCoach()));
	}
}
