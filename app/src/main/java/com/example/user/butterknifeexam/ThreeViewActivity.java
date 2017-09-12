package com.example.user.butterknifeexam;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;

public class ThreeViewActivity extends AppCompatActivity {
    @BindViews({R.id.editText1, R.id.editText2, R.id.editText3})
    List<EditText> nameViews;

    @BindView(R.id.applyButton)
    Button applyButton;

    private boolean applyButtonSign = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_view);
        ButterKnife.bind(this);

        boolean sign = false;

        applyButton.setOnClickListener(v ->  applyButtonClick());
    }

    private boolean applyButtonClick() {
        applyButtonSign = !applyButtonSign;

        ButterKnife.apply(nameViews, View.ALPHA, 0.0f);
//        ButterKnife.apply(nameViews, DISABLE);
//        ButterKnife.apply(nameViews, ENABLE, applyButtonSign);

        return applyButtonSign;
    }

    static final ButterKnife.Action<View> DISABLE = new ButterKnife.Action<View>() {
        @Override
        public void apply(@NonNull View view, int index) {
            view.setEnabled(false);
        }
    };

    static final ButterKnife.Setter<View, Boolean> ENABLE = new ButterKnife.Setter<View, Boolean>() {
        @Override
        public void set(@NonNull View view, Boolean value, int index) {
            view.setEnabled(value);
        }
    };


}
