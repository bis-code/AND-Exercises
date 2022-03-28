package com.example.codelab06_notewithmvvm;

import androidx.lifecycle.LiveData;

import java.util.List;

public class NoteRepository {

    private final NoteDao noteDao;
    private static NoteRepository instance;

    public NoteRepository()

    {
        noteDao = NoteDao.getInstance();
    }

    public static NoteRepository getInstance(){
        if(instance == null)
        {
            instance = new NoteRepository();
        }
        return instance;
    }

    public LiveData<List<Note>> getAllNotes()
    {
        return noteDao.getAllNotes();
    }

    public LiveData<Boolean> isLoading()
    {
        return noteDao.isLoading();
    }

    public void insert(Note note)
    {
        noteDao.insert(note);
    }

    public void deleteAllNotes()
    {
        noteDao.deleteAllNotes();
    }
}
