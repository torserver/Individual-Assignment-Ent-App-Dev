package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Component;

import java.util.*;

/**
this is the JournalEntry DAO class which implements the interface class
@author Tor Vaz
*/

@Component
public class JournalEntryDAOStub implements IJournalEntryDAO {

    List<JournalEntry> allJournalEntries = new ArrayList<JournalEntry>();
    HashMap<Integer, JournalEntry> journalEntryMap = new HashMap<>();

//    saves journal entries
    @Override
    public void save(JournalEntry journalEntry) {
        allJournalEntries.add(journalEntry);
        /*journalEntry.setEntryID(allJournalEntries.size());
        allJournalEntries.put(journalEntry.getEntryID(), journalEntry);*/
    }
//  deletes or removes entries
    @Override
    public void remove(int entryID) {
        allJournalEntries.remove(entryID);
    }
//  returns journal entry by ID
    @Override
    public JournalEntry getEntryByID(int entryID) {
        allJournalEntries.get(entryID);
        return null;
    }
//  returns all journal entries in list
    @Override
    public List<JournalEntry> getAllEntries() {
        return allJournalEntries;
    }
}
