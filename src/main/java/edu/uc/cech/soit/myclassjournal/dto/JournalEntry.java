package edu.uc.cech.soit.myclassjournal.dto;

import lombok.Data;

/*
this is the DTO class which defines the attributes for the JournalEntry object
@author Tor Vaz
*/

public @Data
class JournalEntry {
    private String notes;
    private String date;
    private int entryID;
}
