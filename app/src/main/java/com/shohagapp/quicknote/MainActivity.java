package com.shohagapp.quicknote;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText title, description;
    Button save;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Initialization();
    }

    private void Initialization() {
        title = findViewById(R.id.titleET);
        description = findViewById(R.id.descET);
        save = findViewById(R.id.saveET);

    }
}
