public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int minusScore1, int minusScore2) {
        StringBuilder score = new StringBuilder();
        int tempScore = 0;
        final int love = 0;
        final int fifteen = 1;
        final int thirty = 2;
        final int forty = 3;
        if (minusScore1 == minusScore2) {
            switch (minusScore1) {
                case love:
                    score = new StringBuilder("Love-All");
                    break;
                case fifteen:
                    score = new StringBuilder("Fifteen-All");
                    break;
                case thirty:
                    score = new StringBuilder("Thirty-All");
                    break;
                case forty:
                    score = new StringBuilder("Forty-All");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;

            }
        } else if (minusScore1 >= 4 || minusScore2 >= 4) {
            int minusResult = minusScore1 - minusScore2;
            if (minusResult == 1) score = new StringBuilder("Advantage player1");
            else if (minusResult == -1) score = new StringBuilder("Advantage player2");
            else if (minusResult >= 2) score = new StringBuilder("Win for player1");
            else score = new StringBuilder("Win for player2");
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = minusScore1;
                else {
                    score.append("-");
                    tempScore = minusScore2;
                }
                switch (tempScore) {
                    case love:
                        score.append("Love");
                        break;
                    case fifteen:
                        score.append("Fifteen");
                        break;
                    case thirty:
                        score.append("Thirty");
                        break;
                    case forty:
                        score.append("Forty");
                        break;
                }
            }
        }
        return score.toString();

    }
}