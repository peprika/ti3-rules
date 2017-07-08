package exxxample.ti3rules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mButtonBasicRules;
    Button mButtonLore;
    Button mButtonAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Basic Rules button listener
        mButtonBasicRules = (Button)findViewById(R.id.buttonBasicRules);
        mButtonBasicRules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, BasicRulesActivity.class);
                startActivity(intent);
            }
        });

        // Lore button listener
        mButtonLore = (Button)findViewById(R.id.buttonLore);
        mButtonLore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, LoreActivity.class);
                startActivity(intent);
            }
        });

        // About button listener
        mButtonAbout = (Button)findViewById(R.id.buttonAbout);
        mButtonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });
    }
}
