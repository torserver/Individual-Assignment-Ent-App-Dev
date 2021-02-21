package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class JournalEntryDAO implements IJournalEntryDAO {

    HashMap<Integer, JournalEntry> journalEntryMap = new HashMap<>();

    @Override
    public void save(JournalEntry journalEntry) {
        journalEntry.setEntryID(journalEntryMap.size());
        journalEntryMap.put(journalEntry.getEntryID(), journalEntry);
    }

    @Override
    public void remove(int entryID) {
        journalEntryMap.remove(entryID);
    }

    @Override
    public JournalEntry getEntryByID(int entryID) {
        journalEntryMap.get(entryID);
        return null;
    }

    @Override
    public List<JournalEntry> getAllEntries() {
        return new ArrayList<>(journalEntryMap.values());
    }
}
