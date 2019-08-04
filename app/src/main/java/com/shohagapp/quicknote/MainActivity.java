package com.shohagapp.quicknote;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.shohagapp.quicknote.adapter.NoteAdapter;
import com.shohagapp.quicknote.model.Note;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText title, description;
    Button save;
    RecyclerView recyclerView;
    NoteAdapter adapter;
    ArrayList<Note> notes =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Initialize();

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (title.getText().toString().equals("")||description.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Insert", Toast.LENGTH_SHORT).show();
                }
                else{
                    String mTitle, mDescription;
                    mTitle = title.getText().toString();
                    mDescription = description.getText().toString();

                    Note temp = new Note(mTitle,mDescription);
                    notes.add(temp);
                    adapter.notifyDataSetChanged();
                }
            }
        });
    }

    private void Initialize() {
        title = findViewById(R.id.titleET);
        description = findViewById(R.id.descET);
        save = findViewById(R.id.saveET);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new NoteAdapter(notes);
        recyclerView.setAdapter(adapter);
    }
}
