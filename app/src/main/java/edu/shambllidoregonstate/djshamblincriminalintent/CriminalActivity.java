package edu.shambllidoregonstate.djshamblincriminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CriminalActivity extends AppCompatActivity {

    private Button mButton1;
    private Button mButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criminal);

        mButton1 = (Button) findViewById(R.id.crime1);
        mButton2 = (Button) findViewById(R.id.crime2);

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(v);
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(v);
            }
        });
    }

    public void changeFragment(View v) {
        Fragment fragment;
        if (v == findViewById(R.id.crime1)) {
            fragment = new Fragment4();
            FragmentManager fm = getSupportFragmentManager();
            fm.beginTransaction()
                    .replace(R.id.crime3, fragment)
                    .commit();
        } else if (v == findViewById(R.id.crime2)) {
            fragment = new Fragment8();
            FragmentManager fm = getSupportFragmentManager();
            fm.beginTransaction()
                    .replace(R.id.crime3, fragment)
                    .commit();
        }

    }
}
