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
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity  {
    private ImageButton icBengbeng, icGoodtime, icNextar, icPilus, icRicheese, icShorr, icTehPucuk, icUltramilk, icVit;
    Dialog popupwind;
    private static final String TAG = "MainActivity";
    private Button Orderan;

    String myString = "Silahkan Bayar Melalui Kasir, Setelah Menekan Submit Layar Akan Berhenti Selama 15 Detik dan Kasir Akan Kembali Terkunci";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        popupwind = new Dialog(this);

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
                startActivity(new Intent(MainActivity.this, BuyGoodTime.class));
            }
        });

        icShorr = findViewById(R.id.shorr);
        icShorr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BuyShorr.class));
            }
        });

        icNextar = findViewById(R.id.nextar);
        icNextar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BuyNextar.class));
            }
        });

        icPilus = findViewById(R.id.pilus);
        icPilus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BuyPilus.class));
            }
        });

        icRicheese = findViewById(R.id.richeese);
        icRicheese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BuyRicheese.class));
            }
        });

        icTehPucuk = findViewById(R.id.tehpucuk);
        icTehPucuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BuyTehPucuk.class));
            }
        });

        icUltramilk = findViewById(R.id.ultramilk);
        icUltramilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BuyUltramilk.class));
            }
        });

        icVit = findViewById(R.id.vit);
        icVit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BuyVit.class));
            }
        });

        Orderan = findViewById(R.id.orderbutton);
        Orderan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orderDetails(v);
                Toast.makeText(getApplicationContext(),myString,Toast.LENGTH_LONG).show();
                //startActivity(new Intent(MainActivity.this, ListOrder.class));
            }
        });
    }

    public void orderDetails(View view)
    {
        Intent intent = new Intent(this, ListOrder.class);
        startActivity(intent);
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
