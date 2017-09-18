package com.example.ghost.dataAnalyzer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by ghost on 9/7/17.
 */

public class InformationData extends AppCompatActivity {

    private TextView nameInfo;
    private TextView ageInfo;
    private TextView emailInfo;
    private String name;
    private String age;
    private String email;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.information_data);

        nameInfo = (TextView) findViewById(R.id.info_name);
        ageInfo = (TextView) findViewById(R.id.info_age);
        emailInfo = (TextView) findViewById(R.id.info_email);

        name = getIntent().getStringExtra("NAME");
        age = getIntent().getStringExtra("AGE");
        email = getIntent().getStringExtra("EMAIL");

        nameInfo.setText(name);
        ageInfo.setText(age);
        emailInfo.setText(email);
    }
}
