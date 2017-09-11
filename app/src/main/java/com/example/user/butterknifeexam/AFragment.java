package com.example.user.butterknifeexam;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by user on 2017-09-12.
 */

public class AFragment extends Fragment {
    @BindView(R.id.button1) Button button1;
    @BindView(R.id.button2) Button button2;

    public AFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        ButterKnife.bind(this, view);

        button1.setOnClickListener(v -> button1Click());
        button2.setOnClickListener(v -> button2Click());

        return view;
    }

    private void button2Click() {
        Toast.makeText(getContext(), "Fragment button2 Clicked", Toast.LENGTH_SHORT).show();
    }

    private void button1Click() {
        Toast.makeText(getContext(), "Fragment button1 Clicked", Toast.LENGTH_SHORT).show();
    }
}
