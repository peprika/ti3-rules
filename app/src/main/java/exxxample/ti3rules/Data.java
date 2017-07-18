package exxxample.ti3rules;

import android.content.Context;

import java.util.ArrayList;

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

    }

    public class Ship {
        int shipId;
        String shipName;
        int shipFirepower;
    }


    // Build the races
    public static ArrayList<Race> buildRaces(Context context) {

        String [] raceNames = context.getResources().getStringArray(R.array.RaceNames);

        // Let's build the races!
        // #01: The Barony of Letnev
        Data.Race letnev = new Data.Race();
        letnev.raceId = 1;
        letnev.raceName = raceNames[0];

        // #02: The Emirates of Hacan
        Data.Race hacan = new Data.Race();
        hacan.raceId = 2;
        hacan.raceName = raceNames[1];

        // #03: Federation of Sol
        Data.Race sol = new Data.Race();
        sol.raceId = 3;
        sol.raceName = raceNames[2];

        // #04: The L1Z1X Mindnet
        Data.Race lizix = new Data.Race();
        lizix.raceId = 4;
        lizix.raceName = raceNames[3];

        // #05: The Mentak Coalition
        Data.Race mentak = new Data.Race();
        mentak.raceId = 5;
        mentak.raceName = raceNames[4];

        // #06: The Naalu Collective
        Data.Race naalu = new Data.Race();
        naalu.raceId = 6;
        naalu.raceName = raceNames[5];

        // #07: Sardakk N'orr
        Data.Race sardakk = new Data.Race();
        sardakk.raceId = 7;
        sardakk.raceName = raceNames[6];

        // #08: The Universities of Jol-Nar
        Data.Race jolnar = new Data.Race();
        jolnar.raceId = 8;
        jolnar.raceName = raceNames[7];

        // #09: The Xxcha Kingdom
        Data.Race xxcha = new Data.Race();
        xxcha.raceId = 9;
        xxcha.raceName = raceNames[8];

        // #10: The Yssaril Tribes
        Data.Race yssaril = new Data.Race();
        yssaril.raceId = 10;
        yssaril.raceName = raceNames[9];

        // Create an array of Race objects
        ArrayList<Data.Race> racesArray = new ArrayList<>();
        racesArray.add(letnev);
        racesArray.add(hacan);
        racesArray.add(sol);
        racesArray.add(lizix);
        racesArray.add(mentak);
        racesArray.add(naalu);
        racesArray.add(sardakk);
        racesArray.add(jolnar);
        racesArray.add(xxcha);
        racesArray.add(yssaril);

        return racesArray;
    }
}
