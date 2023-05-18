package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class Timer extends AppCompatActivity {

    TextView newTime;

    private long startTime = 0L, elapsedTime = 0L;

    private String time;
    private Handler timerHandler = new Handler();
    private Runnable timerRunnable = new Runnable() {
        @Override
        public void run() {
            elapsedTime = System.currentTimeMillis() - startTime;
            int hours = (int) (elapsedTime / 360000);
            int minutes = (int) (elapsedTime / 60000) % 60;
            int seconds = (int) (elapsedTime / 1000) % 60;
            int milliseconds = (int) (elapsedTime % 100);
            time = String.format(Locale.getDefault(), "%d:%02d:%02d:%02d", hours, minutes, seconds, milliseconds);
            newTime.setText(time);
            timerHandler.postDelayed(this, 10);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        newTime = findViewById(R.id.newTime);
        goTimer();

        newTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timerHandler.removeCallbacks(timerRunnable);

                Intent intentTimerReverse = new Intent(Timer.this, MainActivity.class);
                intentTimerReverse.putExtra("TIME", time);
                startActivity(intentTimerReverse);
                finish();
            }
        });
    }

    private void goTimer() {
        startTime = System.currentTimeMillis();
        timerHandler.postDelayed(timerRunnable, 0);
    }


}