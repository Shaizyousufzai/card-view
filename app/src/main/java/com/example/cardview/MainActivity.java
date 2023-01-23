package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Model> WaterfallModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        WaterfallModelList = new ArrayList<>();
        WaterfallModelList.add(new Model("1st one",R.drawable.w1));
        WaterfallModelList.add(new Model("2nd one",R.drawable.w2));
        WaterfallModelList.add(new Model("3rd one",R.drawable.w3));
        MyAdapter myAdapter=new MyAdapter(this,WaterfallModelList);
        RecyclerView.LayoutManager linearLayoutmanager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutmanager);
        recyclerView.setAdapter(myAdapter);


    }
}