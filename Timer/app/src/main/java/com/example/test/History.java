package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class History extends AppCompatActivity {

    TextView timer;
    ListView listView;

    private ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        timer = findViewById(R.id.timer);
        listView = findViewById(R.id.listView);

        intentGetTimeHistory();

        timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHistory = new Intent(History.this, MainActivity.class);
                startActivity(intentHistory);
            }
        });
    }

    private void intentGetTimeHistory() {
        list = (ArrayList<String>) getIntent().getSerializableExtra("HISTORY");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
    }
}