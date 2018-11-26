package com.example.bitsi34gb.entetrivandrum;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ShopsList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shops_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        RecyclerView shopsRecycler = (RecyclerView)findViewById(R.id.recycle);
        shopsRecycler.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        shopsRecycler.setLayoutManager(layoutManager);
        RecyclerShops recyclerAdapter = new RecyclerShops(ShopsList.this);
        shopsRecycler.setAdapter(recyclerAdapter);
    }
}
