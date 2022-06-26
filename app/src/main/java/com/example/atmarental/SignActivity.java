package com.example.atmarental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.atmarental.Database.DatabaseClient;
import com.example.atmarental.Model.User;
import com.example.atmarental.Preferences.UserPreferences;
import com.google.android.material.button.MaterialButton;
import com.example.atmarental.R;

public class SignActivity extends AppCompatActivity {
    private EditText etNama, etAlamat, etTelepon, etEmail, etPassword;
    private MaterialButton btnSignup;
    private UserPreferences userPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);

        userPreferences = new UserPreferences(SignActivity.this);

        etNama = findViewById(R.id.etNama);
        etAlamat = findViewById(R.id.etAlamat);
        etTelepon = findViewById(R.id.etTelepon);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnSignup = findViewById(R.id.btnSignup);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validateForm()){
                    register(etNama.getText().toString().trim(), etAlamat.getText().toString().trim(),
                            etTelepon.getText().toString().trim(), etEmail.getText().toString(),
                            etPassword.getText().toString().trim());
                }
            }
        });
    }

    private void register(String nama,String alamat,String telepon,String email,String password){

        class RegisterUser extends AsyncTask<Void, Void, Void> {

            @Override
            protected Void doInBackground(Void... voids) {
                User user = new User();
                user.setNama(nama);
                user.setAlamat(alamat);
                user.setTelepon(telepon);
                user.setEmail(email);
                user.setPassword(password);

                DatabaseClient.getInstance(SignActivity.this)
                        .getDatabase()
                        .userDAO()
                        .registerUser(user);

                return null;
            }

            @Override
            protected void onPostExecute(Void unused) {
                super.onPostExecute(unused);
                Toast.makeText(SignActivity.this, "Berhasil mendaftar", Toast.LENGTH_SHORT).show();
                clearField();
                startActivity(new Intent(SignActivity.this, LoginActivity.class));
                finish();
            }

        }

        RegisterUser registerUser = new RegisterUser();
        registerUser.execute();
    }

    private void clearField(){
        etNama.setText("");
        etAlamat.setText("");
        etTelepon.setText("");
        etEmail.setText("");
        etPassword.setText("");
    }


    private boolean validateForm(){
        /* Check username & password is empty or not */
        if(etNama.getText().toString().trim().isEmpty() || etAlamat.getText().toString().trim().isEmpty() || etTelepon.getText().toString().trim().isEmpty() ||
                etPassword.getText().toString().trim().isEmpty() || etEmail.getText().toString().trim().isEmpty()){
            Toast.makeText(SignActivity.this,"Field tidak boleh Kosong",Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}