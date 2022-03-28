package com.example.codelab07_roomexample;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NoteRepository {
    private static NoteRepository instance;
    private final NoteDao noteDao;
    private final LiveData<List<Note>> allNotes;
    private final ExecutorService executorService;

    private NoteRepository(Application application)
    {
        NoteDatabase database = NoteDatabase.getInstance(application);
        noteDao = database.noteDao();
        allNotes = noteDao.getAllNotes();
        executorService = Executors.newFixedThreadPool(2);
    }

    public static synchronized NoteRepository getInstance(Application application)
    {
        if(instance == null)
        {
            instance = new NoteRepository(application);
        }
        return instance;
    }

    public LiveData<List<Note>> getAllNotes()
    {
        return allNotes;
    }

    public void insert(Note note)
    {
        executorService.execute(() -> noteDao.insert(note));
    }

    public void deleteAllNotes()
    {
        executorService.execute(noteDao::deleteAllNotes);
    }
}
