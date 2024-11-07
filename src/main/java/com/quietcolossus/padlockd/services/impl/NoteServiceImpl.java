package com.quietcolossus.padlockd.services.impl;

import com.quietcolossus.padlockd.models.Note;
import com.quietcolossus.padlockd.repositories.NoteRepository;
import com.quietcolossus.padlockd.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public Note createNoteByUser(String username, String content) {
        Note note = new Note();
        note.setContent(content);
        note.setOwnerUsername(username);
        return noteRepository.save(note);
    }

    @Override
    public Note updateNoteByUser(Long noteId, String content, String username) {
        Note note = noteRepository.findById(noteId).orElseThrow(()
                -> new RuntimeException("Note not found"));
        note.setContent(content);
        return noteRepository.save(note);
    }

    @Override
    public void deleteNoteByUser(Long noteId, String username) {
        noteRepository.deleteById(noteId);
    }

    @Override
    public List<Note> getNotesByUser(String username) {
        return noteRepository.findByOwnerUsername(username);
    }
}
