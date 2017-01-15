package com.example.kapil.assingment41;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ListView lv;
    ArrayAdapter<String> aa;
    Button ascending, descending;
    String data[] = {"Jan", "Feb", "March", "April", "May", "June", "July","August","September","October","November","December"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiation of UI Components
        lv = (ListView) findViewById(R.id.listview1);
        ascending = (Button) findViewById(R.id.ascending);
        descending = (Button) findViewById(R.id.descending);

        aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, data);
        lv.setAdapter(aa);

        ascending.setOnClickListener(this);
        descending.setOnClickListener(this);

    }

    public void onClick(View v) {

        if (v == ascending) {
            Arrays.sort(data);
            aa.notifyDataSetChanged();

        }

        if (v == descending) {
            Arrays.sort(data);
            List<String> list = Arrays.asList(data);
            Collections.reverse(list);
            aa.notifyDataSetChanged();

        }

    }
}