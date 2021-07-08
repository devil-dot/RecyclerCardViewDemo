package com.kmtstudio.myrecyclercardviewdemo10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private String[] title, desc;

    private int[] images = {R.drawable.afghanistan,R.drawable.armenia,R.drawable.azerbaijan,
            R.drawable.bangladesh,R.drawable.bahrain,R.drawable.bhutan,R.drawable.brazil,
            R.drawable.china,R.drawable.india,R.drawable.japan,R.drawable.malta,R.drawable.nepal,
            R.drawable.pakistan,R.drawable.poland,R.drawable.spain};

    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerViewID);

        title = getResources().getStringArray(R.array.country_names);
        desc = getResources().getStringArray(R.array.country_desc);


        myAdapter = new MyAdapter(this,images,title,desc);


        recyclerView.setAdapter(myAdapter);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}