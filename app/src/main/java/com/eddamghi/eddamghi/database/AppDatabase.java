package com.eddamghi.eddamghi.database;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.Database;

import com.eddamghi.eddamghi.entities.FirstEntity;
import com.eddamghi.eddamghi.entities.FirstEntityDAO;

import lombok.var;

@Database(entities = {FirstEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract FirstEntityDAO firstEntityDAO();
    private static volatile AppDatabase INSTANCE;

    public static AppDatabase getDatabase(Context context) {
        AppDatabase tempInstance = INSTANCE;
        if (tempInstance != null) {
            return tempInstance;
        }
        synchronized (AppDatabase.class) {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                        context.getApplicationContext(),
                        AppDatabase.class,
                        "eddamghi_database"
                ).build();
            }
            return INSTANCE;
        }
    }
}
