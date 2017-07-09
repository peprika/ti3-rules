package exxxample.ti3rules;

import android.support.annotation.NonNull;

import java.util.stream.IntStream;

/**
 * Created by Riku Pepponen on 8.7.2017.
 * (riku.pepponen@gmail.com)
 */

public class Data extends Object {

    public static class Race implements Comparable<Race> {
        int raceId;
        String raceName;
        String raceSpecialAbilities;
        String raceDescription;
        String raceLoreText;


        public int getRaceId() {
            return raceId;
        }
        public String getRaceName() {
            return raceName;
        }

        // Override toString to show the race title in the LoreActivity's Listview
        @Override
        public String toString() {
            return raceName;
            }

        // An abstract method for the Comparable interface
        @Override
        public int compareTo(@NonNull Race o) {
            return 0;
        }
    }


    public class Ship {
        int shipId;
        String shipName;
        int shipFirepower;
    }

}
