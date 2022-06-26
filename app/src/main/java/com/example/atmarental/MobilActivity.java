package com.example.atmarental;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import com.example.atmarental.Data.RecyclerViewDaftarMobil;

public class MobilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobil);
        RecyclerView view = findViewById(R.id.rv_mobil);
        view.setLayoutManager(new LinearLayoutManager(MobilActivity.this, LinearLayoutManager.VERTICAL, false));
        view.setAdapter(new RecyclerViewDaftarMobil());
    }
}