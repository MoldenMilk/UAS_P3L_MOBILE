package com.example.atmarental.Dao;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.atmarental.Model.User;

@Dao
public interface UserDao {
    @Query("SELECT * FROM users WHERE email=:email AND password=:password")
    User attemptLogin(String email, String password);

    @Insert
    void registerUser(User user);
}
