package es.poo.lucky_roulette;

public class Round {
	
		private static final String EXPERT 			= "expert";
		private static final String MEDIUM 			= "medium";

		private int roundNumber, score;
		private String level;	
		
		/* This method returns a number of attempts according to the level of difficulty */
		public int numberAttemps() {
			
			String strlevel = getLevel();
			int MAXattempt;
			
			if(strlevel.equals(EXPERT)) {
				MAXattempt = 5;
			}
			else if(strlevel.equals(MEDIUM)) {
				MAXattempt = 8;
			}
			else {
				MAXattempt = 10;
			}
			
			return MAXattempt;
		}
		
		public int getRoundNumber() {
			return roundNumber;
		}

		public void setRoundNumber(int roundNumber) {
			this.roundNumber = roundNumber;
		}

		public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}

		public String getLevel() {
			return level;
		}

		public void setLevel(String level) {
			this.level = level;
		} 
}
