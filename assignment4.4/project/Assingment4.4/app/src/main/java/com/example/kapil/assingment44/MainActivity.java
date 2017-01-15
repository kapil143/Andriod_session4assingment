package com.example.kapil.assingment44;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView grid;

    Integer[] imageIDs = {
            R.drawable.ginger, R.drawable.honeycomb, R.drawable.icecream,
            R.drawable.jellybeans, R.drawable.kitkat, R.drawable.lollipop
    };
    String[] inames={"GingerBread","Honeycomb","Ice-cream Sandwich","Jellybeans","Kitkat","Lollipop"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomGrid adapter = new CustomGrid(MainActivity.this,inames,imageIDs);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +inames[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }

}