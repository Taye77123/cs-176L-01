public class Quiz implements Measurable {
   private int score;
   
   /**
      Constructs a quiz with a given score.
      @param score the score of the quiz
   */
   public Quiz(int score) {
      this.score = score;
   }
   
   /**
      Measurable interface method to retrieve measure.
      @return the measured score
   */
   public double getMeasure() {
      return score;
   }
}
