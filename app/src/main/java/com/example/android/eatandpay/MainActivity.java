package com.example.android.eatandpay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity  {
    private ImageButton icBengbeng, icGoodtime, icNextar, icPilus, icRicheese, icShorr, icTehPucuk, icUltramilk, icVit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        icBengbeng = findViewById(R.id.bengbeng);
        icBengbeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BuyBengBeng.class));
            }
        });

        icGoodtime = findViewById(R.id.goodtime);
        icGoodtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buyFood();
            }
        });

        icShorr = findViewById(R.id.shorr);
        icShorr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buyFood();
            }
        });

        icNextar = findViewById(R.id.nextar);
        icNextar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buyFood();
            }
        });

        icPilus = findViewById(R.id.pilus);
        icPilus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buyFood();
            }
        });

        icRicheese = findViewById(R.id.richeese);
        icRicheese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buyFood();
            }
        });

        icVit = findViewById(R.id.vit);
        icVit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buyFood();
            }
        });

        icTehPucuk = findViewById(R.id.tehpucuk);
        icTehPucuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buyFood();
            }
        });

        icUltramilk = findViewById(R.id.ultramilk);
        icUltramilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buyFood();
            }
        });
    }

    // buyFood method
    public void buyFood()
    {
        Log.i("info", "makanan diklik");
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
