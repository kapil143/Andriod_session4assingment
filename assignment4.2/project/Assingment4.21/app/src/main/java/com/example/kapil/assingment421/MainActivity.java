package com.example.kapil.assingment421;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener
{
    ListView listView;
    ListViewAdapter listViewAdapter;

    private final static String name[] = {"Arun","Barun","Chirag","Durga","Ekansh","Faizal","Garvit"};

    private final static String number[] = {"9988778877", "9988778874","9988778844","9977654123","9874562103","7988778877","9968778877"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        listViewAdapter = new ListViewAdapter(this, name, number);
        System.out.println("adapter => "+ listViewAdapter.getCount());
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(this,name[position]+"=> "+number[position], Toast.LENGTH_SHORT).show();
    }
}