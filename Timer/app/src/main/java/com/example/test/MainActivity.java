package com.example.test;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView displayScramble1, displayScramble2, displayTime, history;
    Button draw, start;

    String measuringTime = "0:00:00:00";
    ArrayList<String> listTime = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relays();
        buttons();
        intentGetTime();
        drawingScramble();
    }

    private void drawingScramble() {
        Drawing drawing = new Drawing();
        String scramble1 = drawing.drawingFirst();
        String scramble2 = drawing.drawingSecond();
        displayScramble1.setText(scramble1);
        displayScramble2.setText(scramble2);
    }

    public void intentGetTime() {
        Intent intentTimerReverse = getIntent();
        measuringTime = intentTimerReverse.getStringExtra("TIME");
        displayTime.setText(measuringTime);
        listTime.add(measuringTime);
    }

    private void buttons() {
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentTimer = new Intent(MainActivity.this, Timer.class);
                startActivity(intentTimer);
            }
        });

        draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawingScramble();
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHistory = new Intent(MainActivity.this, History.class);
                intentHistory.putExtra("HISTORY", listTime);
                startActivity(intentHistory);
            }
        });
    }

    private void relays() {
        displayTime = findViewById(R.id.displayTime);
        displayScramble1 = findViewById(R.id.displayScramble1);
        displayScramble2 = findViewById(R.id.displayScramble2);
        draw = findViewById(R.id.draw);
        start = findViewById(R.id.start);
        history = findViewById(R.id.history);
    }
}