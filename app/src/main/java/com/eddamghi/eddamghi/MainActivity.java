package com.eddamghi.eddamghi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;


import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.eddamghi.eddamghi.database.AppDatabase;
import com.eddamghi.eddamghi.entities.FirstEntity;
import com.eddamghi.eddamghi.entities.FirstEntityDAO;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Date;
import java.util.List;

import kotlinx.coroutines.CoroutineScope;


public class MainActivity extends AppCompatActivity {
    AppDatabase appDatabase;
    FirstEntityDAO dao;
    RecyclerView recyclerView;
    FloatingActionButton add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = findViewById(R.id.add);
        recyclerView = findViewById(R.id.recyclerView);

        add.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AddActivity.class);
            startActivity(intent);
        });
    }
    public void addData(){

    }
}