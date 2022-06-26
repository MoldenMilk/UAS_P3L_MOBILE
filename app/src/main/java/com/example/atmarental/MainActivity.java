package com.example.atmarental;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationManagerCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.atmarental.Model.User;
import com.example.atmarental.Preferences.UserPreferences;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private TextView tvWelcome;
    private MaterialButton btnMobil, btnPromo, btnChekOut, btnLogout;
    private ImageButton btnProfile;
    private User user;
    private UserPreferences userPreferences;
    boolean isPressend=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userPreferences = new UserPreferences(MainActivity.this);
        tvWelcome = findViewById(R.id.tvWelcome);
        btnMobil = findViewById(R.id.btnMobil);
        btnPromo = findViewById(R.id.btnPromo);
        btnChekOut = findViewById(R.id.btnCheckOut);
        btnLogout = findViewById(R.id.btnLogout);
        btnProfile = findViewById(R.id.btnProfile);

        user = userPreferences.getUserLogin();
        checkLogin();
        tvWelcome.setText("Selamat Datang, " + user.getNama());

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userPreferences.logout();
                Toast.makeText(MainActivity.this, "Buu baii ", Toast.LENGTH_SHORT).show();
                checkLogin();
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profileActivity = new Intent(MainActivity.this, ProfileActivity.class);
                profileActivity.putExtra("nama", user.getNama());
                profileActivity.putExtra("alamat", user.getAlamat());
                profileActivity.putExtra("telepon", user.getTelepon());
                profileActivity.putExtra("email", user.getEmail());
                startActivity(profileActivity);
            }
        });
    }

    private void checkLogin(){
        if(!userPreferences.checkLogin()){
            startActivity(new Intent(MainActivity.this,LoginActivity.class));
            finish();
        }
        else{
            Toast.makeText(MainActivity.this,"Sudah Login !!",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onBackPressed(){
        if(isPressend)
        {
            finishAffinity();
            System.exit(0);
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Please click back again to exit.", Toast.LENGTH_SHORT).show();
            isPressend = true;
        }
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                isPressend = false;
            }
        };
        new Handler().postDelayed(runnable,2000);
    }
}