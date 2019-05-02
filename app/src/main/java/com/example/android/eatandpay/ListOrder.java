package com.example.android.eatandpay;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

import static java.lang.Thread.sleep;

public class ListOrder extends AppCompatActivity {

    private Integer jmlsisa1 = 0, jmlsisa2 = 0, jmlsisa3 = 0, jmlsisa4 = 0, jmlsisa5 = 0, jmlsisa6 = 0, jmlsisa7 = 0, jmlsisa8 = 0, jmlsisa9 = 0;
    private String value1, value2, value3, value4, value5, value6, value7, value8, value9;
    private Integer jmlbengbeng = 0, jmlgoodtime = 0, jmlshorr = 0, jmlnextar = 0, jmlpilus = 0, jmlricheese = 0, jmltehpucuk = 0, jmlultramilk = 0, jmlvit = 0;
    private Integer uangMasuk, servo;
    private Boolean noData = true;
    public static DatabaseReference databengbeng,datagoodtime,datashorr,datanextar,datapilus,dataricheese,datatehpucuk,dataultramilk,datavit, datatransaksi, dataservo;

    private Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listorder);

        Submit = findViewById(R.id.submit);

        SharedPreferences countbengbeng = getSharedPreferences("countbengbeng", Context.MODE_PRIVATE);
        value1 = countbengbeng.getString("countbengbeng", "0");
        TextView beliBengbeng = (TextView) findViewById(R.id.count_bengbeng);
        beliBengbeng.setText(value1);

        SharedPreferences countgoodtime = getSharedPreferences("countgoodtime", Context.MODE_PRIVATE);
        value2 = countgoodtime.getString("countgoodtime", "0");
        TextView beliGoodtime = (TextView) findViewById(R.id.count_goodtime);
        beliGoodtime.setText(value2);

        SharedPreferences countshorr = getSharedPreferences("countshorr", Context.MODE_PRIVATE);
        value3 = countshorr.getString("countshorr", "0");
        TextView beliShorr = (TextView) findViewById(R.id.count_shorr);
        beliShorr.setText(value3);

        SharedPreferences countnextar = getSharedPreferences("countnextar", Context.MODE_PRIVATE);
        value4 = countnextar.getString("countnextar", "0");
        TextView beliNextar = (TextView) findViewById(R.id.count_nextar);
        beliNextar.setText(value4);

        SharedPreferences countpilus = getSharedPreferences("countpilus", Context.MODE_PRIVATE);
        value5 = countpilus.getString("countpilus", "0");
        TextView beliPilus = (TextView) findViewById(R.id.count_pilus);
        beliPilus.setText(value5);

        SharedPreferences countricheese = getSharedPreferences("countricheese", Context.MODE_PRIVATE);
        value6 = countricheese.getString("countricheese", "0");
        TextView beliRicheese = (TextView) findViewById(R.id.count_richeese);
        beliRicheese.setText(value6);

        SharedPreferences counttehpucuk = getSharedPreferences("counttehpucuk", Context.MODE_PRIVATE);
        value7 = counttehpucuk.getString("counttehpucuk", "0");
        TextView beliTehpucuk = (TextView) findViewById(R.id.count_tehpucuk);
        beliTehpucuk.setText(value7);

        SharedPreferences countultramilk = getSharedPreferences("countultramilk", Context.MODE_PRIVATE);
        value8 = countultramilk.getString("countultramilk", "0");
        TextView beliUltramilk = (TextView) findViewById(R.id.count_ultramilk);
        beliUltramilk.setText(value8);

        SharedPreferences countvit = getSharedPreferences("countvit", Context.MODE_PRIVATE);
        value9 = countvit.getString("countvit", "0");
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
        final int iTotal = (cbengbeng * 2500) + (cgoodtime * 2000) + (cshorr * 1500) + (cnextar * 2500) + (cpilus * 1500) + (cricheese * 1500) + (ctehpucuk * 4000) + (cultramilk * 6000) + (cvit * 2500);

        String sTotal = Integer.toString(iTotal);
        totalharga.setText(sTotal);

        databengbeng = FirebaseDatabase.getInstance().getReference("/Barang/1");
        databengbeng.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                jmlbengbeng = dataSnapshot.child("Jumlah_Sisa").getValue(Integer.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        datagoodtime = FirebaseDatabase.getInstance().getReference("/Barang/2");
        datagoodtime.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                jmlgoodtime = dataSnapshot.child("Jumlah_Sisa").getValue(Integer.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        datashorr = FirebaseDatabase.getInstance().getReference("/Barang/3");
        datashorr.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                jmlshorr = dataSnapshot.child("Jumlah_Sisa").getValue(Integer.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        datanextar = FirebaseDatabase.getInstance().getReference("/Barang/4");
        datanextar.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                jmlnextar = dataSnapshot.child("Jumlah_Sisa").getValue(Integer.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        datapilus = FirebaseDatabase.getInstance().getReference("/Barang/5");
        datapilus.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                jmlpilus = dataSnapshot.child("Jumlah_Sisa").getValue(Integer.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        dataricheese = FirebaseDatabase.getInstance().getReference("/Barang/6");
        dataricheese.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                jmlricheese = dataSnapshot.child("Jumlah_Sisa").getValue(Integer.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        datatehpucuk = FirebaseDatabase.getInstance().getReference("/Barang/7");
        datatehpucuk.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                jmltehpucuk = dataSnapshot.child("Jumlah_Sisa").getValue(Integer.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        dataultramilk = FirebaseDatabase.getInstance().getReference("/Barang/8");
        dataultramilk.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                jmlultramilk = dataSnapshot.child("Jumlah_Sisa").getValue(Integer.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        datavit = FirebaseDatabase.getInstance().getReference("/Barang/9");
        datavit.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                jmlvit = dataSnapshot.child("Jumlah_Sisa").getValue(Integer.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        datatransaksi = FirebaseDatabase.getInstance().getReference("/Transaksi");
        datatransaksi.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                uangMasuk = dataSnapshot.child("Uang_Masuk").getValue(Integer.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        dataservo = FirebaseDatabase.getInstance().getReference("/SERVO");
        dataservo.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                servo = dataSnapshot.child("HIGH").getValue(Integer.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jmlsisa1 = jmlbengbeng - Integer.parseInt(value1);
                databengbeng.child("Jumlah_Sisa").setValue(jmlsisa1);
                value1 = "";

                jmlsisa2 = jmlgoodtime - Integer.parseInt(value2);
                datagoodtime.child("Jumlah_Sisa").setValue(jmlsisa2);
                value2 = "";

                jmlsisa3 = jmlshorr - Integer.parseInt(value3);
                datashorr.child("Jumlah_Sisa").setValue(jmlsisa3);
                value3 = "";

                jmlsisa4 = jmlnextar - Integer.parseInt(value4);
                datanextar.child("Jumlah_Sisa").setValue(jmlsisa4);
                value4 = "";

                jmlsisa5 = jmlpilus - Integer.parseInt(value5);
                datapilus.child("Jumlah_Sisa").setValue(jmlsisa5);
                value5 = "";

                jmlsisa6 = jmlricheese - Integer.parseInt(value6);
                dataricheese.child("Jumlah_Sisa").setValue(jmlsisa6);
                value6 = "";

                jmlsisa7 = jmltehpucuk - Integer.parseInt(value7);
                datatehpucuk.child("Jumlah_Sisa").setValue(jmlsisa7);
                value7 = "";

                jmlsisa8 = jmlultramilk - Integer.parseInt(value8);
                dataultramilk.child("Jumlah_Sisa").setValue(jmlsisa8);
                value8 = "";

                jmlsisa9 = jmlvit - Integer.parseInt(value9);
                datavit.child("Jumlah_Sisa").setValue(jmlsisa9);
                value9 = "";

                uangMasuk = uangMasuk + iTotal;
                datatransaksi.child("Uang_Masuk").setValue(uangMasuk);
                dataservo.child("HIGH").setValue(1);
                try {
                    sleep(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dataservo.child("HIGH").setValue(0);

                Intent mainactivity = new Intent(ListOrder.this,MainActivity.class);
                startActivity(mainactivity);
            }
        });


    }
}
