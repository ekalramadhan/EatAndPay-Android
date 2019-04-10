package com.example.android.eatandpay;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity  {
    private ImageButton icBengbeng, icGoodtime, icNextar, icPilus, icRicheese, icShorr, icTehPucuk, icUltramilk, icVit;
    Dialog popupwind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        popupwind = new Dialog(this);

        icBengbeng = findViewById(R.id.bengbeng);
        icBengbeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity.this, BuyBengBeng.class));
                buyBengbeng(v);
            }
        });

        icGoodtime = findViewById(R.id.goodtime);
        icGoodtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buyGoodtime(v);
            }
        });

        icShorr = findViewById(R.id.shorr);
        icShorr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buyShorr(v);
            }
        });

    }

    // buyFood method
    public void buyBengbeng(View view)
    {
        Log.i("info", "bengbeng diklik");
        Button done;

        popupwind.setContentView(R.layout.buybengbeng);
        done = popupwind.findViewById(R.id.ok);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupwind.dismiss();
            }
        });
        popupwind.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popupwind.show();
    }

    public void buyGoodtime(View view)
    {
        Button done;

        popupwind.setContentView(R.layout.buygoodtime);
        done = popupwind.findViewById(R.id.ok);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupwind.dismiss();
            }
        });
        popupwind.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popupwind.show();
    }

    public void buyShorr(View view)
    {
        Log.i("info", "bengbeng diklik");
        Button done;

        popupwind.setContentView(R.layout.buyshorr);
        done = popupwind.findViewById(R.id.ok);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupwind.dismiss();
            }
        });
        popupwind.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popupwind.show();
    }


    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onStop() {
        super.onStop();

    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }
}
