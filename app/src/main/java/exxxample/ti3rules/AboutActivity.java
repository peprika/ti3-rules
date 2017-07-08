package exxxample.ti3rules;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Riku Pepponen on 8.7.2017.
 * (riku.pepponen@gmail.com)
 */

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        // Hide the action bar
        getSupportActionBar().hide();
    }
}
