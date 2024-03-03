package com.example.miniprojetlistgridspinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar; // Add this import statement

import android.os.Bundle;
import android.widget.ListView;

import com.example.miniprojetlistgridspinner.BaseAdapter;
import com.example.miniprojetlistgridspinner.R;

public class MainActivity extends AppCompatActivity {

    String fruitList[] = {"Apple", "Strawberries", "Pineapple", "Grape", "Mango", "Orange"};
    int fruitImages[] = {R.drawable.apple, R.drawable.strawberry, R.drawable.pineapple, R.drawable.grape, R.drawable.mango, R.drawable.orange};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.ListActivity);
        BaseAdapter baseAdapter = new BaseAdapter(getApplicationContext(), fruitList, fruitImages);
        getSupportActionBar().setTitle("Fruits");

        // Enable the home button in the ActionBar
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        listView.setAdapter(baseAdapter);
    }
}
