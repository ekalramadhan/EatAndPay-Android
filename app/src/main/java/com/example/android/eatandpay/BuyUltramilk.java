package com.example.android.eatandpay;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

public class BuyUltramilk extends Activity {

    ElegantNumberButton btn;
    ImageView ultramilk;
    Button done;
    int countUltramilk;
    String num;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "text";

    SharedPreferences sharedPreferences;

    @SuppressLint("WrongViewCast")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buyultramilk);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8), (int)(height*.6));


        ultramilk = (ImageView)findViewById(R.id.ultramilk);

        btn = (ElegantNumberButton)findViewById(R.id.myButton);
        btn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = btn.getNumber();
                Log.e("NUM", num);
            }
        });

        done = findViewById(R.id.ok);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferences = getSharedPreferences("countultramilk", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("countultramilk", num);
                editor.apply();
                finish();
            }
        });


    }
}