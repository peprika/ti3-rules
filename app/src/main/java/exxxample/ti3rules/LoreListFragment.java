package exxxample.ti3rules;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * Created by Riku Pepponen on 9.7.2017.
 * (riku.pepponen@gmail.com)
 */

public class LoreListFragment extends ListFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lore_list_fragment, container, false);

        // Get the races
        ArrayList<Data.Race> racesArray = buildRaces();

        // Set the listview adapter
        LoreAdapter loreAdapter = new LoreAdapter(racesArray);
        setListAdapter(loreAdapter);

        return view;
    }

    // Custom adapter for ListView
    private class LoreAdapter extends ArrayAdapter<Data.Race> {
        private LoreAdapter(ArrayList<Data.Race> races) {
            super(getActivity(), 0, races);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if (convertView == null) {
                convertView = getActivity().getLayoutInflater()
                        .inflate(R.layout.lore_list_view_single_item ,null);
            }

            Data.Race race = getItem(position);

            TextView loreRaceTitle = (TextView)convertView.findViewById(R.id.lore_race_title);
            loreRaceTitle.setText(race.getRaceName());

            return convertView;
        }
    }

    // OnListItemClick
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Data.Race race = ((LoreAdapter)getListAdapter()).getItem(position);
        Toast.makeText(getActivity(), race.getRaceName() + " was clicked", Toast.LENGTH_LONG).show();
    }

    // Build the races
    public ArrayList<Data.Race> buildRaces() {

        String [] raceNames = getResources().getStringArray(R.array.RaceNames);

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

