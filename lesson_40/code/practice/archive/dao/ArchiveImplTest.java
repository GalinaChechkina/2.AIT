package practice.archive.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.archive.model.Doc;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveImplTest {

    Archive archive;
    Doc[]docs;
    LocalDateTime now=LocalDateTime.now();

    @BeforeEach
    void setUp() {
        archive= new ArchiveImpl(5);
        docs= new Doc[4];
        docs[0]=new Doc(1,1,"doc1","url1",now.minusDays(1));
        docs[1]=new Doc(1,2,"doc2","url2",now.minusDays(2));
        docs[2]=new Doc(2,1,"doc3","url3",now.minusDays(3));
        docs[3]=new Doc(2,2,"doc4","url4",now.minusDays(4));
        for (int i = 0; i < docs.length; i++) {
            archive.addDoc(docs[i]);
        }
    }

    @Test
    void addDoc() {
        assertFalse(archive.addDoc(null));
        assertFalse(archive.addDoc(docs[1]));
        Doc doc= new Doc(3,1,"doc5","url5",now);
        assertTrue(archive.addDoc(doc));
        assertEquals(5,archive.size());
        Doc doc1= new Doc(3,2,"doc6","url6",now);
        assertFalse(archive.addDoc(doc1));
    }

    @Test
    void removeDoc() {
        assertTrue(archive.removeDoc(1,2));
        assertFalse(archive.removeDoc(4,2));
        assertEquals(3,archive.size());
        assertNull(archive.getDocFromArchive(1,2));
    }

    @Test
    void updateDoc() {
        assertTrue(archive.updateDoc(1,1,"new url"));
        assertEquals("new url",archive.getDocFromArchive(1,1).getUrl());
    }

    @Test
    void getDocFromArchive() {
        assertEquals(docs[3],archive.getDocFromArchive(2,2));
        assertNull(archive.getDocFromArchive(5,5));
    }

    @Test
    void getAllDocsFromArchive() {
        Doc[]act= archive.getAllDocsFromArchive(1);
        Arrays.sort(act);
        Doc[]exp={docs[0],docs[1]};
        assertArrayEquals(exp,act);
    }

    @Test
    void getDocsBetweenDate() {
        LocalDate ld= now.toLocalDate();
        Doc[]act= archive.getDocsBetweenDate(ld.minusDays(1),ld.minusDays(3));
        Arrays.sort(act);
        Doc[]exp= {docs[0],docs[1]};
        assertArrayEquals(exp,act);

    }

    @Test
    void size() {
        assertEquals(4,archive.size());
    }
}