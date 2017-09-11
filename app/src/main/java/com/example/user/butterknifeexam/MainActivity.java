package com.example.user.butterknifeexam;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.annotation.Nullable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.moveToButterKnifeActivity_Button) Button moveToButterKnifeActivity_Button;
    @BindView(R.id.moveToNormalActivity_Button) Button moveToNormalActivity_Button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        moveToButterKnifeActivity_Button.setOnClickListener(v -> moveToButterKnifeActivity_ButtonClick());
        moveToNormalActivity_Button.setOnClickListener(v -> moveToNormalActivity_ButtonClick());
    }

    private void moveToButterKnifeActivity_ButtonClick() {
        Intent intent = new Intent(this, ButterKnifeActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        startActivity(intent);
    }

    private void moveToNormalActivity_ButtonClick() {
        Intent intent = new Intent(this, NormalActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        startActivity(intent);
    }


}
