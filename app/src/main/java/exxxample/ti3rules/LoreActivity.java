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

        // Create Sol/Sardakk Races, input the name to textview (all we need for now)
        Data.Race sol = new Data.Race();
        sol.raceName = getResources().getString(R.string.sol);
        Data.Race sardakk = new Data.Race();
        sardakk.raceName = getResources().getString(R.string.sardakk);

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
