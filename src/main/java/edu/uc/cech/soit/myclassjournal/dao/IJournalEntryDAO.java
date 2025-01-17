package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import java.util.List;

/**
this is the DAO interface class
@author Tor Vaz
*/

public interface IJournalEntryDAO {

    void save(JournalEntry journalEntry);
    void remove(int entryID);

    JournalEntry getEntryByID(int entryID);
    List<JournalEntry> getAllEntries();

}
