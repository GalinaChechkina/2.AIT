package practice.archive.dao;

import practice.archive.model.Doc;

import java.time.LocalDate;

public interface Archive {
    boolean addDoc (Doc doc);
    boolean removeDoc (int archiveId,int docId);
    boolean updateDoc (int archiveId,int docId,String url);
    Doc getDocFromArchive (int archiveId, int docId);
    Doc[] getAllDocsFromArchive (int archiveId);
    Doc[] getDocsBetweenDate (LocalDate dateFrom, LocalDate dateTo);
    int size();
    void printDocuments();

}
