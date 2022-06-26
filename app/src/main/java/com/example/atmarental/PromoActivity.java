package com.example.atmarental;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import com.example.atmarental.Data.RecyclerViewDaftarPromo;

public class PromoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promo);
        RecyclerView view = findViewById(R.id.rv_promo);
        view.setLayoutManager(new LinearLayoutManager(PromoActivity.this, LinearLayoutManager.VERTICAL, false));
        view.setAdapter(new RecyclerViewDaftarPromo());
    }
}