package practice.book.model;

public class Dictionary extends Book{
    private String type;
    private boolean isElektr;
    public Dictionary(long ISBN, int year, String title, String author,String type, boolean isElektr) {
        super(ISBN, year, title, author);
        this.type=type;
        this.isElektr=isElektr;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public boolean isElektr() {
        return isElektr;
    }
    public void setElektr(boolean isElektr) {
        this.isElektr = isElektr;
    }

    public void display(){
        super.display();
        System.out.println("Type of dictionary: "+type+"  Way of reading a book: "+(isElektr? " printed book ":" eBook "));
    }
}
