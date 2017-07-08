package exxxample.ti3rules;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mButtonBasicRules;
    Button mButtonLore;
    Button mButtonAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonBasicRules = (Button)findViewById(R.id.buttonBasicRules);
        mButtonLore = (Button)findViewById(R.id.buttonLore);
        mButtonAbout = (Button)findViewById(R.id.buttonAbout);
    }
}
