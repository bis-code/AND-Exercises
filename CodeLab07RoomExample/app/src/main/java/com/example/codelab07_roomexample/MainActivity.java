package com.example.codelab07_roomexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private NoteViewModel viewModel;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

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
            else{
                textView.setText("Empty");
            }
        });
    }

    public void saveNote(View v)
    {
        viewModel.insert(new Note(editText.getText().toString(), "description", 1));
    }

    public void deleteAllNotes(View v)
    {
        viewModel.deleteAllNotes();
    }
}