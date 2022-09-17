// 1st Method

public class Blackjack1 {
    private final int BLACKJACK_VALUE = 21;
    private enum Strategy {
        STAND("S"),
        HIT("H"),
        SPLIT("P"),
        AUTO_WIN("W");
        public final String code;
        Strategy(String code) {
            this.code = code;
        }
    }
    public int parseCard(String card) {
        switch (card) {
            case "ace":
                return 11;
            case "ten":
            case "jack":
            case "queen":
            case "king":
                return 10;
            case "nine":
                return 9;
            case "eight":
                return 8;
            case "seven":
                return 7;
            case "six":
                return 6;
            case "five":
                return 5;
            case "four":
                return 4;
            case "three":
                return 3;
            case "two":
                return 2;
            default:
                return 0;
        }
    }
    public boolean isBlackjack(String card1, String card2) {
        return (parseCard(card1) + parseCard(card2)) == BLACKJACK_VALUE;
    }
    public String largeHand(boolean isBlackjack, int dealerScore) {
        var strategy = Strategy.STAND;
        if (!isBlackjack) {
            strategy = Strategy.SPLIT;
        } else if (dealerScore < 10) {
            strategy = Strategy.AUTO_WIN;
        }
        return strategy.code;
    }
    public String smallHand(int handScore, int dealerScore) {
        var strategy = (dealerScore >= 7) ? Strategy.HIT : Strategy.STAND;
        if (handScore <= 11) {
            strategy = Strategy.HIT;
        } else if (handScore >= 17) {
            strategy = Strategy.STAND;
        }
        return strategy.code;
    }
    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);
        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}

// 2nd Method

public class Blackjack2 {
  private final int BLACKJACK = 21;
  private final String STAND = "S";
  private final String HIT = "H";
  private final String SPLIT = "P";
  private final String WIN = "W";
  public int parseCard(String card) {
    switch (card) {
      case "two":
        return 2;
      case "three":
        return 3;
      case "four":
        return 4;
      case "five":
        return 5;
      case "six":
        return 6;
      case "seven":
        return 7;
      case "eight":
        return 8;
      case "nine":
        return 9;
      case "ten":
      case "jack":
      case "queen":
      case "king":
        return 10;
      case "ace":
        return 11;
      default:
        return 0;
    }
  }
  public boolean isBlackjack(String card1, String card2) {
    return parseCard(card1) + parseCard(card2) == BLACKJACK;
  }
  public String largeHand(boolean isBlackjack, int dealerScore) {
    if (!isBlackjack) {
      return SPLIT;
    } else if (dealerScore < 10) {
      return WIN;
    } else {
      return STAND;
    }
  }
  public String smallHand(int handScore, int dealerScore) {
    if (handScore >= 17) {
      return STAND;
    } else if (handScore <= 11) {
      return HIT;
    } else if (dealerScore >= 7) {
      return HIT;
    } else {
      return STAND;
    }
  }
  // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
  // This function is already implemented and does not need to be edited. It pulls the other functions together in a
  // complete decision tree for the first turn.
  public String firstTurn(String card1, String card2, String dealerCard) {
    int handScore = parseCard(card1) + parseCard(card2);
    int dealerScore = parseCard(dealerCard);
    if (20 < handScore) {
      return largeHand(isBlackjack(card1, card2), dealerScore);
    } else {
      return smallHand(handScore, dealerScore);
    }
  }
}

// 3rd  and Simplest Method

public class Blackjack3 {
    public int parseCard(String card) {
        int n;
        switch(card){
            case "ace"   : n = 11  ; break;
            case "jack"  : n = 10  ; break;
            case "queen" : n = 10  ; break;
            case "king"  : n = 10  ; break;
            case "ten"   : n = 10  ; break;
            case "nine"  : n = 9   ; break;
            case "eight" : n = 8   ; break;
            case "seven" : n = 7   ; break;
            case "six"   : n = 6   ; break;
            case "five"  : n = 5   ; break;
            case "four"  : n = 4   ; break;
            case "three" : n = 3   ; break;
            case "two"   : n = 2   ; break;
            case "one"   : n = 1   ; break;
            default : n = 0;
        }
        return n;
    }
    public boolean isBlackjack(String card1, String card2) {
        int intCard1 = parseCard(card1);
        int intCard2 = parseCard(card2);
        if(intCard1 + intCard2 == 21){
            return true;
        }else{
            return false;
        }
    }
    public String largeHand(boolean isBlackjack, int dealerScore) {
        if(isBlackjack){
            if(dealerScore < 10){
                return "W";
            }else{
                return "S";
            }
        }else{
            return "P";
        }
    }
    public String smallHand(int handScore, int dealerScore) {
        if(handScore >= 17){
            return "S";
        }else if(handScore > 11 && handScore < 17 && dealerScore < 7){
            return "S";
        }else if(handScore > 11 && handScore < 17 && dealerScore > 6){
         return "H";   
        }else{
            return "H";
        }
    }
    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);
        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
