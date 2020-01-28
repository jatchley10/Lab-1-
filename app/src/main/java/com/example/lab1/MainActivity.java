package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t = (TextView) findViewById(R.id.counterView);
        t.setText("50");
    }

    public void incrementCounter(View v){
        int c = 0;
        TextView t = (TextView) findViewById(R.id.counterView);
        int x = Integer.parseInt(t.getText().toString());
        t.setText(Integer.toString(++x));
    }

    public void decrementCounter(View v){
        TextView t = (TextView) findViewById(R.id.counterView);
        int x = Integer.parseInt(t.getText().toString());
        t.setText(Integer.toString(--x));
    }
}
