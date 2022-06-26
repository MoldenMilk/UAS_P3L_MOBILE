package com.example.atmarental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.atmarental.Model.User;
import com.google.android.material.button.MaterialButton;

public class ProfileActivity extends AppCompatActivity {
    private TextView tvNama, tvAlamat, tvTelepon, tvEmail;
    private MaterialButton btnBack;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvNama = findViewById(R.id.tvNama);
        tvAlamat = findViewById(R.id.tvAlamat);
        tvTelepon = findViewById(R.id.tvTelepon);
        tvEmail = findViewById(R.id.tvEmail);
        btnBack = findViewById(R.id.btnBack);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String Nama = extras.getString("nama");
            tvNama.setText(Nama);
            String Alamat = extras.getString("alamat");
            tvAlamat.setText(Alamat);
            String Telepon = extras.getString("telepon");
            tvTelepon.setText(Telepon);
            String Email = extras.getString("email");
            tvEmail.setText(Email);
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfileActivity.this, MainActivity.class));
                finish();
            }
        });
    }
}