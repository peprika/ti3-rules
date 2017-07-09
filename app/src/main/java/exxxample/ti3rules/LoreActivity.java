package exxxample.ti3rules;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.id.list;

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
        letnev.raceName = getResources().getString(R.string.letnev);

        // #02: The Emirates of Hacan
        Data.Race hacan = new Data.Race();
        letnev.raceName = getResources().getString(R.string.hacan);

        // #03: Federation of Sol
        Data.Race sol = new Data.Race();
        sol.raceName = getResources().getString(R.string.sol);

        // #04: The L1Z1X Mindnet
        Data.Race lizix = new Data.Race();
        lizix.raceName = getResources().getString(R.string.lizix);

        // #05: The Mentak Coalition
        Data.Race mentak = new Data.Race();
        lizix.raceName = getResources().getString(R.string.mentak);

        // #06: The Naalu Collective
        Data.Race naalu = new Data.Race();
        lizix.raceName = getResources().getString(R.string.naalu);

        // #07: Sardakk N'orr
        Data.Race sardakk = new Data.Race();
        sardakk.raceName = getResources().getString(R.string.sardakk);

        // #08: The Universities of Jol-Nar
        Data.Race jolnar = new Data.Race();
        sardakk.raceName = getResources().getString(R.string.jolnar);

        // #09: The Xxcha Kingdom
        Data.Race xxcha = new Data.Race();
        sardakk.raceName = getResources().getString(R.string.xxcha);

        // #10: The Yssaril Tribes
        Data.Race yssaril = new Data.Race();
        sardakk.raceName = getResources().getString(R.string.yssaril);

        // Create an array of Race objects
        Data.Race[] racesArray = new Data.Race[10];
        for (int i = 0; i < 10; i++) {
            racesArray[i] = sol;
        }

        // ListView adapter
        final ArrayAdapter<Data.Race> adapter = new ArrayAdapter<>(this,
                R.layout.lore_list_view_single_item, R.id.listViewItem, racesArray);
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

}
