package com.example.codelab06_notewithmvvm;

//Database placeholder

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class NoteDao {
    private final MutableLiveData<List<Note>> allNotes;
    private final MutableLiveData<Boolean> isLoading = new MutableLiveData<>(false);

    private static NoteDao instance;

    private NoteDao()
    {
        allNotes = new MutableLiveData<>();
        List<Note> newList = new ArrayList<>();
        allNotes.setValue(newList);
    }

    public static NoteDao getInstance()
    {
        if(instance == null)
        {
            instance = new NoteDao();
        }
        return instance;
    }

    public LiveData<List<Note>> getAllNotes()
    {
        return allNotes;
    }

    public LiveData<Boolean> isLoading()
    {
        return isLoading;
    }

    public void insert(Note note)
    {
        isLoading.setValue(true);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                List<Note> currentNotes = allNotes.getValue();
                currentNotes.add(note);
                allNotes.postValue(currentNotes);
                isLoading.postValue(false);
            }
        }, 3000);
    }

    public void deleteAllNotes()
    {
        isLoading.setValue(true);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                List<Note> newList = new ArrayList<>();
                allNotes.postValue(newList);
                isLoading.postValue(false);
            }
        }, 3000);
    }
}
