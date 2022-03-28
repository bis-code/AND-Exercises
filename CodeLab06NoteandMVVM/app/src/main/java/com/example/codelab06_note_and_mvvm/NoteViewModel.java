package com.example.codelab06_note_and_mvvm;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class NoteViewModel extends ViewModel {
    private final NoteRepository repository;

    public NoteViewModel()
    {
        repository = NoteRepository.getInstance();
    }

    public LiveData<List<Note>> getAllNotes()
    {
        return repository.getAllNotes();
    }

    public LiveData<Boolean> isLoading()
    {
        return repository.isLoading();
    }

    public void insert(Note note)
    {
        repository.insert(note);

    }

    public void deleteAllNotes()
    {
        repository.deleteAllNotes();
    }

    public void addNoteFromInternet()
    {
        repository.addNoteFromInternet();
    }
}