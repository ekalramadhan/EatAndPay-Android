package com.example.android.eatandpay;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ListOrder extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listorder);

        SharedPreferences countbengbeng = getSharedPreferences("countbengbeng", Context.MODE_PRIVATE);
        String value1 = countbengbeng.getString("countbengbeng", "0");
        TextView beliBengbeng = (TextView) findViewById(R.id.count_bengbeng);
        beliBengbeng.setText(value1);

        SharedPreferences countgoodtime = getSharedPreferences("countgoodtime", Context.MODE_PRIVATE);
        String value2 = countgoodtime.getString("countgoodtime", "0");
        TextView beliGoodtime = (TextView) findViewById(R.id.count_goodtime);
        beliGoodtime.setText(value2);

        SharedPreferences countshorr = getSharedPreferences("countshorr", Context.MODE_PRIVATE);
        String value3 = countshorr.getString("countshorr", "0");
        TextView beliShorr = (TextView) findViewById(R.id.count_shorr);
        beliShorr.setText(value3);

        SharedPreferences countnextar = getSharedPreferences("countnextar", Context.MODE_PRIVATE);
        String value4 = countnextar.getString("countnextar", "0");
        TextView beliNextar = (TextView) findViewById(R.id.count_nextar);
        beliNextar.setText(value4);

        SharedPreferences countpilus = getSharedPreferences("countpilus", Context.MODE_PRIVATE);
        String value5 = countpilus.getString("countpilus", "0");
        TextView beliPilus = (TextView) findViewById(R.id.count_pilus);
        beliPilus.setText(value5);

        SharedPreferences countricheese = getSharedPreferences("countricheese", Context.MODE_PRIVATE);
        String value6 = countricheese.getString("countricheese", "0");
        TextView beliRicheese = (TextView) findViewById(R.id.count_richeese);
        beliRicheese.setText(value6);

        SharedPreferences counttehpucuk = getSharedPreferences("counttehpucuk", Context.MODE_PRIVATE);
        String value7 = counttehpucuk.getString("counttehpucuk", "0");
        TextView beliTehpucuk = (TextView) findViewById(R.id.count_tehpucuk);
        beliTehpucuk.setText(value7);

        SharedPreferences countultramilk = getSharedPreferences("countultramilk", Context.MODE_PRIVATE);
        String value8 = countultramilk.getString("countultramilk", "0");
        TextView beliUltramilk = (TextView) findViewById(R.id.count_ultramilk);
        beliUltramilk.setText(value8);

        SharedPreferences countvit = getSharedPreferences("countvit", Context.MODE_PRIVATE);
        String value9 = countvit.getString("countvit", "0");
        TextView beliVit = (TextView) findViewById(R.id.count_vit);
        beliVit.setText(value9);


        //total
        TextView totalharga = (TextView) findViewById(R.id.totalharga);
        int cbengbeng = Integer.parseInt(value1);
        int cgoodtime = Integer.parseInt(value2);
        int cshorr = Integer.parseInt(value3);
        int cnextar = Integer.parseInt(value4);
        int cpilus = Integer.parseInt(value5);
        int cricheese = Integer.parseInt(value6);
        int ctehpucuk = Integer.parseInt(value7);
        int cultramilk = Integer.parseInt(value8);
        int cvit = Integer.parseInt(value9);
        int iTotal = (cbengbeng * 2500) + (cgoodtime * 2000) + (cshorr * 1500) + (cnextar * 2500) + (cpilus * 1500) + (cricheese * 1500) + (ctehpucuk * 4000) + (cultramilk * 6000) + (cvit * 2500);

        String sTotal = Integer.toString(iTotal);
        totalharga.setText(sTotal);

    }
}