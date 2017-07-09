package exxxample.ti3rules;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Riku Pepponen on 8.7.2017.
 * (riku.pepponen@gmail.com)
 */

public class LoreActivity extends AppCompatActivity {

    TextView testTextView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lore);

        // Create Sol Race, input the name to textview (all we need for now)
        Data.Race sol = new Data.Race();
        sol.raceName = getResources().getString(R.string.sol);

        testTextView = (TextView)findViewById(R.id.textView);
        testTextView.setText(sol.raceName);
    }

}
