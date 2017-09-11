package com.example.user.butterknifeexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NormalActivity extends AppCompatActivity {
    private TextView title;
    private TextView subtitle;
    private TextView footer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

        title = (TextView)findViewById(R.id.title);
        subtitle = (TextView)findViewById(R.id.subtitle);
        footer = (TextView)findViewById(R.id.footer);

        title.setText("is Normal Activity");

    }
}
