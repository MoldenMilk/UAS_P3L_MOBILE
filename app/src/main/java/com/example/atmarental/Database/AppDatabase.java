package com.example.atmarental.Database;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.example.atmarental.Dao.UserDao;
import com.example.atmarental.Model.User;

@Database(entities = {User.class}, version = 2, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase{
    public abstract UserDao userDAO();
}
