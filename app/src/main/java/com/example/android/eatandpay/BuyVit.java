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

public class BuyVit extends Activity {

    ElegantNumberButton btn;
    ImageView vit;
    Button done;
    int countVit;
    String num;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "text";

    SharedPreferences sharedPreferences;

    @SuppressLint("WrongViewCast")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buyvit);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8), (int)(height*.6));


        vit = (ImageView)findViewById(R.id.vit);

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
                sharedPreferences = getSharedPreferences("countvit", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("countvit", num);
                editor.apply();
                finish();
            }
        });


    }
}