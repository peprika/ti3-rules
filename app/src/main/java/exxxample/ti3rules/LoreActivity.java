package exxxample.ti3rules;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Riku Pepponen on 8.7.2017.
 * (riku.pepponen@gmail.com)
 */

public class LoreActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lore);

        final ListView mListView = (ListView) findViewById(R.id.list);

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
        Data.Race[] racesArray = { letnev, hacan, sol, lizix, mentak, naalu, sardakk, jolnar, xxcha, yssaril };

        // Sort the raceArray for the listview adapter
        ArrayList<Data.Race> list;
        list = new ArrayList<>(Arrays.asList(racesArray));
        Collections.sort(list);

        // ListView adapter
        final ArrayAdapter<Data.Race> adapter = new ArrayAdapter<>(this,
                R.layout.lore_list_view_single_item, R.id.listViewItem, list);
        mListView.setAdapter(adapter);

        // ListView click listener
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getApplicationContext(),
                        "Click ListItem Number " + position, Toast.LENGTH_LONG)
                        .show();
            }
        });

}
