package practice.archive.dao;

import practice.archive.model.Doc;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class ArchiveImpl implements Archive{

    static Comparator<Doc> comparator=(d1, d2)->{  //создали компаратор для сравнения по двум полям: Date и DocId
        int res=d1.getDate().compareTo(d2.getDate());
        return res!=0 ? res : Integer.compare(d1.getDocId(), d2.getDocId());
    };

    private Doc[] docs;  //поля
    private int size;

    public ArchiveImpl(int capacity) { //конструктор
        docs = new Doc[capacity];

    }

    @Override
    public boolean addDoc(Doc doc) {
        if(doc==null||size==docs.length||getDocFromArchive(doc.getArchiveId(),doc.getDocId())!=null) {
            return false;
        }
        int ind= Arrays.binarySearch(docs,0,size,doc,comparator);
        ind= ind>=0 ? ind: -ind-1;
        System.arraycopy(docs,ind,docs,ind+1,size-ind);
        docs[ind]=doc;
        size++;
        System.out.println("Document added");
        return true;
    }

    @Override
    public boolean removeDoc(int archiveId, int docId) {
        for (int i = 0; i < size; i++) {
            if(docs[i].getArchiveId()==archiveId&&docs[i].getDocId()==docId){
                System.arraycopy(docs,i+1,docs,i,size-i-1);
                docs[--size]=null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateDoc(int archiveId, int docId, String url) {
        Doc doc= getDocFromArchive(archiveId,docId);
        if(doc==null) {
            return false;
        }
        doc.setUrl(url);
        return true;
    }

    @Override
    public Doc getDocFromArchive(int archiveId, int docId) {
        Doc pat=new Doc(archiveId,docId,null,null,null);
        for (int i = 0; i < size; i++) {
            if(docs[i].equals(pat)){
                return docs[i];
            }
        }
        return null;
    }

    @Override
    public Doc[] getAllDocsFromArchive(int archiveId) {
        return findByPredicate(p-> p.getArchiveId()==archiveId);
    }

    private Doc[]findByPredicate(Predicate<Doc>predicate){
        Doc[]res= new Doc[size];
        int j=0;
        for (int i = 0; i < size; i++) {
            if(predicate.test(docs[i])){
                res[j++]=docs[i];
            }
        }
        return Arrays.copyOf(res,j);
    }

    @Override
    public Doc[] getDocsBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        return new Doc[0];
    }

    @Override
    public int size() {
        return size;
    }
    @Override
    public void printDocuments(){
        for (int i = 0; i < size; i++) {
                System.out.println(docs[i]);
        }
        System.out.println();
    }
}
