package com.manchesterdigital;

// if tea >= 5 and candy >=5  then 1
// if tea >= candy * 2 OR candy >= tea * 2 then 2
// if tea < 5 or candy < 5 then 0

public class CodingChallenge1 {

    // Constant variables
    private static final int BAD_RATING = 0;
    private static final int GOOD_RATING = 1;
    private static final int GREAT_RATING = 2;

    public static int partyRating(int tea, int candy){

        int rating = 0;

        if((tea < 5) || (candy < 5)) {
            rating = BAD_RATING;
        } else if((tea >= (candy * 2)) || (candy >= (tea * 2))) {
            rating = GREAT_RATING;
        } else if((tea >= 5) && (candy >= 5)) {
            rating = GOOD_RATING;
        }

        return rating;
    }
    public static void main(String[] args) {
        System.out.println(partyRating(20, 6));
    }
}
