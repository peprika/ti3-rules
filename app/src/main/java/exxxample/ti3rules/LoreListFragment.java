package exxxample.ti3rules;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Riku Pepponen on 9.7.2017.
 * (riku.pepponen@gmail.com)
 */

public class LoreListFragment extends ListFragment implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lore_list_fragment, container, false);

        // Build the races objects
        Data.Race[] racesArray = buildRaces();

        // ListView adapter
        ArrayAdapter<Data.Race> adapter = new ArrayAdapter<>(getActivity(),
                R.layout.lore_list_view_single_item2, racesArray);
        setListAdapter(adapter);

        return view;
    }


    public Data.Race[] buildRaces() {
        // Let's build the races!
        // #01: The Barony of Letnev
        Data.Race letnev = new Data.Race();
        letnev.raceId = 1;
        letnev.raceName = getResources().getString(R.string.letnev);

        // #02: The Emirates of Hacan
        Data.Race hacan = new Data.Race();
        hacan.raceId = 2;
        hacan.raceName = getResources().getString(R.string.hacan);

        // #03: Federation of Sol
        Data.Race sol = new Data.Race();
        sol.raceId = 3;
        sol.raceName = getResources().getString(R.string.sol);

        // #04: The L1Z1X Mindnet
        Data.Race lizix = new Data.Race();
        lizix.raceId = 4;
        lizix.raceName = getResources().getString(R.string.lizix);

        // #05: The Mentak Coalition
        Data.Race mentak = new Data.Race();
        mentak.raceId = 5;
        mentak.raceName = getResources().getString(R.string.mentak);

        // #06: The Naalu Collective
        Data.Race naalu = new Data.Race();
        naalu.raceId = 6;
        naalu.raceName = getResources().getString(R.string.naalu);

        // #07: Sardakk N'orr
        Data.Race sardakk = new Data.Race();
        sardakk.raceId = 7;
        sardakk.raceName = getResources().getString(R.string.sardakk);

        // #08: The Universities of Jol-Nar
        Data.Race jolnar = new Data.Race();
        jolnar.raceId = 8;
        jolnar.raceName = getResources().getString(R.string.jolnar);

        // #09: The Xxcha Kingdom
        Data.Race xxcha = new Data.Race();
        xxcha.raceId = 9;
        xxcha.raceName = getResources().getString(R.string.xxcha);

        // #10: The Yssaril Tribes
        Data.Race yssaril = new Data.Race();
        yssaril.raceId = 10;
        yssaril.raceName = getResources().getString(R.string.yssaril);

        // Create an array of Race objects
        Data.Race[] racesArray = {letnev, hacan, sol, lizix, mentak, naalu, sardakk, jolnar, xxcha, yssaril};

        return racesArray;
    }

    @Override
    public void onClick(View v) {
        // Something
    }



}

