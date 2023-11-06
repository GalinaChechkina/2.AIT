package practice.archive.model;

import java.time.LocalDateTime;

public class Doc implements Comparable<Doc>{
    private int archiveId;
    private int docId;
    private String title;
    private String url;
    private LocalDateTime date;

    public Doc(int archiveId, int docId, String title, String url, LocalDateTime date) {
        this.archiveId = archiveId;
        this.docId = docId;
        this.title = title;
        this.url = url;
        this.date = date;
    }

    public int getArchiveId() {
        return archiveId;
    }
    public int getDocId() {
        return docId;
    }
    public String getTitle() {
        return title;
    }
    public String getUrl() {
        return url;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Document { " +
                "Folder Id= " + archiveId +
                ", Document Id= " + docId +
                ", Title= '" + title + '\'' +
                ", URL= '" + url + '\'' +
                ", Date= " + date +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Doc doc = (Doc) object;

        if (archiveId != doc.archiveId) return false;
        return docId == doc.docId;
    }

    @Override
    public int hashCode() {
        int result = archiveId;
        result = 31 * result + docId;
        return result;
    }

    @Override
    public int compareTo(Doc o) {  //сделали объекты класса сравниваемыми по двум полям: archive и IddocId
        int res=Integer.compare(this.archiveId,o.archiveId);
        return res!=0 ? res: Integer.compare(this.docId,o.docId);
    }
}
