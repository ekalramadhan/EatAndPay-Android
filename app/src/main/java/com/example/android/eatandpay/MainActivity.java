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

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class MainActivity extends AppCompatActivity  {
    private ImageButton icBengbeng, icGoodtime, icNextar, icPilus, icRicheese, icShorr, icTehPucuk, icUltramilk, icVit;
    Dialog popupwind;
    private static final String TAG = "MainActivity";
    private Button Orderan;

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

        icNextar = findViewById(R.id.nextar);
        icNextar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buyNextar(v);
            }
        });

        icPilus = findViewById(R.id.pilus);
        icPilus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buyPilus(v);
            }
        });

        icRicheese = findViewById(R.id.richeese);
        icRicheese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buyRicheese(v);
            }
        });

        icTehPucuk = findViewById(R.id.tehpucuk);
        icTehPucuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buyTehpucuk(v);
            }
        });

        icUltramilk = findViewById(R.id.ultramilk);
        icUltramilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buyUltramilk(v);
            }
        });

        icVit = findViewById(R.id.vit);
        icVit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buyVit(v);
            }
        });

        Orderan = findViewById(R.id.orderbutton);
        Orderan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orderDetails(v);
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

    public void buyNextar(View view)
    {
        Log.i("info", "bengbeng diklik");
        Button done;

        popupwind.setContentView(R.layout.buynextar);
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

    public void buyPilus(View view)
    {
        Log.i("info", "bengbeng diklik");
        Button done;

        popupwind.setContentView(R.layout.buypilus);
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

    public void buyRicheese(View view)
    {
        Log.i("info", "bengbeng diklik");
        Button done;

        popupwind.setContentView(R.layout.buyricheese);
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

    public void buyTehpucuk(View view)
    {
        Log.i("info", "bengbeng diklik");
        Button done;

        popupwind.setContentView(R.layout.buytehpucuk);
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

    public void buyUltramilk(View view)
    {
        Log.i("info", "bengbeng diklik");
        Button done;

        popupwind.setContentView(R.layout.buyultramilk);
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

    public void buyVit(View view)
    {
        Log.i("info", "bengbeng diklik");
        Button done;

        popupwind.setContentView(R.layout.buyvit);
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

    public void orderDetails(View view)
    {
        Log.i("info", "bengbeng diklik");
        Button done;

        popupwind.setContentView(R.layout.listorder);
        done = popupwind.findViewById(R.id.submit);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupwind.dismiss();
            }
        });
        popupwind.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popupwind.show();
    }

    //Write Database
    public void writeToDatabase() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");
        myRef.setValue("Hello, World!");

        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
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
