package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String winSign = "";
        switch (handSign){
            case "scissor" : winSign = ("rock");
                break;

            case "rock" : winSign = ("paper");
                break;

            case "paper" : winSign = ("scissor");
                break;

            default: winSign = ("Invalid input");
                break;
        }

        return winSign;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String loseSign = "";
        switch (handSign){
            case "scissor" : loseSign = ("paper");
                break;

            case "rock" : loseSign = ("scissor");
                break;

            case "paper" : loseSign = ("rock");
                break;

            default: loseSign = ("Invalid input");
                break;
        }

        return loseSign;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        if (handSignOfPlayer1.equals(handSignOfPlayer2)) {
            return "tie";
        }else{
            if (handSignOfPlayer1.equals("rock") && handSignOfPlayer2.equals("scissor")){
                return "rock";
            }
        }

        return null;
    }
}
