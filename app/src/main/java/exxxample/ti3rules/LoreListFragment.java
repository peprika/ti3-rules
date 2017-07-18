package exxxample.ti3rules;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
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
        ArrayList<Data.Race> racesArray = Data.buildRaces(getActivity());

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

        Fragment fragment2 = new LoreFragment();
        FragmentManager fm = getActivity().getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_container, fragment2, "tag");
        ft.addToBackStack(null);
        ft.commit();

        //Toast.makeText(getActivity(), race.getRaceName() + " was clicked", Toast.LENGTH_LONG).show();
    }


}

