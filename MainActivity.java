package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;
import android.util.Log;


public class MainActivity extends AppCompatActivity {
    private Integer counter = 0;

    Button plus_ruble;
    TextView balance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus_ruble = (Button) findViewById(R.id.plus_ruble);
        balance = (TextView) findViewById(R.id.balance);
        Plus_ruble();
        if (savedInstanceState != null && savedInstanceState.containsKey("counter"))
        {
            counter = savedInstanceState.getInt("counter");
        }
        TextView counterView = (TextView) findViewById(R.id.balance);
        counterView.setText(counter.toString());


    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("counter", counter);

    }
    
        @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("counter")) {
            counter = savedInstanceState.getInt("counter");
        }
    }

    void Plus_ruble() {
        plus_ruble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                balance.setText(counter + "");
            }
        });

    }
}
