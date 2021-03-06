package com.princekumar.zolo.data;

import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.princekumar.zolo.data.entity.User;

@Database(entities = {User.class}, version = 1,exportSchema = false)
public abstract class UserAppDatabase extends RoomDatabase {

    public abstract UserDao userDao();
    private static UserAppDatabase INSTANCE;

    public static UserAppDatabase getAppDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(context.getApplicationContext(), UserAppDatabase.class, "User")
                            .allowMainThreadQueries()
                            .build();
        }
        return INSTANCE;
    }


    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        return null;
    }

    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
