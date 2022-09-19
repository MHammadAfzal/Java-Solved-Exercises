// Method 1
class TwelveDays {
    private static final String[] ORDINALS = {"", "first", "second", "third", "fourth", "fifth", "sixth",
            "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
    private static final String[] NUMBERS = {"", "a", "two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "eleven", "twelve"};
    private static final String[] PRESENTS = {"", "Partridge in a Pear Tree", "Turtle Doves", "French Hens",
            "Calling Birds", "Gold Rings", "Geese-a-Laying", "Swans-a-Swimming", "Maids-a-Milking", "Ladies Dancing",
            "Lords-a-Leaping", "Pipers Piping", "Drummers Drumming"};
    
    String verse(int verseNumber) {
        StringBuilder result = new StringBuilder();
        result.append(String.format("On the %s day of Christmas my true love gave to me: ", ORDINALS[verseNumber]));
        for (int i = verseNumber; i > 0; i--) {
            result.append(i == verseNumber ? "" : i == 1 ? ", and " : ", ");
            result.append(String.format("%s %s", NUMBERS[i], PRESENTS[i]));
        }
        return result.append(".\n").toString();
    }
    String verses(int startVerse, int endVerse) {
        StringBuilder result = new StringBuilder();
        for (int i = startVerse; i <= endVerse; i++) {
            result.append(String.format("%s%s", verse(i), i == endVerse ? "" : "\n"));
        }
        return result.toString();
    }
    String sing() {
        return verses(1, 12);
    }
}

// Method2
class TwelveDays {
    StringBuilder verseStr = new StringBuilder();
    String verse(int verseNumber) {
        String[][] days = new String[12][2];
        days[0][0] = "first";
        days[0][1] = "a Partridge in a Pear Tree.\n";
        days[1][0] = "second";
        days[1][1] = "two Turtle Doves, ";
        days[2][0] = "third";
        days[2][1] = "three French Hens, ";
        days[3][0] = "fourth";
        days[3][1] = "four Calling Birds, ";
        days[4][0] = "fifth";
        days[4][1] = "five Gold Rings, ";
        days[5][0] = "sixth";
        days[5][1] = "six Geese-a-Laying, ";
        days[6][0] = "seventh";
        days[6][1] = "seven Swans-a-Swimming, ";
        days[7][0] = "eighth";
        days[7][1] = "eight Maids-a-Milking, ";
        days[8][0] = "ninth";
        days[8][1] = "nine Ladies Dancing, ";
        days[9][0] = "tenth";
        days[9][1] = "ten Lords-a-Leaping, ";
        days[10][0] = "eleventh";
        days[10][1] = "eleven Pipers Piping, ";
        days[11][0] = "twelfth";
        days[11][1] = "twelve Drummers Drumming, ";
        verseStr.append("On the " + days[verseNumber - 1][0] + " day of Christmas my true love gave to me: ");
        if (verseNumber > 1) {
            for (int i = verseNumber; i > 1; i--) {
                verseStr.append(days[i - 1][1]);
            }
            verseStr.append("and " + days[0][1]);
        } else {
            verseStr.append(days[verseNumber - 1][1]);
        }
        String result = verseStr.toString();
        return result;
    }
    String verses(int startVerse, int endVerse) {
        int count = startVerse;
        StringBuilder verses = new StringBuilder();
        while (count < endVerse) {
            verses.append(verse(count));
            verses.append("\n");
            count++;
            verseStr.delete(0,verseStr.length());
        }
        if (count == endVerse) {
            verses.append(verse(count));
            verseStr.delete(0,verseStr.length());
            count++;
        }
        return verses.toString();
    }
    
    String sing() {
        StringBuilder sing = new StringBuilder();
        sing.append(verses(1, 12));
        return sing.toString();
    }
}


/*  Output these lyrics
-------------------------------------------------
 1. Can we print the 8th verse?
 2. Can we print from 1 to 3 verses?
 3. Can we print from 4 to 7 verses?
 4. Can we print all verses?
-------------------------------------------------
               
On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.

On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.

On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.
  
 */
