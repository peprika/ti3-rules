package exxxample.ti3rules;

import java.util.stream.IntStream;

/**
 * Created by Riku Pepponen on 8.7.2017.
 * (riku.pepponen@gmail.com)
 */

public class Data extends Object {

    public static class Race {
        int raceId;
        String raceName;
        String raceSpecialAbilities;
        String raceDescription;
        String raceLoreText;

        // Override toString to show the race title in the LoreActivity's Listview
        @Override
        public String toString() {
            return raceName;
            }
        }


    public class Ship {
        int shipId;
        String shipName;
        int shipFirepower;
    }

}
