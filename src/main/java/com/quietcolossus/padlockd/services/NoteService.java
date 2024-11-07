package com.quietcolossus.padlockd.services;

import com.quietcolossus.padlockd.models.Note;

import java.util.List;

public interface NoteService {
    Note createNoteByUser(String username, String content);

    Note updateNoteByUser(Long noteId, String content, String username);

    void deleteNoteByUser(Long noteId, String username);

    List<Note> getNotesByUser(String username);
}
