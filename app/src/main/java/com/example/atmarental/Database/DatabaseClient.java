package com.example.atmarental.Database;
import android.content.Context;
import androidx.room.Room;

public class DatabaseClient {
    private Context context;
    private static DatabaseClient databaseClient;
    private static String DatabaseName = "AtmaRental";

    private AppDatabase database;

    public DatabaseClient(Context context) {
        this.context = context;
        database = Room.databaseBuilder(context, AppDatabase.class, DatabaseName).allowMainThreadQueries().build();
    }

    public static synchronized DatabaseClient getInstance(Context context){
        if(databaseClient == null){
            databaseClient = new DatabaseClient(context);
        }
        return databaseClient;
    }

    public AppDatabase getDatabase() { return database; }
}
