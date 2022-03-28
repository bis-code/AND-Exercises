package com.example.codelab06_note_and_mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    NoteViewModel viewModel;
    EditText editText;
    TextView textView;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        progressBar = findViewById(R.id.progressBar);

        viewModel = new ViewModelProvider(this).get(NoteViewModel.class);
        viewModel.getAllNotes().observe(this, notes -> {
            if(!notes.isEmpty())
            {
                textView.setText("");
                for(Note n : notes)
                {
                    textView.append(n.getTitle() + "\n");
                }
            }
            else {
                textView.setText("Empty");
            }
        });

        viewModel.isLoading().observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean isLoading) {
                int visibility = isLoading ? View.VISIBLE : View.INVISIBLE;
                progressBar.setVisibility(visibility);
            }
        });
    }

    public void saveNote(View v) {
        viewModel.insert(new Note(editText.getText().toString()));
    }

    public void deleteAllNotes(View v)
    {
        viewModel.deleteAllNotes();
    }
}