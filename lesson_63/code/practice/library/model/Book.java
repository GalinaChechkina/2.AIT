package practice.library.model;

import java.util.Objects;

public class Book implements Comparable<Book>{

    private String name;
    private String author;
    private Integer issueYear;
    private boolean isAvail;

    public Book(String name, String author, Integer issueYear, boolean isAvail) {
        this.name = name;
        this.author = author;
        this.issueYear = issueYear;
        this.isAvail = isAvail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(Integer issueYear) {
        this.issueYear = issueYear;
    }

    public boolean isAvail() {
        return isAvail;
    }

    public void setAvail(boolean avail) {
        isAvail = avail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (isAvail != book.isAvail) return false;
        if (!Objects.equals(name, book.name)) return false;
        if (!Objects.equals(author, book.author)) return false;
        return Objects.equals(issueYear, book.issueYear);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (issueYear != null ? issueYear.hashCode() : 0);
        result = 31 * result + (isAvail ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("name='").append(name).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", issueYear=").append(issueYear);
        sb.append(", isAvail=").append(isAvail);
        sb.append('}');
        return sb.toString();
    }
    public void checkOutBook(){
        if (isAvail){  //если книга свободна
            isAvail=false; //теперь книга занята
            System.out.println(name+" was given to the reader.");
        } else {
            System.out.println(name+" is not available.");
        }
    }

    public void returnBook(){
        if(!isAvail){  //если книга занята
            isAvail=true; //теперь книга свободна
            System.out.println("The reader returned "+name);
        } else {
            System.out.println("Attention! This book was not taken!");
        }
    }


    @Override
    public int compareTo(Book o) {
        return this.author.compareTo(o.author);
    }
}
