package com.example.atmarental.Preferences;
import android.content.Context;
import android.content.SharedPreferences;
import com.example.atmarental.Model.User;

public class UserPreferences {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Context context;

    public static final String IS_LOGIN = "isLogin";
    public static final String KEY_ID = "id";
    public static final String KEY_NAMA = "nama";
    public static final String KEY_ALAMAT = "alamat";
    public static final String KEY_TELEPON = "telepon";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_PASSWORD = "password";

    public UserPreferences(Context context){
        this.context = context;
        sharedPreferences = context.getSharedPreferences("userPreferences", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void setUser(int id, String nama, String alamat, String telepon,String email, String password){
        editor.putBoolean(IS_LOGIN, true);
        editor.putInt(KEY_ID,id);
        editor.putString(KEY_NAMA,nama);
        editor.putString(KEY_ALAMAT, alamat);
        editor.putString(KEY_TELEPON, telepon);
        editor.putString(KEY_EMAIL,email);
        editor.putString(KEY_PASSWORD,password);
        editor.commit();
    }
    public User getUserLogin(){
        String nama,alamat,telepon,email,password;
        int id;
        id = sharedPreferences.getInt(KEY_ID,0);
        nama = sharedPreferences.getString(KEY_NAMA,null);
        alamat = sharedPreferences.getString(KEY_ALAMAT, null);
        telepon = sharedPreferences.getString(KEY_TELEPON, null);
        email = sharedPreferences.getString(KEY_EMAIL,null);
        password = sharedPreferences.getString(KEY_PASSWORD,null);

        return new User(id,nama,alamat,telepon,email,password);
    }
    public boolean checkLogin(){
        return sharedPreferences.getBoolean(IS_LOGIN, false);
    }
    public void logout(){
        editor.clear();
        editor.commit();
    }
}
